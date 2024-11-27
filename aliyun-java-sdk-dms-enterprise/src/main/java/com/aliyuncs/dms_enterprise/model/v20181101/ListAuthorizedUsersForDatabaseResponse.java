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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListAuthorizedUsersForDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthorizedUsersForDatabaseResponse extends AcsResponse {

	private String requestId;

	private List<UsersItem> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UsersItem> getUsers() {
		return this.users;
	}

	public void setUsers(List<UsersItem> users) {
		this.users = users;
	}

	public static class UsersItem {

		private String userId;

		private String userNickName;

		private String uid;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserNickName() {
			return this.userNickName;
		}

		public void setUserNickName(String userNickName) {
			this.userNickName = userNickName;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}
	}

	@Override
	public ListAuthorizedUsersForDatabaseResponse getInstance(UnmarshallerContext context) {
		return	ListAuthorizedUsersForDatabaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
