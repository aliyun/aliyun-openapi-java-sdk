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

package com.aliyuncs.dms_lab.model.v20200915;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_lab.transform.v20200915.GetTaskStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private LabDbTaskResult labDbTaskResult;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public LabDbTaskResult getLabDbTaskResult() {
		return this.labDbTaskResult;
	}

	public void setLabDbTaskResult(LabDbTaskResult labDbTaskResult) {
		this.labDbTaskResult = labDbTaskResult;
	}

	public static class LabDbTaskResult {

		private String type;

		private String status;

		private Integer totalCount;

		private Integer successCount;

		private Integer failureCount;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}

		public Integer getFailureCount() {
			return this.failureCount;
		}

		public void setFailureCount(Integer failureCount) {
			this.failureCount = failureCount;
		}
	}

	@Override
	public GetTaskStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTaskStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
