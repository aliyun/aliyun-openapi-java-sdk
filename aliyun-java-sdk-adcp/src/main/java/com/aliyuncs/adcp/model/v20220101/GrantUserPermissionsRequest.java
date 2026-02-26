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

package com.aliyuncs.adcp.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adcp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GrantUserPermissionsRequest extends RpcAcsRequest<GrantUserPermissionsResponse> {
	   

	private String userId;

	@SerializedName("permissions")
	private List<Permissions> permissions;
	public GrantUserPermissionsRequest() {
		super("adcp", "2022-01-01", "GrantUserPermissions", "adcp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public List<Permissions> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permissions> permissions) {
		this.permissions = permissions;	
		if (permissions != null) {
			putQueryParameter("Permissions" , new Gson().toJson(permissions));
		}	
	}

	public static class Permissions {

		@SerializedName("IsRamRole")
		private Boolean isRamRole;

		@SerializedName("RoleName")
		private String roleName;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("RoleType")
		private String roleType;

		@SerializedName("ClusterId")
		private String clusterId;

		public Boolean getIsRamRole() {
			return this.isRamRole;
		}

		public void setIsRamRole(Boolean isRamRole) {
			this.isRamRole = isRamRole;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getRoleType() {
			return this.roleType;
		}

		public void setRoleType(String roleType) {
			this.roleType = roleType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}
	}

	@Override
	public Class<GrantUserPermissionsResponse> getResponseClass() {
		return GrantUserPermissionsResponse.class;
	}

}
