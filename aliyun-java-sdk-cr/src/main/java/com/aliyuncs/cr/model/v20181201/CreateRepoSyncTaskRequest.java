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
public class CreateRepoSyncTaskRequest extends RpcAcsRequest<CreateRepoSyncTaskResponse> {
	   

	private String repoId;

	private String targetRepoName;

	private String targetNamespace;

	private String targetTag;

	private String targetUserId;

	private String tag;

	private Boolean override;

	private String instanceId;

	private String targetInstanceId;

	private String targetRegionId;
	public CreateRepoSyncTaskRequest() {
		super("cr", "2018-12-01", "CreateRepoSyncTask", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTargetRepoName() {
		return this.targetRepoName;
	}

	public void setTargetRepoName(String targetRepoName) {
		this.targetRepoName = targetRepoName;
		if(targetRepoName != null){
			putQueryParameter("TargetRepoName", targetRepoName);
		}
	}

	public String getTargetNamespace() {
		return this.targetNamespace;
	}

	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
		if(targetNamespace != null){
			putQueryParameter("TargetNamespace", targetNamespace);
		}
	}

	public String getTargetTag() {
		return this.targetTag;
	}

	public void setTargetTag(String targetTag) {
		this.targetTag = targetTag;
		if(targetTag != null){
			putQueryParameter("TargetTag", targetTag);
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public Boolean getOverride() {
		return this.override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
		if(override != null){
			putQueryParameter("Override", override.toString());
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

	public String getTargetRegionId() {
		return this.targetRegionId;
	}

	public void setTargetRegionId(String targetRegionId) {
		this.targetRegionId = targetRegionId;
		if(targetRegionId != null){
			putQueryParameter("TargetRegionId", targetRegionId);
		}
	}

	@Override
	public Class<CreateRepoSyncTaskResponse> getResponseClass() {
		return CreateRepoSyncTaskResponse.class;
	}

}
