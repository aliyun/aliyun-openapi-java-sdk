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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetPipelineStepLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineStepLogResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Object object;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private Integer last;

		private Boolean more;

		private String logs;

		public Integer getLast() {
			return this.last;
		}

		public void setLast(Integer last) {
			this.last = last;
		}

		public Boolean getMore() {
			return this.more;
		}

		public void setMore(Boolean more) {
			this.more = more;
		}

		public String getLogs() {
			return this.logs;
		}

		public void setLogs(String logs) {
			this.logs = logs;
		}
	}

	@Override
	public GetPipelineStepLogResponse getInstance(UnmarshallerContext context) {
		return	GetPipelineStepLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
