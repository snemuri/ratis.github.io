/*
 * Copyright 2015, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ratis.shaded.io.grpc;

import static org.apache.ratis.shaded.com.google.common.base.Preconditions.checkNotNull;

import org.apache.ratis.shaded.com.google.common.base.Objects;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/**
 * An immutable type-safe container of attributes.
 */
@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1764")
@Immutable
public final class Attributes {

  private final Map<Key<?>, Object> data;

  public static final Attributes EMPTY = new Attributes(Collections.<Key<?>, Object>emptyMap());

  private Attributes(Map<Key<?>, Object> data) {
    assert data != null;
    this.data = data;
  }

  /**
   * Gets the value for the key, or {@code null} if it's not present.
   */
  @SuppressWarnings("unchecked")
  @Nullable
  public <T> T get(Key<T> key) {
    return (T) data.get(key);
  }

  /**
   * Returns set of keys stored in container.
   *
   * @return Set of Key objects.
   */
  public Set<Key<?>> keys() {
    return Collections.unmodifiableSet(data.keySet());
  }

  /**
   * Create a new builder that is pre-populated with the content from a given container.
   */
  public static Builder newBuilder(Attributes base) {
    checkNotNull(base, "base");
    return new Builder(base);
  }

  /**
   * Create a new builder.
   */
  public static Builder newBuilder() {
    return new Builder(EMPTY);
  }

  /**
   * Key for an key-value pair.
   * @param <T> type of the value in the key-value pair
   */
  @Immutable
  public static final class Key<T> {
    private final String name;

    private Key(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }

    /**
     * Factory method for creating instances of {@link Key}.
     *
     * @param name the name of Key. Name collision, won't cause key collision.
     * @param <T> Key type
     * @return Key object
     */
    public static <T> Key<T> of(String name) {
      return new Key<T>(name);
    }
  }

  @Override
  public String toString() {
    return data.toString();
  }

  /**
   * Returns true if the given object is also a {@link Attributes} with an equal attribute values.
   *
   * <p>Note that if a stored values are mutable, it is possible for two objects to be considered
   * equal at one point in time and not equal at another (due to concurrent mutation of attribute
   * values).
   *
   * @param o an object.
   * @return true if the given object is a {@link Attributes} equal attributes.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes that = (Attributes) o;
    if (data.size() != that.data.size()) {
      return false;
    }
    for (Entry<Key<?>, Object> e : data.entrySet()) {
      if (!that.data.containsKey(e.getKey())) {
        return false;
      }
      if (!Objects.equal(e.getValue(), that.data.get(e.getKey()))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns a hash code for the attributes.
   *
   * <p>Note that if a stored values are mutable, it is possible for two objects to be considered
   * equal at one point in time and not equal at another (due to concurrent mutation of attribute
   * values).
   *
   * @return a hash code for the attributes map.
   */
  @Override
  public int hashCode() {
    return data.hashCode();
  }

  /**
   * The helper class to build an Attributes instance.
   */
  public static final class Builder {
    private Attributes base;
    private Map<Key<?>, Object> newdata;

    private Builder(Attributes base) {
      assert base != null;
      this.base = base;
    }

    private Map<Key<?>, Object> data(int size) {
      if (newdata == null) {
        newdata = new IdentityHashMap<Key<?>, Object>(size);
      }
      return newdata;
    }

    public <T> Builder set(Key<T> key, T value) {
      data(1).put(key, value);
      return this;
    }

    public <T> Builder setAll(Attributes other) {
      data(other.data.size()).putAll(other.data);
      return this;
    }

    /**
     * Build the attributes.
     */
    public Attributes build() {
      if (newdata != null) {
        for (Entry<Key<?>, Object> entry : base.data.entrySet()) {
          if (!newdata.containsKey(entry.getKey())) {
            newdata.put(entry.getKey(), entry.getValue());
          }
        }
        base = new Attributes(newdata);
        newdata = null;
      }
      return base;
    }
  }
}
