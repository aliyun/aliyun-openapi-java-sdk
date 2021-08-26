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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeUsersInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUsersInGroupResponse extends AcsResponse {

	private String requestId;

	private Integer usersCount;

	private Integer onlineUsersCount;

	private String nextToken;

	private List<EndUser> endUsers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUsersCount() {
		return this.usersCount;
	}

	public void setUsersCount(Integer usersCount) {
		this.usersCount = usersCount;
	}

	public Integer getOnlineUsersCount() {
		return this.onlineUsersCount;
	}

	public void setOnlineUsersCount(Integer onlineUsersCount) {
		this.onlineUsersCount = onlineUsersCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<EndUser> getEndUsers() {
		return this.endUsers;
	}

	public void setEndUsers(List<EndUser> endUsers) {
		this.endUsers = endUsers;
	}

	public static class EndUser {

		private String endUserId;

		private String endUserName;

		private String endUserType;

		private String endUserEmail;

		private String endUserPhone;

		private String connectionStatus;

		private String desktopId;

		private String desktopName;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}

		public String getEndUserType() {
			return this.endUserType;
		}

		public void setEndUserType(String endUserType) {
			this.endUserType = endUserType;
		}

		public String getEndUserEmail() {
			return this.endUserEmail;
		}

		public void setEndUserEmail(String endUserEmail) {
			this.endUserEmail = endUserEmail;
		}

		public String getEndUserPhone() {
			return this.endUserPhone;
		}

		public void setEndUserPhone(String endUserPhone) {
			this.endUserPhone = endUserPhone;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}
	}

	@Override
	public DescribeUsersInGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeUsersInGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
