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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeBahamutIterationworkitemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutIterationworkitemResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String acHour;

		private String assignedTo;

		private String assignedToStaffId;

		private Long created;

		private String creator;

		private String creatorStaffId;

		private Boolean deleted;

		private String esHour;

		private String externalId;

		private String id;

		private String iterationExternalId;

		private Long lastModified;

		private String link;

		private String mergeRequestId;

		private String priority;

		private String priorityId;

		private String progress;

		private String stamp;

		private String status;

		private String statusId;

		private String statusStage;

		private String subject;

		private String sys;

		private String url;

		public String getAcHour() {
			return this.acHour;
		}

		public void setAcHour(String acHour) {
			this.acHour = acHour;
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

		public String getCreatorStaffId() {
			return this.creatorStaffId;
		}

		public void setCreatorStaffId(String creatorStaffId) {
			this.creatorStaffId = creatorStaffId;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getEsHour() {
			return this.esHour;
		}

		public void setEsHour(String esHour) {
			this.esHour = esHour;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIterationExternalId() {
			return this.iterationExternalId;
		}

		public void setIterationExternalId(String iterationExternalId) {
			this.iterationExternalId = iterationExternalId;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getMergeRequestId() {
			return this.mergeRequestId;
		}

		public void setMergeRequestId(String mergeRequestId) {
			this.mergeRequestId = mergeRequestId;
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

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
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

		public String getSys() {
			return this.sys;
		}

		public void setSys(String sys) {
			this.sys = sys;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public UpdateLinkeBahamutIterationworkitemResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeBahamutIterationworkitemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
