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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySagRouteProtocolBgpRequest extends RpcAcsRequest<ModifySagRouteProtocolBgpResponse> {
	   

	private Long resourceOwnerId;

	private Integer keepAlive;

	private Integer holdTime;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String routerId;

	private Integer localAs;

	private String smartAGId;

	private String smartAGSn;
	public ModifySagRouteProtocolBgpRequest() {
		super("Smartag", "2018-03-13", "ModifySagRouteProtocolBgp", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getKeepAlive() {
		return this.keepAlive;
	}

	public void setKeepAlive(Integer keepAlive) {
		this.keepAlive = keepAlive;
		if(keepAlive != null){
			putQueryParameter("KeepAlive", keepAlive.toString());
		}
	}

	public Integer getHoldTime() {
		return this.holdTime;
	}

	public void setHoldTime(Integer holdTime) {
		this.holdTime = holdTime;
		if(holdTime != null){
			putQueryParameter("HoldTime", holdTime.toString());
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

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		if(routerId != null){
			putQueryParameter("RouterId", routerId);
		}
	}

	public Integer getLocalAs() {
		return this.localAs;
	}

	public void setLocalAs(Integer localAs) {
		this.localAs = localAs;
		if(localAs != null){
			putQueryParameter("LocalAs", localAs.toString());
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getSmartAGSn() {
		return this.smartAGSn;
	}

	public void setSmartAGSn(String smartAGSn) {
		this.smartAGSn = smartAGSn;
		if(smartAGSn != null){
			putQueryParameter("SmartAGSn", smartAGSn);
		}
	}

	@Override
	public Class<ModifySagRouteProtocolBgpResponse> getResponseClass() {
		return ModifySagRouteProtocolBgpResponse.class;
	}

}
