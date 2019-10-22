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
public class ModifyRouterInterfaceAttributeRequest extends RpcAcsRequest<ModifyRouterInterfaceAttributeResponse> {
	   

	private String oppositeRouterId;

	private Long resourceOwnerId;

	private String description;

	private String healthCheckTargetIp;

	private String oppositeInterfaceId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String routerInterfaceId;

	private Long oppositeInterfaceOwnerId;

	private String healthCheckSourceIp;

	private String name;

	private String oppositeRouterType;
	public ModifyRouterInterfaceAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyRouterInterfaceAttribute", "ecs");
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	@Override
	public Class<ModifyRouterInterfaceAttributeResponse> getResponseClass() {
		return ModifyRouterInterfaceAttributeResponse.class;
	}

}
