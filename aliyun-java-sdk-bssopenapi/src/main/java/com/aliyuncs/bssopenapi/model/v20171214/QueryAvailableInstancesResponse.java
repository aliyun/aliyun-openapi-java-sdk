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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryAvailableInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAvailableInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private List<Instance> instanceList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Instance> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<Instance> instanceList) {
			this.instanceList = instanceList;
		}

		public static class Instance {

			private Long ownerId;

			private Long sellerId;

			private String productCode;

			private String productType;

			private String subscriptionType;

			private String instanceID;

			private String region;

			private String createTime;

			private String endTime;

			private String stopTime;

			private String releaseTime;

			private String expectedReleaseTime;

			private String status;

			private String subStatus;

			private String renewStatus;

			private Integer renewalDuration;

			private String renewalDurationUnit;

			private String seller;

			public Long getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(Long ownerId) {
				this.ownerId = ownerId;
			}

			public Long getSellerId() {
				return this.sellerId;
			}

			public void setSellerId(Long sellerId) {
				this.sellerId = sellerId;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStopTime() {
				return this.stopTime;
			}

			public void setStopTime(String stopTime) {
				this.stopTime = stopTime;
			}

			public String getReleaseTime() {
				return this.releaseTime;
			}

			public void setReleaseTime(String releaseTime) {
				this.releaseTime = releaseTime;
			}

			public String getExpectedReleaseTime() {
				return this.expectedReleaseTime;
			}

			public void setExpectedReleaseTime(String expectedReleaseTime) {
				this.expectedReleaseTime = expectedReleaseTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSubStatus() {
				return this.subStatus;
			}

			public void setSubStatus(String subStatus) {
				this.subStatus = subStatus;
			}

			public String getRenewStatus() {
				return this.renewStatus;
			}

			public void setRenewStatus(String renewStatus) {
				this.renewStatus = renewStatus;
			}

			public Integer getRenewalDuration() {
				return this.renewalDuration;
			}

			public void setRenewalDuration(Integer renewalDuration) {
				this.renewalDuration = renewalDuration;
			}

			public String getRenewalDurationUnit() {
				return this.renewalDurationUnit;
			}

			public void setRenewalDurationUnit(String renewalDurationUnit) {
				this.renewalDurationUnit = renewalDurationUnit;
			}

			public String getSeller() {
				return this.seller;
			}

			public void setSeller(String seller) {
				this.seller = seller;
			}
		}
	}

	@Override
	public QueryAvailableInstancesResponse getInstance(UnmarshallerContext context) {
		return	QueryAvailableInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
