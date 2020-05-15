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

/**
 * @author auto create
 * @version 
 */
public class CreateNotificationConfigurationRequest extends RpcAcsRequest<CreateNotificationConfigurationResponse> {
	   

	private String scalingGroupId;

	private String notificationArn;

	private String resourceOwnerAccount;

	private Long ownerId;

	private List<String> notificationTypes;
	public CreateNotificationConfigurationRequest() {
		super("Ess", "2014-08-28", "CreateNotificationConfiguration", "ess");
		setMethod(MethodType.POST);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getNotificationTypes() {
		return this.notificationTypes;
	}

	public void setNotificationTypes(List<String> notificationTypes) {
		this.notificationTypes = notificationTypes;	
		if (notificationTypes != null) {
			for (int i = 0; i < notificationTypes.size(); i++) {
				putQueryParameter("NotificationType." + (i + 1) , notificationTypes.get(i));
			}
		}	
	}

	@Override
	public Class<CreateNotificationConfigurationResponse> getResponseClass() {
		return CreateNotificationConfigurationResponse.class;
	}

}
