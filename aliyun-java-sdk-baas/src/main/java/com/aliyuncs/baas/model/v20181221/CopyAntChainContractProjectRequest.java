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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CopyAntChainContractProjectRequest extends RpcAcsRequest<CopyAntChainContractProjectResponse> {
	   

	private String projectVersion;

	private String projectId;

	private String projectName;

	private String projectDescription;
	public CopyAntChainContractProjectRequest() {
		super("Baas", "2018-12-21", "CopyAntChainContractProject", "baas");
		setMethod(MethodType.PUT);
	}

	public String getProjectVersion() {
		return this.projectVersion;
	}

	public void setProjectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
		if(projectVersion != null){
			putBodyParameter("ProjectVersion", projectVersion);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
		if(projectDescription != null){
			putBodyParameter("ProjectDescription", projectDescription);
		}
	}

	@Override
	public Class<CopyAntChainContractProjectResponse> getResponseClass() {
		return CopyAntChainContractProjectResponse.class;
	}

}
