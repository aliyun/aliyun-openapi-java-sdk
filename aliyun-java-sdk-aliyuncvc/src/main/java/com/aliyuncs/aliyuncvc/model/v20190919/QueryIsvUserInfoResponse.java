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

package com.aliyuncs.aliyuncvc.model.v20190919;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20190919.QueryIsvUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIsvUserInfoResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private UserInfo userInfo;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public static class UserInfo {

		private String userName;

		private Long createTime;

		private String groupId;

		private String groupName;

		private String userId;

		private String userTel;

		private String userEmail;

		private String userMobile;

		private String userAvatarUrl;

		private String departId;

		private String departName;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserTel() {
			return this.userTel;
		}

		public void setUserTel(String userTel) {
			this.userTel = userTel;
		}

		public String getUserEmail() {
			return this.userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserMobile() {
			return this.userMobile;
		}

		public void setUserMobile(String userMobile) {
			this.userMobile = userMobile;
		}

		public String getUserAvatarUrl() {
			return this.userAvatarUrl;
		}

		public void setUserAvatarUrl(String userAvatarUrl) {
			this.userAvatarUrl = userAvatarUrl;
		}

		public String getDepartId() {
			return this.departId;
		}

		public void setDepartId(String departId) {
			this.departId = departId;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}
	}

	@Override
	public QueryIsvUserInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryIsvUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
