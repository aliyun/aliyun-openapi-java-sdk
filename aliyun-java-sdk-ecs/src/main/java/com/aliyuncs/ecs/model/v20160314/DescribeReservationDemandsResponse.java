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
import com.aliyuncs.ecs.transform.v20160314.DescribeReservationDemandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReservationDemandsResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<DemandOrders> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<DemandOrders> getData() {
		return this.data;
	}

	public void setData(List<DemandOrders> data) {
		this.data = data;
	}

	public static class DemandOrders {

		private String status;

		private String savingPlanDescription;

		private String demandId;

		private String reservedInstanceDescription;

		private String savingPlanId;

		private String savingPlanSavingType;

		private String savingPlanPayMode;

		private String couponAuto;

		private String zoneIds;

		private String name;

		private String description;

		private String platform;

		private String reservedInstanceOfferingType;

		private String savingPlanName;

		private Integer instanceCpuCoreCount;

		private String matchCriteria;

		private Float savingPlanHourFee;

		private String reservedInstanceName;

		private String savingPlanInstanceTypeFamilyGroup;

		private String savingPlanSpecType;

		private String reservedInstanceId;

		private String confirmType;

		private String couponType;

		private String regionId;

		private Integer period;

		private String instanceChargeType;

		private String startTime;

		private String productType;

		private String resourceSupplyType;

		private String periodUnit;

		private String instanceTypes;

		private String phoneNumber;

		private List<CapacityReservations> reservationResource;

		private List<CapacityReservations1> recommendResource;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSavingPlanDescription() {
			return this.savingPlanDescription;
		}

		public void setSavingPlanDescription(String savingPlanDescription) {
			this.savingPlanDescription = savingPlanDescription;
		}

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}

		public String getReservedInstanceDescription() {
			return this.reservedInstanceDescription;
		}

		public void setReservedInstanceDescription(String reservedInstanceDescription) {
			this.reservedInstanceDescription = reservedInstanceDescription;
		}

		public String getSavingPlanId() {
			return this.savingPlanId;
		}

		public void setSavingPlanId(String savingPlanId) {
			this.savingPlanId = savingPlanId;
		}

		public String getSavingPlanSavingType() {
			return this.savingPlanSavingType;
		}

		public void setSavingPlanSavingType(String savingPlanSavingType) {
			this.savingPlanSavingType = savingPlanSavingType;
		}

		public String getSavingPlanPayMode() {
			return this.savingPlanPayMode;
		}

		public void setSavingPlanPayMode(String savingPlanPayMode) {
			this.savingPlanPayMode = savingPlanPayMode;
		}

		public String getCouponAuto() {
			return this.couponAuto;
		}

		public void setCouponAuto(String couponAuto) {
			this.couponAuto = couponAuto;
		}

		public String getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(String zoneIds) {
			this.zoneIds = zoneIds;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getReservedInstanceOfferingType() {
			return this.reservedInstanceOfferingType;
		}

		public void setReservedInstanceOfferingType(String reservedInstanceOfferingType) {
			this.reservedInstanceOfferingType = reservedInstanceOfferingType;
		}

		public String getSavingPlanName() {
			return this.savingPlanName;
		}

		public void setSavingPlanName(String savingPlanName) {
			this.savingPlanName = savingPlanName;
		}

		public Integer getInstanceCpuCoreCount() {
			return this.instanceCpuCoreCount;
		}

		public void setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
			this.instanceCpuCoreCount = instanceCpuCoreCount;
		}

		public String getMatchCriteria() {
			return this.matchCriteria;
		}

		public void setMatchCriteria(String matchCriteria) {
			this.matchCriteria = matchCriteria;
		}

		public Float getSavingPlanHourFee() {
			return this.savingPlanHourFee;
		}

		public void setSavingPlanHourFee(Float savingPlanHourFee) {
			this.savingPlanHourFee = savingPlanHourFee;
		}

		public String getReservedInstanceName() {
			return this.reservedInstanceName;
		}

		public void setReservedInstanceName(String reservedInstanceName) {
			this.reservedInstanceName = reservedInstanceName;
		}

		public String getSavingPlanInstanceTypeFamilyGroup() {
			return this.savingPlanInstanceTypeFamilyGroup;
		}

		public void setSavingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
			this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
		}

		public String getSavingPlanSpecType() {
			return this.savingPlanSpecType;
		}

		public void setSavingPlanSpecType(String savingPlanSpecType) {
			this.savingPlanSpecType = savingPlanSpecType;
		}

		public String getReservedInstanceId() {
			return this.reservedInstanceId;
		}

		public void setReservedInstanceId(String reservedInstanceId) {
			this.reservedInstanceId = reservedInstanceId;
		}

		public String getConfirmType() {
			return this.confirmType;
		}

		public void setConfirmType(String confirmType) {
			this.confirmType = confirmType;
		}

		public String getCouponType() {
			return this.couponType;
		}

		public void setCouponType(String couponType) {
			this.couponType = couponType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getResourceSupplyType() {
			return this.resourceSupplyType;
		}

		public void setResourceSupplyType(String resourceSupplyType) {
			this.resourceSupplyType = resourceSupplyType;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public String getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(String instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public List<CapacityReservations> getReservationResource() {
			return this.reservationResource;
		}

		public void setReservationResource(List<CapacityReservations> reservationResource) {
			this.reservationResource = reservationResource;
		}

		public List<CapacityReservations1> getRecommendResource() {
			return this.recommendResource;
		}

		public void setRecommendResource(List<CapacityReservations1> recommendResource) {
			this.recommendResource = recommendResource;
		}

		public static class CapacityReservations {

			private String matchCriteria;

			private String status;

			private String privatePoolOptionsId;

			private String approveCode;

			private String zoneId;

			private String instanceType;

			private String planId;

			private Integer instanceAmount;

			private String approveNotes;

			private String startTime;

			public String getMatchCriteria() {
				return this.matchCriteria;
			}

			public void setMatchCriteria(String matchCriteria) {
				this.matchCriteria = matchCriteria;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrivatePoolOptionsId() {
				return this.privatePoolOptionsId;
			}

			public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
				this.privatePoolOptionsId = privatePoolOptionsId;
			}

			public String getApproveCode() {
				return this.approveCode;
			}

			public void setApproveCode(String approveCode) {
				this.approveCode = approveCode;
			}

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

			public String getPlanId() {
				return this.planId;
			}

			public void setPlanId(String planId) {
				this.planId = planId;
			}

			public Integer getInstanceAmount() {
				return this.instanceAmount;
			}

			public void setInstanceAmount(Integer instanceAmount) {
				this.instanceAmount = instanceAmount;
			}

			public String getApproveNotes() {
				return this.approveNotes;
			}

			public void setApproveNotes(String approveNotes) {
				this.approveNotes = approveNotes;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class CapacityReservations1 {

			private String matchCriteria;

			private String status;

			private String privatePoolOptionsId;

			private String zoneId;

			private String instanceType;

			private String planId;

			private Integer instanceAmount;

			private String startTime;

			public String getMatchCriteria() {
				return this.matchCriteria;
			}

			public void setMatchCriteria(String matchCriteria) {
				this.matchCriteria = matchCriteria;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrivatePoolOptionsId() {
				return this.privatePoolOptionsId;
			}

			public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
				this.privatePoolOptionsId = privatePoolOptionsId;
			}

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

			public String getPlanId() {
				return this.planId;
			}

			public void setPlanId(String planId) {
				this.planId = planId;
			}

			public Integer getInstanceAmount() {
				return this.instanceAmount;
			}

			public void setInstanceAmount(Integer instanceAmount) {
				this.instanceAmount = instanceAmount;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}
	}

	@Override
	public DescribeReservationDemandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReservationDemandsResponseUnmarshaller.unmarshall(this, context);
	}
}
