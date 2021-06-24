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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeScheduleCapacityReservationDemandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeScheduleCapacityReservationDemandResponse extends AcsResponse {

	private Integer status;

	private String keyComponentCounts;

	private String description;

	private String requestId;

	private String matchCriteria;

	private String couponId;

	private Integer instanceChargeType;

	private Integer couponType;

	private String startTime;

	private String productType;

	private String demandId;

	private Integer couponAuto;

	private String keyComponentNames;

	private Integer needConfirm;

	private String gmtExpired;

	private String phoneNumber;

	private String izIds;

	private Long regionId;

	private String instanceTypes;

	private String couponParam;

	private Long aliUid;

	private List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels;

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getKeyComponentCounts() {
		return this.keyComponentCounts;
	}

	public void setKeyComponentCounts(String keyComponentCounts) {
		this.keyComponentCounts = keyComponentCounts;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMatchCriteria() {
		return this.matchCriteria;
	}

	public void setMatchCriteria(String matchCriteria) {
		this.matchCriteria = matchCriteria;
	}

	public String getCouponId() {
		return this.couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Integer getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(Integer instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public Integer getCouponType() {
		return this.couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
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

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
	}

	public Integer getCouponAuto() {
		return this.couponAuto;
	}

	public void setCouponAuto(Integer couponAuto) {
		this.couponAuto = couponAuto;
	}

	public String getKeyComponentNames() {
		return this.keyComponentNames;
	}

	public void setKeyComponentNames(String keyComponentNames) {
		this.keyComponentNames = keyComponentNames;
	}

	public Integer getNeedConfirm() {
		return this.needConfirm;
	}

	public void setNeedConfirm(Integer needConfirm) {
		this.needConfirm = needConfirm;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}

	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIzIds() {
		return this.izIds;
	}

	public void setIzIds(String izIds) {
		this.izIds = izIds;
	}

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(String instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public String getCouponParam() {
		return this.couponParam;
	}

	public void setCouponParam(String couponParam) {
		this.couponParam = couponParam;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public List<EcsAcrDemandPlanModel> getEcsAcrDemandPlanModels() {
		return this.ecsAcrDemandPlanModels;
	}

	public void setEcsAcrDemandPlanModels(List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels) {
		this.ecsAcrDemandPlanModels = ecsAcrDemandPlanModels;
	}

	public static class EcsAcrDemandPlanModel {

		private String matchCriteria;

		private Integer status;

		private Long onlineAmount;

		private String izId;

		private String demandId;

		private String approveCode;

		private String crId;

		private String instanceType;

		private String planId;

		private Long instanceAmount;

		private String approveNotes;

		private Long offlineAmount;

		private String packageId;

		private Integer planType;

		public String getMatchCriteria() {
			return this.matchCriteria;
		}

		public void setMatchCriteria(String matchCriteria) {
			this.matchCriteria = matchCriteria;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getOnlineAmount() {
			return this.onlineAmount;
		}

		public void setOnlineAmount(Long onlineAmount) {
			this.onlineAmount = onlineAmount;
		}

		public String getIzId() {
			return this.izId;
		}

		public void setIzId(String izId) {
			this.izId = izId;
		}

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}

		public String getApproveCode() {
			return this.approveCode;
		}

		public void setApproveCode(String approveCode) {
			this.approveCode = approveCode;
		}

		public String getCrId() {
			return this.crId;
		}

		public void setCrId(String crId) {
			this.crId = crId;
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

		public Long getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Long instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getApproveNotes() {
			return this.approveNotes;
		}

		public void setApproveNotes(String approveNotes) {
			this.approveNotes = approveNotes;
		}

		public Long getOfflineAmount() {
			return this.offlineAmount;
		}

		public void setOfflineAmount(Long offlineAmount) {
			this.offlineAmount = offlineAmount;
		}

		public String getPackageId() {
			return this.packageId;
		}

		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}

		public Integer getPlanType() {
			return this.planType;
		}

		public void setPlanType(Integer planType) {
			this.planType = planType;
		}
	}

	@Override
	public OpsDescribeScheduleCapacityReservationDemandResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeScheduleCapacityReservationDemandResponseUnmarshaller.unmarshall(this, context);
	}
}
