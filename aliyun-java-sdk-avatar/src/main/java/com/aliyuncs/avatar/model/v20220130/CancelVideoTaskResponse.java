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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.avatar.transform.v20220130.CancelVideoTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CancelVideoTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String taskUuid;

		private Boolean isCancel;

		private String failReason;

		public String getTaskUuid() {
			return this.taskUuid;
		}

		public void setTaskUuid(String taskUuid) {
			this.taskUuid = taskUuid;
		}

		public Boolean getIsCancel() {
			return this.isCancel;
		}

		public void setIsCancel(Boolean isCancel) {
			this.isCancel = isCancel;
		}

		public String getFailReason() {
			return this.failReason;
		}

		public void setFailReason(String failReason) {
			this.failReason = failReason;
		}
	}

	@Override
	public CancelVideoTaskResponse getInstance(UnmarshallerContext context) {
		return	CancelVideoTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
