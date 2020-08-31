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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.DescribeEvaluationResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEvaluationResultsResponse extends AcsResponse {

	private String requestId;

	private EvaluationResults evaluationResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EvaluationResults getEvaluationResults() {
		return this.evaluationResults;
	}

	public void setEvaluationResults(EvaluationResults evaluationResults) {
		this.evaluationResults = evaluationResults;
	}

	public static class EvaluationResults {

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<EvaluationResult> evaluationResultList;

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

		public List<EvaluationResult> getEvaluationResultList() {
			return this.evaluationResultList;
		}

		public void setEvaluationResultList(List<EvaluationResult> evaluationResultList) {
			this.evaluationResultList = evaluationResultList;
		}

		public static class EvaluationResult {

			private String annotation;

			private String complianceType;

			private Long configRuleInvokedTimestamp;

			private String invokingEventMessageType;

			private Long resultRecordedTimestamp;

			private Integer riskLevel;

			private EvaluationResultIdentifier evaluationResultIdentifier;

			public String getAnnotation() {
				return this.annotation;
			}

			public void setAnnotation(String annotation) {
				this.annotation = annotation;
			}

			public String getComplianceType() {
				return this.complianceType;
			}

			public void setComplianceType(String complianceType) {
				this.complianceType = complianceType;
			}

			public Long getConfigRuleInvokedTimestamp() {
				return this.configRuleInvokedTimestamp;
			}

			public void setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
				this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
			}

			public String getInvokingEventMessageType() {
				return this.invokingEventMessageType;
			}

			public void setInvokingEventMessageType(String invokingEventMessageType) {
				this.invokingEventMessageType = invokingEventMessageType;
			}

			public Long getResultRecordedTimestamp() {
				return this.resultRecordedTimestamp;
			}

			public void setResultRecordedTimestamp(Long resultRecordedTimestamp) {
				this.resultRecordedTimestamp = resultRecordedTimestamp;
			}

			public Integer getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(Integer riskLevel) {
				this.riskLevel = riskLevel;
			}

			public EvaluationResultIdentifier getEvaluationResultIdentifier() {
				return this.evaluationResultIdentifier;
			}

			public void setEvaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
				this.evaluationResultIdentifier = evaluationResultIdentifier;
			}

			public static class EvaluationResultIdentifier {

				private Long orderingTimestamp;

				private EvaluationResultQualifier evaluationResultQualifier;

				public Long getOrderingTimestamp() {
					return this.orderingTimestamp;
				}

				public void setOrderingTimestamp(Long orderingTimestamp) {
					this.orderingTimestamp = orderingTimestamp;
				}

				public EvaluationResultQualifier getEvaluationResultQualifier() {
					return this.evaluationResultQualifier;
				}

				public void setEvaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
					this.evaluationResultQualifier = evaluationResultQualifier;
				}

				public static class EvaluationResultQualifier {

					private String configRuleArn;

					private String configRuleId;

					private String configRuleName;

					private String resourceId;

					private String resourceType;

					private String regionId;

					public String getConfigRuleArn() {
						return this.configRuleArn;
					}

					public void setConfigRuleArn(String configRuleArn) {
						this.configRuleArn = configRuleArn;
					}

					public String getConfigRuleId() {
						return this.configRuleId;
					}

					public void setConfigRuleId(String configRuleId) {
						this.configRuleId = configRuleId;
					}

					public String getConfigRuleName() {
						return this.configRuleName;
					}

					public void setConfigRuleName(String configRuleName) {
						this.configRuleName = configRuleName;
					}

					public String getResourceId() {
						return this.resourceId;
					}

					public void setResourceId(String resourceId) {
						this.resourceId = resourceId;
					}

					public String getResourceType() {
						return this.resourceType;
					}

					public void setResourceType(String resourceType) {
						this.resourceType = resourceType;
					}

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}
				}
			}
		}
	}

	@Override
	public DescribeEvaluationResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEvaluationResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
