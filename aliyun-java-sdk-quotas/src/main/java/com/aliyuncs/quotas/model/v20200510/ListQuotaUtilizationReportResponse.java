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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListQuotaUtilizationReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaUtilizationReportResponse extends AcsResponse {

	private String status;

	private Integer totalCount;

	private String message;

	private String nextToken;

	private String requestId;

	private String generatedAt;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<QuotasItem> quotas;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGeneratedAt() {
		return this.generatedAt;
	}

	public void setGeneratedAt(String generatedAt) {
		this.generatedAt = generatedAt;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

	public List<QuotasItem> getQuotas() {
		return this.quotas;
	}

	public void setQuotas(List<QuotasItem> quotas) {
		this.quotas = quotas;
	}

	public static class QuotasItem {

		private String quotaDescription;

		private Boolean consumable;

		private String unadjustableDetail;

		private String productCode;

		private Double totalUsage;

		private Map<Object,Object> dimensions;

		private String utilizationStatus;

		private Boolean adjustable;

		private String quotaActionCode;

		private String quotaName;

		private Double utilization;

		private String quotaArn;

		private Double totalQuota;

		private String quotaCategory;

		private UsageMetric usageMetric;

		private FlowControlAlgo flowControlAlgo;

		public String getQuotaDescription() {
			return this.quotaDescription;
		}

		public void setQuotaDescription(String quotaDescription) {
			this.quotaDescription = quotaDescription;
		}

		public Boolean getConsumable() {
			return this.consumable;
		}

		public void setConsumable(Boolean consumable) {
			this.consumable = consumable;
		}

		public String getUnadjustableDetail() {
			return this.unadjustableDetail;
		}

		public void setUnadjustableDetail(String unadjustableDetail) {
			this.unadjustableDetail = unadjustableDetail;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Double getTotalUsage() {
			return this.totalUsage;
		}

		public void setTotalUsage(Double totalUsage) {
			this.totalUsage = totalUsage;
		}

		public Map<Object,Object> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Map<Object,Object> dimensions) {
			this.dimensions = dimensions;
		}

		public String getUtilizationStatus() {
			return this.utilizationStatus;
		}

		public void setUtilizationStatus(String utilizationStatus) {
			this.utilizationStatus = utilizationStatus;
		}

		public Boolean getAdjustable() {
			return this.adjustable;
		}

		public void setAdjustable(Boolean adjustable) {
			this.adjustable = adjustable;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public String getQuotaName() {
			return this.quotaName;
		}

		public void setQuotaName(String quotaName) {
			this.quotaName = quotaName;
		}

		public Double getUtilization() {
			return this.utilization;
		}

		public void setUtilization(Double utilization) {
			this.utilization = utilization;
		}

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public Double getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Double totalQuota) {
			this.totalQuota = totalQuota;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public UsageMetric getUsageMetric() {
			return this.usageMetric;
		}

		public void setUsageMetric(UsageMetric usageMetric) {
			this.usageMetric = usageMetric;
		}

		public FlowControlAlgo getFlowControlAlgo() {
			return this.flowControlAlgo;
		}

		public void setFlowControlAlgo(FlowControlAlgo flowControlAlgo) {
			this.flowControlAlgo = flowControlAlgo;
		}

		public static class UsageMetric {

			private String metricName;

			private Map<Object,Object> metricDimensions;

			private String metricNamespace;

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public Map<Object,Object> getMetricDimensions() {
				return this.metricDimensions;
			}

			public void setMetricDimensions(Map<Object,Object> metricDimensions) {
				this.metricDimensions = metricDimensions;
			}

			public String getMetricNamespace() {
				return this.metricNamespace;
			}

			public void setMetricNamespace(String metricNamespace) {
				this.metricNamespace = metricNamespace;
			}
		}

		public static class FlowControlAlgo {

			private Double totalQuota;

			private String algoType;

			private Integer tokensPerRefill;

			private Integer refillInterval;

			private Period period;

			public Double getTotalQuota() {
				return this.totalQuota;
			}

			public void setTotalQuota(Double totalQuota) {
				this.totalQuota = totalQuota;
			}

			public String getAlgoType() {
				return this.algoType;
			}

			public void setAlgoType(String algoType) {
				this.algoType = algoType;
			}

			public Integer getTokensPerRefill() {
				return this.tokensPerRefill;
			}

			public void setTokensPerRefill(Integer tokensPerRefill) {
				this.tokensPerRefill = tokensPerRefill;
			}

			public Integer getRefillInterval() {
				return this.refillInterval;
			}

			public void setRefillInterval(Integer refillInterval) {
				this.refillInterval = refillInterval;
			}

			public Period getPeriod() {
				return this.period;
			}

			public void setPeriod(Period period) {
				this.period = period;
			}

			public static class Period {

				private Integer periodValue;

				private String periodUnit;

				public Integer getPeriodValue() {
					return this.periodValue;
				}

				public void setPeriodValue(Integer periodValue) {
					this.periodValue = periodValue;
				}

				public String getPeriodUnit() {
					return this.periodUnit;
				}

				public void setPeriodUnit(String periodUnit) {
					this.periodUnit = periodUnit;
				}
			}
		}
	}

	@Override
	public ListQuotaUtilizationReportResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaUtilizationReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
