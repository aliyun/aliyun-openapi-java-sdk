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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyRoleRequest extends RpcAcsRequest<ModifyRoleResponse> {
	   

	private String newRoleName;

	private String roleName;

	private String newAttribute;

	private String newRoleType;

	private String newDescription;
	public ModifyRoleRequest() {
		super("Oam", "2017-01-01", "ModifyRole");
		setMethod(MethodType.POST);
	}

	public String getNewRoleName() {
		return this.newRoleName;
	}

	public void setNewRoleName(String newRoleName) {
		this.newRoleName = newRoleName;
		if(newRoleName != null){
			putQueryParameter("NewRoleName", newRoleName);
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

	public String getNewAttribute() {
		return this.newAttribute;
	}

	public void setNewAttribute(String newAttribute) {
		this.newAttribute = newAttribute;
		if(newAttribute != null){
			putQueryParameter("NewAttribute", newAttribute);
		}
	}

	public String getNewRoleType() {
		return this.newRoleType;
	}

	public void setNewRoleType(String newRoleType) {
		this.newRoleType = newRoleType;
		if(newRoleType != null){
			putQueryParameter("NewRoleType", newRoleType);
		}
	}

	public String getNewDescription() {
		return this.newDescription;
	}

	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
		if(newDescription != null){
			putQueryParameter("NewDescription", newDescription);
		}
	}

	@Override
	public Class<ModifyRoleResponse> getResponseClass() {
		return ModifyRoleResponse.class;
	}

}
