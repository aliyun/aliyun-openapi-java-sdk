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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<Device> data;

	private List<String> params;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public List<Device> getData() {
		return this.data;
	}

	public void setData(List<Device> data) {
		this.data = data;
	}

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public static class Device {

		private String callId;

		private String contact;

		private String deviceId;

		private Long expires;

		private String extension;

		private String instanceId;

		private String userId;

		public String getCallId() {
			return this.callId;
		}

		public void setCallId(String callId) {
			this.callId = callId;
		}

		public String getContact() {
			return this.contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Long getExpires() {
			return this.expires;
		}

		public void setExpires(Long expires) {
			this.expires = expires;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public ListDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
