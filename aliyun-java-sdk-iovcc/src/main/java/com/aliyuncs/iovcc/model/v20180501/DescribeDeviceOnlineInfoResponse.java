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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeDeviceOnlineInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceOnlineInfoResponse extends AcsResponse {

	private String requestId;

	private List<DevicesItem> devices;

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

		private String projectId;

		private String terminal;

		private String iasId;

		private String deviceId;

		private String clientVersion;

		private String systemVersion;

		private Integer online;

		private Long loginTime;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getTerminal() {
			return this.terminal;
		}

		public void setTerminal(String terminal) {
			this.terminal = terminal;
		}

		public String getIasId() {
			return this.iasId;
		}

		public void setIasId(String iasId) {
			this.iasId = iasId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
		}

		public Integer getOnline() {
			return this.online;
		}

		public void setOnline(Integer online) {
			this.online = online;
		}

		public Long getLoginTime() {
			return this.loginTime;
		}

		public void setLoginTime(Long loginTime) {
			this.loginTime = loginTime;
		}
	}

	@Override
	public DescribeDeviceOnlineInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceOnlineInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
