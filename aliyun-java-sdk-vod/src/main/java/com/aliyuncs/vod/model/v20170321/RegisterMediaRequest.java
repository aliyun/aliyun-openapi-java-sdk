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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterMediaRequest extends RpcAcsRequest<RegisterMediaResponse> {
	   

	private String userData;

	private String templateGroupId;

	private String registerMetadatas;

	private String workflowId;
	public RegisterMediaRequest() {
		super("vod", "2017-03-21", "RegisterMedia", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getTemplateGroupId() {
		return this.templateGroupId;
	}

	public void setTemplateGroupId(String templateGroupId) {
		this.templateGroupId = templateGroupId;
		if(templateGroupId != null){
			putQueryParameter("TemplateGroupId", templateGroupId);
		}
	}

	public String getRegisterMetadatas() {
		return this.registerMetadatas;
	}

	public void setRegisterMetadatas(String registerMetadatas) {
		this.registerMetadatas = registerMetadatas;
		if(registerMetadatas != null){
			putQueryParameter("RegisterMetadatas", registerMetadatas);
		}
	}

	public String getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
		if(workflowId != null){
			putQueryParameter("WorkflowId", workflowId);
		}
	}

	@Override
	public Class<RegisterMediaResponse> getResponseClass() {
		return RegisterMediaResponse.class;
	}

}
