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
import com.aliyuncs.vcs.transform.v20200515.AddAiotDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddAiotDevicesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private List<AddAiotDeviceResultType> resultList;

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

	public List<AddAiotDeviceResultType> getResultList() {
		return this.resultList;
	}

	public void setResultList(List<AddAiotDeviceResultType> resultList) {
		this.resultList = resultList;
	}

	public static class AddAiotDeviceResultType {

		private String serverId;

		private String serverHostInternal;

		private String message;

		private String userId;

		private String deviceId;

		private String serverIp;

		private String serverIpInternal;

		private String serverWssPort;

		private String id;

		private String serverHost;

		private String code;

		private String serverPort;

		private String password;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getServerHostInternal() {
			return this.serverHostInternal;
		}

		public void setServerHostInternal(String serverHostInternal) {
			this.serverHostInternal = serverHostInternal;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getServerIpInternal() {
			return this.serverIpInternal;
		}

		public void setServerIpInternal(String serverIpInternal) {
			this.serverIpInternal = serverIpInternal;
		}

		public String getServerWssPort() {
			return this.serverWssPort;
		}

		public void setServerWssPort(String serverWssPort) {
			this.serverWssPort = serverWssPort;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getServerHost() {
			return this.serverHost;
		}

		public void setServerHost(String serverHost) {
			this.serverHost = serverHost;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getServerPort() {
			return this.serverPort;
		}

		public void setServerPort(String serverPort) {
			this.serverPort = serverPort;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}

	@Override
	public AddAiotDevicesResponse getInstance(UnmarshallerContext context) {
		return	AddAiotDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
