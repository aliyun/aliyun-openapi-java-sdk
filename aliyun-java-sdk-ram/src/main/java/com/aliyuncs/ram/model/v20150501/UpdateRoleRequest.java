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
public class UpdateRoleRequest extends RpcAcsRequest<UpdateRoleResponse> {
	
	public UpdateRoleRequest() {
		super("Ram", "2015-05-01", "UpdateRole");
		setProtocol(ProtocolType.HTTPS);
	}

	private String newAssumeRolePolicyDocument;

	private String roleName;

	public String getNewAssumeRolePolicyDocument() {
		return this.newAssumeRolePolicyDocument;
	}

	public void setNewAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
		this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
		if(newAssumeRolePolicyDocument != null){
			putQueryParameter("NewAssumeRolePolicyDocument", newAssumeRolePolicyDocument);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	@Override
	public Class<UpdateRoleResponse> getResponseClass() {
		return UpdateRoleResponse.class;
	}

}
