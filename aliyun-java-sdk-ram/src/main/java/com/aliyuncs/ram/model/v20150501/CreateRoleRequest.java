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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreateRoleRequest extends RpcAcsRequest<CreateRoleResponse> {
	
	public CreateRoleRequest() {
		super("Ram", "2015-05-01", "CreateRole", "ram");
		setProtocol(ProtocolType.HTTPS);
	}

	private String roleName;

	private String description;

	private String assumeRolePolicyDocument;

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getAssumeRolePolicyDocument() {
		return this.assumeRolePolicyDocument;
	}

	public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
		this.assumeRolePolicyDocument = assumeRolePolicyDocument;
		if(assumeRolePolicyDocument != null){
			putQueryParameter("AssumeRolePolicyDocument", assumeRolePolicyDocument);
		}
	}

	@Override
	public Class<CreateRoleResponse> getResponseClass() {
		return CreateRoleResponse.class;
	}

}
