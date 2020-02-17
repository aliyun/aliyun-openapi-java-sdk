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
public class ModifyLifecycleHookRequest extends RpcAcsRequest<ModifyLifecycleHookResponse> {
	   

	private String defaultResult;

	private Integer heartbeatTimeout;

	private String scalingGroupId;

	private String lifecycleTransition;

	private String lifecycleHookName;

	private String notificationArn;

	private String resourceOwnerAccount;

	private String lifecycleHookId;

	private String ownerAccount;

	private String notificationMetadata;

	private Long ownerId;
	public ModifyLifecycleHookRequest() {
		super("Ess", "2014-08-28", "ModifyLifecycleHook", "ess");
		setMethod(MethodType.POST);
	}

	public String getDefaultResult() {
		return this.defaultResult;
	}

	public void setDefaultResult(String defaultResult) {
		this.defaultResult = defaultResult;
		if(defaultResult != null){
			putQueryParameter("DefaultResult", defaultResult);
		}
	}

	public Integer getHeartbeatTimeout() {
		return this.heartbeatTimeout;
	}

	public void setHeartbeatTimeout(Integer heartbeatTimeout) {
		this.heartbeatTimeout = heartbeatTimeout;
		if(heartbeatTimeout != null){
			putQueryParameter("HeartbeatTimeout", heartbeatTimeout.toString());
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

	public String getLifecycleTransition() {
		return this.lifecycleTransition;
	}

	public void setLifecycleTransition(String lifecycleTransition) {
		this.lifecycleTransition = lifecycleTransition;
		if(lifecycleTransition != null){
			putQueryParameter("LifecycleTransition", lifecycleTransition);
		}
	}

	public String getLifecycleHookName() {
		return this.lifecycleHookName;
	}

	public void setLifecycleHookName(String lifecycleHookName) {
		this.lifecycleHookName = lifecycleHookName;
		if(lifecycleHookName != null){
			putQueryParameter("LifecycleHookName", lifecycleHookName);
		}
	}

	public String getNotificationArn() {
		return this.notificationArn;
	}

	public void setNotificationArn(String notificationArn) {
		this.notificationArn = notificationArn;
		if(notificationArn != null){
			putQueryParameter("NotificationArn", notificationArn);
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

	public String getLifecycleHookId() {
		return this.lifecycleHookId;
	}

	public void setLifecycleHookId(String lifecycleHookId) {
		this.lifecycleHookId = lifecycleHookId;
		if(lifecycleHookId != null){
			putQueryParameter("LifecycleHookId", lifecycleHookId);
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

	public String getNotificationMetadata() {
		return this.notificationMetadata;
	}

	public void setNotificationMetadata(String notificationMetadata) {
		this.notificationMetadata = notificationMetadata;
		if(notificationMetadata != null){
			putQueryParameter("NotificationMetadata", notificationMetadata);
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

	@Override
	public Class<ModifyLifecycleHookResponse> getResponseClass() {
		return ModifyLifecycleHookResponse.class;
	}

}
