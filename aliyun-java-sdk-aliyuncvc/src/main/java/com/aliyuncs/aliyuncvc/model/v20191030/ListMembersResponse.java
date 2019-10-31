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
import com.aliyuncs.aliyuncvc.transform.v20191030.ListMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMembersResponse extends AcsResponse {

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

		private String meetingCode;

		private String memo;

		private String userName;

		private Long createTime;

		private String userId;

		private String meetingUUID;

		private List<MemberRecord> memberInfos;

		public String getMeetingName() {
			return this.meetingName;
		}

		public void setMeetingName(String meetingName) {
			this.meetingName = meetingName;
		}

		public String getMeetingCode() {
			return this.meetingCode;
		}

		public void setMeetingCode(String meetingCode) {
			this.meetingCode = meetingCode;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

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

		public List<MemberRecord> getMemberInfos() {
			return this.memberInfos;
		}

		public void setMemberInfos(List<MemberRecord> memberInfos) {
			this.memberInfos = memberInfos;
		}

		public static class MemberRecord {

			private String memberUUID;

			private String userId;

			private String status;

			private Long beginTime;

			private Long endTime;

			private String userName;

			public String getMemberUUID() {
				return this.memberUUID;
			}

			public void setMemberUUID(String memberUUID) {
				this.memberUUID = memberUUID;
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

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
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
	public ListMembersResponse getInstance(UnmarshallerContext context) {
		return	ListMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
