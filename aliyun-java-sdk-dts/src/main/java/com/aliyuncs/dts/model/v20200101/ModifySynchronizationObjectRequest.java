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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifySynchronizationObjectRequest extends RpcAcsRequest<ModifySynchronizationObjectResponse> {
	   

	private String synchronizationObjects;

	private String ownerId;

	private String synchronizationJobId;

	private String accountId;

	private String synchronizationDirection;
	public ModifySynchronizationObjectRequest() {
		super("Dts", "2020-01-01", "ModifySynchronizationObject");
		setMethod(MethodType.POST);
	}

	public String getSynchronizationObjects() {
		return this.synchronizationObjects;
	}

	public void setSynchronizationObjects(String synchronizationObjects) {
		this.synchronizationObjects = synchronizationObjects;
		if(synchronizationObjects != null){
			putQueryParameter("SynchronizationObjects", synchronizationObjects);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getSynchronizationJobId() {
		return this.synchronizationJobId;
	}

	public void setSynchronizationJobId(String synchronizationJobId) {
		this.synchronizationJobId = synchronizationJobId;
		if(synchronizationJobId != null){
			putQueryParameter("SynchronizationJobId", synchronizationJobId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
		if(synchronizationDirection != null){
			putQueryParameter("SynchronizationDirection", synchronizationDirection);
		}
	}

	@Override
	public Class<ModifySynchronizationObjectResponse> getResponseClass() {
		return ModifySynchronizationObjectResponse.class;
	}

}
