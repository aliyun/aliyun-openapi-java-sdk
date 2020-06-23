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
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRepoSyncRuleRequest extends RpcAcsRequest<CreateRepoSyncRuleResponse> {
	   

	private String namespaceName;

	private String targetRepoName;

	private String syncScope;

	private String syncRuleName;

	private String tagFilter;

	private String targetNamespaceName;

	private String instanceId;

	private String targetInstanceId;

	private String repoName;

	private String targetRegionId;

	private String syncTrigger;
	public CreateRepoSyncRuleRequest() {
		super("cr", "2018-12-01", "CreateRepoSyncRule", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
		if(namespaceName != null){
			putQueryParameter("NamespaceName", namespaceName);
		}
	}

	public String getTargetRepoName() {
		return this.targetRepoName;
	}

	public void setTargetRepoName(String targetRepoName) {
		this.targetRepoName = targetRepoName;
		if(targetRepoName != null){
			putQueryParameter("TargetRepoName", targetRepoName);
		}
	}

	public String getSyncScope() {
		return this.syncScope;
	}

	public void setSyncScope(String syncScope) {
		this.syncScope = syncScope;
		if(syncScope != null){
			putQueryParameter("SyncScope", syncScope);
		}
	}

	public String getSyncRuleName() {
		return this.syncRuleName;
	}

	public void setSyncRuleName(String syncRuleName) {
		this.syncRuleName = syncRuleName;
		if(syncRuleName != null){
			putQueryParameter("SyncRuleName", syncRuleName);
		}
	}

	public String getTagFilter() {
		return this.tagFilter;
	}

	public void setTagFilter(String tagFilter) {
		this.tagFilter = tagFilter;
		if(tagFilter != null){
			putQueryParameter("TagFilter", tagFilter);
		}
	}

	public String getTargetNamespaceName() {
		return this.targetNamespaceName;
	}

	public void setTargetNamespaceName(String targetNamespaceName) {
		this.targetNamespaceName = targetNamespaceName;
		if(targetNamespaceName != null){
			putQueryParameter("TargetNamespaceName", targetNamespaceName);
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

	public String getTargetInstanceId() {
		return this.targetInstanceId;
	}

	public void setTargetInstanceId(String targetInstanceId) {
		this.targetInstanceId = targetInstanceId;
		if(targetInstanceId != null){
			putQueryParameter("TargetInstanceId", targetInstanceId);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	public String getTargetRegionId() {
		return this.targetRegionId;
	}

	public void setTargetRegionId(String targetRegionId) {
		this.targetRegionId = targetRegionId;
		if(targetRegionId != null){
			putQueryParameter("TargetRegionId", targetRegionId);
		}
	}

	public String getSyncTrigger() {
		return this.syncTrigger;
	}

	public void setSyncTrigger(String syncTrigger) {
		this.syncTrigger = syncTrigger;
		if(syncTrigger != null){
			putQueryParameter("SyncTrigger", syncTrigger);
		}
	}

	@Override
	public Class<CreateRepoSyncRuleResponse> getResponseClass() {
		return CreateRepoSyncRuleResponse.class;
	}

}
