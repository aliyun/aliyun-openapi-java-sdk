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
import com.aliyuncs.quotas.transform.v20200510.ListQuotaApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaApplicationsResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<QuotaApplicationsItem> quotaApplications;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<QuotaApplicationsItem> getQuotaApplications() {
		return this.quotaApplications;
	}

	public void setQuotaApplications(List<QuotaApplicationsItem> quotaApplications) {
		this.quotaApplications = quotaApplications;
	}

	public static class QuotaApplicationsItem {

		private String applicationId;

		private String applyTime;

		private Float approveValue;

		private String auditReason;

		private String comment;

		private Float desireValue;

		private Map<Object,Object> dimension;

		private String effectiveTime;

		private String expireTime;

		private Integer noticeType;

		private String productCode;

		private String quotaActionCode;

		private String quotaArn;

		private String quotaCategory;

		private String quotaDescription;

		private String quotaName;

		private String quotaUnit;

		private String reason;

		private String status;

		private Period period;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplyTime() {
			return this.applyTime;
		}

		public void setApplyTime(String applyTime) {
			this.applyTime = applyTime;
		}

		public Float getApproveValue() {
			return this.approveValue;
		}

		public void setApproveValue(Float approveValue) {
			this.approveValue = approveValue;
		}

		public String getAuditReason() {
			return this.auditReason;
		}

		public void setAuditReason(String auditReason) {
			this.auditReason = auditReason;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Float getDesireValue() {
			return this.desireValue;
		}

		public void setDesireValue(Float desireValue) {
			this.desireValue = desireValue;
		}

		public Map<Object,Object> getDimension() {
			return this.dimension;
		}

		public void setDimension(Map<Object,Object> dimension) {
			this.dimension = dimension;
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

		public Integer getNoticeType() {
			return this.noticeType;
		}

		public void setNoticeType(Integer noticeType) {
			this.noticeType = noticeType;
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

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public String getQuotaDescription() {
			return this.quotaDescription;
		}

		public void setQuotaDescription(String quotaDescription) {
			this.quotaDescription = quotaDescription;
		}

		public String getQuotaName() {
			return this.quotaName;
		}

		public void setQuotaName(String quotaName) {
			this.quotaName = quotaName;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
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

		public Period getPeriod() {
			return this.period;
		}

		public void setPeriod(Period period) {
			this.period = period;
		}

		public static class Period {

			private String periodUnit;

			private Long periodValue;

			public String getPeriodUnit() {
				return this.periodUnit;
			}

			public void setPeriodUnit(String periodUnit) {
				this.periodUnit = periodUnit;
			}

			public Long getPeriodValue() {
				return this.periodValue;
			}

			public void setPeriodValue(Long periodValue) {
				this.periodValue = periodValue;
			}
		}
	}

	@Override
	public ListQuotaApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
