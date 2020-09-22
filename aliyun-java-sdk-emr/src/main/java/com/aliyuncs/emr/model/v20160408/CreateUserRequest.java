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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUserRequest extends RpcAcsRequest<CreateUserResponse> {
	   

	private Long resourceOwnerId;

	private String userType;

	private String description;

	private List<UserAccountParamList> userAccountParamLists;

	private List<Long> groupIdLists;

	private List<Long> roleIdLists;

	private String aliyunUserId;

	private String userName;

	private String status;
	public CreateUserRequest() {
		super("Emr", "2016-04-08", "CreateUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<UserAccountParamList> getUserAccountParamLists() {
		return this.userAccountParamLists;
	}

	public void setUserAccountParamLists(List<UserAccountParamList> userAccountParamLists) {
		this.userAccountParamLists = userAccountParamLists;	
		if (userAccountParamLists != null) {
			for (int depth1 = 0; depth1 < userAccountParamLists.size(); depth1++) {
				putQueryParameter("UserAccountParamList." + (depth1 + 1) + ".AccountType" , userAccountParamLists.get(depth1).getAccountType());
				putQueryParameter("UserAccountParamList." + (depth1 + 1) + ".AuthType" , userAccountParamLists.get(depth1).getAuthType());
				putQueryParameter("UserAccountParamList." + (depth1 + 1) + ".AccountPassword" , userAccountParamLists.get(depth1).getAccountPassword());
			}
		}	
	}

	public List<Long> getGroupIdLists() {
		return this.groupIdLists;
	}

	public void setGroupIdLists(List<Long> groupIdLists) {
		this.groupIdLists = groupIdLists;	
		if (groupIdLists != null) {
			for (int i = 0; i < groupIdLists.size(); i++) {
				putQueryParameter("GroupIdList." + (i + 1) , groupIdLists.get(i));
			}
		}	
	}

	public List<Long> getRoleIdLists() {
		return this.roleIdLists;
	}

	public void setRoleIdLists(List<Long> roleIdLists) {
		this.roleIdLists = roleIdLists;	
		if (roleIdLists != null) {
			for (int i = 0; i < roleIdLists.size(); i++) {
				putQueryParameter("RoleIdList." + (i + 1) , roleIdLists.get(i));
			}
		}	
	}

	public String getAliyunUserId() {
		return this.aliyunUserId;
	}

	public void setAliyunUserId(String aliyunUserId) {
		this.aliyunUserId = aliyunUserId;
		if(aliyunUserId != null){
			putQueryParameter("AliyunUserId", aliyunUserId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public static class UserAccountParamList {

		private String accountType;

		private String authType;

		private String accountPassword;

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public String getAccountPassword() {
			return this.accountPassword;
		}

		public void setAccountPassword(String accountPassword) {
			this.accountPassword = accountPassword;
		}
	}

	@Override
	public Class<CreateUserResponse> getResponseClass() {
		return CreateUserResponse.class;
	}

}
