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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CancelAuthorizationMenuRequest extends RpcAcsRequest<CancelAuthorizationMenuResponse> {
	   

	private String dataPortalId;

	private String menuIds;

	private String userGroupIds;

	private String userIds;
	public CancelAuthorizationMenuRequest() {
		super("quickbi-public", "2022-01-01", "CancelAuthorizationMenu", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getDataPortalId() {
		return this.dataPortalId;
	}

	public void setDataPortalId(String dataPortalId) {
		this.dataPortalId = dataPortalId;
		if(dataPortalId != null){
			putQueryParameter("DataPortalId", dataPortalId);
		}
	}

	public String getMenuIds() {
		return this.menuIds;
	}

	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
		if(menuIds != null){
			putQueryParameter("MenuIds", menuIds);
		}
	}

	public String getUserGroupIds() {
		return this.userGroupIds;
	}

	public void setUserGroupIds(String userGroupIds) {
		this.userGroupIds = userGroupIds;
		if(userGroupIds != null){
			putQueryParameter("UserGroupIds", userGroupIds);
		}
	}

	public String getUserIds() {
		return this.userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
		if(userIds != null){
			putQueryParameter("UserIds", userIds);
		}
	}

	@Override
	public Class<CancelAuthorizationMenuResponse> getResponseClass() {
		return CancelAuthorizationMenuResponse.class;
	}

}
