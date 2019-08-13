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
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBatchUsersRequest extends RpcAcsRequest<CreateBatchUsersResponse> {
	
	public CreateBatchUsersRequest() {
		super("Emr", "2016-04-08", "CreateBatchUsers", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<UserBaseParamList> userBaseParamLists;

	private List<Long> roleIds;

	private List<Long> groupIds;

	private String description;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<UserBaseParamList> getUserBaseParamLists() {
		return this.userBaseParamLists;
	}

	public void setUserBaseParamLists(List<UserBaseParamList> userBaseParamLists) {
		this.userBaseParamLists = userBaseParamLists;	
		if (userBaseParamLists != null) {
			for (int depth1 = 0; depth1 < userBaseParamLists.size(); depth1++) {
				putQueryParameter("UserBaseParamList." + (depth1 + 1) + ".AliyunUserId" , userBaseParamLists.get(depth1).getAliyunUserId());
				putQueryParameter("UserBaseParamList." + (depth1 + 1) + ".UserName" , userBaseParamLists.get(depth1).getUserName());
				putQueryParameter("UserBaseParamList." + (depth1 + 1) + ".UserType" , userBaseParamLists.get(depth1).getUserType());
				putQueryParameter("UserBaseParamList." + (depth1 + 1) + ".IsSuperAdmin" , userBaseParamLists.get(depth1).getIsSuperAdmin());
			}
		}	
	}

	public List<Long> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;	
		if (roleIds != null) {
			for (int i = 0; i < roleIds.size(); i++) {
				putQueryParameter("RoleId." + (i + 1) , roleIds.get(i));
			}
		}	
	}

	public List<Long> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<Long> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			for (int i = 0; i < groupIds.size(); i++) {
				putQueryParameter("GroupId." + (i + 1) , groupIds.get(i));
			}
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

	public static class UserBaseParamList {

		private String aliyunUserId;

		private String userName;

		private String userType;

		private String isSuperAdmin;

		public String getAliyunUserId() {
			return this.aliyunUserId;
		}

		public void setAliyunUserId(String aliyunUserId) {
			this.aliyunUserId = aliyunUserId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getIsSuperAdmin() {
			return this.isSuperAdmin;
		}

		public void setIsSuperAdmin(String isSuperAdmin) {
			this.isSuperAdmin = isSuperAdmin;
		}
	}

	@Override
	public Class<CreateBatchUsersResponse> getResponseClass() {
		return CreateBatchUsersResponse.class;
	}

}
