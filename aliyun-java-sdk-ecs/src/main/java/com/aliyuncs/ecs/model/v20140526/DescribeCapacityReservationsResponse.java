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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCapacityReservationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCapacityReservationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<CapacityReservationItem> capacityReservationSet;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<CapacityReservationItem> getCapacityReservationSet() {
		return this.capacityReservationSet;
	}

	public void setCapacityReservationSet(List<CapacityReservationItem> capacityReservationSet) {
		this.capacityReservationSet = capacityReservationSet;
	}

	public static class CapacityReservationItem {

		private String privatePoolOptionsId;

		private String privatePoolOptionsName;

		private String description;

		private String regionId;

		private String privatePoolOptionsMatchCriteria;

		private String status;

		private String startTime;

		private String endTime;

		private String endTimeType;

		private String instanceChargeType;

		private String platform;

		private String timeSlot;

		private List<AllocatedResource> allocatedResources;

		public String getPrivatePoolOptionsId() {
			return this.privatePoolOptionsId;
		}

		public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
			this.privatePoolOptionsId = privatePoolOptionsId;
		}

		public String getPrivatePoolOptionsName() {
			return this.privatePoolOptionsName;
		}

		public void setPrivatePoolOptionsName(String privatePoolOptionsName) {
			this.privatePoolOptionsName = privatePoolOptionsName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPrivatePoolOptionsMatchCriteria() {
			return this.privatePoolOptionsMatchCriteria;
		}

		public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
			this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getEndTimeType() {
			return this.endTimeType;
		}

		public void setEndTimeType(String endTimeType) {
			this.endTimeType = endTimeType;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getTimeSlot() {
			return this.timeSlot;
		}

		public void setTimeSlot(String timeSlot) {
			this.timeSlot = timeSlot;
		}

		public List<AllocatedResource> getAllocatedResources() {
			return this.allocatedResources;
		}

		public void setAllocatedResources(List<AllocatedResource> allocatedResources) {
			this.allocatedResources = allocatedResources;
		}

		public static class AllocatedResource {

			private String zoneId;

			private String instanceType;

			private Integer totalAmount;

			private Integer usedAmount;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Integer getTotalAmount() {
				return this.totalAmount;
			}

			public void setTotalAmount(Integer totalAmount) {
				this.totalAmount = totalAmount;
			}

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}
		}
	}

	@Override
	public DescribeCapacityReservationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCapacityReservationsResponseUnmarshaller.unmarshall(this, context);
	}
}
