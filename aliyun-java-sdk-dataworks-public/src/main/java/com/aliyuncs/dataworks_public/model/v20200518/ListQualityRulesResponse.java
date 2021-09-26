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

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<RulesItem> rules;

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

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class RulesItem {

			private Integer blockType;

			private String onDutyAccountName;

			private String property;

			private String warningThreshold;

			private String tableName;

			private String onDuty;

			private String comment;

			private Integer ruleCheckerRelationId;

			private Boolean fixCheck;

			private Integer methodId;

			private String templateName;

			private String trend;

			private String historyWarningThreshold;

			private Integer ruleType;

			private String matchExpression;

			private String projectName;

			private String propertyKey;

			private String criticalThreshold;

			private String historyCriticalThreshold;

			private String methodName;

			private Integer checkerId;

			private Integer entityId;

			private String expectValue;

			private Integer templateId;

			private Integer id;

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

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public String getWarningThreshold() {
				return this.warningThreshold;
			}

			public void setWarningThreshold(String warningThreshold) {
				this.warningThreshold = warningThreshold;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getOnDuty() {
				return this.onDuty;
			}

			public void setOnDuty(String onDuty) {
				this.onDuty = onDuty;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Integer getRuleCheckerRelationId() {
				return this.ruleCheckerRelationId;
			}

			public void setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
				this.ruleCheckerRelationId = ruleCheckerRelationId;
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

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getTrend() {
				return this.trend;
			}

			public void setTrend(String trend) {
				this.trend = trend;
			}

			public String getHistoryWarningThreshold() {
				return this.historyWarningThreshold;
			}

			public void setHistoryWarningThreshold(String historyWarningThreshold) {
				this.historyWarningThreshold = historyWarningThreshold;
			}

			public Integer getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(Integer ruleType) {
				this.ruleType = ruleType;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public String getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(String criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public String getHistoryCriticalThreshold() {
				return this.historyCriticalThreshold;
			}

			public void setHistoryCriticalThreshold(String historyCriticalThreshold) {
				this.historyCriticalThreshold = historyCriticalThreshold;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public Integer getCheckerId() {
				return this.checkerId;
			}

			public void setCheckerId(Integer checkerId) {
				this.checkerId = checkerId;
			}

			public Integer getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Integer entityId) {
				this.entityId = entityId;
			}

			public String getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(String expectValue) {
				this.expectValue = expectValue;
			}

			public Integer getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Integer templateId) {
				this.templateId = templateId;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
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
