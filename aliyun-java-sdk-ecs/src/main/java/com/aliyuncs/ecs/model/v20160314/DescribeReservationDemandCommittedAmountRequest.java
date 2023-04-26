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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeReservationDemandCommittedAmountRequest extends RpcAcsRequest<DescribeReservationDemandCommittedAmountResponse> {
	   

	private List<DemandPlan> demandPlan;

	private String instanceFamily;

	private String instanceFamilySet;

	private String planType;

	private String platform;

	private String instanceChargeType;

	private String purchaseMethod;

	private Integer period;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String periodUnit;

	private String offeringType;
	public DescribeReservationDemandCommittedAmountRequest() {
		super("Ecs", "2016-03-14", "DescribeReservationDemandCommittedAmount", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DemandPlan> getDemandPlan() {
		return this.demandPlan;
	}

	public void setDemandPlan(List<DemandPlan> demandPlan) {
		this.demandPlan = demandPlan;	
		if (demandPlan != null) {
			for (int depth1 = 0; depth1 < demandPlan.size(); depth1++) {
				if (demandPlan.get(depth1) != null) {
					
						putQueryParameter("DemandPlan." + (depth1 + 1) + ".InstanceType" , demandPlan.get(depth1).getInstanceType());
						putQueryParameter("DemandPlan." + (depth1 + 1) + ".Amount" , demandPlan.get(depth1).getAmount());
				}
			}
		}	
	}

	public String getInstanceFamily() {
		return this.instanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		this.instanceFamily = instanceFamily;
		if(instanceFamily != null){
			putQueryParameter("InstanceFamily", instanceFamily);
		}
	}

	public String getInstanceFamilySet() {
		return this.instanceFamilySet;
	}

	public void setInstanceFamilySet(String instanceFamilySet) {
		this.instanceFamilySet = instanceFamilySet;
		if(instanceFamilySet != null){
			putQueryParameter("InstanceFamilySet", instanceFamilySet);
		}
	}

	public String getPlanType() {
		return this.planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getPurchaseMethod() {
		return this.purchaseMethod;
	}

	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
		if(purchaseMethod != null){
			putQueryParameter("PurchaseMethod", purchaseMethod);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getOfferingType() {
		return this.offeringType;
	}

	public void setOfferingType(String offeringType) {
		this.offeringType = offeringType;
		if(offeringType != null){
			putQueryParameter("OfferingType", offeringType);
		}
	}

	public static class DemandPlan {

		private String instanceType;

		private Long amount;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}
	}

	@Override
	public Class<DescribeReservationDemandCommittedAmountResponse> getResponseClass() {
		return DescribeReservationDemandCommittedAmountResponse.class;
	}

}
