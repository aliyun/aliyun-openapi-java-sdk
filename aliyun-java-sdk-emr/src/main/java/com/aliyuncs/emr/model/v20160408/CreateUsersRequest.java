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

/**
 * @author auto create
 * @version 
 */
public class CreateUsersRequest extends RpcAcsRequest<CreateUsersResponse> {
	
	public CreateUsersRequest() {
		super("Emr", "2016-04-08", "CreateUsers");
	}

	private Long resourceOwnerId;

	private String clusterId;

	private List<UserInfo> userInfos;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<UserInfo> getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;	
		if (userInfos != null) {
			for (int depth1 = 0; depth1 < userInfos.size(); depth1++) {
				putQueryParameter("UserInfo." + (depth1 + 1) + ".Type" , userInfos.get(depth1).getType());
				putQueryParameter("UserInfo." + (depth1 + 1) + ".UserId" , userInfos.get(depth1).getUserId());
				putQueryParameter("UserInfo." + (depth1 + 1) + ".UserName" , userInfos.get(depth1).getUserName());
			}
		}	
	}

	public static class UserInfo {

		private String type;

		private String userId;

		private String userName;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public Class<CreateUsersResponse> getResponseClass() {
		return CreateUsersResponse.class;
	}

}
