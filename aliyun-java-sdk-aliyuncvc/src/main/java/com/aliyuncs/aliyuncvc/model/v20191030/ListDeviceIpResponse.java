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
import com.aliyuncs.aliyuncvc.transform.v20191030.ListDeviceIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceIpResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private List<DevicesItem> devices;

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

	public List<DevicesItem> getDevices() {
		return this.devices;
	}

	public void setDevices(List<DevicesItem> devices) {
		this.devices = devices;
	}

	public static class DevicesItem {

		private String screenCode;

		private String ip;

		private String mac;

		private String ssId;

		private String port;

		public String getScreenCode() {
			return this.screenCode;
		}

		public void setScreenCode(String screenCode) {
			this.screenCode = screenCode;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getSsId() {
			return this.ssId;
		}

		public void setSsId(String ssId) {
			this.ssId = ssId;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	@Override
	public ListDeviceIpResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
