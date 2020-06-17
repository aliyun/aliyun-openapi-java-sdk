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
public class ModifySagRouteProtocolOspfRequest extends RpcAcsRequest<ModifySagRouteProtocolOspfResponse> {
	   

	private Long resourceOwnerId;

	private String authenticationType;

	private String password;

	private Integer areaId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer md5KeyId;

	private String routerId;

	private String smartAGId;

	private String smartAGSn;

	private Integer deadTime;

	private String md5Key;

	private Integer helloTime;
	public ModifySagRouteProtocolOspfRequest() {
		super("Smartag", "2018-03-13", "ModifySagRouteProtocolOspf", "smartag");
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

	public String getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
		if(authenticationType != null){
			putQueryParameter("AuthenticationType", authenticationType);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
		if(areaId != null){
			putQueryParameter("AreaId", areaId.toString());
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

	public Integer getMd5KeyId() {
		return this.md5KeyId;
	}

	public void setMd5KeyId(Integer md5KeyId) {
		this.md5KeyId = md5KeyId;
		if(md5KeyId != null){
			putQueryParameter("Md5KeyId", md5KeyId.toString());
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

	public Integer getDeadTime() {
		return this.deadTime;
	}

	public void setDeadTime(Integer deadTime) {
		this.deadTime = deadTime;
		if(deadTime != null){
			putQueryParameter("DeadTime", deadTime.toString());
		}
	}

	public String getMd5Key() {
		return this.md5Key;
	}

	public void setMd5Key(String md5Key) {
		this.md5Key = md5Key;
		if(md5Key != null){
			putQueryParameter("Md5Key", md5Key);
		}
	}

	public Integer getHelloTime() {
		return this.helloTime;
	}

	public void setHelloTime(Integer helloTime) {
		this.helloTime = helloTime;
		if(helloTime != null){
			putQueryParameter("HelloTime", helloTime.toString());
		}
	}

	@Override
	public Class<ModifySagRouteProtocolOspfResponse> getResponseClass() {
		return ModifySagRouteProtocolOspfResponse.class;
	}

}
