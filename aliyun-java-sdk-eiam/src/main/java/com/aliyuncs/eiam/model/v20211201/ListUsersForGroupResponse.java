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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListUsersForGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersForGroupResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<User> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class User {

		private String userId;

		private String groupMemberRelationSourceId;

		private String groupMemberRelationSourceType;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getGroupMemberRelationSourceId() {
			return this.groupMemberRelationSourceId;
		}

		public void setGroupMemberRelationSourceId(String groupMemberRelationSourceId) {
			this.groupMemberRelationSourceId = groupMemberRelationSourceId;
		}

		public String getGroupMemberRelationSourceType() {
			return this.groupMemberRelationSourceType;
		}

		public void setGroupMemberRelationSourceType(String groupMemberRelationSourceType) {
			this.groupMemberRelationSourceType = groupMemberRelationSourceType;
		}
	}

	@Override
	public ListUsersForGroupResponse getInstance(UnmarshallerContext context) {
		return	ListUsersForGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
