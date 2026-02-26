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
import com.aliyuncs.eiam.transform.v20211201.ListGroupsForUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupsForUserResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<Group> groups;

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

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static class Group {

		private String groupId;

		private String groupMemberRelationSourceId;

		private String groupMemberRelationSourceType;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
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
	public ListGroupsForUserResponse getInstance(UnmarshallerContext context) {
		return	ListGroupsForUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
