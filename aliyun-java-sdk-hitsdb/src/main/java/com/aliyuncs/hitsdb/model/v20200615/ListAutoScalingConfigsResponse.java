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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.ListAutoScalingConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAutoScalingConfigsResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ScaleConfig> scaleConfigs;

		public List<ScaleConfig> getScaleConfigs() {
			return this.scaleConfigs;
		}

		public void setScaleConfigs(List<ScaleConfig> scaleConfigs) {
			this.scaleConfigs = scaleConfigs;
		}

		public static class ScaleConfig {

			private String instanceId;

			private String configId;

			private String configName;

			private String engine;

			private String specId;

			private String scaleType;

			private Boolean enabled;

			private String effectiveTimeStart;

			private String effectiveTimeEnd;

			private Integer nodesMin;

			private Integer nodesMax;

			private Long storageCapacityMax;

			private List<ScaleRuleListItem> scaleRuleList;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getSpecId() {
				return this.specId;
			}

			public void setSpecId(String specId) {
				this.specId = specId;
			}

			public String getScaleType() {
				return this.scaleType;
			}

			public void setScaleType(String scaleType) {
				this.scaleType = scaleType;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public String getEffectiveTimeStart() {
				return this.effectiveTimeStart;
			}

			public void setEffectiveTimeStart(String effectiveTimeStart) {
				this.effectiveTimeStart = effectiveTimeStart;
			}

			public String getEffectiveTimeEnd() {
				return this.effectiveTimeEnd;
			}

			public void setEffectiveTimeEnd(String effectiveTimeEnd) {
				this.effectiveTimeEnd = effectiveTimeEnd;
			}

			public Integer getNodesMin() {
				return this.nodesMin;
			}

			public void setNodesMin(Integer nodesMin) {
				this.nodesMin = nodesMin;
			}

			public Integer getNodesMax() {
				return this.nodesMax;
			}

			public void setNodesMax(Integer nodesMax) {
				this.nodesMax = nodesMax;
			}

			public Long getStorageCapacityMax() {
				return this.storageCapacityMax;
			}

			public void setStorageCapacityMax(Long storageCapacityMax) {
				this.storageCapacityMax = storageCapacityMax;
			}

			public List<ScaleRuleListItem> getScaleRuleList() {
				return this.scaleRuleList;
			}

			public void setScaleRuleList(List<ScaleRuleListItem> scaleRuleList) {
				this.scaleRuleList = scaleRuleList;
			}

			public static class ScaleRuleListItem {

				private String instanceId;

				private String configId;

				private String ruleId;

				private String ruleName;

				private String ruleType;

				private Boolean enabled;

				private String operationType;

				private String triggerCronExpr;

				private Integer targetNodes;

				private String targetMetric;

				private Integer thresholdLower;

				private Integer thresholdUpper;

				private Integer observationWindow;

				private Integer silenceTime;

				private Integer scaleOutStep;

				private Integer scaleInStep;

				private String startTime;

				private String endTime;

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getConfigId() {
					return this.configId;
				}

				public void setConfigId(String configId) {
					this.configId = configId;
				}

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getOperationType() {
					return this.operationType;
				}

				public void setOperationType(String operationType) {
					this.operationType = operationType;
				}

				public String getTriggerCronExpr() {
					return this.triggerCronExpr;
				}

				public void setTriggerCronExpr(String triggerCronExpr) {
					this.triggerCronExpr = triggerCronExpr;
				}

				public Integer getTargetNodes() {
					return this.targetNodes;
				}

				public void setTargetNodes(Integer targetNodes) {
					this.targetNodes = targetNodes;
				}

				public String getTargetMetric() {
					return this.targetMetric;
				}

				public void setTargetMetric(String targetMetric) {
					this.targetMetric = targetMetric;
				}

				public Integer getThresholdLower() {
					return this.thresholdLower;
				}

				public void setThresholdLower(Integer thresholdLower) {
					this.thresholdLower = thresholdLower;
				}

				public Integer getThresholdUpper() {
					return this.thresholdUpper;
				}

				public void setThresholdUpper(Integer thresholdUpper) {
					this.thresholdUpper = thresholdUpper;
				}

				public Integer getObservationWindow() {
					return this.observationWindow;
				}

				public void setObservationWindow(Integer observationWindow) {
					this.observationWindow = observationWindow;
				}

				public Integer getSilenceTime() {
					return this.silenceTime;
				}

				public void setSilenceTime(Integer silenceTime) {
					this.silenceTime = silenceTime;
				}

				public Integer getScaleOutStep() {
					return this.scaleOutStep;
				}

				public void setScaleOutStep(Integer scaleOutStep) {
					this.scaleOutStep = scaleOutStep;
				}

				public Integer getScaleInStep() {
					return this.scaleInStep;
				}

				public void setScaleInStep(Integer scaleInStep) {
					this.scaleInStep = scaleInStep;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}
	}

	@Override
	public ListAutoScalingConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListAutoScalingConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
