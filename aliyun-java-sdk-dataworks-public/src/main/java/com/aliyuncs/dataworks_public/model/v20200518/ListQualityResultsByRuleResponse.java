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
import com.aliyuncs.dataworks_public.transform.v20200518.ListQualityResultsByRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityResultsByRuleResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<RuleChecksItem> ruleChecks;

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

		public List<RuleChecksItem> getRuleChecks() {
			return this.ruleChecks;
		}

		public void setRuleChecks(List<RuleChecksItem> ruleChecks) {
			this.ruleChecks = ruleChecks;
		}

		public static class RuleChecksItem {

			private Integer blockType;

			private Float warningThreshold;

			private String property;

			private String tableName;

			private String comment;

			private Integer checkResultStatus;

			private String templateName;

			private String checkerName;

			private Integer ruleId;

			private Boolean fixedCheck;

			private String op;

			private Float upperValue;

			private String actualExpression;

			private String externalId;

			private String timeCost;

			private String trend;

			private String externalType;

			private Long bizDate;

			private Integer checkResult;

			private String resultString;

			private String matchExpression;

			private Integer checkerType;

			private String projectName;

			private Long beginTime;

			private String dateType;

			private Float criticalThreshold;

			private Boolean isPrediction;

			private String ruleName;

			private Integer checkerId;

			private Boolean discreteCheck;

			private Long endTime;

			private String methodName;

			private Float lowerValue;

			private Integer entityId;

			private String whereCondition;

			private Float expectValue;

			private Integer templateId;

			private String taskId;

			private Integer id;

			private List<ReferenceValueItem> referenceValue;

			private List<SampleValueItem> sampleValue;

			public Integer getBlockType() {
				return this.blockType;
			}

			public void setBlockType(Integer blockType) {
				this.blockType = blockType;
			}

			public Float getWarningThreshold() {
				return this.warningThreshold;
			}

			public void setWarningThreshold(Float warningThreshold) {
				this.warningThreshold = warningThreshold;
			}

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Integer getCheckResultStatus() {
				return this.checkResultStatus;
			}

			public void setCheckResultStatus(Integer checkResultStatus) {
				this.checkResultStatus = checkResultStatus;
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

			public Integer getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Integer ruleId) {
				this.ruleId = ruleId;
			}

			public Boolean getFixedCheck() {
				return this.fixedCheck;
			}

			public void setFixedCheck(Boolean fixedCheck) {
				this.fixedCheck = fixedCheck;
			}

			public String getOp() {
				return this.op;
			}

			public void setOp(String op) {
				this.op = op;
			}

			public Float getUpperValue() {
				return this.upperValue;
			}

			public void setUpperValue(Float upperValue) {
				this.upperValue = upperValue;
			}

			public String getActualExpression() {
				return this.actualExpression;
			}

			public void setActualExpression(String actualExpression) {
				this.actualExpression = actualExpression;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}

			public String getTimeCost() {
				return this.timeCost;
			}

			public void setTimeCost(String timeCost) {
				this.timeCost = timeCost;
			}

			public String getTrend() {
				return this.trend;
			}

			public void setTrend(String trend) {
				this.trend = trend;
			}

			public String getExternalType() {
				return this.externalType;
			}

			public void setExternalType(String externalType) {
				this.externalType = externalType;
			}

			public Long getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(Long bizDate) {
				this.bizDate = bizDate;
			}

			public Integer getCheckResult() {
				return this.checkResult;
			}

			public void setCheckResult(Integer checkResult) {
				this.checkResult = checkResult;
			}

			public String getResultString() {
				return this.resultString;
			}

			public void setResultString(String resultString) {
				this.resultString = resultString;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public Integer getCheckerType() {
				return this.checkerType;
			}

			public void setCheckerType(Integer checkerType) {
				this.checkerType = checkerType;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public String getDateType() {
				return this.dateType;
			}

			public void setDateType(String dateType) {
				this.dateType = dateType;
			}

			public Float getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(Float criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public Boolean getIsPrediction() {
				return this.isPrediction;
			}

			public void setIsPrediction(Boolean isPrediction) {
				this.isPrediction = isPrediction;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public Integer getCheckerId() {
				return this.checkerId;
			}

			public void setCheckerId(Integer checkerId) {
				this.checkerId = checkerId;
			}

			public Boolean getDiscreteCheck() {
				return this.discreteCheck;
			}

			public void setDiscreteCheck(Boolean discreteCheck) {
				this.discreteCheck = discreteCheck;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public Float getLowerValue() {
				return this.lowerValue;
			}

			public void setLowerValue(Float lowerValue) {
				this.lowerValue = lowerValue;
			}

			public Integer getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Integer entityId) {
				this.entityId = entityId;
			}

			public String getWhereCondition() {
				return this.whereCondition;
			}

			public void setWhereCondition(String whereCondition) {
				this.whereCondition = whereCondition;
			}

			public Float getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(Float expectValue) {
				this.expectValue = expectValue;
			}

			public Integer getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Integer templateId) {
				this.templateId = templateId;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public List<ReferenceValueItem> getReferenceValue() {
				return this.referenceValue;
			}

			public void setReferenceValue(List<ReferenceValueItem> referenceValue) {
				this.referenceValue = referenceValue;
			}

			public List<SampleValueItem> getSampleValue() {
				return this.sampleValue;
			}

			public void setSampleValue(List<SampleValueItem> sampleValue) {
				this.sampleValue = sampleValue;
			}

			public static class ReferenceValueItem {

				private String discreteProperty;

				private Float value;

				private String bizDate;

				private Integer singleCheckResult;

				private Float threshold;

				public String getDiscreteProperty() {
					return this.discreteProperty;
				}

				public void setDiscreteProperty(String discreteProperty) {
					this.discreteProperty = discreteProperty;
				}

				public Float getValue() {
					return this.value;
				}

				public void setValue(Float value) {
					this.value = value;
				}

				public String getBizDate() {
					return this.bizDate;
				}

				public void setBizDate(String bizDate) {
					this.bizDate = bizDate;
				}

				public Integer getSingleCheckResult() {
					return this.singleCheckResult;
				}

				public void setSingleCheckResult(Integer singleCheckResult) {
					this.singleCheckResult = singleCheckResult;
				}

				public Float getThreshold() {
					return this.threshold;
				}

				public void setThreshold(Float threshold) {
					this.threshold = threshold;
				}
			}

			public static class SampleValueItem {

				private String discreteProperty;

				private String bizDate;

				private Float value;

				public String getDiscreteProperty() {
					return this.discreteProperty;
				}

				public void setDiscreteProperty(String discreteProperty) {
					this.discreteProperty = discreteProperty;
				}

				public String getBizDate() {
					return this.bizDate;
				}

				public void setBizDate(String bizDate) {
					this.bizDate = bizDate;
				}

				public Float getValue() {
					return this.value;
				}

				public void setValue(Float value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListQualityResultsByRuleResponse getInstance(UnmarshallerContext context) {
		return	ListQualityResultsByRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
