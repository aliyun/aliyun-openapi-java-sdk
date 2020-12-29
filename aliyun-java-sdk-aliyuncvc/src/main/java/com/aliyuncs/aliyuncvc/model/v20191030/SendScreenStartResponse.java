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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.SendScreenStartResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SendScreenStartResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer errorCode;

	private Boolean success;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> receiverInfo;

		private String sessionId;

		private List<IceServersItem> iceServers;

		private AuthWsChannelConfig authWsChannelConfig;

		private ShareConfig shareConfig;

		private SignallingServerConfig signallingServerConfig;

		public Map<Object,Object> getReceiverInfo() {
			return this.receiverInfo;
		}

		public void setReceiverInfo(Map<Object,Object> receiverInfo) {
			this.receiverInfo = receiverInfo;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public List<IceServersItem> getIceServers() {
			return this.iceServers;
		}

		public void setIceServers(List<IceServersItem> iceServers) {
			this.iceServers = iceServers;
		}

		public AuthWsChannelConfig getAuthWsChannelConfig() {
			return this.authWsChannelConfig;
		}

		public void setAuthWsChannelConfig(AuthWsChannelConfig authWsChannelConfig) {
			this.authWsChannelConfig = authWsChannelConfig;
		}

		public ShareConfig getShareConfig() {
			return this.shareConfig;
		}

		public void setShareConfig(ShareConfig shareConfig) {
			this.shareConfig = shareConfig;
		}

		public SignallingServerConfig getSignallingServerConfig() {
			return this.signallingServerConfig;
		}

		public void setSignallingServerConfig(SignallingServerConfig signallingServerConfig) {
			this.signallingServerConfig = signallingServerConfig;
		}

		public static class IceServersItem {

			private String credential;

			private String url;

			private String userName;

			public String getCredential() {
				return this.credential;
			}

			public void setCredential(String credential) {
				this.credential = credential;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class AuthWsChannelConfig {

			private String authWsUrl;

			private String token;

			private Integer wsOuterReConnTime;

			public String getAuthWsUrl() {
				return this.authWsUrl;
			}

			public void setAuthWsUrl(String authWsUrl) {
				this.authWsUrl = authWsUrl;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public Integer getWsOuterReConnTime() {
				return this.wsOuterReConnTime;
			}

			public void setWsOuterReConnTime(Integer wsOuterReConnTime) {
				this.wsOuterReConnTime = wsOuterReConnTime;
			}
		}

		public static class ShareConfig {

			private Integer maxMultiScreenShareBitrate;

			private Integer maxScreenShareBitrate;

			private Integer shareConfigMaxFrameRate;

			private Integer shareConfigMinFrameRate;

			public Integer getMaxMultiScreenShareBitrate() {
				return this.maxMultiScreenShareBitrate;
			}

			public void setMaxMultiScreenShareBitrate(Integer maxMultiScreenShareBitrate) {
				this.maxMultiScreenShareBitrate = maxMultiScreenShareBitrate;
			}

			public Integer getMaxScreenShareBitrate() {
				return this.maxScreenShareBitrate;
			}

			public void setMaxScreenShareBitrate(Integer maxScreenShareBitrate) {
				this.maxScreenShareBitrate = maxScreenShareBitrate;
			}

			public Integer getShareConfigMaxFrameRate() {
				return this.shareConfigMaxFrameRate;
			}

			public void setShareConfigMaxFrameRate(Integer shareConfigMaxFrameRate) {
				this.shareConfigMaxFrameRate = shareConfigMaxFrameRate;
			}

			public Integer getShareConfigMinFrameRate() {
				return this.shareConfigMinFrameRate;
			}

			public void setShareConfigMinFrameRate(Integer shareConfigMinFrameRate) {
				this.shareConfigMinFrameRate = shareConfigMinFrameRate;
			}
		}

		public static class SignallingServerConfig {

			private String clientHeartBeatUrl;

			private String getMessageUrl;

			private String getReceiverInfoUrl;

			private String sendMessageUrl;

			private String shareScreenMeetingRobUrl;

			public String getClientHeartBeatUrl() {
				return this.clientHeartBeatUrl;
			}

			public void setClientHeartBeatUrl(String clientHeartBeatUrl) {
				this.clientHeartBeatUrl = clientHeartBeatUrl;
			}

			public String getGetMessageUrl() {
				return this.getMessageUrl;
			}

			public void setGetMessageUrl(String getMessageUrl) {
				this.getMessageUrl = getMessageUrl;
			}

			public String getGetReceiverInfoUrl() {
				return this.getReceiverInfoUrl;
			}

			public void setGetReceiverInfoUrl(String getReceiverInfoUrl) {
				this.getReceiverInfoUrl = getReceiverInfoUrl;
			}

			public String getSendMessageUrl() {
				return this.sendMessageUrl;
			}

			public void setSendMessageUrl(String sendMessageUrl) {
				this.sendMessageUrl = sendMessageUrl;
			}

			public String getShareScreenMeetingRobUrl() {
				return this.shareScreenMeetingRobUrl;
			}

			public void setShareScreenMeetingRobUrl(String shareScreenMeetingRobUrl) {
				this.shareScreenMeetingRobUrl = shareScreenMeetingRobUrl;
			}
		}
	}

	@Override
	public SendScreenStartResponse getInstance(UnmarshallerContext context) {
		return	SendScreenStartResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
