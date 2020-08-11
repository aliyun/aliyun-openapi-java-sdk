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
public class ListRolesRequest extends RpcAcsRequest<ListRolesResponse> {
	   

	private String roleNameHas;

	private Integer pageSize;

	private Integer pageIndex;
	public ListRolesRequest() {
		super("Oam", "2017-01-01", "ListRoles");
		setMethod(MethodType.POST);
	}

	public String getRoleNameHas() {
		return this.roleNameHas;
	}

	public void setRoleNameHas(String roleNameHas) {
		this.roleNameHas = roleNameHas;
		if(roleNameHas != null){
			putQueryParameter("RoleNameHas", roleNameHas);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	@Override
	public Class<ListRolesResponse> getResponseClass() {
		return ListRolesResponse.class;
	}

}
