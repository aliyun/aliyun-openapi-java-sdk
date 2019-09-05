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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePurchasedApiGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePurchasedApiGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<PurchasedApiGroupAttribute> purchasedApiGroupAttributes;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<PurchasedApiGroupAttribute> getPurchasedApiGroupAttributes() {
		return this.purchasedApiGroupAttributes;
	}

	public void setPurchasedApiGroupAttributes(List<PurchasedApiGroupAttribute> purchasedApiGroupAttributes) {
		this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
	}

	public static class PurchasedApiGroupAttribute {

		private String groupId;

		private String groupName;

		private String description;

		private String purchasedTime;

		private String expireTime;

		private String regionId;

		private String billingType;

		private Long invokeTimesMax;

		private Long invokeTimesNow;

		private String status;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPurchasedTime() {
			return this.purchasedTime;
		}

		public void setPurchasedTime(String purchasedTime) {
			this.purchasedTime = purchasedTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBillingType() {
			return this.billingType;
		}

		public void setBillingType(String billingType) {
			this.billingType = billingType;
		}

		public Long getInvokeTimesMax() {
			return this.invokeTimesMax;
		}

		public void setInvokeTimesMax(Long invokeTimesMax) {
			this.invokeTimesMax = invokeTimesMax;
		}

		public Long getInvokeTimesNow() {
			return this.invokeTimesNow;
		}

		public void setInvokeTimesNow(Long invokeTimesNow) {
			this.invokeTimesNow = invokeTimesNow;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribePurchasedApiGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribePurchasedApiGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
