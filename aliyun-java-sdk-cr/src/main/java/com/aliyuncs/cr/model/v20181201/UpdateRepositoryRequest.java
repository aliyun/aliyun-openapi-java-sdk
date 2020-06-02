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
public class UpdateRepositoryRequest extends RpcAcsRequest<UpdateRepositoryResponse> {
	   

	private String repoType;

	private String summary;

	private String repoId;

	private String instanceId;

	private String detail;
	public UpdateRepositoryRequest() {
		super("cr", "2018-12-01", "UpdateRepository", "acr");
		setMethod(MethodType.POST);
	}

	public String getRepoType() {
		return this.repoType;
	}

	public void setRepoType(String repoType) {
		this.repoType = repoType;
		if(repoType != null){
			putQueryParameter("RepoType", repoType);
		}
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
		if(summary != null){
			putQueryParameter("Summary", summary);
		}
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	@Override
	public Class<UpdateRepositoryResponse> getResponseClass() {
		return UpdateRepositoryResponse.class;
	}

}
