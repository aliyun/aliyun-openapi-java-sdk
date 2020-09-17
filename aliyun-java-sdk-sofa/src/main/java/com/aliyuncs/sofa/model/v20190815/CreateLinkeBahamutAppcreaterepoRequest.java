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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutAppcreaterepoRequest extends RpcAcsRequest<CreateLinkeBahamutAppcreaterepoResponse> {
	   

	private String repo;

	private String repoDescription;

	private String initProject;

	private String tenantIdOrg;

	private String visibilityLevel;

	private String group;
	public CreateLinkeBahamutAppcreaterepoRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutAppcreaterepo", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRepo() {
		return this.repo;
	}

	public void setRepo(String repo) {
		this.repo = repo;
		if(repo != null){
			putBodyParameter("Repo", repo);
		}
	}

	public String getRepoDescription() {
		return this.repoDescription;
	}

	public void setRepoDescription(String repoDescription) {
		this.repoDescription = repoDescription;
		if(repoDescription != null){
			putBodyParameter("RepoDescription", repoDescription);
		}
	}

	public String getInitProject() {
		return this.initProject;
	}

	public void setInitProject(String initProject) {
		this.initProject = initProject;
		if(initProject != null){
			putBodyParameter("InitProject", initProject);
		}
	}

	public String getTenantIdOrg() {
		return this.tenantIdOrg;
	}

	public void setTenantIdOrg(String tenantIdOrg) {
		this.tenantIdOrg = tenantIdOrg;
		if(tenantIdOrg != null){
			putBodyParameter("TenantIdOrg", tenantIdOrg);
		}
	}

	public String getVisibilityLevel() {
		return this.visibilityLevel;
	}

	public void setVisibilityLevel(String visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
		if(visibilityLevel != null){
			putBodyParameter("VisibilityLevel", visibilityLevel);
		}
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
		if(group != null){
			putBodyParameter("Group", group);
		}
	}

	@Override
	public Class<CreateLinkeBahamutAppcreaterepoResponse> getResponseClass() {
		return CreateLinkeBahamutAppcreaterepoResponse.class;
	}

}
