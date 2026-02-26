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
import com.aliyuncs.quotas.transform.v20200510.ListQuotaApplicationsForTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaApplicationsForTemplateResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private Integer maxResults;

	private List<QuotaBatchApplicationsItem> quotaBatchApplications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<QuotaBatchApplicationsItem> getQuotaBatchApplications() {
		return this.quotaBatchApplications;
	}

	public void setQuotaBatchApplications(List<QuotaBatchApplicationsItem> quotaBatchApplications) {
		this.quotaBatchApplications = quotaBatchApplications;
	}

	public static class QuotaBatchApplicationsItem {

		private String productCode;

		private String quotaActionCode;

		private String batchQuotaApplicationId;

		private String effectiveTime;

		private String expireTime;

		private String applyTime;

		private Double desireValue;

		private String quotaCategory;

		private Map<Object,Object> dimensions;

		private String reason;

		private List<AuditStatusVo> auditStatusVos;

		private List<String> aliyunUids;

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

		public String getBatchQuotaApplicationId() {
			return this.batchQuotaApplicationId;
		}

		public void setBatchQuotaApplicationId(String batchQuotaApplicationId) {
			this.batchQuotaApplicationId = batchQuotaApplicationId;
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

		public Double getDesireValue() {
			return this.desireValue;
		}

		public void setDesireValue(Double desireValue) {
			this.desireValue = desireValue;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public Map<Object,Object> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Map<Object,Object> dimensions) {
			this.dimensions = dimensions;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<AuditStatusVo> getAuditStatusVos() {
			return this.auditStatusVos;
		}

		public void setAuditStatusVos(List<AuditStatusVo> auditStatusVos) {
			this.auditStatusVos = auditStatusVos;
		}

		public List<String> getAliyunUids() {
			return this.aliyunUids;
		}

		public void setAliyunUids(List<String> aliyunUids) {
			this.aliyunUids = aliyunUids;
		}

		public static class AuditStatusVo {

			private String status;

			private Integer count;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public ListQuotaApplicationsForTemplateResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaApplicationsForTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
