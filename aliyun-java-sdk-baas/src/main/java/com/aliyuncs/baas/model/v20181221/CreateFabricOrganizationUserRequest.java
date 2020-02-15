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
public class CreateFabricOrganizationUserRequest extends RpcAcsRequest<CreateFabricOrganizationUserResponse> {
	   

	private String password;

	private String attrs;

	private String organizationId;

	private String username;
	public CreateFabricOrganizationUserRequest() {
		super("Baas", "2018-12-21", "CreateFabricOrganizationUser", "baas");
		setMethod(MethodType.PUT);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getAttrs() {
		return this.attrs;
	}

	public void setAttrs(String attrs) {
		this.attrs = attrs;
		if(attrs != null){
			putBodyParameter("Attrs", attrs);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putBodyParameter("Username", username);
		}
	}

	@Override
	public Class<CreateFabricOrganizationUserResponse> getResponseClass() {
		return CreateFabricOrganizationUserResponse.class;
	}

}
