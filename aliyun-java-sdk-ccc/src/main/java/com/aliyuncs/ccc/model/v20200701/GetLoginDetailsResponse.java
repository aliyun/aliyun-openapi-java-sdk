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
import com.aliyuncs.ccc.transform.v20200701.GetLoginDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoginDetailsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<String> params;

	private Data data;

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

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String displayName;

		private String extension;

		private String signature;

		private String sipServerUrl;

		private String deviceId;

		private String agentServerUrl;

		private String userId;

		private String userKey;

		private String workMode;

		private String userKey2;

		private String signature2;

		private String deviceExt;

		private String deviceState;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getSipServerUrl() {
			return this.sipServerUrl;
		}

		public void setSipServerUrl(String sipServerUrl) {
			this.sipServerUrl = sipServerUrl;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getAgentServerUrl() {
			return this.agentServerUrl;
		}

		public void setAgentServerUrl(String agentServerUrl) {
			this.agentServerUrl = agentServerUrl;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserKey() {
			return this.userKey;
		}

		public void setUserKey(String userKey) {
			this.userKey = userKey;
		}

		public String getWorkMode() {
			return this.workMode;
		}

		public void setWorkMode(String workMode) {
			this.workMode = workMode;
		}

		public String getUserKey2() {
			return this.userKey2;
		}

		public void setUserKey2(String userKey2) {
			this.userKey2 = userKey2;
		}

		public String getSignature2() {
			return this.signature2;
		}

		public void setSignature2(String signature2) {
			this.signature2 = signature2;
		}

		public String getDeviceExt() {
			return this.deviceExt;
		}

		public void setDeviceExt(String deviceExt) {
			this.deviceExt = deviceExt;
		}

		public String getDeviceState() {
			return this.deviceState;
		}

		public void setDeviceState(String deviceState) {
			this.deviceState = deviceState;
		}
	}

	@Override
	public GetLoginDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetLoginDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
