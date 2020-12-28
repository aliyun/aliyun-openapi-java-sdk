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

package com.aliyuncs.nlp_automl.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectRequest extends RpcAcsRequest<CreateProjectResponse> {
	   

	private String projectName;

	private String projectDescription;

	private String projectType;
	public CreateProjectRequest() {
		super("nlp-automl", "2019-11-11", "CreateProject", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
		if(projectType != null){
			putBodyParameter("ProjectType", projectType);
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
