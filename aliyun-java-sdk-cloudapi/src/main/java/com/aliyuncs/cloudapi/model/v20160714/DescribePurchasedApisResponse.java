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
import com.aliyuncs.cloudapi.transform.v20160714.DescribePurchasedApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePurchasedApisResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<PurchasedApi> purchasedApis;

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

	public List<PurchasedApi> getPurchasedApis() {
		return this.purchasedApis;
	}

	public void setPurchasedApis(List<PurchasedApi> purchasedApis) {
		this.purchasedApis = purchasedApis;
	}

	public static class PurchasedApi {

		private String regionId;

		private String groupId;

		private String groupName;

		private String apiId;

		private String apiName;

		private String stageName;

		private String description;

		private String purchasedTime;

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

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
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
	}

	@Override
	public DescribePurchasedApisResponse getInstance(UnmarshallerContext context) {
		return	DescribePurchasedApisResponseUnmarshaller.unmarshall(this, context);
	}
}
