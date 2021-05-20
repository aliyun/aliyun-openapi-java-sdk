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
import com.aliyuncs.quotas.transform.v20200510.GetProductQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProductQuotaResponse extends AcsResponse {

	private String requestId;

	private Quota quota;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Quota getQuota() {
		return this.quota;
	}

	public void setQuota(Quota quota) {
		this.quota = quota;
	}

	public static class Quota {

		private String quotaDescription;

		private Boolean consumable;

		private String unadjustableDetail;

		private String productCode;

		private Float totalUsage;

		private String quotaType;

		private Map<Object,Object> dimensions;

		private String quotaUnit;

		private Boolean adjustable;

		private String quotaActionCode;

		private String quotaName;

		private String quotaArn;

		private Float totalQuota;

		private String applicableType;

		private List<QuotaItemsItem> quotaItems;

		private List<Float> applicableRange;

		private Period period;

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

		public Map<Object,Object> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Map<Object,Object> dimensions) {
			this.dimensions = dimensions;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
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

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public Float getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Float totalQuota) {
			this.totalQuota = totalQuota;
		}

		public String getApplicableType() {
			return this.applicableType;
		}

		public void setApplicableType(String applicableType) {
			this.applicableType = applicableType;
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

		public Period getPeriod() {
			return this.period;
		}

		public void setPeriod(Period period) {
			this.period = period;
		}

		public static class QuotaItemsItem {

			private String usage;

			private String type;

			private String quota;

			private String quotaUnit;

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}

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

	@Override
	public GetProductQuotaResponse getInstance(UnmarshallerContext context) {
		return	GetProductQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
