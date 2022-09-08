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
public class BatchAddFeishuUsersRequest extends RpcAcsRequest<BatchAddFeishuUsersResponse> {
	   

	private Boolean isAdmin;

	private String feishuUsers;

	private Integer userType;

	private String userGroupIds;

	private Boolean isAuthAdmin;
	public BatchAddFeishuUsersRequest() {
		super("quickbi-public", "2022-01-01", "BatchAddFeishuUsers", "quickbi");
		setMethod(MethodType.POST);
	}

	public Boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
		if(isAdmin != null){
			putQueryParameter("IsAdmin", isAdmin.toString());
		}
	}

	public String getFeishuUsers() {
		return this.feishuUsers;
	}

	public void setFeishuUsers(String feishuUsers) {
		this.feishuUsers = feishuUsers;
		if(feishuUsers != null){
			putQueryParameter("FeishuUsers", feishuUsers);
		}
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType.toString());
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

	public Boolean getIsAuthAdmin() {
		return this.isAuthAdmin;
	}

	public void setIsAuthAdmin(Boolean isAuthAdmin) {
		this.isAuthAdmin = isAuthAdmin;
		if(isAuthAdmin != null){
			putQueryParameter("IsAuthAdmin", isAuthAdmin.toString());
		}
	}

	@Override
	public Class<BatchAddFeishuUsersResponse> getResponseClass() {
		return BatchAddFeishuUsersResponse.class;
	}

}
