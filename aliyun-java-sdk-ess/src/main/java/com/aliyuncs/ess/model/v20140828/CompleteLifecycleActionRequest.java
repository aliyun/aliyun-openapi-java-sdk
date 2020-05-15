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
public class CompleteLifecycleActionRequest extends RpcAcsRequest<CompleteLifecycleActionResponse> {
	   

	private String lifecycleActionToken;

	private String resourceOwnerAccount;

	private String lifecycleHookId;

	private String ownerAccount;

	private Long ownerId;

	private String lifecycleActionResult;
	public CompleteLifecycleActionRequest() {
		super("Ess", "2014-08-28", "CompleteLifecycleAction", "ess");
		setMethod(MethodType.POST);
	}

	public String getLifecycleActionToken() {
		return this.lifecycleActionToken;
	}

	public void setLifecycleActionToken(String lifecycleActionToken) {
		this.lifecycleActionToken = lifecycleActionToken;
		if(lifecycleActionToken != null){
			putQueryParameter("LifecycleActionToken", lifecycleActionToken);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLifecycleActionResult() {
		return this.lifecycleActionResult;
	}

	public void setLifecycleActionResult(String lifecycleActionResult) {
		this.lifecycleActionResult = lifecycleActionResult;
		if(lifecycleActionResult != null){
			putQueryParameter("LifecycleActionResult", lifecycleActionResult);
		}
	}

	@Override
	public Class<CompleteLifecycleActionResponse> getResponseClass() {
		return CompleteLifecycleActionResponse.class;
	}

}
