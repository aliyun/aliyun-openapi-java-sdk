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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.PubGetDQCQualityByRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PubGetDQCQualityByRuleResponse extends AcsResponse {

	private String returnCode;

	private Integer count;

	private List<QualiltyList> returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<QualiltyList> getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(List<QualiltyList> returnValue) {
		this.returnValue = returnValue;
	}

	public static class QualiltyList {

		private Integer id;

		private String taskId;

		private Integer entityId;

		private Integer ruleId;

		private String property;

		private String bizdate;

		private String dateType;

		private String actualExpression;

		private String matchExpression;

		private Integer blockType;

		private Integer checkResult;

		private Integer checkResultStatus;

		private String methodName;

		private String beginTime;

		private String endTime;

		private String timeConsuming;

		private String externalType;

		private String externalId;

		private Boolean discrete;

		private Boolean fixedCheck;

		private String trend;

		private Float expectValue;

		private String op;

		private Integer checkerType;

		private String ruleName;

		private Boolean isPrediction;

		private String checkerName;

		private List<ReferenceValueList> referenceValue;

		private List<SampleValueList> sampleValue;

		private CheckResultDetail checkResultDetail;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getEntityId() {
			return this.entityId;
		}

		public void setEntityId(Integer entityId) {
			this.entityId = entityId;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}

		public String getProperty() {
			return this.property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getBizdate() {
			return this.bizdate;
		}

		public void setBizdate(String bizdate) {
			this.bizdate = bizdate;
		}

		public String getDateType() {
			return this.dateType;
		}

		public void setDateType(String dateType) {
			this.dateType = dateType;
		}

		public String getActualExpression() {
			return this.actualExpression;
		}

		public void setActualExpression(String actualExpression) {
			this.actualExpression = actualExpression;
		}

		public String getMatchExpression() {
			return this.matchExpression;
		}

		public void setMatchExpression(String matchExpression) {
			this.matchExpression = matchExpression;
		}

		public Integer getBlockType() {
			return this.blockType;
		}

		public void setBlockType(Integer blockType) {
			this.blockType = blockType;
		}

		public Integer getCheckResult() {
			return this.checkResult;
		}

		public void setCheckResult(Integer checkResult) {
			this.checkResult = checkResult;
		}

		public Integer getCheckResultStatus() {
			return this.checkResultStatus;
		}

		public void setCheckResultStatus(Integer checkResultStatus) {
			this.checkResultStatus = checkResultStatus;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getTimeConsuming() {
			return this.timeConsuming;
		}

		public void setTimeConsuming(String timeConsuming) {
			this.timeConsuming = timeConsuming;
		}

		public String getExternalType() {
			return this.externalType;
		}

		public void setExternalType(String externalType) {
			this.externalType = externalType;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public Boolean getDiscrete() {
			return this.discrete;
		}

		public void setDiscrete(Boolean discrete) {
			this.discrete = discrete;
		}

		public Boolean getFixedCheck() {
			return this.fixedCheck;
		}

		public void setFixedCheck(Boolean fixedCheck) {
			this.fixedCheck = fixedCheck;
		}

		public String getTrend() {
			return this.trend;
		}

		public void setTrend(String trend) {
			this.trend = trend;
		}

		public Float getExpectValue() {
			return this.expectValue;
		}

		public void setExpectValue(Float expectValue) {
			this.expectValue = expectValue;
		}

		public String getOp() {
			return this.op;
		}

		public void setOp(String op) {
			this.op = op;
		}

		public Integer getCheckerType() {
			return this.checkerType;
		}

		public void setCheckerType(Integer checkerType) {
			this.checkerType = checkerType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Boolean getIsPrediction() {
			return this.isPrediction;
		}

		public void setIsPrediction(Boolean isPrediction) {
			this.isPrediction = isPrediction;
		}

		public String getCheckerName() {
			return this.checkerName;
		}

		public void setCheckerName(String checkerName) {
			this.checkerName = checkerName;
		}

		public List<ReferenceValueList> getReferenceValue() {
			return this.referenceValue;
		}

		public void setReferenceValue(List<ReferenceValueList> referenceValue) {
			this.referenceValue = referenceValue;
		}

		public List<SampleValueList> getSampleValue() {
			return this.sampleValue;
		}

		public void setSampleValue(List<SampleValueList> sampleValue) {
			this.sampleValue = sampleValue;
		}

		public CheckResultDetail getCheckResultDetail() {
			return this.checkResultDetail;
		}

		public void setCheckResultDetail(CheckResultDetail checkResultDetail) {
			this.checkResultDetail = checkResultDetail;
		}

		public static class ReferenceValueList {

			private String bizDate;

			private String discreteProperty;

			private Float value;

			private Integer singleCheckResult;

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}

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

			public Integer getSingleCheckResult() {
				return this.singleCheckResult;
			}

			public void setSingleCheckResult(Integer singleCheckResult) {
				this.singleCheckResult = singleCheckResult;
			}
		}

		public static class SampleValueList {

			private String bizDate;

			private Float value;

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

		public static class CheckResultDetail {

			private Boolean isDiscrete;

			private Float warningThreshold;

			private Float criticalThreshold;

			private String op;

			private Float expectValue;

			private String externalId;

			private Integer status;

			private Integer qualityStatus;

			private List<QualityDetailList> detail;

			public Boolean getIsDiscrete() {
				return this.isDiscrete;
			}

			public void setIsDiscrete(Boolean isDiscrete) {
				this.isDiscrete = isDiscrete;
			}

			public Float getWarningThreshold() {
				return this.warningThreshold;
			}

			public void setWarningThreshold(Float warningThreshold) {
				this.warningThreshold = warningThreshold;
			}

			public Float getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(Float criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public String getOp() {
				return this.op;
			}

			public void setOp(String op) {
				this.op = op;
			}

			public Float getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(Float expectValue) {
				this.expectValue = expectValue;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getQualityStatus() {
				return this.qualityStatus;
			}

			public void setQualityStatus(Integer qualityStatus) {
				this.qualityStatus = qualityStatus;
			}

			public List<QualityDetailList> getDetail() {
				return this.detail;
			}

			public void setDetail(List<QualityDetailList> detail) {
				this.detail = detail;
			}

			public static class QualityDetailList {

				private List<HistoricalSampleList> historicalSamples;

				private CurrentSample currentSample;

				public List<HistoricalSampleList> getHistoricalSamples() {
					return this.historicalSamples;
				}

				public void setHistoricalSamples(List<HistoricalSampleList> historicalSamples) {
					this.historicalSamples = historicalSamples;
				}

				public CurrentSample getCurrentSample() {
					return this.currentSample;
				}

				public void setCurrentSample(CurrentSample currentSample) {
					this.currentSample = currentSample;
				}

				public static class HistoricalSampleList {

					private String bizdate;

					private Float value;

					private String detail;

					private Float fluctuatedValue;

					public String getBizdate() {
						return this.bizdate;
					}

					public void setBizdate(String bizdate) {
						this.bizdate = bizdate;
					}

					public Float getValue() {
						return this.value;
					}

					public void setValue(Float value) {
						this.value = value;
					}

					public String getDetail() {
						return this.detail;
					}

					public void setDetail(String detail) {
						this.detail = detail;
					}

					public Float getFluctuatedValue() {
						return this.fluctuatedValue;
					}

					public void setFluctuatedValue(Float fluctuatedValue) {
						this.fluctuatedValue = fluctuatedValue;
					}
				}

				public static class CurrentSample {

					private String bizdate;

					private String property;

					private Float value;

					private String detail;

					public String getBizdate() {
						return this.bizdate;
					}

					public void setBizdate(String bizdate) {
						this.bizdate = bizdate;
					}

					public String getProperty() {
						return this.property;
					}

					public void setProperty(String property) {
						this.property = property;
					}

					public Float getValue() {
						return this.value;
					}

					public void setValue(Float value) {
						this.value = value;
					}

					public String getDetail() {
						return this.detail;
					}

					public void setDetail(String detail) {
						this.detail = detail;
					}
				}
			}
		}
	}

	@Override
	public PubGetDQCQualityByRuleResponse getInstance(UnmarshallerContext context) {
		return	PubGetDQCQualityByRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
