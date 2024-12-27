/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateAlertRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateAlertRuleResponse extends AcsResponse {

	private String requestId;

	private AlertRule alertRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlertRule getAlertRule() {
		return this.alertRule;
	}

	public void setAlertRule(AlertRule alertRule) {
		this.alertRule = alertRule;
	}

	public static class AlertRule {

		private Long alertId;

		private String alertName;

		private String userId;

		private String regionId;

		private String alertType;

		private String alertStatus;

		private Long createdTime;

		private Long updatedTime;

		private String extend;

		private String notifyStrategy;

		private Boolean autoAddNewApplication;

		private String metricsType;

		private String alertCheckType;

		private String clusterId;

		private Long alertGroup;

		private String promQL;

		private String duration;

		private String level;

		private String message;

		private String notifyMode;

		private List<LabelsItem> labels;

		private List<AnnotationsItem> annotations;

		private List<Tag> tags;

		private List<String> pids;

		private AlertRuleContent alertRuleContent;

		private Filters filters;

		public Long getAlertId() {
			return this.alertId;
		}

		public void setAlertId(Long alertId) {
			this.alertId = alertId;
		}

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAlertType() {
			return this.alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public String getAlertStatus() {
			return this.alertStatus;
		}

		public void setAlertStatus(String alertStatus) {
			this.alertStatus = alertStatus;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getExtend() {
			return this.extend;
		}

		public void setExtend(String extend) {
			this.extend = extend;
		}

		public String getNotifyStrategy() {
			return this.notifyStrategy;
		}

		public void setNotifyStrategy(String notifyStrategy) {
			this.notifyStrategy = notifyStrategy;
		}

		public Boolean getAutoAddNewApplication() {
			return this.autoAddNewApplication;
		}

		public void setAutoAddNewApplication(Boolean autoAddNewApplication) {
			this.autoAddNewApplication = autoAddNewApplication;
		}

		public String getMetricsType() {
			return this.metricsType;
		}

		public void setMetricsType(String metricsType) {
			this.metricsType = metricsType;
		}

		public String getAlertCheckType() {
			return this.alertCheckType;
		}

		public void setAlertCheckType(String alertCheckType) {
			this.alertCheckType = alertCheckType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getAlertGroup() {
			return this.alertGroup;
		}

		public void setAlertGroup(Long alertGroup) {
			this.alertGroup = alertGroup;
		}

		public String getPromQL() {
			return this.promQL;
		}

		public void setPromQL(String promQL) {
			this.promQL = promQL;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getNotifyMode() {
			return this.notifyMode;
		}

		public void setNotifyMode(String notifyMode) {
			this.notifyMode = notifyMode;
		}

		public List<LabelsItem> getLabels() {
			return this.labels;
		}

		public void setLabels(List<LabelsItem> labels) {
			this.labels = labels;
		}

		public List<AnnotationsItem> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(List<AnnotationsItem> annotations) {
			this.annotations = annotations;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getPids() {
			return this.pids;
		}

		public void setPids(List<String> pids) {
			this.pids = pids;
		}

		public AlertRuleContent getAlertRuleContent() {
			return this.alertRuleContent;
		}

		public void setAlertRuleContent(AlertRuleContent alertRuleContent) {
			this.alertRuleContent = alertRuleContent;
		}

		public Filters getFilters() {
			return this.filters;
		}

		public void setFilters(Filters filters) {
			this.filters = filters;
		}

		public static class LabelsItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class AnnotationsItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class AlertRuleContent {

			private String condition;

			private List<AlertRuleItemsItem> alertRuleItems;

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public List<AlertRuleItemsItem> getAlertRuleItems() {
				return this.alertRuleItems;
			}

			public void setAlertRuleItems(List<AlertRuleItemsItem> alertRuleItems) {
				this.alertRuleItems = alertRuleItems;
			}

			public static class AlertRuleItemsItem {

				private Float n;

				private String metricKey;

				private String aggregate;

				private String operator;

				private String value;

				public Float getN() {
					return this.n;
				}

				public void setN(Float n) {
					this.n = n;
				}

				public String getMetricKey() {
					return this.metricKey;
				}

				public void setMetricKey(String metricKey) {
					this.metricKey = metricKey;
				}

				public String getAggregate() {
					return this.aggregate;
				}

				public void setAggregate(String aggregate) {
					this.aggregate = aggregate;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class Filters {

			private List<DimFiltersItem> dimFilters;

			private List<CustomSLSFiltersItem> customSLSFilters;

			private List<String> customSLSGroupByDimensions;

			private List<String> customSLSWheres;

			public List<DimFiltersItem> getDimFilters() {
				return this.dimFilters;
			}

			public void setDimFilters(List<DimFiltersItem> dimFilters) {
				this.dimFilters = dimFilters;
			}

			public List<CustomSLSFiltersItem> getCustomSLSFilters() {
				return this.customSLSFilters;
			}

			public void setCustomSLSFilters(List<CustomSLSFiltersItem> customSLSFilters) {
				this.customSLSFilters = customSLSFilters;
			}

			public List<String> getCustomSLSGroupByDimensions() {
				return this.customSLSGroupByDimensions;
			}

			public void setCustomSLSGroupByDimensions(List<String> customSLSGroupByDimensions) {
				this.customSLSGroupByDimensions = customSLSGroupByDimensions;
			}

			public List<String> getCustomSLSWheres() {
				return this.customSLSWheres;
			}

			public void setCustomSLSWheres(List<String> customSLSWheres) {
				this.customSLSWheres = customSLSWheres;
			}

			public static class DimFiltersItem {

				private String filterKey;

				private String filterOpt;

				private List<String> filterValues;

				public String getFilterKey() {
					return this.filterKey;
				}

				public void setFilterKey(String filterKey) {
					this.filterKey = filterKey;
				}

				public String getFilterOpt() {
					return this.filterOpt;
				}

				public void setFilterOpt(String filterOpt) {
					this.filterOpt = filterOpt;
				}

				public List<String> getFilterValues() {
					return this.filterValues;
				}

				public void setFilterValues(List<String> filterValues) {
					this.filterValues = filterValues;
				}
			}

			public static class CustomSLSFiltersItem {

				private String key;

				private String opt;

				private String value;

				private String t;

				private Boolean show;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getOpt() {
					return this.opt;
				}

				public void setOpt(String opt) {
					this.opt = opt;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getT() {
					return this.t;
				}

				public void setT(String t) {
					this.t = t;
				}

				public Boolean getShow() {
					return this.show;
				}

				public void setShow(Boolean show) {
					this.show = show;
				}
			}
		}
	}

	@Override
	public CreateOrUpdateAlertRuleResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateAlertRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
