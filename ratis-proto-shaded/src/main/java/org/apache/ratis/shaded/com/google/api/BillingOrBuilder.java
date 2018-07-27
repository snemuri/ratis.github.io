// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/billing.proto

package org.apache.ratis.shaded.com.google.api;

public interface BillingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Billing)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.api.Billing.BillingDestination> 
      getConsumerDestinationsList();
  /**
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  org.apache.ratis.shaded.com.google.api.Billing.BillingDestination getConsumerDestinations(int index);
  /**
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  int getConsumerDestinationsCount();
  /**
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.api.Billing.BillingDestinationOrBuilder> 
      getConsumerDestinationsOrBuilderList();
  /**
   * <pre>
   * Billing configurations for sending metrics to the consumer project.
   * There can be multiple consumer destinations per service, each one must have
   * a different monitored resource type. A metric can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Billing.BillingDestination consumer_destinations = 8;</code>
   */
  org.apache.ratis.shaded.com.google.api.Billing.BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(
      int index);
}