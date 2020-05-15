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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CheckLinkeLinktDeleteworkflowstatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLinkeLinktDeleteworkflowstatusResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean checkSuccess;

		private Long errorCode;

		private Long workItemCount;

		public Boolean getCheckSuccess() {
			return this.checkSuccess;
		}

		public void setCheckSuccess(Boolean checkSuccess) {
			this.checkSuccess = checkSuccess;
		}

		public Long getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(Long errorCode) {
			this.errorCode = errorCode;
		}

		public Long getWorkItemCount() {
			return this.workItemCount;
		}

		public void setWorkItemCount(Long workItemCount) {
			this.workItemCount = workItemCount;
		}
	}

	@Override
	public CheckLinkeLinktDeleteworkflowstatusResponse getInstance(UnmarshallerContext context) {
		return	CheckLinkeLinktDeleteworkflowstatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
