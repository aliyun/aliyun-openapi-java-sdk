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
import com.aliyuncs.devops.transform.v20210625.GetWorkItemInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkItemInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Workitem workitem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

		private Long finishTime;

		private List<CustomField> customFields;

		private List<TagDetailsItem> tagDetails;

		private List<String> sprint;

		private List<String> tag;

		private List<String> participant;

		private List<String> tracker;

		private List<String> verifier;

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

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public List<CustomField> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<CustomField> customFields) {
			this.customFields = customFields;
		}

		public List<TagDetailsItem> getTagDetails() {
			return this.tagDetails;
		}

		public void setTagDetails(List<TagDetailsItem> tagDetails) {
			this.tagDetails = tagDetails;
		}

		public List<String> getSprint() {
			return this.sprint;
		}

		public void setSprint(List<String> sprint) {
			this.sprint = sprint;
		}

		public List<String> getTag() {
			return this.tag;
		}

		public void setTag(List<String> tag) {
			this.tag = tag;
		}

		public List<String> getParticipant() {
			return this.participant;
		}

		public void setParticipant(List<String> participant) {
			this.participant = participant;
		}

		public List<String> getTracker() {
			return this.tracker;
		}

		public void setTracker(List<String> tracker) {
			this.tracker = tracker;
		}

		public List<String> getVerifier() {
			return this.verifier;
		}

		public void setVerifier(List<String> verifier) {
			this.verifier = verifier;
		}

		public static class CustomField {

			private String fieldIdentifier;

			private String fieldFormat;

			private String fieldClassName;

			private String objectValue;

			private String value;

			private String workitemIdentifier;

			private Long position;

			private Long level;

			private List<Value> valueList;

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getFieldFormat() {
				return this.fieldFormat;
			}

			public void setFieldFormat(String fieldFormat) {
				this.fieldFormat = fieldFormat;
			}

			public String getFieldClassName() {
				return this.fieldClassName;
			}

			public void setFieldClassName(String fieldClassName) {
				this.fieldClassName = fieldClassName;
			}

			public String getObjectValue() {
				return this.objectValue;
			}

			public void setObjectValue(String objectValue) {
				this.objectValue = objectValue;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getWorkitemIdentifier() {
				return this.workitemIdentifier;
			}

			public void setWorkitemIdentifier(String workitemIdentifier) {
				this.workitemIdentifier = workitemIdentifier;
			}

			public Long getPosition() {
				return this.position;
			}

			public void setPosition(Long position) {
				this.position = position;
			}

			public Long getLevel() {
				return this.level;
			}

			public void setLevel(Long level) {
				this.level = level;
			}

			public List<Value> getValueList() {
				return this.valueList;
			}

			public void setValueList(List<Value> valueList) {
				this.valueList = valueList;
			}

			public static class Value {

				private String value;

				private String valueEn;

				private String displayValue;

				private String identifier;

				private Long level;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getValueEn() {
					return this.valueEn;
				}

				public void setValueEn(String valueEn) {
					this.valueEn = valueEn;
				}

				public String getDisplayValue() {
					return this.displayValue;
				}

				public void setDisplayValue(String displayValue) {
					this.displayValue = displayValue;
				}

				public String getIdentifier() {
					return this.identifier;
				}

				public void setIdentifier(String identifier) {
					this.identifier = identifier;
				}

				public Long getLevel() {
					return this.level;
				}

				public void setLevel(Long level) {
					this.level = level;
				}
			}
		}

		public static class TagDetailsItem {

			private String identifier;

			private String name;

			private String color;

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}
		}
	}

	@Override
	public GetWorkItemInfoResponse getInstance(UnmarshallerContext context) {
		return	GetWorkItemInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
