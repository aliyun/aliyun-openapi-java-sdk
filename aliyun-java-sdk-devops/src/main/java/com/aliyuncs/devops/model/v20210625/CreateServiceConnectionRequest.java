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
public class CreateServiceConnectionRequest extends RoaAcsRequest<CreateServiceConnectionResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;
	public CreateServiceConnectionRequest() {
		super("devops", "2021-06-25", "CreateServiceConnection");
		setUriPattern("/organization/[organizationId]/createServiceConnection");
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

		@SerializedName("serviceAuthId")
		private Long serviceAuthId;

		@SerializedName("scope")
		private String scope;

		@SerializedName("connectionName")
		private String connectionName;

		@SerializedName("connectionType")
		private String connectionType;

		@SerializedName("authType")
		private String authType;

		public Long getServiceAuthId() {
			return this.serviceAuthId;
		}

		public void setServiceAuthId(Long serviceAuthId) {
			this.serviceAuthId = serviceAuthId;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getConnectionName() {
			return this.connectionName;
		}

		public void setConnectionName(String connectionName) {
			this.connectionName = connectionName;
		}

		public String getConnectionType() {
			return this.connectionType;
		}

		public void setConnectionType(String connectionType) {
			this.connectionType = connectionType;
		}

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}
	}

	@Override
	public Class<CreateServiceConnectionResponse> getResponseClass() {
		return CreateServiceConnectionResponse.class;
	}

}
