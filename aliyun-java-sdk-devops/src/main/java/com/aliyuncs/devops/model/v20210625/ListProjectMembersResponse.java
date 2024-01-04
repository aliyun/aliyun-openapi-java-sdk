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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListProjectMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectMembersResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<Member> members;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public static class Member {

		private String account;

		private String avatar;

		private String dingTalkId;

		private String displayName;

		private String displayNickName;

		private String displayRealName;

		private String email;

		private String gender;

		private String identifier;

		private String mobile;

		private String nameEn;

		private String nickName;

		private String nickNamePinyin;

		private String realName;

		private String realNamePinyin;

		private String stamp;

		private String tbRoleId;

		private String roleName;

		private Division division;

		private OrganizationUserInfo organizationUserInfo;

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getDingTalkId() {
			return this.dingTalkId;
		}

		public void setDingTalkId(String dingTalkId) {
			this.dingTalkId = dingTalkId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayNickName() {
			return this.displayNickName;
		}

		public void setDisplayNickName(String displayNickName) {
			this.displayNickName = displayNickName;
		}

		public String getDisplayRealName() {
			return this.displayRealName;
		}

		public void setDisplayRealName(String displayRealName) {
			this.displayRealName = displayRealName;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getNameEn() {
			return this.nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getNickNamePinyin() {
			return this.nickNamePinyin;
		}

		public void setNickNamePinyin(String nickNamePinyin) {
			this.nickNamePinyin = nickNamePinyin;
		}

		public String getRealName() {
			return this.realName;
		}

		public void setRealName(String realName) {
			this.realName = realName;
		}

		public String getRealNamePinyin() {
			return this.realNamePinyin;
		}

		public void setRealNamePinyin(String realNamePinyin) {
			this.realNamePinyin = realNamePinyin;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getTbRoleId() {
			return this.tbRoleId;
		}

		public void setTbRoleId(String tbRoleId) {
			this.tbRoleId = tbRoleId;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public Division getDivision() {
			return this.division;
		}

		public void setDivision(Division division) {
			this.division = division;
		}

		public OrganizationUserInfo getOrganizationUserInfo() {
			return this.organizationUserInfo;
		}

		public void setOrganizationUserInfo(OrganizationUserInfo organizationUserInfo) {
			this.organizationUserInfo = organizationUserInfo;
		}

		public static class Division {

			private String identifier;

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}
		}

		public static class OrganizationUserInfo {

			private String organizationIdentifier;

			public String getOrganizationIdentifier() {
				return this.organizationIdentifier;
			}

			public void setOrganizationIdentifier(String organizationIdentifier) {
				this.organizationIdentifier = organizationIdentifier;
			}
		}
	}

	@Override
	public ListProjectMembersResponse getInstance(UnmarshallerContext context) {
		return	ListProjectMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
