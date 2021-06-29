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

package com.aliyuncs.linkedmall.model.v20210616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemovePermissionsOfRoleRequest extends RpcAcsRequest<RemovePermissionsOfRoleResponse> {
	   

	private String roleCode;

	private String roleId;

	private String tenantId;

	private String permissionCodes;

	private String permissionIds;
	public RemovePermissionsOfRoleRequest() {
		super("linkedmall", "2021-06-16", "RemovePermissionsOfRole", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
		if(roleCode != null){
			putQueryParameter("RoleCode", roleCode);
		}
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
		if(roleId != null){
			putQueryParameter("RoleId", roleId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getPermissionCodes() {
		return this.permissionCodes;
	}

	public void setPermissionCodes(String permissionCodes) {
		this.permissionCodes = permissionCodes;
		if(permissionCodes != null){
			putQueryParameter("PermissionCodes", permissionCodes);
		}
	}

	public String getPermissionIds() {
		return this.permissionIds;
	}

	public void setPermissionIds(String permissionIds) {
		this.permissionIds = permissionIds;
		if(permissionIds != null){
			putQueryParameter("PermissionIds", permissionIds);
		}
	}

	@Override
	public Class<RemovePermissionsOfRoleResponse> getResponseClass() {
		return RemovePermissionsOfRoleResponse.class;
	}

}
