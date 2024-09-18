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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListByUserGroupIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListByUserGroupIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<UserGroupModelsItem> userGroupModels;

		private List<String> failedUserGroupIds;

		public List<UserGroupModelsItem> getUserGroupModels() {
			return this.userGroupModels;
		}

		public void setUserGroupModels(List<UserGroupModelsItem> userGroupModels) {
			this.userGroupModels = userGroupModels;
		}

		public List<String> getFailedUserGroupIds() {
			return this.failedUserGroupIds;
		}

		public void setFailedUserGroupIds(List<String> failedUserGroupIds) {
			this.failedUserGroupIds = failedUserGroupIds;
		}

		public static class UserGroupModelsItem {

			private String createTime;

			private String createUser;

			private String identifiedPath;

			private String modifiedTime;

			private String modifyUser;

			private String parentUsergroupId;

			private String usergroupDesc;

			private String usergroupId;

			private String usergroupName;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public String getIdentifiedPath() {
				return this.identifiedPath;
			}

			public void setIdentifiedPath(String identifiedPath) {
				this.identifiedPath = identifiedPath;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getModifyUser() {
				return this.modifyUser;
			}

			public void setModifyUser(String modifyUser) {
				this.modifyUser = modifyUser;
			}

			public String getParentUsergroupId() {
				return this.parentUsergroupId;
			}

			public void setParentUsergroupId(String parentUsergroupId) {
				this.parentUsergroupId = parentUsergroupId;
			}

			public String getUsergroupDesc() {
				return this.usergroupDesc;
			}

			public void setUsergroupDesc(String usergroupDesc) {
				this.usergroupDesc = usergroupDesc;
			}

			public String getUsergroupId() {
				return this.usergroupId;
			}

			public void setUsergroupId(String usergroupId) {
				this.usergroupId = usergroupId;
			}

			public String getUsergroupName() {
				return this.usergroupName;
			}

			public void setUsergroupName(String usergroupName) {
				this.usergroupName = usergroupName;
			}
		}
	}

	@Override
	public ListByUserGroupIdResponse getInstance(UnmarshallerContext context) {
		return	ListByUserGroupIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
