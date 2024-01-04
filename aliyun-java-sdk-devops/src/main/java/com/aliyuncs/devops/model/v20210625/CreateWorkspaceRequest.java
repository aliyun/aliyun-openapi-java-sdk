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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWorkspaceRequest extends RoaAcsRequest<CreateWorkspaceResponse> {
	   

	private String codeUrl;

	private Boolean reuse;

	private String resourceIdentifier;

	private String requestFrom;

	private String workspaceTemplate;

	private String filePath;

	private String name;

	private String codeVersion;
	public CreateWorkspaceRequest() {
		super("devops", "2021-06-25", "CreateWorkspace");
		setUriPattern("/api/workspaces");
		setMethod(MethodType.POST);
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
		if(codeUrl != null){
			putBodyParameter("codeUrl", codeUrl);
		}
	}

	public Boolean getReuse() {
		return this.reuse;
	}

	public void setReuse(Boolean reuse) {
		this.reuse = reuse;
		if(reuse != null){
			putBodyParameter("reuse", reuse.toString());
		}
	}

	public String getResourceIdentifier() {
		return this.resourceIdentifier;
	}

	public void setResourceIdentifier(String resourceIdentifier) {
		this.resourceIdentifier = resourceIdentifier;
		if(resourceIdentifier != null){
			putBodyParameter("resourceIdentifier", resourceIdentifier);
		}
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
		if(requestFrom != null){
			putBodyParameter("requestFrom", requestFrom);
		}
	}

	public String getWorkspaceTemplate() {
		return this.workspaceTemplate;
	}

	public void setWorkspaceTemplate(String workspaceTemplate) {
		this.workspaceTemplate = workspaceTemplate;
		if(workspaceTemplate != null){
			putBodyParameter("workspaceTemplate", workspaceTemplate);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("filePath", filePath);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("name", name);
		}
	}

	public String getCodeVersion() {
		return this.codeVersion;
	}

	public void setCodeVersion(String codeVersion) {
		this.codeVersion = codeVersion;
		if(codeVersion != null){
			putBodyParameter("codeVersion", codeVersion);
		}
	}

	@Override
	public Class<CreateWorkspaceResponse> getResponseClass() {
		return CreateWorkspaceResponse.class;
	}

}
