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

package com.aliyuncs.quickbi_public.model.v20201111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20201111.ListDataLevelPermissionWhiteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataLevelPermissionWhiteListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Result result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String cubeId;

		private String ruleType;

		private UsersModel usersModel;

		public String getCubeId() {
			return this.cubeId;
		}

		public void setCubeId(String cubeId) {
			this.cubeId = cubeId;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public UsersModel getUsersModel() {
			return this.usersModel;
		}

		public void setUsersModel(UsersModel usersModel) {
			this.usersModel = usersModel;
		}

		public static class UsersModel {

			private List<String> userGroups;

			private List<String> users;

			public List<String> getUserGroups() {
				return this.userGroups;
			}

			public void setUserGroups(List<String> userGroups) {
				this.userGroups = userGroups;
			}

			public List<String> getUsers() {
				return this.users;
			}

			public void setUsers(List<String> users) {
				this.users = users;
			}
		}
	}

	@Override
	public ListDataLevelPermissionWhiteListResponse getInstance(UnmarshallerContext context) {
		return	ListDataLevelPermissionWhiteListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
