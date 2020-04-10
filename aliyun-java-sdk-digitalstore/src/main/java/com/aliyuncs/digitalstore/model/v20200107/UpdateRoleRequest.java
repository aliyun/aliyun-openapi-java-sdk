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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRoleRequest extends RpcAcsRequest<UpdateRoleResponse> {
	   

	private Integer roleId;

	private List<Apis> apiss;

	private String name;

	private List<Menus> menuss;

	private Integer status;
	public UpdateRoleRequest() {
		super("digitalstore", "2020-01-07", "UpdateRole", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
		if(roleId != null){
			putBodyParameter("RoleId", roleId.toString());
		}
	}

	public List<Apis> getApiss() {
		return this.apiss;
	}

	public void setApiss(List<Apis> apiss) {
		this.apiss = apiss;	
		if (apiss != null) {
			for (int depth1 = 0; depth1 < apiss.size(); depth1++) {
				putBodyParameter("Apis." + (depth1 + 1) + ".Name" , apiss.get(depth1).getName());
				putBodyParameter("Apis." + (depth1 + 1) + ".Id" , apiss.get(depth1).getId());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<Menus> getMenuss() {
		return this.menuss;
	}

	public void setMenuss(List<Menus> menuss) {
		this.menuss = menuss;	
		if (menuss != null) {
			for (int depth1 = 0; depth1 < menuss.size(); depth1++) {
				putBodyParameter("Menus." + (depth1 + 1) + ".Name" , menuss.get(depth1).getName());
				putBodyParameter("Menus." + (depth1 + 1) + ".Id" , menuss.get(depth1).getId());
			}
		}	
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public static class Apis {

		private String name;

		private String id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class Menus {

		private String name;

		private String id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<UpdateRoleResponse> getResponseClass() {
		return UpdateRoleResponse.class;
	}

}
