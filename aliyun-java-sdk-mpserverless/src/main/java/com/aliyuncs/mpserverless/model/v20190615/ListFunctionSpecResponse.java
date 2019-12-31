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

package com.aliyuncs.mpserverless.model.v20190615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190615.ListFunctionSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionSpecResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<RuntimeListItem> runtimeList;

	private List<MemoryListItem> memoryList;

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

	public List<RuntimeListItem> getRuntimeList() {
		return this.runtimeList;
	}

	public void setRuntimeList(List<RuntimeListItem> runtimeList) {
		this.runtimeList = runtimeList;
	}

	public List<MemoryListItem> getMemoryList() {
		return this.memoryList;
	}

	public void setMemoryList(List<MemoryListItem> memoryList) {
		this.memoryList = memoryList;
	}

	public static class RuntimeListItem {

		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class MemoryListItem {

		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListFunctionSpecResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
