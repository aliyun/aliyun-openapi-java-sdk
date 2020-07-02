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

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long entityId;

		private String property;

		private Integer methodId;

		private String methodName;

		private String whereCondition;

		private String onDuty;

		private Integer ruleType;

		private Integer blockType;

		private Integer templateId;

		private String templateName;

		private String comment;

		private String ruleName;

		private Integer predictType;

		private String warningThreshold;

		private String criticalThreshold;

		private String operator;

		private String expectValue;

		private String trend;

		private String checkerName;

		private Integer checker;

		private Boolean fixCheck;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getEntityId() {
			return this.entityId;
		}

		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}

		public String getProperty() {
			return this.property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public Integer getMethodId() {
			return this.methodId;
		}

		public void setMethodId(Integer methodId) {
			this.methodId = methodId;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getWhereCondition() {
			return this.whereCondition;
		}

		public void setWhereCondition(String whereCondition) {
			this.whereCondition = whereCondition;
		}

		public String getOnDuty() {
			return this.onDuty;
		}

		public void setOnDuty(String onDuty) {
			this.onDuty = onDuty;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public Integer getBlockType() {
			return this.blockType;
		}

		public void setBlockType(Integer blockType) {
			this.blockType = blockType;
		}

		public Integer getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Integer getPredictType() {
			return this.predictType;
		}

		public void setPredictType(Integer predictType) {
			this.predictType = predictType;
		}

		public String getWarningThreshold() {
			return this.warningThreshold;
		}

		public void setWarningThreshold(String warningThreshold) {
			this.warningThreshold = warningThreshold;
		}

		public String getCriticalThreshold() {
			return this.criticalThreshold;
		}

		public void setCriticalThreshold(String criticalThreshold) {
			this.criticalThreshold = criticalThreshold;
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

		public String getCheckerName() {
			return this.checkerName;
		}

		public void setCheckerName(String checkerName) {
			this.checkerName = checkerName;
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
