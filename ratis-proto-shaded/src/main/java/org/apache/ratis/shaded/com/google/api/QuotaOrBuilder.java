// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto

package org.apache.ratis.shaded.com.google.api;

public interface QuotaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Quota)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.api.QuotaLimit> 
      getLimitsList();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  org.apache.ratis.shaded.com.google.api.QuotaLimit getLimits(int index);
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  int getLimitsCount();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.api.QuotaLimitOrBuilder> 
      getLimitsOrBuilderList();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3;</code>
   */
  org.apache.ratis.shaded.com.google.api.QuotaLimitOrBuilder getLimitsOrBuilder(
      int index);

  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.api.MetricRule> 
      getMetricRulesList();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  org.apache.ratis.shaded.com.google.api.MetricRule getMetricRules(int index);
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  int getMetricRulesCount();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.api.MetricRuleOrBuilder> 
      getMetricRulesOrBuilderList();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4;</code>
   */
  org.apache.ratis.shaded.com.google.api.MetricRuleOrBuilder getMetricRulesOrBuilder(
      int index);
}
