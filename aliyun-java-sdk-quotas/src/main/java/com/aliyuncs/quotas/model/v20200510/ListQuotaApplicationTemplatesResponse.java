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
import com.aliyuncs.quotas.transform.v20200510.ListQuotaApplicationTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaApplicationTemplatesResponse extends AcsResponse {

	private String requestId;

	private Integer maxResults;

	private String nextToken;

	private Integer totalCount;

	private List<QuotaApplicationTemplatesItem> quotaApplicationTemplates;

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

	public List<QuotaApplicationTemplatesItem> getQuotaApplicationTemplates() {
		return this.quotaApplicationTemplates;
	}

	public void setQuotaApplicationTemplates(List<QuotaApplicationTemplatesItem> quotaApplicationTemplates) {
		this.quotaApplicationTemplates = quotaApplicationTemplates;
	}

	public static class QuotaApplicationTemplatesItem {

		private String id;

		private String productCode;

		private Map<Object,Object> dimensions;

		private Float desireValue;

		private Integer noticeType;

		private String quotaActionCode;

		private String applicableType;

		private String envLanguage;

		private String quotaName;

		private String quotaDescription;

		private String effectiveTime;

		private String expireTime;

		private String quotaCategory;

		private List<Float> applicableRange;

		private Period period;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Map<Object,Object> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Map<Object,Object> dimensions) {
			this.dimensions = dimensions;
		}

		public Float getDesireValue() {
			return this.desireValue;
		}

		public void setDesireValue(Float desireValue) {
			this.desireValue = desireValue;
		}

		public Integer getNoticeType() {
			return this.noticeType;
		}

		public void setNoticeType(Integer noticeType) {
			this.noticeType = noticeType;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public String getApplicableType() {
			return this.applicableType;
		}

		public void setApplicableType(String applicableType) {
			this.applicableType = applicableType;
		}

		public String getEnvLanguage() {
			return this.envLanguage;
		}

		public void setEnvLanguage(String envLanguage) {
			this.envLanguage = envLanguage;
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
	public ListQuotaApplicationTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaApplicationTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
