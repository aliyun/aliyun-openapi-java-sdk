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
public class CreateCasApplicationRequest extends RpcAcsRequest<CreateCasApplicationResponse> {
	   

	private String workspace;

	private Boolean codeRepositoryExisted;

	private String codeRepositoryName;

	private String stackId;

	private String description;

	private String appDomainId;

	private String authorization;

	private String chineseName;

	private String codeRepositoryGroupName;

	private String buildpackVersion;

	private String ownerId;

	private String appLevelId;

	private String name;

	private String codeRepositoryType;
	public CreateCasApplicationRequest() {
		super("SOFA", "2019-08-15", "CreateCasApplication", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public Boolean getCodeRepositoryExisted() {
		return this.codeRepositoryExisted;
	}

	public void setCodeRepositoryExisted(Boolean codeRepositoryExisted) {
		this.codeRepositoryExisted = codeRepositoryExisted;
		if(codeRepositoryExisted != null){
			putBodyParameter("CodeRepositoryExisted", codeRepositoryExisted.toString());
		}
	}

	public String getCodeRepositoryName() {
		return this.codeRepositoryName;
	}

	public void setCodeRepositoryName(String codeRepositoryName) {
		this.codeRepositoryName = codeRepositoryName;
		if(codeRepositoryName != null){
			putBodyParameter("CodeRepositoryName", codeRepositoryName);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putBodyParameter("StackId", stackId);
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

	public String getAppDomainId() {
		return this.appDomainId;
	}

	public void setAppDomainId(String appDomainId) {
		this.appDomainId = appDomainId;
		if(appDomainId != null){
			putBodyParameter("AppDomainId", appDomainId);
		}
	}

	public String getAuthorization() {
		return this.authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
		if(authorization != null){
			putBodyParameter("Authorization", authorization);
		}
	}

	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
		if(chineseName != null){
			putBodyParameter("ChineseName", chineseName);
		}
	}

	public String getCodeRepositoryGroupName() {
		return this.codeRepositoryGroupName;
	}

	public void setCodeRepositoryGroupName(String codeRepositoryGroupName) {
		this.codeRepositoryGroupName = codeRepositoryGroupName;
		if(codeRepositoryGroupName != null){
			putBodyParameter("CodeRepositoryGroupName", codeRepositoryGroupName);
		}
	}

	public String getBuildpackVersion() {
		return this.buildpackVersion;
	}

	public void setBuildpackVersion(String buildpackVersion) {
		this.buildpackVersion = buildpackVersion;
		if(buildpackVersion != null){
			putBodyParameter("BuildpackVersion", buildpackVersion);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putBodyParameter("OwnerId", ownerId);
		}
	}

	public String getAppLevelId() {
		return this.appLevelId;
	}

	public void setAppLevelId(String appLevelId) {
		this.appLevelId = appLevelId;
		if(appLevelId != null){
			putBodyParameter("AppLevelId", appLevelId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCodeRepositoryType() {
		return this.codeRepositoryType;
	}

	public void setCodeRepositoryType(String codeRepositoryType) {
		this.codeRepositoryType = codeRepositoryType;
		if(codeRepositoryType != null){
			putBodyParameter("CodeRepositoryType", codeRepositoryType);
		}
	}

	@Override
	public Class<CreateCasApplicationResponse> getResponseClass() {
		return CreateCasApplicationResponse.class;
	}

}
