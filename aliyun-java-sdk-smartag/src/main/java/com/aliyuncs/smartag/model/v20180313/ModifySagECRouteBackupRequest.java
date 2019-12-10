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
public class ModifySagECRouteBackupRequest extends RpcAcsRequest<ModifySagECRouteBackupResponse> {
	   

	private Long resourceOwnerId;

	private String expressConnectionInterface;

	private String hcIp;

	private Boolean routeBackup;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String smartAGId;

	private String expressConnectionNexthop;
	public ModifySagECRouteBackupRequest() {
		super("Smartag", "2018-03-13", "ModifySagECRouteBackup", "smartag");
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

	public String getExpressConnectionInterface() {
		return this.expressConnectionInterface;
	}

	public void setExpressConnectionInterface(String expressConnectionInterface) {
		this.expressConnectionInterface = expressConnectionInterface;
		if(expressConnectionInterface != null){
			putQueryParameter("ExpressConnectionInterface", expressConnectionInterface);
		}
	}

	public String getHcIp() {
		return this.hcIp;
	}

	public void setHcIp(String hcIp) {
		this.hcIp = hcIp;
		if(hcIp != null){
			putQueryParameter("HcIp", hcIp);
		}
	}

	public Boolean getRouteBackup() {
		return this.routeBackup;
	}

	public void setRouteBackup(Boolean routeBackup) {
		this.routeBackup = routeBackup;
		if(routeBackup != null){
			putQueryParameter("RouteBackup", routeBackup.toString());
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getExpressConnectionNexthop() {
		return this.expressConnectionNexthop;
	}

	public void setExpressConnectionNexthop(String expressConnectionNexthop) {
		this.expressConnectionNexthop = expressConnectionNexthop;
		if(expressConnectionNexthop != null){
			putQueryParameter("ExpressConnectionNexthop", expressConnectionNexthop);
		}
	}

	@Override
	public Class<ModifySagECRouteBackupResponse> getResponseClass() {
		return ModifySagECRouteBackupResponse.class;
	}

}
