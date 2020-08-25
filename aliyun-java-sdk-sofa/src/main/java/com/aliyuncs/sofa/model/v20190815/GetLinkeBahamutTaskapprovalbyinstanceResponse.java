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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutTaskapprovalbyinstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutTaskapprovalbyinstanceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean abortedBlocked;

		private String assignee;

		private String assigneeUser;

		private Boolean completed;

		private Long created;

		private String creator;

		private String creatorId;

		private String detail;

		private String extend;

		private String extra;

		private Boolean finishedSuccessful;

		private String flowStatus;

		private String gmtCreate;

		private String id;

		private String objectId;

		private String objectType;

		private String portalUrl;

		private String recordCnName;

		private String sourceId;

		private String status;

		private String statusName;

		private String taskStatus;

		private String title;

		private String type;

		private String url;

		private List<String> appNames;

		private List<String> assigneeUsers;

		public Boolean getAbortedBlocked() {
			return this.abortedBlocked;
		}

		public void setAbortedBlocked(Boolean abortedBlocked) {
			this.abortedBlocked = abortedBlocked;
		}

		public String getAssignee() {
			return this.assignee;
		}

		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}

		public String getAssigneeUser() {
			return this.assigneeUser;
		}

		public void setAssigneeUser(String assigneeUser) {
			this.assigneeUser = assigneeUser;
		}

		public Boolean getCompleted() {
			return this.completed;
		}

		public void setCompleted(Boolean completed) {
			this.completed = completed;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getExtend() {
			return this.extend;
		}

		public void setExtend(String extend) {
			this.extend = extend;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public Boolean getFinishedSuccessful() {
			return this.finishedSuccessful;
		}

		public void setFinishedSuccessful(Boolean finishedSuccessful) {
			this.finishedSuccessful = finishedSuccessful;
		}

		public String getFlowStatus() {
			return this.flowStatus;
		}

		public void setFlowStatus(String flowStatus) {
			this.flowStatus = flowStatus;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getPortalUrl() {
			return this.portalUrl;
		}

		public void setPortalUrl(String portalUrl) {
			this.portalUrl = portalUrl;
		}

		public String getRecordCnName() {
			return this.recordCnName;
		}

		public void setRecordCnName(String recordCnName) {
			this.recordCnName = recordCnName;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<String> getAppNames() {
			return this.appNames;
		}

		public void setAppNames(List<String> appNames) {
			this.appNames = appNames;
		}

		public List<String> getAssigneeUsers() {
			return this.assigneeUsers;
		}

		public void setAssigneeUsers(List<String> assigneeUsers) {
			this.assigneeUsers = assigneeUsers;
		}
	}

	@Override
	public GetLinkeBahamutTaskapprovalbyinstanceResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutTaskapprovalbyinstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
