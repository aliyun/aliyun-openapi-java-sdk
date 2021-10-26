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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetQualityRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityRuleResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer blockType;

		private String onDutyAccountName;

		private String warningThreshold;

		private String property;

		private Integer ruleType;

		private String comment;

		private String onDuty;

		private Integer checker;

		private Boolean fixCheck;

		private Integer methodId;

		private String criticalThreshold;

		private Integer predictType;

		private String templateName;

		private String checkerName;

		private String ruleName;

		private String methodName;

		private Long entityId;

		private String whereCondition;

		private String operator;

		private String expectValue;

		private String trend;

		private Integer templateId;

		private Long id;

		public Integer getBlockType() {
			return this.blockType;
		}

		public void setBlockType(Integer blockType) {
			this.blockType = blockType;
		}

		public String getOnDutyAccountName() {
			return this.onDutyAccountName;
		}

		public void setOnDutyAccountName(String onDutyAccountName) {
			this.onDutyAccountName = onDutyAccountName;
		}

		public String getWarningThreshold() {
			return this.warningThreshold;
		}

		public void setWarningThreshold(String warningThreshold) {
			this.warningThreshold = warningThreshold;
		}

		public String getProperty() {
			return this.property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getOnDuty() {
			return this.onDuty;
		}

		public void setOnDuty(String onDuty) {
			this.onDuty = onDuty;
		}

		public Integer getChecker() {
			return this.checker;
		}

		public void setChecker(Integer checker) {
			this.checker = checker;
		}

		public Boolean getFixCheck() {
			return this.fixCheck;
		}

		public void setFixCheck(Boolean fixCheck) {
			this.fixCheck = fixCheck;
		}

		public Integer getMethodId() {
			return this.methodId;
		}

		public void setMethodId(Integer methodId) {
			this.methodId = methodId;
		}

		public String getCriticalThreshold() {
			return this.criticalThreshold;
		}

		public void setCriticalThreshold(String criticalThreshold) {
			this.criticalThreshold = criticalThreshold;
		}

		public Integer getPredictType() {
			return this.predictType;
		}

		public void setPredictType(Integer predictType) {
			this.predictType = predictType;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getCheckerName() {
			return this.checkerName;
		}

		public void setCheckerName(String checkerName) {
			this.checkerName = checkerName;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public Long getEntityId() {
			return this.entityId;
		}

		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}

		public String getWhereCondition() {
			return this.whereCondition;
		}

		public void setWhereCondition(String whereCondition) {
			this.whereCondition = whereCondition;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getExpectValue() {
			return this.expectValue;
		}

		public void setExpectValue(String expectValue) {
			this.expectValue = expectValue;
		}

		public String getTrend() {
			return this.trend;
		}

		public void setTrend(String trend) {
			this.trend = trend;
		}

		public Integer getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public GetQualityRuleResponse getInstance(UnmarshallerContext context) {
		return	GetQualityRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
