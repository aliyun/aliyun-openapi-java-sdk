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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetAdHocTaskLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAdHocTaskLogResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private LogInfo logInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public LogInfo getLogInfo() {
		return this.logInfo;
	}

	public void setLogInfo(LogInfo logInfo) {
		this.logInfo = logInfo;
	}

	public static class LogInfo {

		private String taskId;

		private Integer subTaskId;

		private String taskStatus;

		private Boolean hasNext;

		private Boolean hasResult;

		private Integer nextOffset;

		private String content;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getSubTaskId() {
			return this.subTaskId;
		}

		public void setSubTaskId(Integer subTaskId) {
			this.subTaskId = subTaskId;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public Boolean getHasNext() {
			return this.hasNext;
		}

		public void setHasNext(Boolean hasNext) {
			this.hasNext = hasNext;
		}

		public Boolean getHasResult() {
			return this.hasResult;
		}

		public void setHasResult(Boolean hasResult) {
			this.hasResult = hasResult;
		}

		public Integer getNextOffset() {
			return this.nextOffset;
		}

		public void setNextOffset(Integer nextOffset) {
			this.nextOffset = nextOffset;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public GetAdHocTaskLogResponse getInstance(UnmarshallerContext context) {
		return	GetAdHocTaskLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
