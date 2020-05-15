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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.JoinDeviceMeetingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JoinDeviceMeetingResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private Device device;

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

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public static class Device {

		private String meetingDomain;

		private String meetingToken;

		private String meetingCode;

		private String memberUUID;

		private String clientAppId;

		private String meetingUUID;

		private String meetingAppId;

		private SlsInfo slsInfo;

		public String getMeetingDomain() {
			return this.meetingDomain;
		}

		public void setMeetingDomain(String meetingDomain) {
			this.meetingDomain = meetingDomain;
		}

		public String getMeetingToken() {
			return this.meetingToken;
		}

		public void setMeetingToken(String meetingToken) {
			this.meetingToken = meetingToken;
		}

		public String getMeetingCode() {
			return this.meetingCode;
		}

		public void setMeetingCode(String meetingCode) {
			this.meetingCode = meetingCode;
		}

		public String getMemberUUID() {
			return this.memberUUID;
		}

		public void setMemberUUID(String memberUUID) {
			this.memberUUID = memberUUID;
		}

		public String getClientAppId() {
			return this.clientAppId;
		}

		public void setClientAppId(String clientAppId) {
			this.clientAppId = clientAppId;
		}

		public String getMeetingUUID() {
			return this.meetingUUID;
		}

		public void setMeetingUUID(String meetingUUID) {
			this.meetingUUID = meetingUUID;
		}

		public String getMeetingAppId() {
			return this.meetingAppId;
		}

		public void setMeetingAppId(String meetingAppId) {
			this.meetingAppId = meetingAppId;
		}

		public SlsInfo getSlsInfo() {
			return this.slsInfo;
		}

		public void setSlsInfo(SlsInfo slsInfo) {
			this.slsInfo = slsInfo;
		}

		public static class SlsInfo {

			private String logServiceEndpoint;

			private String project;

			private String logstore;

			public String getLogServiceEndpoint() {
				return this.logServiceEndpoint;
			}

			public void setLogServiceEndpoint(String logServiceEndpoint) {
				this.logServiceEndpoint = logServiceEndpoint;
			}

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}
		}
	}

	@Override
	public JoinDeviceMeetingResponse getInstance(UnmarshallerContext context) {
		return	JoinDeviceMeetingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
