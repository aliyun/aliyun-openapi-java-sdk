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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListQualityRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityRulesResponse extends AcsResponse {

	private String errorCode;

	private Boolean success;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

		private Long totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RulesItem> rules;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class RulesItem {

			private String projectName;

			private String tableName;

			private Integer id;

			private Integer entityId;

			private String property;

			private Integer methodId;

			private String methodName;

			private String onDuty;

			private Integer ruleType;

			private Integer blockType;

			private Integer templateId;

			private String templateName;

			private Integer ruleCheckerRelationId;

			private Integer checkerId;

			private Boolean fixCheck;

			private String trend;

			private String warningThreshold;

			private String criticalThreshold;

			private String historyWarningThreshold;

			private String historyCriticalThreshold;

			private String propertyKey;

			private String matchExpression;

			private String comment;

			private String expectValue;

			private String onDutyAccountName;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Integer entityId) {
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

			public Integer getRuleCheckerRelationId() {
				return this.ruleCheckerRelationId;
			}

			public void setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
				this.ruleCheckerRelationId = ruleCheckerRelationId;
			}

			public Integer getCheckerId() {
				return this.checkerId;
			}

			public void setCheckerId(Integer checkerId) {
				this.checkerId = checkerId;
			}

			public Boolean getFixCheck() {
				return this.fixCheck;
			}

			public void setFixCheck(Boolean fixCheck) {
				this.fixCheck = fixCheck;
			}

			public String getTrend() {
				return this.trend;
			}

			public void setTrend(String trend) {
				this.trend = trend;
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

			public String getHistoryWarningThreshold() {
				return this.historyWarningThreshold;
			}

			public void setHistoryWarningThreshold(String historyWarningThreshold) {
				this.historyWarningThreshold = historyWarningThreshold;
			}

			public String getHistoryCriticalThreshold() {
				return this.historyCriticalThreshold;
			}

			public void setHistoryCriticalThreshold(String historyCriticalThreshold) {
				this.historyCriticalThreshold = historyCriticalThreshold;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(String expectValue) {
				this.expectValue = expectValue;
			}

			public String getOnDutyAccountName() {
				return this.onDutyAccountName;
			}

			public void setOnDutyAccountName(String onDutyAccountName) {
				this.onDutyAccountName = onDutyAccountName;
			}
		}
	}

	@Override
	public ListQualityRulesResponse getInstance(UnmarshallerContext context) {
		return	ListQualityRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
