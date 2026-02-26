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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreateWorkitemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWorkitemResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Workitem workitem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Workitem getWorkitem() {
		return this.workitem;
	}

	public void setWorkitem(Workitem workitem) {
		this.workitem = workitem;
	}

	public static class Workitem {

		private String identifier;

		private String subject;

		private String document;

		private String assignedTo;

		private String status;

		private String statusStageIdentifier;

		private String spaceIdentifier;

		private String spaceName;

		private String spaceType;

		private String logicalStatus;

		private String categoryIdentifier;

		private String parentIdentifier;

		private String workitemTypeIdentifier;

		private Long updateStatusAt;

		private String serialNumber;

		private Long gmtCreate;

		private Long gmtModified;

		private String creator;

		private String modifier;

		private String statusIdentifier;

		private String sprintIdentifier;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getDocument() {
			return this.document;
		}

		public void setDocument(String document) {
			this.document = document;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusStageIdentifier() {
			return this.statusStageIdentifier;
		}

		public void setStatusStageIdentifier(String statusStageIdentifier) {
			this.statusStageIdentifier = statusStageIdentifier;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getSpaceName() {
			return this.spaceName;
		}

		public void setSpaceName(String spaceName) {
			this.spaceName = spaceName;
		}

		public String getSpaceType() {
			return this.spaceType;
		}

		public void setSpaceType(String spaceType) {
			this.spaceType = spaceType;
		}

		public String getLogicalStatus() {
			return this.logicalStatus;
		}

		public void setLogicalStatus(String logicalStatus) {
			this.logicalStatus = logicalStatus;
		}

		public String getCategoryIdentifier() {
			return this.categoryIdentifier;
		}

		public void setCategoryIdentifier(String categoryIdentifier) {
			this.categoryIdentifier = categoryIdentifier;
		}

		public String getParentIdentifier() {
			return this.parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public String getWorkitemTypeIdentifier() {
			return this.workitemTypeIdentifier;
		}

		public void setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
			this.workitemTypeIdentifier = workitemTypeIdentifier;
		}

		public Long getUpdateStatusAt() {
			return this.updateStatusAt;
		}

		public void setUpdateStatusAt(Long updateStatusAt) {
			this.updateStatusAt = updateStatusAt;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getStatusIdentifier() {
			return this.statusIdentifier;
		}

		public void setStatusIdentifier(String statusIdentifier) {
			this.statusIdentifier = statusIdentifier;
		}

		public String getSprintIdentifier() {
			return this.sprintIdentifier;
		}

		public void setSprintIdentifier(String sprintIdentifier) {
			this.sprintIdentifier = sprintIdentifier;
		}
	}

	@Override
	public CreateWorkitemResponse getInstance(UnmarshallerContext context) {
		return	CreateWorkitemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
