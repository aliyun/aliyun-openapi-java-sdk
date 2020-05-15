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
import com.aliyuncs.aliyuncvc.transform.v20191030.CreateDeviceMeetingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceMeetingResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private Devices devices;

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

	public Devices getDevices() {
		return this.devices;
	}

	public void setDevices(Devices devices) {
		this.devices = devices;
	}

	public static class Devices {

		private String meetingCode;

		private String meetingUUID;

		public String getMeetingCode() {
			return this.meetingCode;
		}

		public void setMeetingCode(String meetingCode) {
			this.meetingCode = meetingCode;
		}

		public String getMeetingUUID() {
			return this.meetingUUID;
		}

		public void setMeetingUUID(String meetingUUID) {
			this.meetingUUID = meetingUUID;
		}
	}

	@Override
	public CreateDeviceMeetingResponse getInstance(UnmarshallerContext context) {
		return	CreateDeviceMeetingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
