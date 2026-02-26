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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUsersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<User> userList;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getUserList() {
		return this.userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public static class User {

		private String id;

		private String parentId;

		private String sourceType;

		private String sourceId;

		private String name;

		private String displayName;

		private String displayNameWithoutStatus;

		private String accountName;

		private String realName;

		private String nickName;

		private Long gmtCreate;

		private String mobilePhone;

		private String mail;

		private String dingNumber;

		private String weChatRobot;

		private String feiShuRobot;

		private String enableWhiteIp;

		private String whiteIp;

		private Long gmtModified;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayNameWithoutStatus() {
			return this.displayNameWithoutStatus;
		}

		public void setDisplayNameWithoutStatus(String displayNameWithoutStatus) {
			this.displayNameWithoutStatus = displayNameWithoutStatus;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getRealName() {
			return this.realName;
		}

		public void setRealName(String realName) {
			this.realName = realName;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getMobilePhone() {
			return this.mobilePhone;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getMail() {
			return this.mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getDingNumber() {
			return this.dingNumber;
		}

		public void setDingNumber(String dingNumber) {
			this.dingNumber = dingNumber;
		}

		public String getWeChatRobot() {
			return this.weChatRobot;
		}

		public void setWeChatRobot(String weChatRobot) {
			this.weChatRobot = weChatRobot;
		}

		public String getFeiShuRobot() {
			return this.feiShuRobot;
		}

		public void setFeiShuRobot(String feiShuRobot) {
			this.feiShuRobot = feiShuRobot;
		}

		public String getEnableWhiteIp() {
			return this.enableWhiteIp;
		}

		public void setEnableWhiteIp(String enableWhiteIp) {
			this.enableWhiteIp = enableWhiteIp;
		}

		public String getWhiteIp() {
			return this.whiteIp;
		}

		public void setWhiteIp(String whiteIp) {
			this.whiteIp = whiteIp;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public GetUsersResponse getInstance(UnmarshallerContext context) {
		return	GetUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
