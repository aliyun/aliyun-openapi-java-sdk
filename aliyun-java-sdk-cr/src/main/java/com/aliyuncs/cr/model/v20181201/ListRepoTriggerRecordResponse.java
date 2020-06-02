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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoTriggerRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoTriggerRecordResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private List<RepoTriggerRecordsItem> repoTriggerRecords;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RepoTriggerRecordsItem> getRepoTriggerRecords() {
		return this.repoTriggerRecords;
	}

	public void setRepoTriggerRecords(List<RepoTriggerRecordsItem> repoTriggerRecords) {
		this.repoTriggerRecords = repoTriggerRecords;
	}

	public static class RepoTriggerRecordsItem {

		private String triggerId;

		private String triggerName;

		private String triggerUrl;

		private String repoEvent;

		private String triggerType;

		private String triggerTag;

		private String triggerLogId;

		private String statusCode;

		private Long requestTime;

		private String requestHeaders;

		private String requestBody;

		private String responseHeaders;

		private String responseBody;

		public String getTriggerId() {
			return this.triggerId;
		}

		public void setTriggerId(String triggerId) {
			this.triggerId = triggerId;
		}

		public String getTriggerName() {
			return this.triggerName;
		}

		public void setTriggerName(String triggerName) {
			this.triggerName = triggerName;
		}

		public String getTriggerUrl() {
			return this.triggerUrl;
		}

		public void setTriggerUrl(String triggerUrl) {
			this.triggerUrl = triggerUrl;
		}

		public String getRepoEvent() {
			return this.repoEvent;
		}

		public void setRepoEvent(String repoEvent) {
			this.repoEvent = repoEvent;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getTriggerTag() {
			return this.triggerTag;
		}

		public void setTriggerTag(String triggerTag) {
			this.triggerTag = triggerTag;
		}

		public String getTriggerLogId() {
			return this.triggerLogId;
		}

		public void setTriggerLogId(String triggerLogId) {
			this.triggerLogId = triggerLogId;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public Long getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(Long requestTime) {
			this.requestTime = requestTime;
		}

		public String getRequestHeaders() {
			return this.requestHeaders;
		}

		public void setRequestHeaders(String requestHeaders) {
			this.requestHeaders = requestHeaders;
		}

		public String getRequestBody() {
			return this.requestBody;
		}

		public void setRequestBody(String requestBody) {
			this.requestBody = requestBody;
		}

		public String getResponseHeaders() {
			return this.responseHeaders;
		}

		public void setResponseHeaders(String responseHeaders) {
			this.responseHeaders = responseHeaders;
		}

		public String getResponseBody() {
			return this.responseBody;
		}

		public void setResponseBody(String responseBody) {
			this.responseBody = responseBody;
		}
	}

	@Override
	public ListRepoTriggerRecordResponse getInstance(UnmarshallerContext context) {
		return	ListRepoTriggerRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
