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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeBahamutVcsmergerequestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutVcsmergerequestResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String assignee;

		private String author;

		private String description;

		private Long id;

		private Long iid;

		private String mergeCommitSha;

		private String mergeStatus;

		private Long projectId;

		private String review;

		private Boolean reviewed;

		private String sourceBranch;

		private Long sourceProjectId;

		private String state;

		private String targetBranch;

		private Long targetProjectId;

		private String title;

		private String webUrl;

		public String getAssignee() {
			return this.assignee;
		}

		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIid() {
			return this.iid;
		}

		public void setIid(Long iid) {
			this.iid = iid;
		}

		public String getMergeCommitSha() {
			return this.mergeCommitSha;
		}

		public void setMergeCommitSha(String mergeCommitSha) {
			this.mergeCommitSha = mergeCommitSha;
		}

		public String getMergeStatus() {
			return this.mergeStatus;
		}

		public void setMergeStatus(String mergeStatus) {
			this.mergeStatus = mergeStatus;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getReview() {
			return this.review;
		}

		public void setReview(String review) {
			this.review = review;
		}

		public Boolean getReviewed() {
			return this.reviewed;
		}

		public void setReviewed(Boolean reviewed) {
			this.reviewed = reviewed;
		}

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public Long getSourceProjectId() {
			return this.sourceProjectId;
		}

		public void setSourceProjectId(Long sourceProjectId) {
			this.sourceProjectId = sourceProjectId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTargetBranch() {
			return this.targetBranch;
		}

		public void setTargetBranch(String targetBranch) {
			this.targetBranch = targetBranch;
		}

		public Long getTargetProjectId() {
			return this.targetProjectId;
		}

		public void setTargetProjectId(Long targetProjectId) {
			this.targetProjectId = targetProjectId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}
	}

	@Override
	public CreateLinkeBahamutVcsmergerequestResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeBahamutVcsmergerequestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
