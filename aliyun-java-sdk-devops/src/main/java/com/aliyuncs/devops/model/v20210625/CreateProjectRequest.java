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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectRequest extends RoaAcsRequest<CreateProjectResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateProjectRequest() {
		super("devops", "2021-06-25", "CreateProject");
		setUriPattern("/organization/[organizationId]/projects/createProject");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public static class Body {

		@SerializedName("templateIdentifier")
		private String templateIdentifier;

		@SerializedName("scope")
		private String scope;

		@SerializedName("name")
		private String name;

		@SerializedName("customCode")
		private String customCode;

		public String getTemplateIdentifier() {
			return this.templateIdentifier;
		}

		public void setTemplateIdentifier(String templateIdentifier) {
			this.templateIdentifier = templateIdentifier;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCustomCode() {
			return this.customCode;
		}

		public void setCustomCode(String customCode) {
			this.customCode = customCode;
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
