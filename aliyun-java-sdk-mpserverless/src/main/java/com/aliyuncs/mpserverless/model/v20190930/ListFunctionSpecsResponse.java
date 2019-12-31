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

package com.aliyuncs.mpserverless.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190930.ListFunctionSpecsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionSpecsResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String code1;

	private String message2;

	private List<RuntimeSpec> runtimeSpecs;

	private List<MemorySpec> memorySpecs;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getCode1() {
		return this.code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getMessage2() {
		return this.message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public List<RuntimeSpec> getRuntimeSpecs() {
		return this.runtimeSpecs;
	}

	public void setRuntimeSpecs(List<RuntimeSpec> runtimeSpecs) {
		this.runtimeSpecs = runtimeSpecs;
	}

	public List<MemorySpec> getMemorySpecs() {
		return this.memorySpecs;
	}

	public void setMemorySpecs(List<MemorySpec> memorySpecs) {
		this.memorySpecs = memorySpecs;
	}

	public static class RuntimeSpec {

		private String runtimeId;

		private String runtimeName;

		public String getRuntimeId() {
			return this.runtimeId;
		}

		public void setRuntimeId(String runtimeId) {
			this.runtimeId = runtimeId;
		}

		public String getRuntimeName() {
			return this.runtimeName;
		}

		public void setRuntimeName(String runtimeName) {
			this.runtimeName = runtimeName;
		}
	}

	public static class MemorySpec {

		private String memoryId;

		private String memoryName;

		public String getMemoryId() {
			return this.memoryId;
		}

		public void setMemoryId(String memoryId) {
			this.memoryId = memoryId;
		}

		public String getMemoryName() {
			return this.memoryName;
		}

		public void setMemoryName(String memoryName) {
			this.memoryName = memoryName;
		}
	}

	@Override
	public ListFunctionSpecsResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionSpecsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
