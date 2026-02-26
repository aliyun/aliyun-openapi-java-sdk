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
import com.aliyuncs.quotas.transform.v20200510.ListProductQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductQuotasResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<QuotasItem> quotas;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<QuotasItem> getQuotas() {
		return this.quotas;
	}

	public void setQuotas(List<QuotasItem> quotas) {
		this.quotas = quotas;
	}

	public static class QuotasItem {

		private String quotaUnit;

		private String quotaActionCode;

		private Float totalUsage;

		private String quotaType;

		private String quotaDescription;

		private String quotaArn;

		private String applicableType;

		private Map<Object,Object> dimensions;

		private Boolean adjustable;

		private String quotaName;

		private String unadjustableDetail;

		private Boolean consumable;

		private Float totalQuota;

		private String productCode;

		private String effectiveTime;

		private String expireTime;

		private String quotaCategory;

		private String applyReasonTips;

		private Boolean globalQuota;

		private List<QuotaItemsItem> quotaItems;

		private List<Float> applicableRange;

		private List<Float> supportedRange;

		private Period period;

		private UsageMetric usageMetric;

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public Float getTotalUsage() {
			return this.totalUsage;
		}

		public void setTotalUsage(Float totalUsage) {
			this.totalUsage = totalUsage;
		}

		public String getQuotaType() {
			return this.quotaType;
		}

		public void setQuotaType(String quotaType) {
			this.quotaType = quotaType;
		}

		public String getQuotaDescription() {
			return this.quotaDescription;
		}

		public void setQuotaDescription(String quotaDescription) {
			this.quotaDescription = quotaDescription;
		}

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public String getApplicableType() {
			return this.applicableType;
		}

		public void setApplicableType(String applicableType) {
			this.applicableType = applicableType;
		}

		public Map<Object,Object> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Map<Object,Object> dimensions) {
			this.dimensions = dimensions;
		}

		public Boolean getAdjustable() {
			return this.adjustable;
		}

		public void setAdjustable(Boolean adjustable) {
			this.adjustable = adjustable;
		}

		public String getQuotaName() {
			return this.quotaName;
		}

		public void setQuotaName(String quotaName) {
			this.quotaName = quotaName;
		}

		public String getUnadjustableDetail() {
			return this.unadjustableDetail;
		}

		public void setUnadjustableDetail(String unadjustableDetail) {
			this.unadjustableDetail = unadjustableDetail;
		}

		public Boolean getConsumable() {
			return this.consumable;
		}

		public void setConsumable(Boolean consumable) {
			this.consumable = consumable;
		}

		public Float getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Float totalQuota) {
			this.totalQuota = totalQuota;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public String getApplyReasonTips() {
			return this.applyReasonTips;
		}

		public void setApplyReasonTips(String applyReasonTips) {
			this.applyReasonTips = applyReasonTips;
		}

		public Boolean getGlobalQuota() {
			return this.globalQuota;
		}

		public void setGlobalQuota(Boolean globalQuota) {
			this.globalQuota = globalQuota;
		}

		public List<QuotaItemsItem> getQuotaItems() {
			return this.quotaItems;
		}

		public void setQuotaItems(List<QuotaItemsItem> quotaItems) {
			this.quotaItems = quotaItems;
		}

		public List<Float> getApplicableRange() {
			return this.applicableRange;
		}

		public void setApplicableRange(List<Float> applicableRange) {
			this.applicableRange = applicableRange;
		}

		public List<Float> getSupportedRange() {
			return this.supportedRange;
		}

		public void setSupportedRange(List<Float> supportedRange) {
			this.supportedRange = supportedRange;
		}

		public Period getPeriod() {
			return this.period;
		}

		public void setPeriod(Period period) {
			this.period = period;
		}

		public UsageMetric getUsageMetric() {
			return this.usageMetric;
		}

		public void setUsageMetric(UsageMetric usageMetric) {
			this.usageMetric = usageMetric;
		}

		public static class QuotaItemsItem {

			private String type;

			private String quota;

			private String quotaUnit;

			private String usage;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getQuota() {
				return this.quota;
			}

			public void setQuota(String quota) {
				this.quota = quota;
			}

			public String getQuotaUnit() {
				return this.quotaUnit;
			}

			public void setQuotaUnit(String quotaUnit) {
				this.quotaUnit = quotaUnit;
			}

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}
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

		public static class UsageMetric {

			private String metricNamespace;

			private String metricName;

			private Map<Object,Object> metricDimensions;

			public String getMetricNamespace() {
				return this.metricNamespace;
			}

			public void setMetricNamespace(String metricNamespace) {
				this.metricNamespace = metricNamespace;
			}

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
		}
	}

	@Override
	public ListProductQuotasResponse getInstance(UnmarshallerContext context) {
		return	ListProductQuotasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
