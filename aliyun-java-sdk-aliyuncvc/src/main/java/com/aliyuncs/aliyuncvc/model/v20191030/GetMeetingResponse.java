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

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private MeetingInfo meetingInfo;

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

	public MeetingInfo getMeetingInfo() {
		return this.meetingInfo;
	}

	public void setMeetingInfo(MeetingInfo meetingInfo) {
		this.meetingInfo = meetingInfo;
	}

	public static class MeetingInfo {

		private String meetingName;

		private Long validTime;

		private String meetingCode;

		private Long createTime;

		private String userId;

		private String meetingUUID;

		private List<MemberListItem> memberList;

		public String getMeetingName() {
			return this.meetingName;
		}

		public void setMeetingName(String meetingName) {
			this.meetingName = meetingName;
		}

		public Long getValidTime() {
			return this.validTime;
		}

		public void setValidTime(Long validTime) {
			this.validTime = validTime;
		}

		public String getMeetingCode() {
			return this.meetingCode;
		}

		public void setMeetingCode(String meetingCode) {
			this.meetingCode = meetingCode;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getMeetingUUID() {
			return this.meetingUUID;
		}

		public void setMeetingUUID(String meetingUUID) {
			this.meetingUUID = meetingUUID;
		}

		public List<MemberListItem> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<MemberListItem> memberList) {
			this.memberList = memberList;
		}

		public static class MemberListItem {

			private String userAvatarUrl;

			private String memberUUID;

			private String userName;

			private String userId;

			private String status;

			public String getUserAvatarUrl() {
				return this.userAvatarUrl;
			}

			public void setUserAvatarUrl(String userAvatarUrl) {
				this.userAvatarUrl = userAvatarUrl;
			}

			public String getMemberUUID() {
				return this.memberUUID;
			}

			public void setMemberUUID(String memberUUID) {
				this.memberUUID = memberUUID;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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
