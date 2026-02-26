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
import com.aliyuncs.quotas.transform.v20200510.ListQuotaApplicationsDetailForTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaApplicationsDetailForTemplateResponse extends AcsResponse {

	private String nextToken;

	private Integer totalCount;

	private Integer maxResults;

	private String requestId;

	private List<QuotaBatchApplicationDetailVos> quotaApplications;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QuotaBatchApplicationDetailVos> getQuotaApplications() {
		return this.quotaApplications;
	}

	public void setQuotaApplications(List<QuotaBatchApplicationDetailVos> quotaApplications) {
		this.quotaApplications = quotaApplications;
	}

	public static class QuotaBatchApplicationDetailVos {

		private String batchQuotaApplicationId;

		private String productCode;

		private String quotaActionCode;

		private String quotaName;

		private String quotaDescription;

		private String quotaUnit;

		private String quotaArn;

		private Map<Object,Object> quotaDimension;

		private String applicationId;

		private Double desireValue;

		private String reason;

		private String status;

		private Double approveValue;

		private String effectiveTime;

		private String expireTime;

		private String applyTime;

		private String auditReason;

		private Integer noticeType;

		private String aliyunUid;

		private String quotaCategory;

		private String envLanguage;

		private Period period;

		public String getBatchQuotaApplicationId() {
			return this.batchQuotaApplicationId;
		}

		public void setBatchQuotaApplicationId(String batchQuotaApplicationId) {
			this.batchQuotaApplicationId = batchQuotaApplicationId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
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

		public String getQuotaDescription() {
			return this.quotaDescription;
		}

		public void setQuotaDescription(String quotaDescription) {
			this.quotaDescription = quotaDescription;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
		}

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public Map<Object,Object> getQuotaDimension() {
			return this.quotaDimension;
		}

		public void setQuotaDimension(Map<Object,Object> quotaDimension) {
			this.quotaDimension = quotaDimension;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public Double getDesireValue() {
			return this.desireValue;
		}

		public void setDesireValue(Double desireValue) {
			this.desireValue = desireValue;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Double getApproveValue() {
			return this.approveValue;
		}

		public void setApproveValue(Double approveValue) {
			this.approveValue = approveValue;
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

		public String getApplyTime() {
			return this.applyTime;
		}

		public void setApplyTime(String applyTime) {
			this.applyTime = applyTime;
		}

		public String getAuditReason() {
			return this.auditReason;
		}

		public void setAuditReason(String auditReason) {
			this.auditReason = auditReason;
		}

		public Integer getNoticeType() {
			return this.noticeType;
		}

		public void setNoticeType(Integer noticeType) {
			this.noticeType = noticeType;
		}

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public String getEnvLanguage() {
			return this.envLanguage;
		}

		public void setEnvLanguage(String envLanguage) {
			this.envLanguage = envLanguage;
		}

		public Period getPeriod() {
			return this.period;
		}

		public void setPeriod(Period period) {
			this.period = period;
		}

		public static class Period {

			private String periodUnit;

			private Integer periodValue;

			public String getPeriodUnit() {
				return this.periodUnit;
			}

			public void setPeriodUnit(String periodUnit) {
				this.periodUnit = periodUnit;
			}

			public Integer getPeriodValue() {
				return this.periodValue;
			}

			public void setPeriodValue(Integer periodValue) {
				this.periodValue = periodValue;
			}
		}
	}

	@Override
	public ListQuotaApplicationsDetailForTemplateResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaApplicationsDetailForTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
