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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetWorkitemFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkitemFileResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private String success;

	private WorkitemFile workitemFile;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public WorkitemFile getWorkitemFile() {
		return this.workitemFile;
	}

	public void setWorkitemFile(WorkitemFile workitemFile) {
		this.workitemFile = workitemFile;
	}

	public static class WorkitemFile {

		private String id;

		private String name;

		private String suffix;

		private Integer size;

		private String url;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSuffix() {
			return this.suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public GetWorkitemFileResponse getInstance(UnmarshallerContext context) {
		return	GetWorkitemFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
