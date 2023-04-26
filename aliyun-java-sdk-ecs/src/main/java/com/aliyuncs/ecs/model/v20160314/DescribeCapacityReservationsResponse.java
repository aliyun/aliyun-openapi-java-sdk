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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeCapacityReservationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCapacityReservationsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<CapacityReservation> capacityReservations;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<CapacityReservation> getCapacityReservations() {
		return this.capacityReservations;
	}

	public void setCapacityReservations(List<CapacityReservation> capacityReservations) {
		this.capacityReservations = capacityReservations;
	}

	public static class CapacityReservation {

		private String status;

		private Integer totalInstanceCount;

		private String timeSlot;

		private String capacityReservationName;

		private String endDateType;

		private String capacityReservationId;

		private String networkType;

		private String instanceType;

		private Integer availableInstanceCount;

		private String instancePlatform;

		private String regionId;

		private String description;

		private String instanceMatchCriteria;

		private String zoneId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getTotalInstanceCount() {
			return this.totalInstanceCount;
		}

		public void setTotalInstanceCount(Integer totalInstanceCount) {
			this.totalInstanceCount = totalInstanceCount;
		}

		public String getTimeSlot() {
			return this.timeSlot;
		}

		public void setTimeSlot(String timeSlot) {
			this.timeSlot = timeSlot;
		}

		public String getCapacityReservationName() {
			return this.capacityReservationName;
		}

		public void setCapacityReservationName(String capacityReservationName) {
			this.capacityReservationName = capacityReservationName;
		}

		public String getEndDateType() {
			return this.endDateType;
		}

		public void setEndDateType(String endDateType) {
			this.endDateType = endDateType;
		}

		public String getCapacityReservationId() {
			return this.capacityReservationId;
		}

		public void setCapacityReservationId(String capacityReservationId) {
			this.capacityReservationId = capacityReservationId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getAvailableInstanceCount() {
			return this.availableInstanceCount;
		}

		public void setAvailableInstanceCount(Integer availableInstanceCount) {
			this.availableInstanceCount = availableInstanceCount;
		}

		public String getInstancePlatform() {
			return this.instancePlatform;
		}

		public void setInstancePlatform(String instancePlatform) {
			this.instancePlatform = instancePlatform;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceMatchCriteria() {
			return this.instanceMatchCriteria;
		}

		public void setInstanceMatchCriteria(String instanceMatchCriteria) {
			this.instanceMatchCriteria = instanceMatchCriteria;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public DescribeCapacityReservationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCapacityReservationsResponseUnmarshaller.unmarshall(this, context);
	}
}
