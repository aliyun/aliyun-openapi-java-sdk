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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class StartRestoreTaskRequest extends RpcAcsRequest<StartRestoreTaskResponse> {
	
	public StartRestoreTaskRequest() {
		super("Dbs", "2019-03-06", "StartRestoreTask", "cbs");
	}

	private String clientToken;

	private String restoreTaskId;

	private String ownerId;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getRestoreTaskId() {
		return this.restoreTaskId;
	}

	public void setRestoreTaskId(String restoreTaskId) {
		this.restoreTaskId = restoreTaskId;
		if(restoreTaskId != null){
			putQueryParameter("RestoreTaskId", restoreTaskId);
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

	@Override
	public Class<StartRestoreTaskResponse> getResponseClass() {
		return StartRestoreTaskResponse.class;
	}

}
