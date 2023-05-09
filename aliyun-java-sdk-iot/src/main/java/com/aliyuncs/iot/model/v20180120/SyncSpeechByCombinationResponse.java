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
import com.aliyuncs.iot.transform.v20180120.SyncSpeechByCombinationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SyncSpeechByCombinationResponse extends AcsResponse {

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

		private Integer retryCount;

		private Boolean success;

		private String deviceErrorMessage;

		private Integer maxRetryCount;

		private String deviceErrorCode;

		private String id;

		private String detail;

		public Integer getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Integer retryCount) {
			this.retryCount = retryCount;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getDeviceErrorMessage() {
			return this.deviceErrorMessage;
		}

		public void setDeviceErrorMessage(String deviceErrorMessage) {
			this.deviceErrorMessage = deviceErrorMessage;
		}

		public Integer getMaxRetryCount() {
			return this.maxRetryCount;
		}

		public void setMaxRetryCount(Integer maxRetryCount) {
			this.maxRetryCount = maxRetryCount;
		}

		public String getDeviceErrorCode() {
			return this.deviceErrorCode;
		}

		public void setDeviceErrorCode(String deviceErrorCode) {
			this.deviceErrorCode = deviceErrorCode;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public SyncSpeechByCombinationResponse getInstance(UnmarshallerContext context) {
		return	SyncSpeechByCombinationResponseUnmarshaller.unmarshall(this, context);
	}
}
