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
public class CreateFlowProjectUserRequest extends RpcAcsRequest<CreateFlowProjectUserResponse> {
	
	public CreateFlowProjectUserRequest() {
		super("Emr", "2016-04-08", "CreateFlowProjectUser", "emr");
	}

	private String projectId;

	private List<User> users;

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;	
		if (users != null) {
			for (int depth1 = 0; depth1 < users.size(); depth1++) {
				putQueryParameter("User." + (depth1 + 1) + ".UserId" , users.get(depth1).getUserId());
				putQueryParameter("User." + (depth1 + 1) + ".UserName" , users.get(depth1).getUserName());
			}
		}	
	}

	public static class User {

		private String userId;

		private String userName;

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
	public Class<CreateFlowProjectUserResponse> getResponseClass() {
		return CreateFlowProjectUserResponse.class;
	}

}
