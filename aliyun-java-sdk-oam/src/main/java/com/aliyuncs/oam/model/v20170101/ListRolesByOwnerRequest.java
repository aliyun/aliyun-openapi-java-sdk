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
public class ListRolesByOwnerRequest extends RpcAcsRequest<ListRolesByOwnerResponse> {
	   

	private String roleNameHas;

	private String roleOwnerName;

	private String roleOwnerType;

	private Integer pageSize;

	private Integer pageIndex;
	public ListRolesByOwnerRequest() {
		super("Oam", "2017-01-01", "ListRolesByOwner");
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

	public String getRoleOwnerName() {
		return this.roleOwnerName;
	}

	public void setRoleOwnerName(String roleOwnerName) {
		this.roleOwnerName = roleOwnerName;
		if(roleOwnerName != null){
			putQueryParameter("RoleOwnerName", roleOwnerName);
		}
	}

	public String getRoleOwnerType() {
		return this.roleOwnerType;
	}

	public void setRoleOwnerType(String roleOwnerType) {
		this.roleOwnerType = roleOwnerType;
		if(roleOwnerType != null){
			putQueryParameter("RoleOwnerType", roleOwnerType);
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
	public Class<ListRolesByOwnerResponse> getResponseClass() {
		return ListRolesByOwnerResponse.class;
	}

}
