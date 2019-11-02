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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class VoipGetTokenRequest extends RpcAcsRequest<VoipGetTokenResponse> {
	   

	private Long resourceOwnerId;

	private String voipId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String deviceId;

	private Boolean isCustomAccount;
	public VoipGetTokenRequest() {
		super("Dyvmsapi", "2017-05-25", "VoipGetToken");
		setMethod(MethodType.POST);
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

	public String getVoipId() {
		return this.voipId;
	}

	public void setVoipId(String voipId) {
		this.voipId = voipId;
		if(voipId != null){
			putQueryParameter("VoipId", voipId);
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

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public Boolean getIsCustomAccount() {
		return this.isCustomAccount;
	}

	public void setIsCustomAccount(Boolean isCustomAccount) {
		this.isCustomAccount = isCustomAccount;
		if(isCustomAccount != null){
			putQueryParameter("IsCustomAccount", isCustomAccount.toString());
		}
	}

	@Override
	public Class<VoipGetTokenResponse> getResponseClass() {
		return VoipGetTokenResponse.class;
	}

}
