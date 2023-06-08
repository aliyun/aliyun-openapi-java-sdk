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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.StartCheckQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartCheckQualityResponse extends AcsResponse {

	private String returnCode;

	private String requestId;

	private ReturnValue returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ReturnValue getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(ReturnValue returnValue) {
		this.returnValue = returnValue;
	}

	public static class ReturnValue {

		private Boolean success;

		private String taskId;

		private List<ResultsItem> results;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ResultsItem {

			private String actualExpression;

			private String bizdate;

			private Long blockType;

			private Long checkResult;

			private String checkerName;

			private Long containStrongRule;

			private String criticalThreshold;

			private String dateType;

			private String entityName;

			private String externalId;

			private String externalType;

			private String finishTime;

			private Long ifFixedCheck;

			private String matchExpression;

			private Long methodId;

			private String methodName;

			private String projectName;

			private String property;

			private Long ruleId;

			private Long taskLevel;

			private Long taskStatus;

			private String trend;

			private String warningThreshold;

			private String whereCondition;

			private List<ActualResultItem> actualResult;

			private List<SampleResultItem> sampleResult;

			public String getActualExpression() {
				return this.actualExpression;
			}

			public void setActualExpression(String actualExpression) {
				this.actualExpression = actualExpression;
			}

			public String getBizdate() {
				return this.bizdate;
			}

			public void setBizdate(String bizdate) {
				this.bizdate = bizdate;
			}

			public Long getBlockType() {
				return this.blockType;
			}

			public void setBlockType(Long blockType) {
				this.blockType = blockType;
			}

			public Long getCheckResult() {
				return this.checkResult;
			}

			public void setCheckResult(Long checkResult) {
				this.checkResult = checkResult;
			}

			public String getCheckerName() {
				return this.checkerName;
			}

			public void setCheckerName(String checkerName) {
				this.checkerName = checkerName;
			}

			public Long getContainStrongRule() {
				return this.containStrongRule;
			}

			public void setContainStrongRule(Long containStrongRule) {
				this.containStrongRule = containStrongRule;
			}

			public String getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(String criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public String getDateType() {
				return this.dateType;
			}

			public void setDateType(String dateType) {
				this.dateType = dateType;
			}

			public String getEntityName() {
				return this.entityName;
			}

			public void setEntityName(String entityName) {
				this.entityName = entityName;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}

			public String getExternalType() {
				return this.externalType;
			}

			public void setExternalType(String externalType) {
				this.externalType = externalType;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public Long getIfFixedCheck() {
				return this.ifFixedCheck;
			}

			public void setIfFixedCheck(Long ifFixedCheck) {
				this.ifFixedCheck = ifFixedCheck;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public Long getMethodId() {
				return this.methodId;
			}

			public void setMethodId(Long methodId) {
				this.methodId = methodId;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public Long getTaskLevel() {
				return this.taskLevel;
			}

			public void setTaskLevel(Long taskLevel) {
				this.taskLevel = taskLevel;
			}

			public Long getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Long taskStatus) {
				this.taskStatus = taskStatus;
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

			public String getWhereCondition() {
				return this.whereCondition;
			}

			public void setWhereCondition(String whereCondition) {
				this.whereCondition = whereCondition;
			}

			public List<ActualResultItem> getActualResult() {
				return this.actualResult;
			}

			public void setActualResult(List<ActualResultItem> actualResult) {
				this.actualResult = actualResult;
			}

			public List<SampleResultItem> getSampleResult() {
				return this.sampleResult;
			}

			public void setSampleResult(List<SampleResultItem> sampleResult) {
				this.sampleResult = sampleResult;
			}

			public static class ActualResultItem {

				private String actualThreshold;

				private String bizDate;

				private String property;

				private String result;

				private Long status;

				public String getActualThreshold() {
					return this.actualThreshold;
				}

				public void setActualThreshold(String actualThreshold) {
					this.actualThreshold = actualThreshold;
				}

				public String getBizDate() {
					return this.bizDate;
				}

				public void setBizDate(String bizDate) {
					this.bizDate = bizDate;
				}

				public String getProperty() {
					return this.property;
				}

				public void setProperty(String property) {
					this.property = property;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public Long getStatus() {
					return this.status;
				}

				public void setStatus(Long status) {
					this.status = status;
				}
			}

			public static class SampleResultItem {

				private String bizDate;

				private String property;

				private String result;

				private Long status;

				public String getBizDate() {
					return this.bizDate;
				}

				public void setBizDate(String bizDate) {
					this.bizDate = bizDate;
				}

				public String getProperty() {
					return this.property;
				}

				public void setProperty(String property) {
					this.property = property;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public Long getStatus() {
					return this.status;
				}

				public void setStatus(Long status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public StartCheckQualityResponse getInstance(UnmarshallerContext context) {
		return	StartCheckQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
