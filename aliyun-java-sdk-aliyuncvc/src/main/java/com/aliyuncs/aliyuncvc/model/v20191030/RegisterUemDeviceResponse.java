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
import com.aliyuncs.aliyuncvc.transform.v20191030.RegisterUemDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterUemDeviceResponse extends AcsResponse {

	private Integer errorCode;

	private Boolean success;

	private String requestId;

	private String message;

	private DeviceInfo deviceInfo;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public static class DeviceInfo {

		private String channelType;

		private Long registerTime;

		private String deviceName;

		private String deviceSessionId;

		private String messageKey;

		private String screenCode;

		private String token;

		private MqttParam mqttParam;

		private AuthWsChannelConfig authWsChannelConfig;

		private SlsConfig slsConfig;

		public String getChannelType() {
			return this.channelType;
		}

		public void setChannelType(String channelType) {
			this.channelType = channelType;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceSessionId() {
			return this.deviceSessionId;
		}

		public void setDeviceSessionId(String deviceSessionId) {
			this.deviceSessionId = deviceSessionId;
		}

		public String getMessageKey() {
			return this.messageKey;
		}

		public void setMessageKey(String messageKey) {
			this.messageKey = messageKey;
		}

		public String getScreenCode() {
			return this.screenCode;
		}

		public void setScreenCode(String screenCode) {
			this.screenCode = screenCode;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public MqttParam getMqttParam() {
			return this.mqttParam;
		}

		public void setMqttParam(MqttParam mqttParam) {
			this.mqttParam = mqttParam;
		}

		public AuthWsChannelConfig getAuthWsChannelConfig() {
			return this.authWsChannelConfig;
		}

		public void setAuthWsChannelConfig(AuthWsChannelConfig authWsChannelConfig) {
			this.authWsChannelConfig = authWsChannelConfig;
		}

		public SlsConfig getSlsConfig() {
			return this.slsConfig;
		}

		public void setSlsConfig(SlsConfig slsConfig) {
			this.slsConfig = slsConfig;
		}

		public static class MqttParam {

			private String clientId;

			private String groupId;

			private String cleanSession;

			private String password;

			private String port;

			private String host;

			private String topic;

			private String sDKClientPort;

			private String tLSPort;

			private String useTLS;

			private String userName;

			private String reconnectTimeout;

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getCleanSession() {
				return this.cleanSession;
			}

			public void setCleanSession(String cleanSession) {
				this.cleanSession = cleanSession;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getSDKClientPort() {
				return this.sDKClientPort;
			}

			public void setSDKClientPort(String sDKClientPort) {
				this.sDKClientPort = sDKClientPort;
			}

			public String getTLSPort() {
				return this.tLSPort;
			}

			public void setTLSPort(String tLSPort) {
				this.tLSPort = tLSPort;
			}

			public String getUseTLS() {
				return this.useTLS;
			}

			public void setUseTLS(String useTLS) {
				this.useTLS = useTLS;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getReconnectTimeout() {
				return this.reconnectTimeout;
			}

			public void setReconnectTimeout(String reconnectTimeout) {
				this.reconnectTimeout = reconnectTimeout;
			}
		}

		public static class AuthWsChannelConfig {

			private String authWsUrl;

			private Integer wsOuterReconnTime;

			private String token;

			public String getAuthWsUrl() {
				return this.authWsUrl;
			}

			public void setAuthWsUrl(String authWsUrl) {
				this.authWsUrl = authWsUrl;
			}

			public Integer getWsOuterReconnTime() {
				return this.wsOuterReconnTime;
			}

			public void setWsOuterReconnTime(Integer wsOuterReconnTime) {
				this.wsOuterReconnTime = wsOuterReconnTime;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}
		}

		public static class SlsConfig {

			private String project;

			private String logStore;

			private String logServiceEndpoint;

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getLogStore() {
				return this.logStore;
			}

			public void setLogStore(String logStore) {
				this.logStore = logStore;
			}

			public String getLogServiceEndpoint() {
				return this.logServiceEndpoint;
			}

			public void setLogServiceEndpoint(String logServiceEndpoint) {
				this.logServiceEndpoint = logServiceEndpoint;
			}
		}
	}

	@Override
	public RegisterUemDeviceResponse getInstance(UnmarshallerContext context) {
		return	RegisterUemDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
