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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.ExecuteOperationSyncResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecuteOperationSyncResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer code;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String operationId;

		private String status;

		private String message;

		private String arguments;

		public String getOperationId() {
			return this.operationId;
		}

		public void setOperationId(String operationId) {
			this.operationId = operationId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getArguments() {
			return this.arguments;
		}

		public void setArguments(String arguments) {
			this.arguments = arguments;
		}
	}

	@Override
	public ExecuteOperationSyncResponse getInstance(UnmarshallerContext context) {
		return	ExecuteOperationSyncResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
