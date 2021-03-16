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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryUserQuotaCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryUserQuotaCategoryResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String nextToken;

	private List<Category> categories;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private Long id;

		private String gmtCreateStr;

		private String gmtModifiedStr;

		private String regionId;

		private String zoneId;

		private Integer payType;

		private Long resourceType;

		private String resourceName;

		private Integer networkType;

		private String quotaUnit;

		private String categoryName;

		private String categoryId;

		private Long reservedQuota;

		private Long baseQuota;

		private Long burstQuota;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreateStr() {
			return this.gmtCreateStr;
		}

		public void setGmtCreateStr(String gmtCreateStr) {
			this.gmtCreateStr = gmtCreateStr;
		}

		public String getGmtModifiedStr() {
			return this.gmtModifiedStr;
		}

		public void setGmtModifiedStr(String gmtModifiedStr) {
			this.gmtModifiedStr = gmtModifiedStr;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getPayType() {
			return this.payType;
		}

		public void setPayType(Integer payType) {
			this.payType = payType;
		}

		public Long getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Long resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public Integer getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(Integer networkType) {
			this.networkType = networkType;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public Long getReservedQuota() {
			return this.reservedQuota;
		}

		public void setReservedQuota(Long reservedQuota) {
			this.reservedQuota = reservedQuota;
		}

		public Long getBaseQuota() {
			return this.baseQuota;
		}

		public void setBaseQuota(Long baseQuota) {
			this.baseQuota = baseQuota;
		}

		public Long getBurstQuota() {
			return this.burstQuota;
		}

		public void setBurstQuota(Long burstQuota) {
			this.burstQuota = burstQuota;
		}
	}

	@Override
	public OpsQueryUserQuotaCategoryResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryUserQuotaCategoryResponseUnmarshaller.unmarshall(this, context);
	}
}
