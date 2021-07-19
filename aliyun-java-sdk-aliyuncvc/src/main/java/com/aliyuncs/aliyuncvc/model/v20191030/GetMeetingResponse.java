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

package com.aliyuncs.aliyuncvc.model.v20191030;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.GetMeetingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMeetingResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer errorCode;

	private Boolean success;

	private MeetingInfo meetingInfo;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public MeetingInfo getMeetingInfo() {
		return this.meetingInfo;
	}

	public void setMeetingInfo(MeetingInfo meetingInfo) {
		this.meetingInfo = meetingInfo;
	}

	public static class MeetingInfo {

		private String password;

		private String meetingUUID;

		private Long validTime;

		private Long createTime;

		private String meetingName;

		private String userId;

		private String meetingCode;

		private List<MemberListItem> memberList;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMeetingUUID() {
			return this.meetingUUID;
		}

		public void setMeetingUUID(String meetingUUID) {
			this.meetingUUID = meetingUUID;
		}

		public Long getValidTime() {
			return this.validTime;
		}

		public void setValidTime(Long validTime) {
			this.validTime = validTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getMeetingName() {
			return this.meetingName;
		}

		public void setMeetingName(String meetingName) {
			this.meetingName = meetingName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getMeetingCode() {
			return this.meetingCode;
		}

		public void setMeetingCode(String meetingCode) {
			this.meetingCode = meetingCode;
		}

		public List<MemberListItem> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<MemberListItem> memberList) {
			this.memberList = memberList;
		}

		public static class MemberListItem {

			private String status;

			private String memberUUID;

			private String userAvatarUrl;

			private String userId;

			private String userName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMemberUUID() {
				return this.memberUUID;
			}

			public void setMemberUUID(String memberUUID) {
				this.memberUUID = memberUUID;
			}

			public String getUserAvatarUrl() {
				return this.userAvatarUrl;
			}

			public void setUserAvatarUrl(String userAvatarUrl) {
				this.userAvatarUrl = userAvatarUrl;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	@Override
	public GetMeetingResponse getInstance(UnmarshallerContext context) {
		return	GetMeetingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
