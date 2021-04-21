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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.GetCodeCompletionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCodeCompletionResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private String errorMessage;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String body;

		private String clientTimestamp;

		private String receiveTimestamp;

		private String invokeTimestamp;

		private String fetchTimestamp;

		private String rspTimestamp;

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getClientTimestamp() {
			return this.clientTimestamp;
		}

		public void setClientTimestamp(String clientTimestamp) {
			this.clientTimestamp = clientTimestamp;
		}

		public String getReceiveTimestamp() {
			return this.receiveTimestamp;
		}

		public void setReceiveTimestamp(String receiveTimestamp) {
			this.receiveTimestamp = receiveTimestamp;
		}

		public String getInvokeTimestamp() {
			return this.invokeTimestamp;
		}

		public void setInvokeTimestamp(String invokeTimestamp) {
			this.invokeTimestamp = invokeTimestamp;
		}

		public String getFetchTimestamp() {
			return this.fetchTimestamp;
		}

		public void setFetchTimestamp(String fetchTimestamp) {
			this.fetchTimestamp = fetchTimestamp;
		}

		public String getRspTimestamp() {
			return this.rspTimestamp;
		}

		public void setRspTimestamp(String rspTimestamp) {
			this.rspTimestamp = rspTimestamp;
		}
	}

	@Override
	public GetCodeCompletionResponse getInstance(UnmarshallerContext context) {
		return	GetCodeCompletionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
