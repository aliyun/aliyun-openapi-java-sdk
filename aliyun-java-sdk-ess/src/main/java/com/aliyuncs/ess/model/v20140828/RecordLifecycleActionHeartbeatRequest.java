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
public class RecordLifecycleActionHeartbeatRequest extends RpcAcsRequest<RecordLifecycleActionHeartbeatResponse> {
	   

	private String lifecycleActionToken;

	private Integer heartbeatTimeout;

	private String resourceOwnerAccount;

	private String lifecycleHookId;

	private String ownerAccount;

	private Long ownerId;
	public RecordLifecycleActionHeartbeatRequest() {
		super("Ess", "2014-08-28", "RecordLifecycleActionHeartbeat", "ess");
		setMethod(MethodType.POST);
	}

	public String getLifecycleActionToken() {
		return this.lifecycleActionToken;
	}

	public void setLifecycleActionToken(String lifecycleActionToken) {
		this.lifecycleActionToken = lifecycleActionToken;
		if(lifecycleActionToken != null){
			putQueryParameter("lifecycleActionToken", lifecycleActionToken);
		}
	}

	public Integer getHeartbeatTimeout() {
		return this.heartbeatTimeout;
	}

	public void setHeartbeatTimeout(Integer heartbeatTimeout) {
		this.heartbeatTimeout = heartbeatTimeout;
		if(heartbeatTimeout != null){
			putQueryParameter("heartbeatTimeout", heartbeatTimeout.toString());
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
			putQueryParameter("lifecycleHookId", lifecycleHookId);
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

	@Override
	public Class<RecordLifecycleActionHeartbeatResponse> getResponseClass() {
		return RecordLifecycleActionHeartbeatResponse.class;
	}

}
