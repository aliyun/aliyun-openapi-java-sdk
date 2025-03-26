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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachInstancesRequest extends RpcAcsRequest<DetachInstancesResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String scalingGroupId;

	private Boolean decreaseDesiredCapacity;

	private Boolean ignoreInvalidInstance;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String detachOption;

	private List<String> instanceIds;

	private Boolean lifecycleHook;
	public DetachInstancesRequest() {
		super("Ess", "2014-08-28", "DetachInstances", "ess");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Boolean getDecreaseDesiredCapacity() {
		return this.decreaseDesiredCapacity;
	}

	public void setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
		this.decreaseDesiredCapacity = decreaseDesiredCapacity;
		if(decreaseDesiredCapacity != null){
			putQueryParameter("DecreaseDesiredCapacity", decreaseDesiredCapacity.toString());
		}
	}

	public Boolean getIgnoreInvalidInstance() {
		return this.ignoreInvalidInstance;
	}

	public void setIgnoreInvalidInstance(Boolean ignoreInvalidInstance) {
		this.ignoreInvalidInstance = ignoreInvalidInstance;
		if(ignoreInvalidInstance != null){
			putQueryParameter("IgnoreInvalidInstance", ignoreInvalidInstance.toString());
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

	public String getDetachOption() {
		return this.detachOption;
	}

	public void setDetachOption(String detachOption) {
		this.detachOption = detachOption;
		if(detachOption != null){
			putQueryParameter("DetachOption", detachOption);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public Boolean getLifecycleHook() {
		return this.lifecycleHook;
	}

	public void setLifecycleHook(Boolean lifecycleHook) {
		this.lifecycleHook = lifecycleHook;
		if(lifecycleHook != null){
			putQueryParameter("LifecycleHook", lifecycleHook.toString());
		}
	}

	@Override
	public Class<DetachInstancesResponse> getResponseClass() {
		return DetachInstancesResponse.class;
	}

}
