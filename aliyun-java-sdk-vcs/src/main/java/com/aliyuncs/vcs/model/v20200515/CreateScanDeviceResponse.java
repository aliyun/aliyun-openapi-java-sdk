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
import com.aliyuncs.vcs.transform.v20200515.CreateScanDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateScanDeviceResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String serverIp;

		private String serverRealm;

		private String serverPort;

		private String sipDeviceGbId;

		private String deviceId;

		private String serverId;

		private String password;

		private String deviceSn;

		private String corpId;

		private List<SubDeviceInfoItem> subDeviceInfo;

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getServerRealm() {
			return this.serverRealm;
		}

		public void setServerRealm(String serverRealm) {
			this.serverRealm = serverRealm;
		}

		public String getServerPort() {
			return this.serverPort;
		}

		public void setServerPort(String serverPort) {
			this.serverPort = serverPort;
		}

		public String getSipDeviceGbId() {
			return this.sipDeviceGbId;
		}

		public void setSipDeviceGbId(String sipDeviceGbId) {
			this.sipDeviceGbId = sipDeviceGbId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
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

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
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
	public CreateScanDeviceResponse getInstance(UnmarshallerContext context) {
		return	CreateScanDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
