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
public class CreateBuildRecordByRuleRequest extends RpcAcsRequest<CreateBuildRecordByRuleResponse> {
	   

	private String repoId;

	private String buildRuleId;

	private String instanceId;
	public CreateBuildRecordByRuleRequest() {
		super("cr", "2018-12-01", "CreateBuildRecordByRule", "acr");
		setMethod(MethodType.POST);
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public String getBuildRuleId() {
		return this.buildRuleId;
	}

	public void setBuildRuleId(String buildRuleId) {
		this.buildRuleId = buildRuleId;
		if(buildRuleId != null){
			putQueryParameter("BuildRuleId", buildRuleId);
		}
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

	@Override
	public Class<CreateBuildRecordByRuleResponse> getResponseClass() {
		return CreateBuildRecordByRuleResponse.class;
	}

}
