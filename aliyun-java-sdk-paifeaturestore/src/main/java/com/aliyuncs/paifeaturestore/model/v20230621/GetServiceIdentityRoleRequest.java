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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetServiceIdentityRoleRequest extends RoaAcsRequest<GetServiceIdentityRoleResponse> {
	   

	private String roleName;
	public GetServiceIdentityRoleRequest() {
		super("PaiFeatureStore", "2023-06-21", "GetServiceIdentityRole");
		setUriPattern("/api/v1/serviceidentityroles/[RoleName]");
		setMethod(MethodType.GET);
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putPathParameter("RoleName", roleName);
		}
	}

	@Override
	public Class<GetServiceIdentityRoleResponse> getResponseClass() {
		return GetServiceIdentityRoleResponse.class;
	}

}
