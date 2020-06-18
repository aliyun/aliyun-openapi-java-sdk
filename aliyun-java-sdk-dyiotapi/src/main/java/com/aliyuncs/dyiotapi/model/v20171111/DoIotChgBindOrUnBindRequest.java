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

package com.aliyuncs.dyiotapi.model.v20171111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyiotapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DoIotChgBindOrUnBindRequest extends RpcAcsRequest<DoIotChgBindOrUnBindResponse> {
	   

	private Long resourceOwnerId;

	private String opionType;

	private String iccid;

	private String midChannelId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String newImei;

	private String imei;
	public DoIotChgBindOrUnBindRequest() {
		super("Dyiotapi", "2017-11-11", "DoIotChgBindOrUnBind", "dyiotapi");
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

	public String getOpionType() {
		return this.opionType;
	}

	public void setOpionType(String opionType) {
		this.opionType = opionType;
		if(opionType != null){
			putQueryParameter("OpionType", opionType);
		}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public String getMidChannelId() {
		return this.midChannelId;
	}

	public void setMidChannelId(String midChannelId) {
		this.midChannelId = midChannelId;
		if(midChannelId != null){
			putQueryParameter("MidChannelId", midChannelId);
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

	public String getNewImei() {
		return this.newImei;
	}

	public void setNewImei(String newImei) {
		this.newImei = newImei;
		if(newImei != null){
			putQueryParameter("NewImei", newImei);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putQueryParameter("Imei", imei);
		}
	}

	@Override
	public Class<DoIotChgBindOrUnBindResponse> getResponseClass() {
		return DoIotChgBindOrUnBindResponse.class;
	}

}
