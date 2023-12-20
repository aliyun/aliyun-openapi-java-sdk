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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryRtmpKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRtmpKeyResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String pullAuthKey;

		private Integer pullKeyExpireTime;

		private Integer pushKeyExpireTime;

		private String streamName;

		private String pushAuthKey;

		public String getPullAuthKey() {
			return this.pullAuthKey;
		}

		public void setPullAuthKey(String pullAuthKey) {
			this.pullAuthKey = pullAuthKey;
		}

		public Integer getPullKeyExpireTime() {
			return this.pullKeyExpireTime;
		}

		public void setPullKeyExpireTime(Integer pullKeyExpireTime) {
			this.pullKeyExpireTime = pullKeyExpireTime;
		}

		public Integer getPushKeyExpireTime() {
			return this.pushKeyExpireTime;
		}

		public void setPushKeyExpireTime(Integer pushKeyExpireTime) {
			this.pushKeyExpireTime = pushKeyExpireTime;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getPushAuthKey() {
			return this.pushAuthKey;
		}

		public void setPushAuthKey(String pushAuthKey) {
			this.pushAuthKey = pushAuthKey;
		}
	}

	@Override
	public QueryRtmpKeyResponse getInstance(UnmarshallerContext context) {
		return	QueryRtmpKeyResponseUnmarshaller.unmarshall(this, context);
	}
}
