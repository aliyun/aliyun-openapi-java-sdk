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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateImportMigrationRequest extends RpcAcsRequest<CreateImportMigrationResponse> {
	   

	private String description;

	private String commitRule;

	private String workspaceMap;

	private String calculateEngineMap;

	private String name;

	private String packageType;

	private Long projectId;

	private String packageOssDownloadLink;
	public CreateImportMigrationRequest() {
		super("dataworks-public", "2020-05-18", "CreateImportMigration");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCommitRule() {
		return this.commitRule;
	}

	public void setCommitRule(String commitRule) {
		this.commitRule = commitRule;
		if(commitRule != null){
			putBodyParameter("CommitRule", commitRule);
		}
	}

	public String getWorkspaceMap() {
		return this.workspaceMap;
	}

	public void setWorkspaceMap(String workspaceMap) {
		this.workspaceMap = workspaceMap;
		if(workspaceMap != null){
			putBodyParameter("WorkspaceMap", workspaceMap);
		}
	}

	public String getCalculateEngineMap() {
		return this.calculateEngineMap;
	}

	public void setCalculateEngineMap(String calculateEngineMap) {
		this.calculateEngineMap = calculateEngineMap;
		if(calculateEngineMap != null){
			putBodyParameter("CalculateEngineMap", calculateEngineMap);
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

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
		if(packageType != null){
			putBodyParameter("PackageType", packageType);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getPackageOssDownloadLink() {
		return this.packageOssDownloadLink;
	}

	public void setPackageOssDownloadLink(String packageOssDownloadLink) {
		this.packageOssDownloadLink = packageOssDownloadLink;
		if(packageOssDownloadLink != null){
			putBodyParameter("PackageOssDownloadLink", packageOssDownloadLink);
		}
	}

	@Override
	public Class<CreateImportMigrationResponse> getResponseClass() {
		return CreateImportMigrationResponse.class;
	}

}
