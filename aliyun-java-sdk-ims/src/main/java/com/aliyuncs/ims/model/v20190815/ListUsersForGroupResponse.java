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

package com.aliyuncs.ims.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListUsersForGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersForGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean isTruncated;

	private String marker;

	private List<User> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class User {

		private String userPrincipalName;

		private String displayName;

		private String userId;

		private String joinDate;

		public String getUserPrincipalName() {
			return this.userPrincipalName;
		}

		public void setUserPrincipalName(String userPrincipalName) {
			this.userPrincipalName = userPrincipalName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getJoinDate() {
			return this.joinDate;
		}

		public void setJoinDate(String joinDate) {
			this.joinDate = joinDate;
		}
	}

	@Override
	public ListUsersForGroupResponse getInstance(UnmarshallerContext context) {
		return	ListUsersForGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
