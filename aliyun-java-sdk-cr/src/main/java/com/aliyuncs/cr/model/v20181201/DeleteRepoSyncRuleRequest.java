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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteRepoSyncRuleRequest extends RpcAcsRequest<DeleteRepoSyncRuleResponse> {
	   

	private String instanceId;

	private String syncRuleId;
	public DeleteRepoSyncRuleRequest() {
		super("cr", "2018-12-01", "DeleteRepoSyncRule", "acr");
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSyncRuleId() {
		return this.syncRuleId;
	}

	public void setSyncRuleId(String syncRuleId) {
		this.syncRuleId = syncRuleId;
		if(syncRuleId != null){
			putQueryParameter("SyncRuleId", syncRuleId);
		}
	}

	@Override
	public Class<DeleteRepoSyncRuleResponse> getResponseClass() {
		return DeleteRepoSyncRuleResponse.class;
	}

}
