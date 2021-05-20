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
import com.aliyuncs.iot.transform.v20180120.PrintByTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PrintByTemplateResponse extends AcsResponse {

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

		private Boolean success;

		private String deviceErrorCode;

		private String deviceErrorMessage;

		private String id;

		private Integer retryCount;

		private Integer maxRetryCount;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getDeviceErrorCode() {
			return this.deviceErrorCode;
		}

		public void setDeviceErrorCode(String deviceErrorCode) {
			this.deviceErrorCode = deviceErrorCode;
		}

		public String getDeviceErrorMessage() {
			return this.deviceErrorMessage;
		}

		public void setDeviceErrorMessage(String deviceErrorMessage) {
			this.deviceErrorMessage = deviceErrorMessage;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Integer retryCount) {
			this.retryCount = retryCount;
		}

		public Integer getMaxRetryCount() {
			return this.maxRetryCount;
		}

		public void setMaxRetryCount(Integer maxRetryCount) {
			this.maxRetryCount = maxRetryCount;
		}
	}

	@Override
	public PrintByTemplateResponse getInstance(UnmarshallerContext context) {
		return	PrintByTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
