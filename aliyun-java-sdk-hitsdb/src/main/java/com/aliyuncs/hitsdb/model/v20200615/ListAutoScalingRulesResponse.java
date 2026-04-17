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
import com.aliyuncs.hitsdb.transform.v20200615.ListAutoScalingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAutoScalingRulesResponse extends AcsResponse {

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

		private List<ScaleRule> scaleRules;

		public List<ScaleRule> getScaleRules() {
			return this.scaleRules;
		}

		public void setScaleRules(List<ScaleRule> scaleRules) {
			this.scaleRules = scaleRules;
		}

		public static class ScaleRule {

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

	@Override
	public ListAutoScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	ListAutoScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
