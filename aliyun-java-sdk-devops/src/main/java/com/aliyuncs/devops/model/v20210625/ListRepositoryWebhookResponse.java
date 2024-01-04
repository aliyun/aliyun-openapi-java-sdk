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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListRepositoryWebhookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoryWebhookResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Long total;

	private Boolean success;

	private String errorCode;

	private List<ResultItem> result;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean pushEvents;

		private Long projectId;

		private String createdAt;

		private String url;

		private Boolean tagPushEvents;

		private String lastTestResult;

		private Boolean mergeRequestsEvents;

		private String description;

		private Boolean noteEvents;

		private String secretToken;

		private Long id;

		private Boolean enableSslVerification;

		public Boolean getPushEvents() {
			return this.pushEvents;
		}

		public void setPushEvents(Boolean pushEvents) {
			this.pushEvents = pushEvents;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Boolean getTagPushEvents() {
			return this.tagPushEvents;
		}

		public void setTagPushEvents(Boolean tagPushEvents) {
			this.tagPushEvents = tagPushEvents;
		}

		public String getLastTestResult() {
			return this.lastTestResult;
		}

		public void setLastTestResult(String lastTestResult) {
			this.lastTestResult = lastTestResult;
		}

		public Boolean getMergeRequestsEvents() {
			return this.mergeRequestsEvents;
		}

		public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
			this.mergeRequestsEvents = mergeRequestsEvents;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getNoteEvents() {
			return this.noteEvents;
		}

		public void setNoteEvents(Boolean noteEvents) {
			this.noteEvents = noteEvents;
		}

		public String getSecretToken() {
			return this.secretToken;
		}

		public void setSecretToken(String secretToken) {
			this.secretToken = secretToken;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getEnableSslVerification() {
			return this.enableSslVerification;
		}

		public void setEnableSslVerification(Boolean enableSslVerification) {
			this.enableSslVerification = enableSslVerification;
		}
	}

	@Override
	public ListRepositoryWebhookResponse getInstance(UnmarshallerContext context) {
		return	ListRepositoryWebhookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
