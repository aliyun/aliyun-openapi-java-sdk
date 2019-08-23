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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.CreateZnodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateZnodeResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String errorCode;

	private String requestId;

	private String httpCode;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String path;

		private String name;

		private String data;

		private Boolean dir;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Boolean getDir() {
			return this.dir;
		}

		public void setDir(Boolean dir) {
			this.dir = dir;
		}
	}

	@Override
	public CreateZnodeResponse getInstance(UnmarshallerContext context) {
		return	CreateZnodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
