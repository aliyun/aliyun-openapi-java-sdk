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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private User user;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class User {

		private String state;

		private Long curResultCount;

		private String userId;

		private String lastLoginTime;

		private Long maxResultCount;

		private Long parentUid;

		private String nickName;

		private Long maxExecuteCount;

		private Long curExecuteCount;

		private String mobile;

		private String uid;

		private String email;

		private String dingRobot;

		private String webhook;

		private String signatureMethod;

		private String notificationMode;

		private List<Integer> roleIdList;

		private List<String> roleNameList;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCurResultCount() {
			return this.curResultCount;
		}

		public void setCurResultCount(Long curResultCount) {
			this.curResultCount = curResultCount;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getLastLoginTime() {
			return this.lastLoginTime;
		}

		public void setLastLoginTime(String lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}

		public Long getMaxResultCount() {
			return this.maxResultCount;
		}

		public void setMaxResultCount(Long maxResultCount) {
			this.maxResultCount = maxResultCount;
		}

		public Long getParentUid() {
			return this.parentUid;
		}

		public void setParentUid(Long parentUid) {
			this.parentUid = parentUid;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public Long getMaxExecuteCount() {
			return this.maxExecuteCount;
		}

		public void setMaxExecuteCount(Long maxExecuteCount) {
			this.maxExecuteCount = maxExecuteCount;
		}

		public Long getCurExecuteCount() {
			return this.curExecuteCount;
		}

		public void setCurExecuteCount(Long curExecuteCount) {
			this.curExecuteCount = curExecuteCount;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDingRobot() {
			return this.dingRobot;
		}

		public void setDingRobot(String dingRobot) {
			this.dingRobot = dingRobot;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getSignatureMethod() {
			return this.signatureMethod;
		}

		public void setSignatureMethod(String signatureMethod) {
			this.signatureMethod = signatureMethod;
		}

		public String getNotificationMode() {
			return this.notificationMode;
		}

		public void setNotificationMode(String notificationMode) {
			this.notificationMode = notificationMode;
		}

		public List<Integer> getRoleIdList() {
			return this.roleIdList;
		}

		public void setRoleIdList(List<Integer> roleIdList) {
			this.roleIdList = roleIdList;
		}

		public List<String> getRoleNameList() {
			return this.roleNameList;
		}

		public void setRoleNameList(List<String> roleNameList) {
			this.roleNameList = roleNameList;
		}
	}

	@Override
	public GetUserResponse getInstance(UnmarshallerContext context) {
		return	GetUserResponseUnmarshaller.unmarshall(this, context);
	}
}
