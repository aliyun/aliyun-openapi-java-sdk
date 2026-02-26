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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeGroupUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupUserResponse extends AcsResponse {

	private String requestId;

	private List<Group> groups;

	private List<User> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class Group {

		private String groupName;

		private String groupId;

		private String userCount;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getUserCount() {
			return this.userCount;
		}

		public void setUserCount(String userCount) {
			this.userCount = userCount;
		}
	}

	public static class User {

		private String endUserId;

		private String avatar;

		private String address;

		private String phone;

		private String email;

		private String nickName;

		private String jobNumber;

		private String gmtJoinGroup;

		private String gmtCreated;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getJobNumber() {
			return this.jobNumber;
		}

		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}

		public String getGmtJoinGroup() {
			return this.gmtJoinGroup;
		}

		public void setGmtJoinGroup(String gmtJoinGroup) {
			this.gmtJoinGroup = gmtJoinGroup;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}
	}

	@Override
	public DescribeGroupUserResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
