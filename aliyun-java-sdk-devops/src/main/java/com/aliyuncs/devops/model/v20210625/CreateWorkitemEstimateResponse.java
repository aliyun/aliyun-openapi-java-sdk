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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreateWorkitemEstimateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWorkitemEstimateResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private WorkitemTimeEstimate workitemTimeEstimate;

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

	public WorkitemTimeEstimate getWorkitemTimeEstimate() {
		return this.workitemTimeEstimate;
	}

	public void setWorkitemTimeEstimate(WorkitemTimeEstimate workitemTimeEstimate) {
		this.workitemTimeEstimate = workitemTimeEstimate;
	}

	public static class WorkitemTimeEstimate {

		private String identifier;

		private String workitemIdentifier;

		private Long spentTime;

		private String type;

		private String description;

		private RecordUser recordUser;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getWorkitemIdentifier() {
			return this.workitemIdentifier;
		}

		public void setWorkitemIdentifier(String workitemIdentifier) {
			this.workitemIdentifier = workitemIdentifier;
		}

		public Long getSpentTime() {
			return this.spentTime;
		}

		public void setSpentTime(Long spentTime) {
			this.spentTime = spentTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public RecordUser getRecordUser() {
			return this.recordUser;
		}

		public void setRecordUser(RecordUser recordUser) {
			this.recordUser = recordUser;
		}

		public static class RecordUser {

			private String account;

			private String identifier;

			private String realName;

			private String nickName;

			private String avatar;

			private String stamp;

			private String nameEn;

			private String gender;

			private String mobile;

			private String email;

			private String nickNamePinyin;

			private String realNamePinyin;

			private String displayNickName;

			private String displayRealName;

			private String displayName;

			private String dingTalkId;

			private String tbRoleId;

			private Boolean isDisabled;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
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

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}

			public String getStamp() {
				return this.stamp;
			}

			public void setStamp(String stamp) {
				this.stamp = stamp;
			}

			public String getNameEn() {
				return this.nameEn;
			}

			public void setNameEn(String nameEn) {
				this.nameEn = nameEn;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getNickNamePinyin() {
				return this.nickNamePinyin;
			}

			public void setNickNamePinyin(String nickNamePinyin) {
				this.nickNamePinyin = nickNamePinyin;
			}

			public String getRealNamePinyin() {
				return this.realNamePinyin;
			}

			public void setRealNamePinyin(String realNamePinyin) {
				this.realNamePinyin = realNamePinyin;
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

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDingTalkId() {
				return this.dingTalkId;
			}

			public void setDingTalkId(String dingTalkId) {
				this.dingTalkId = dingTalkId;
			}

			public String getTbRoleId() {
				return this.tbRoleId;
			}

			public void setTbRoleId(String tbRoleId) {
				this.tbRoleId = tbRoleId;
			}

			public Boolean getIsDisabled() {
				return this.isDisabled;
			}

			public void setIsDisabled(Boolean isDisabled) {
				this.isDisabled = isDisabled;
			}
		}
	}

	@Override
	public CreateWorkitemEstimateResponse getInstance(UnmarshallerContext context) {
		return	CreateWorkitemEstimateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
