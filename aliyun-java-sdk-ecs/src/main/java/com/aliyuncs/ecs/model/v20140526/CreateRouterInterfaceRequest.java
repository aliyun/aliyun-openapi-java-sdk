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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRouterInterfaceRequest extends RpcAcsRequest<CreateRouterInterfaceResponse> {
	   

	private String accessPointId;

	private String oppositeRouterId;

	private String oppositeAccessPointId;

	private Long resourceOwnerId;

	private String role;

	private String clientToken;

	private String healthCheckTargetIp;

	private String description;

	private String spec;

	private String userCidr;

	private String oppositeInterfaceId;

	private String instanceChargeType;

	private Integer period;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String oppositeRegionId;

	private String ownerAccount;

	private Long ownerId;

	private String oppositeInterfaceOwnerId;

	private String routerType;

	private String healthCheckSourceIp;

	private String routerId;

	private String oppositeRouterType;

	private String name;

	private String pricingCycle;
	public CreateRouterInterfaceRequest() {
		super("Ecs", "2014-05-26", "CreateRouterInterface", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		if(accessPointId != null){
			putQueryParameter("AccessPointId", accessPointId);
		}
	}

	public String getOppositeRouterId() {
		return this.oppositeRouterId;
	}

	public void setOppositeRouterId(String oppositeRouterId) {
		this.oppositeRouterId = oppositeRouterId;
		if(oppositeRouterId != null){
			putQueryParameter("OppositeRouterId", oppositeRouterId);
		}
	}

	public String getOppositeAccessPointId() {
		return this.oppositeAccessPointId;
	}

	public void setOppositeAccessPointId(String oppositeAccessPointId) {
		this.oppositeAccessPointId = oppositeAccessPointId;
		if(oppositeAccessPointId != null){
			putQueryParameter("OppositeAccessPointId", oppositeAccessPointId);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getHealthCheckTargetIp() {
		return this.healthCheckTargetIp;
	}

	public void setHealthCheckTargetIp(String healthCheckTargetIp) {
		this.healthCheckTargetIp = healthCheckTargetIp;
		if(healthCheckTargetIp != null){
			putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getUserCidr() {
		return this.userCidr;
	}

	public void setUserCidr(String userCidr) {
		this.userCidr = userCidr;
		if(userCidr != null){
			putQueryParameter("UserCidr", userCidr);
		}
	}

	public String getOppositeInterfaceId() {
		return this.oppositeInterfaceId;
	}

	public void setOppositeInterfaceId(String oppositeInterfaceId) {
		this.oppositeInterfaceId = oppositeInterfaceId;
		if(oppositeInterfaceId != null){
			putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
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

	public String getOppositeRegionId() {
		return this.oppositeRegionId;
	}

	public void setOppositeRegionId(String oppositeRegionId) {
		this.oppositeRegionId = oppositeRegionId;
		if(oppositeRegionId != null){
			putQueryParameter("OppositeRegionId", oppositeRegionId);
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

	public String getOppositeInterfaceOwnerId() {
		return this.oppositeInterfaceOwnerId;
	}

	public void setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
		this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
		if(oppositeInterfaceOwnerId != null){
			putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
		}
	}

	public String getRouterType() {
		return this.routerType;
	}

	public void setRouterType(String routerType) {
		this.routerType = routerType;
		if(routerType != null){
			putQueryParameter("RouterType", routerType);
		}
	}

	public String getHealthCheckSourceIp() {
		return this.healthCheckSourceIp;
	}

	public void setHealthCheckSourceIp(String healthCheckSourceIp) {
		this.healthCheckSourceIp = healthCheckSourceIp;
		if(healthCheckSourceIp != null){
			putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
		}
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		if(routerId != null){
			putQueryParameter("RouterId", routerId);
		}
	}

	public String getOppositeRouterType() {
		return this.oppositeRouterType;
	}

	public void setOppositeRouterType(String oppositeRouterType) {
		this.oppositeRouterType = oppositeRouterType;
		if(oppositeRouterType != null){
			putQueryParameter("OppositeRouterType", oppositeRouterType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	@Override
	public Class<CreateRouterInterfaceResponse> getResponseClass() {
		return CreateRouterInterfaceResponse.class;
	}

}
