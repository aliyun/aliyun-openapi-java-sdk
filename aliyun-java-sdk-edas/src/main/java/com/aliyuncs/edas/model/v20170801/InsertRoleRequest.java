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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InsertRoleRequest extends RoaAcsRequest<InsertRoleResponse> {
	
	public InsertRoleRequest() {
		super("Edas", "2017-08-01", "InsertRole", "edas");
		setUriPattern("/pop/v5/account/create_role");
		setMethod(MethodType.POST);
	}

	private String roleName;

	private String actionData;

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	public String getActionData() {
		return this.actionData;
	}

	public void setActionData(String actionData) {
		this.actionData = actionData;
		if(actionData != null){
			putQueryParameter("ActionData", actionData);
		}
	}

	@Override
	public Class<InsertRoleResponse> getResponseClass() {
		return InsertRoleResponse.class;
	}

}
