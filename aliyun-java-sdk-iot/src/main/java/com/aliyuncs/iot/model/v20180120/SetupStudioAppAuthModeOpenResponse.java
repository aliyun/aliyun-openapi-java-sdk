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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.SetupStudioAppAuthModeOpenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetupStudioAppAuthModeOpenResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer authMode;

		private TokenInfo tokenInfo;

		public Integer getAuthMode() {
			return this.authMode;
		}

		public void setAuthMode(Integer authMode) {
			this.authMode = authMode;
		}

		public TokenInfo getTokenInfo() {
			return this.tokenInfo;
		}

		public void setTokenInfo(TokenInfo tokenInfo) {
			this.tokenInfo = tokenInfo;
		}

		public static class TokenInfo {

			private String isEnable;

			private String type;

			private String bizType;

			private String token;

			private String bizId;

			public String getIsEnable() {
				return this.isEnable;
			}

			public void setIsEnable(String isEnable) {
				this.isEnable = isEnable;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}
		}
	}

	@Override
	public SetupStudioAppAuthModeOpenResponse getInstance(UnmarshallerContext context) {
		return	SetupStudioAppAuthModeOpenResponseUnmarshaller.unmarshall(this, context);
	}
}
