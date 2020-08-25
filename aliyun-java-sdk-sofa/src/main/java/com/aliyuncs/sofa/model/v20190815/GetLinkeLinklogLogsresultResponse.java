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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeLinklogLogsresultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeLinklogLogsresultResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMsg;

	private String responseContentRange;

	private String responseContentType;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getResponseContentRange() {
		return this.responseContentRange;
	}

	public void setResponseContentRange(String responseContentRange) {
		this.responseContentRange = responseContentRange;
	}

	public String getResponseContentType() {
		return this.responseContentType;
	}

	public void setResponseContentType(String responseContentType) {
		this.responseContentType = responseContentType;
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

		private String bizInfo;

		private String fullLogUrl;

		private Long lineCount;

		private Long logId;

		private String rawLogDownloadUrl;

		private String sourceId;

		private String sourcePath;

		private String sourceType;

		private String status;

		private Long storeId;

		private String storeName;

		private String taskId;

		private String taskStatus;

		private String taskUrl;

		private List<String> blockContent;

		private List<String> causeResults;

		private List<String> envs;

		private List<String> feedbackOptions;

		private List<String> feedbackResult;

		private List<String> patternResult;

		private List<String> steps;

		public String getBizInfo() {
			return this.bizInfo;
		}

		public void setBizInfo(String bizInfo) {
			this.bizInfo = bizInfo;
		}

		public String getFullLogUrl() {
			return this.fullLogUrl;
		}

		public void setFullLogUrl(String fullLogUrl) {
			this.fullLogUrl = fullLogUrl;
		}

		public Long getLineCount() {
			return this.lineCount;
		}

		public void setLineCount(Long lineCount) {
			this.lineCount = lineCount;
		}

		public Long getLogId() {
			return this.logId;
		}

		public void setLogId(Long logId) {
			this.logId = logId;
		}

		public String getRawLogDownloadUrl() {
			return this.rawLogDownloadUrl;
		}

		public void setRawLogDownloadUrl(String rawLogDownloadUrl) {
			this.rawLogDownloadUrl = rawLogDownloadUrl;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getSourcePath() {
			return this.sourcePath;
		}

		public void setSourcePath(String sourcePath) {
			this.sourcePath = sourcePath;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getStoreName() {
			return this.storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskUrl() {
			return this.taskUrl;
		}

		public void setTaskUrl(String taskUrl) {
			this.taskUrl = taskUrl;
		}

		public List<String> getBlockContent() {
			return this.blockContent;
		}

		public void setBlockContent(List<String> blockContent) {
			this.blockContent = blockContent;
		}

		public List<String> getCauseResults() {
			return this.causeResults;
		}

		public void setCauseResults(List<String> causeResults) {
			this.causeResults = causeResults;
		}

		public List<String> getEnvs() {
			return this.envs;
		}

		public void setEnvs(List<String> envs) {
			this.envs = envs;
		}

		public List<String> getFeedbackOptions() {
			return this.feedbackOptions;
		}

		public void setFeedbackOptions(List<String> feedbackOptions) {
			this.feedbackOptions = feedbackOptions;
		}

		public List<String> getFeedbackResult() {
			return this.feedbackResult;
		}

		public void setFeedbackResult(List<String> feedbackResult) {
			this.feedbackResult = feedbackResult;
		}

		public List<String> getPatternResult() {
			return this.patternResult;
		}

		public void setPatternResult(List<String> patternResult) {
			this.patternResult = patternResult;
		}

		public List<String> getSteps() {
			return this.steps;
		}

		public void setSteps(List<String> steps) {
			this.steps = steps;
		}
	}

	@Override
	public GetLinkeLinklogLogsresultResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeLinklogLogsresultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
