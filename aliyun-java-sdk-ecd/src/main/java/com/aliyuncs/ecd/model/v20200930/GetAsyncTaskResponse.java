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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.GetAsyncTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAsyncTaskResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private Long totalProcess;

		private String url;

		private Long errCode;

		private String asyncTaskId;

		private String message;

		private String consumedProcess;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTotalProcess() {
			return this.totalProcess;
		}

		public void setTotalProcess(Long totalProcess) {
			this.totalProcess = totalProcess;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Long getErrCode() {
			return this.errCode;
		}

		public void setErrCode(Long errCode) {
			this.errCode = errCode;
		}

		public String getAsyncTaskId() {
			return this.asyncTaskId;
		}

		public void setAsyncTaskId(String asyncTaskId) {
			this.asyncTaskId = asyncTaskId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getConsumedProcess() {
			return this.consumedProcess;
		}

		public void setConsumedProcess(String consumedProcess) {
			this.consumedProcess = consumedProcess;
		}
	}

	@Override
	public GetAsyncTaskResponse getInstance(UnmarshallerContext context) {
		return	GetAsyncTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
