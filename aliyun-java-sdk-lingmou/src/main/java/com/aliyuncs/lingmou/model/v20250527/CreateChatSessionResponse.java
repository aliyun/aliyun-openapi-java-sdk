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

package com.aliyuncs.lingmou.model.v20250527;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lingmou.transform.v20250527.CreateChatSessionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateChatSessionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Long httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private String sessionId;

		private RtcParams rtcParams;

		private AvatarAssets avatarAssets;

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public RtcParams getRtcParams() {
			return this.rtcParams;
		}

		public void setRtcParams(RtcParams rtcParams) {
			this.rtcParams = rtcParams;
		}

		public AvatarAssets getAvatarAssets() {
			return this.avatarAssets;
		}

		public void setAvatarAssets(AvatarAssets avatarAssets) {
			this.avatarAssets = avatarAssets;
		}

		public static class RtcParams {

			private String appId;

			private String avatarUserId;

			private String channel;

			private String clientUserId;

			private String gslb;

			private String nonce;

			private String serverUserId;

			private Long timestamp;

			private String token;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAvatarUserId() {
				return this.avatarUserId;
			}

			public void setAvatarUserId(String avatarUserId) {
				this.avatarUserId = avatarUserId;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public String getClientUserId() {
				return this.clientUserId;
			}

			public void setClientUserId(String clientUserId) {
				this.clientUserId = clientUserId;
			}

			public String getGslb() {
				return this.gslb;
			}

			public void setGslb(String gslb) {
				this.gslb = gslb;
			}

			public String getNonce() {
				return this.nonce;
			}

			public void setNonce(String nonce) {
				this.nonce = nonce;
			}

			public String getServerUserId() {
				return this.serverUserId;
			}

			public void setServerUserId(String serverUserId) {
				this.serverUserId = serverUserId;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}
		}

		public static class AvatarAssets {

			private String url;

			private String md5;

			private String secret;

			private String type;

			private String minRequiredVersion;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public String getSecret() {
				return this.secret;
			}

			public void setSecret(String secret) {
				this.secret = secret;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMinRequiredVersion() {
				return this.minRequiredVersion;
			}

			public void setMinRequiredVersion(String minRequiredVersion) {
				this.minRequiredVersion = minRequiredVersion;
			}
		}
	}

	@Override
	public CreateChatSessionResponse getInstance(UnmarshallerContext context) {
		return	CreateChatSessionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
