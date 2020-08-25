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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeBahamutAoneinternalworkitemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutAoneinternalworkitemResponse extends AcsResponse {

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

		private String akProjectId;

		private String assignedTo;

		private String assignedToStaffId;

		private Long createdAt;

		private String id;

		private String link;

		private String otherJson;

		private String priority;

		private String priorityId;

		private String projectId;

		private String stamp;

		private String status;

		private String statusId;

		private String statusStage;

		private String subject;

		private String user;

		private String userId;

		private String userStaffId;

		private List<String> cfsList;

		public String getAkProjectId() {
			return this.akProjectId;
		}

		public void setAkProjectId(String akProjectId) {
			this.akProjectId = akProjectId;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public String getAssignedToStaffId() {
			return this.assignedToStaffId;
		}

		public void setAssignedToStaffId(String assignedToStaffId) {
			this.assignedToStaffId = assignedToStaffId;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getOtherJson() {
			return this.otherJson;
		}

		public void setOtherJson(String otherJson) {
			this.otherJson = otherJson;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getPriorityId() {
			return this.priorityId;
		}

		public void setPriorityId(String priorityId) {
			this.priorityId = priorityId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusId() {
			return this.statusId;
		}

		public void setStatusId(String statusId) {
			this.statusId = statusId;
		}

		public String getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(String statusStage) {
			this.statusStage = statusStage;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserStaffId() {
			return this.userStaffId;
		}

		public void setUserStaffId(String userStaffId) {
			this.userStaffId = userStaffId;
		}

		public List<String> getCfsList() {
			return this.cfsList;
		}

		public void setCfsList(List<String> cfsList) {
			this.cfsList = cfsList;
		}
	}

	@Override
	public UpdateLinkeBahamutAoneinternalworkitemResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeBahamutAoneinternalworkitemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
