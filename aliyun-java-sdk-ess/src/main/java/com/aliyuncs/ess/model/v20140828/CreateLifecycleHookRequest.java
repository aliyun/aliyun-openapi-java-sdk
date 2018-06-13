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

/**
 * @author auto create
 * @version 
 */
public class CreateLifecycleHookRequest extends RpcAcsRequest<CreateLifecycleHookResponse> {
	
	public CreateLifecycleHookRequest() {
		super("Ess", "2014-08-28", "CreateLifecycleHook", "ess");
	}

	private String defaultResult;

	private String resourceOwnerAccount;

	private Integer heartbeatTimeout;

	private String scalingGroupId;

	private String ownerAccount;

	private String notificationMetadata;

	private Long ownerId;

	private String lifecycleTransition;

	private String lifecycleHookName;

	private String notificationArn;

	private List<LifecycleHook> lifecycleHooks;

	public String getDefaultResult() {
		return this.defaultResult;
	}

	public void setDefaultResult(String defaultResult) {
		this.defaultResult = defaultResult;
		if(defaultResult != null){
			putQueryParameter("DefaultResult", defaultResult);
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

	public List<LifecycleHook> getLifecycleHooks() {
		return this.lifecycleHooks;
	}

	public void setLifecycleHooks(List<LifecycleHook> lifecycleHooks) {
		this.lifecycleHooks = lifecycleHooks;	
		if (lifecycleHooks != null) {
			for (int depth1 = 0; depth1 < lifecycleHooks.size(); depth1++) {
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".LifecycleHookName" , lifecycleHooks.get(depth1).getLifecycleHookName());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".LifecycleTransition" , lifecycleHooks.get(depth1).getLifecycleTransition());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".DefaultResult" , lifecycleHooks.get(depth1).getDefaultResult());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".HeartbeatTimeout" , lifecycleHooks.get(depth1).getHeartbeatTimeout());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".NotificationMetadata" , lifecycleHooks.get(depth1).getNotificationMetadata());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".NotificationArn" , lifecycleHooks.get(depth1).getNotificationArn());
			}
		}	
	}

	public static class LifecycleHook {

		private String lifecycleHookName;

		private String lifecycleTransition;

		private String defaultResult;

		private Integer heartbeatTimeout;

		private String notificationMetadata;

		private String notificationArn;

		public String getLifecycleHookName() {
			return this.lifecycleHookName;
		}

		public void setLifecycleHookName(String lifecycleHookName) {
			this.lifecycleHookName = lifecycleHookName;
		}

		public String getLifecycleTransition() {
			return this.lifecycleTransition;
		}

		public void setLifecycleTransition(String lifecycleTransition) {
			this.lifecycleTransition = lifecycleTransition;
		}

		public String getDefaultResult() {
			return this.defaultResult;
		}

		public void setDefaultResult(String defaultResult) {
			this.defaultResult = defaultResult;
		}

		public Integer getHeartbeatTimeout() {
			return this.heartbeatTimeout;
		}

		public void setHeartbeatTimeout(Integer heartbeatTimeout) {
			this.heartbeatTimeout = heartbeatTimeout;
		}

		public String getNotificationMetadata() {
			return this.notificationMetadata;
		}

		public void setNotificationMetadata(String notificationMetadata) {
			this.notificationMetadata = notificationMetadata;
		}

		public String getNotificationArn() {
			return this.notificationArn;
		}

		public void setNotificationArn(String notificationArn) {
			this.notificationArn = notificationArn;
		}
	}

	@Override
	public Class<CreateLifecycleHookResponse> getResponseClass() {
		return CreateLifecycleHookResponse.class;
	}

}
