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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveMessageGroupUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveMessageGroupUsersResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private Long nextPageToken;

	private Boolean hasmore;

	private List<Users> userList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(Long nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public Boolean getHasmore() {
		return this.hasmore;
	}

	public void setHasmore(Boolean hasmore) {
		this.hasmore = hasmore;
	}

	public List<Users> getUserList() {
		return this.userList;
	}

	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}

	public static class Users {

		private String userId;

		private String userInfo;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(String userInfo) {
			this.userInfo = userInfo;
		}
	}

	@Override
	public ListLiveMessageGroupUsersResponse getInstance(UnmarshallerContext context) {
		return	ListLiveMessageGroupUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
