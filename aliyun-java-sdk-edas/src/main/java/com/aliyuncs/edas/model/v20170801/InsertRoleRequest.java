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
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertRoleRequest extends RoaAcsRequest<InsertRoleResponse> {
	   

	private String roleName;

	private String actionData;
	public InsertRoleRequest() {
		super("Edas", "2017-08-01", "InsertRole", "Edas");
		setUriPattern("/pop/v5/account/create_role");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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
