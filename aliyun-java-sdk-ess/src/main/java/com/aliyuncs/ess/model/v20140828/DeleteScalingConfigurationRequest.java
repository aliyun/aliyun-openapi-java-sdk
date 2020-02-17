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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteScalingConfigurationRequest extends RpcAcsRequest<DeleteScalingConfigurationResponse> {
	   

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String scalingConfigurationId;
	public DeleteScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "DeleteScalingConfiguration", "ess");
		setMethod(MethodType.POST);
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

	public String getScalingConfigurationId() {
		return this.scalingConfigurationId;
	}

	public void setScalingConfigurationId(String scalingConfigurationId) {
		this.scalingConfigurationId = scalingConfigurationId;
		if(scalingConfigurationId != null){
			putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
		}
	}

	@Override
	public Class<DeleteScalingConfigurationResponse> getResponseClass() {
		return DeleteScalingConfigurationResponse.class;
	}

}
