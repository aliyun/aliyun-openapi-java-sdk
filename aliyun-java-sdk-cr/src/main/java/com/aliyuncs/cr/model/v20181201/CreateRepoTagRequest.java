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
public class CreateRepoTagRequest extends RpcAcsRequest<CreateRepoTagResponse> {
	   

	private String namespaceName;

	private String fromTag;

	private String toTag;

	private String instanceId;

	private String repoName;
	public CreateRepoTagRequest() {
		super("cr", "2018-12-01", "CreateRepoTag", "acr");
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

	public String getFromTag() {
		return this.fromTag;
	}

	public void setFromTag(String fromTag) {
		this.fromTag = fromTag;
		if(fromTag != null){
			putQueryParameter("FromTag", fromTag);
		}
	}

	public String getToTag() {
		return this.toTag;
	}

	public void setToTag(String toTag) {
		this.toTag = toTag;
		if(toTag != null){
			putQueryParameter("ToTag", toTag);
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

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	@Override
	public Class<CreateRepoTagResponse> getResponseClass() {
		return CreateRepoTagResponse.class;
	}

}
