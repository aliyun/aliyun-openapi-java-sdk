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

/**
 * @author auto create
 * @version 
 */
public class ModifyAlertConfigRequest extends RpcAcsRequest<ModifyAlertConfigResponse> {
	
	public ModifyAlertConfigRequest() {
		super("Ess", "2014-08-28", "ModifyAlertConfig", "ESS");
	}

	private Integer successConfig;

	private Integer rejectConfig;

	private String resourceOwnerAccount;

	private String scalingGroupId;

	private Long ownerId;

	private Integer failConfig;

	public Integer getSuccessConfig() {
		return this.successConfig;
	}

	public void setSuccessConfig(Integer successConfig) {
		this.successConfig = successConfig;
		if(successConfig != null){
			putQueryParameter("SuccessConfig", successConfig.toString());
		}
	}

	public Integer getRejectConfig() {
		return this.rejectConfig;
	}

	public void setRejectConfig(Integer rejectConfig) {
		this.rejectConfig = rejectConfig;
		if(rejectConfig != null){
			putQueryParameter("RejectConfig", rejectConfig.toString());
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public Integer getFailConfig() {
		return this.failConfig;
	}

	public void setFailConfig(Integer failConfig) {
		this.failConfig = failConfig;
		if(failConfig != null){
			putQueryParameter("FailConfig", failConfig.toString());
		}
	}

	@Override
	public Class<ModifyAlertConfigResponse> getResponseClass() {
		return ModifyAlertConfigResponse.class;
	}

}
