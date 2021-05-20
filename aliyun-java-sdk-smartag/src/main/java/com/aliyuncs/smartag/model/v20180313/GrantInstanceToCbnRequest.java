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
public class GrantInstanceToCbnRequest extends RpcAcsRequest<GrantInstanceToCbnResponse> {
	   

	private Long resourceOwnerId;

	private String ccnInstanceId;

	private Boolean grantTrafficService;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Long cenUid;

	private String cenInstanceId;
	public GrantInstanceToCbnRequest() {
		super("Smartag", "2018-03-13", "GrantInstanceToCbn", "smartag");
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

	public String getCcnInstanceId() {
		return this.ccnInstanceId;
	}

	public void setCcnInstanceId(String ccnInstanceId) {
		this.ccnInstanceId = ccnInstanceId;
		if(ccnInstanceId != null){
			putQueryParameter("CcnInstanceId", ccnInstanceId);
		}
	}

	public Boolean getGrantTrafficService() {
		return this.grantTrafficService;
	}

	public void setGrantTrafficService(Boolean grantTrafficService) {
		this.grantTrafficService = grantTrafficService;
		if(grantTrafficService != null){
			putQueryParameter("GrantTrafficService", grantTrafficService.toString());
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

	public Long getCenUid() {
		return this.cenUid;
	}

	public void setCenUid(Long cenUid) {
		this.cenUid = cenUid;
		if(cenUid != null){
			putQueryParameter("CenUid", cenUid.toString());
		}
	}

	public String getCenInstanceId() {
		return this.cenInstanceId;
	}

	public void setCenInstanceId(String cenInstanceId) {
		this.cenInstanceId = cenInstanceId;
		if(cenInstanceId != null){
			putQueryParameter("CenInstanceId", cenInstanceId);
		}
	}

	@Override
	public Class<GrantInstanceToCbnResponse> getResponseClass() {
		return GrantInstanceToCbnResponse.class;
	}

}
