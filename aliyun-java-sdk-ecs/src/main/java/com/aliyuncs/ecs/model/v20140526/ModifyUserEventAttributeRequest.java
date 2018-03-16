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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyUserEventAttributeRequest extends RpcAcsRequest<ModifyUserEventAttributeResponse> {
	
	public ModifyUserEventAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyUserEventAttribute", "ecs");
	}

	private String eventId;

	private Long resourceOwnerId;

	private String resourceId;

	private String resourceOwnerAccount;

	private String newPlanTime;

	private Long ownerId;

	private String newExpireTime;

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putQueryParameter("EventId", eventId);
		}
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

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
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

	public String getNewPlanTime() {
		return this.newPlanTime;
	}

	public void setNewPlanTime(String newPlanTime) {
		this.newPlanTime = newPlanTime;
		if(newPlanTime != null){
			putQueryParameter("NewPlanTime", newPlanTime);
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

	public String getNewExpireTime() {
		return this.newExpireTime;
	}

	public void setNewExpireTime(String newExpireTime) {
		this.newExpireTime = newExpireTime;
		if(newExpireTime != null){
			putQueryParameter("NewExpireTime", newExpireTime);
		}
	}

	@Override
	public Class<ModifyUserEventAttributeResponse> getResponseClass() {
		return ModifyUserEventAttributeResponse.class;
	}

}
