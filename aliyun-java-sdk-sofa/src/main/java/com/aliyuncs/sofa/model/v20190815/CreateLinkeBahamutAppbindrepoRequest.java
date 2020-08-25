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
public class CreateLinkeBahamutAppbindrepoRequest extends RpcAcsRequest<CreateLinkeBahamutAppbindrepoResponse> {
	   

	private String repo;

	private String description;

	private String initProject;

	private String appName;

	private String tenantId;

	private String visibilityLevel;

	private String group;
	public CreateLinkeBahamutAppbindrepoRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutAppbindrepo", "sofa");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
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
	public Class<CreateLinkeBahamutAppbindrepoResponse> getResponseClass() {
		return CreateLinkeBahamutAppbindrepoResponse.class;
	}

}
