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
public class UpdateRepoSourceCodeRepoRequest extends RpcAcsRequest<UpdateRepoSourceCodeRepoResponse> {
	   

	private String codeRepoType;

	private String repoId;

	private String autoBuild;

	private String disableCacheBuild;

	private String codeRepoId;

	private String overseaBuild;

	private String instanceId;

	private String codeRepoNamespaceName;

	private String codeRepoName;
	public UpdateRepoSourceCodeRepoRequest() {
		super("cr", "2018-12-01", "UpdateRepoSourceCodeRepo", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCodeRepoType() {
		return this.codeRepoType;
	}

	public void setCodeRepoType(String codeRepoType) {
		this.codeRepoType = codeRepoType;
		if(codeRepoType != null){
			putQueryParameter("CodeRepoType", codeRepoType);
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

	public String getAutoBuild() {
		return this.autoBuild;
	}

	public void setAutoBuild(String autoBuild) {
		this.autoBuild = autoBuild;
		if(autoBuild != null){
			putQueryParameter("AutoBuild", autoBuild);
		}
	}

	public String getDisableCacheBuild() {
		return this.disableCacheBuild;
	}

	public void setDisableCacheBuild(String disableCacheBuild) {
		this.disableCacheBuild = disableCacheBuild;
		if(disableCacheBuild != null){
			putQueryParameter("DisableCacheBuild", disableCacheBuild);
		}
	}

	public String getCodeRepoId() {
		return this.codeRepoId;
	}

	public void setCodeRepoId(String codeRepoId) {
		this.codeRepoId = codeRepoId;
		if(codeRepoId != null){
			putQueryParameter("CodeRepoId", codeRepoId);
		}
	}

	public String getOverseaBuild() {
		return this.overseaBuild;
	}

	public void setOverseaBuild(String overseaBuild) {
		this.overseaBuild = overseaBuild;
		if(overseaBuild != null){
			putQueryParameter("OverseaBuild", overseaBuild);
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

	public String getCodeRepoNamespaceName() {
		return this.codeRepoNamespaceName;
	}

	public void setCodeRepoNamespaceName(String codeRepoNamespaceName) {
		this.codeRepoNamespaceName = codeRepoNamespaceName;
		if(codeRepoNamespaceName != null){
			putQueryParameter("CodeRepoNamespaceName", codeRepoNamespaceName);
		}
	}

	public String getCodeRepoName() {
		return this.codeRepoName;
	}

	public void setCodeRepoName(String codeRepoName) {
		this.codeRepoName = codeRepoName;
		if(codeRepoName != null){
			putQueryParameter("CodeRepoName", codeRepoName);
		}
	}

	@Override
	public Class<UpdateRepoSourceCodeRepoResponse> getResponseClass() {
		return UpdateRepoSourceCodeRepoResponse.class;
	}

}
