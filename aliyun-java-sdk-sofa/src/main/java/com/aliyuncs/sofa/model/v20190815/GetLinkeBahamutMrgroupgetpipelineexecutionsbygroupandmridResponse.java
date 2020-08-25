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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse extends AcsResponse {

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

		private Long created;

		private String extraDiv;

		private String id;

		private String iterationName;

		private Long lastModified;

		private Long mergeRequestId;

		private Long mergeRequestIid;

		private String mrState;

		private String mrType;

		private String mrWebUrl;

		private String name;

		private String pipelineExecutionStatus;

		private String pipelineTag;

		private Boolean reviewed;

		private Boolean showState;

		private String sourceBranch;

		private Long timelimeComparingTime;

		private Boolean triggerByAdmin;

		private String type;

		private List<String> pipelineExecutionVOS;

		private List<String> stages;

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

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getExtraDiv() {
			return this.extraDiv;
		}

		public void setExtraDiv(String extraDiv) {
			this.extraDiv = extraDiv;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIterationName() {
			return this.iterationName;
		}

		public void setIterationName(String iterationName) {
			this.iterationName = iterationName;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Long getMergeRequestId() {
			return this.mergeRequestId;
		}

		public void setMergeRequestId(Long mergeRequestId) {
			this.mergeRequestId = mergeRequestId;
		}

		public Long getMergeRequestIid() {
			return this.mergeRequestIid;
		}

		public void setMergeRequestIid(Long mergeRequestIid) {
			this.mergeRequestIid = mergeRequestIid;
		}

		public String getMrState() {
			return this.mrState;
		}

		public void setMrState(String mrState) {
			this.mrState = mrState;
		}

		public String getMrType() {
			return this.mrType;
		}

		public void setMrType(String mrType) {
			this.mrType = mrType;
		}

		public String getMrWebUrl() {
			return this.mrWebUrl;
		}

		public void setMrWebUrl(String mrWebUrl) {
			this.mrWebUrl = mrWebUrl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPipelineExecutionStatus() {
			return this.pipelineExecutionStatus;
		}

		public void setPipelineExecutionStatus(String pipelineExecutionStatus) {
			this.pipelineExecutionStatus = pipelineExecutionStatus;
		}

		public String getPipelineTag() {
			return this.pipelineTag;
		}

		public void setPipelineTag(String pipelineTag) {
			this.pipelineTag = pipelineTag;
		}

		public Boolean getReviewed() {
			return this.reviewed;
		}

		public void setReviewed(Boolean reviewed) {
			this.reviewed = reviewed;
		}

		public Boolean getShowState() {
			return this.showState;
		}

		public void setShowState(Boolean showState) {
			this.showState = showState;
		}

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public Long getTimelimeComparingTime() {
			return this.timelimeComparingTime;
		}

		public void setTimelimeComparingTime(Long timelimeComparingTime) {
			this.timelimeComparingTime = timelimeComparingTime;
		}

		public Boolean getTriggerByAdmin() {
			return this.triggerByAdmin;
		}

		public void setTriggerByAdmin(Boolean triggerByAdmin) {
			this.triggerByAdmin = triggerByAdmin;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getPipelineExecutionVOS() {
			return this.pipelineExecutionVOS;
		}

		public void setPipelineExecutionVOS(List<String> pipelineExecutionVOS) {
			this.pipelineExecutionVOS = pipelineExecutionVOS;
		}

		public List<String> getStages() {
			return this.stages;
		}

		public void setStages(List<String> stages) {
			this.stages = stages;
		}
	}

	@Override
	public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
