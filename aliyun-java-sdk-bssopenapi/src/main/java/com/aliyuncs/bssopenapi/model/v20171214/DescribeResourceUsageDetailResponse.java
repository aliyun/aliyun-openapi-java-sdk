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
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeResourceUsageDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceUsageDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer totalCount;

		private Integer maxResults;

		private List<Item> items;

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

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String status;

			private Float usagePercentage;

			private String resourceInstanceId;

			private Float totalQuantity;

			private String reservationCost;

			private String regionNo;

			private String userId;

			private String statusName;

			private String capacityUnit;

			private String potentialSavedCost;

			private String currency;

			private String zoneName;

			private String instanceSpec;

			private String endTime;

			private String postpaidCost;

			private String imageType;

			private String startTime;

			private String region;

			private Float deductQuantity;

			private String savedCost;

			private String zone;

			private String userName;

			private Long quantity;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getUsagePercentage() {
				return this.usagePercentage;
			}

			public void setUsagePercentage(Float usagePercentage) {
				this.usagePercentage = usagePercentage;
			}

			public String getResourceInstanceId() {
				return this.resourceInstanceId;
			}

			public void setResourceInstanceId(String resourceInstanceId) {
				this.resourceInstanceId = resourceInstanceId;
			}

			public Float getTotalQuantity() {
				return this.totalQuantity;
			}

			public void setTotalQuantity(Float totalQuantity) {
				this.totalQuantity = totalQuantity;
			}

			public String getReservationCost() {
				return this.reservationCost;
			}

			public void setReservationCost(String reservationCost) {
				this.reservationCost = reservationCost;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public String getCapacityUnit() {
				return this.capacityUnit;
			}

			public void setCapacityUnit(String capacityUnit) {
				this.capacityUnit = capacityUnit;
			}

			public String getPotentialSavedCost() {
				return this.potentialSavedCost;
			}

			public void setPotentialSavedCost(String potentialSavedCost) {
				this.potentialSavedCost = potentialSavedCost;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getZoneName() {
				return this.zoneName;
			}

			public void setZoneName(String zoneName) {
				this.zoneName = zoneName;
			}

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getPostpaidCost() {
				return this.postpaidCost;
			}

			public void setPostpaidCost(String postpaidCost) {
				this.postpaidCost = postpaidCost;
			}

			public String getImageType() {
				return this.imageType;
			}

			public void setImageType(String imageType) {
				this.imageType = imageType;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Float getDeductQuantity() {
				return this.deductQuantity;
			}

			public void setDeductQuantity(Float deductQuantity) {
				this.deductQuantity = deductQuantity;
			}

			public String getSavedCost() {
				return this.savedCost;
			}

			public void setSavedCost(String savedCost) {
				this.savedCost = savedCost;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Long getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Long quantity) {
				this.quantity = quantity;
			}
		}
	}

	@Override
	public DescribeResourceUsageDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceUsageDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
