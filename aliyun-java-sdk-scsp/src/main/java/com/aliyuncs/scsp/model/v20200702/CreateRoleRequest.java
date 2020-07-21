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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateRoleRequest extends RpcAcsRequest<CreateRoleResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String roleName;

	private List<Long> permissionIds;

	private String operator;
	public CreateRoleRequest() {
		super("scsp", "2020-07-02", "CreateRole", "scsp");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putBodyParameter("RoleName", roleName);
		}
	}

	public List<Long> getPermissionIds() {
		return this.permissionIds;
	}

	public void setPermissionIds(List<Long> permissionIds) {
		this.permissionIds = permissionIds;	
		if (permissionIds != null) {
			for (int i = 0; i < permissionIds.size(); i++) {
				putBodyParameter("PermissionId." + (i + 1) , permissionIds.get(i));
			}
		}	
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	@Override
	public Class<CreateRoleResponse> getResponseClass() {
		return CreateRoleResponse.class;
	}

}
