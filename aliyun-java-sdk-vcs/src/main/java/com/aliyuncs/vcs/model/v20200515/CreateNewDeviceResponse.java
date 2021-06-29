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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.CreateNewDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNewDeviceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String sipRealm;

		private String serverIp;

		private String deviceId;

		private String serverPort;

		private String serverId;

		private String password;

		private List<SubDeviceInfoItem> subDeviceInfo;

		public String getSipRealm() {
			return this.sipRealm;
		}

		public void setSipRealm(String sipRealm) {
			this.sipRealm = sipRealm;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getServerPort() {
			return this.serverPort;
		}

		public void setServerPort(String serverPort) {
			this.serverPort = serverPort;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<SubDeviceInfoItem> getSubDeviceInfo() {
			return this.subDeviceInfo;
		}

		public void setSubDeviceInfo(List<SubDeviceInfoItem> subDeviceInfo) {
			this.subDeviceInfo = subDeviceInfo;
		}

		public static class SubDeviceInfoItem {

			private String channelDeviceId;

			public String getChannelDeviceId() {
				return this.channelDeviceId;
			}

			public void setChannelDeviceId(String channelDeviceId) {
				this.channelDeviceId = channelDeviceId;
			}
		}
	}

	@Override
	public CreateNewDeviceResponse getInstance(UnmarshallerContext context) {
		return	CreateNewDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
