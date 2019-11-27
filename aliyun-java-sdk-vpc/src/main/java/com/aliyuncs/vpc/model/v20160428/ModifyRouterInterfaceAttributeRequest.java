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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRouterInterfaceAttributeRequest extends RpcAcsRequest<ModifyRouterInterfaceAttributeResponse> {
	   

	private String oppositeRouterId;

	private Long resourceOwnerId;

	private String description;

	private String healthCheckTargetIp;

	private String oppositeInterfaceId;

	private Integer hcThreshold;

	private String resourceOwnerAccount;

	private Boolean deleteHealthCheckIp;

	private Long ownerId;

	private String routerInterfaceId;

	private Long oppositeInterfaceOwnerId;

	private String healthCheckSourceIp;

	private String name;

	private String oppositeRouterType;

	private Integer hcRate;
	public ModifyRouterInterfaceAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyRouterInterfaceAttribute", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getHealthCheckTargetIp() {
		return this.healthCheckTargetIp;
	}

	public void setHealthCheckTargetIp(String healthCheckTargetIp) {
		this.healthCheckTargetIp = healthCheckTargetIp;
		if(healthCheckTargetIp != null){
			putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
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

	public Integer getHcThreshold() {
		return this.hcThreshold;
	}

	public void setHcThreshold(Integer hcThreshold) {
		this.hcThreshold = hcThreshold;
		if(hcThreshold != null){
			putQueryParameter("HcThreshold", hcThreshold.toString());
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

	public Boolean getDeleteHealthCheckIp() {
		return this.deleteHealthCheckIp;
	}

	public void setDeleteHealthCheckIp(Boolean deleteHealthCheckIp) {
		this.deleteHealthCheckIp = deleteHealthCheckIp;
		if(deleteHealthCheckIp != null){
			putQueryParameter("DeleteHealthCheckIp", deleteHealthCheckIp.toString());
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

	public String getRouterInterfaceId() {
		return this.routerInterfaceId;
	}

	public void setRouterInterfaceId(String routerInterfaceId) {
		this.routerInterfaceId = routerInterfaceId;
		if(routerInterfaceId != null){
			putQueryParameter("RouterInterfaceId", routerInterfaceId);
		}
	}

	public Long getOppositeInterfaceOwnerId() {
		return this.oppositeInterfaceOwnerId;
	}

	public void setOppositeInterfaceOwnerId(Long oppositeInterfaceOwnerId) {
		this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
		if(oppositeInterfaceOwnerId != null){
			putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Integer getHcRate() {
		return this.hcRate;
	}

	public void setHcRate(Integer hcRate) {
		this.hcRate = hcRate;
		if(hcRate != null){
			putQueryParameter("HcRate", hcRate.toString());
		}
	}

	@Override
	public Class<ModifyRouterInterfaceAttributeResponse> getResponseClass() {
		return ModifyRouterInterfaceAttributeResponse.class;
	}

}
