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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinktWorkitemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinktWorkitemResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

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

	public Long getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String assignedToIds;

		private Boolean asRootLevel;

		private Long childrenCount;

		private Long createdAt;

		private String creator;

		private Boolean deleted;

		private String description;

		private Long expectedAt;

		private Long filteredChildrenCount;

		private Long finishedChildrenCount;

		private Long id;

		private String iteration;

		private String iterationSign;

		private String link;

		private String modifier;

		private String parentSign;

		private String parentWorkItem;

		private Long priority;

		private String priorityEntity;

		private String project;

		private String projectName;

		private String projectSign;

		private String region;

		private String sign;

		private String signPath;

		private String stamp;

		private String status;

		private Long statusId;

		private Long statusStage;

		private String subject;

		private String template;

		private Long templateId;

		private Long updatedAt;

		private List<String> attachmentVOs;

		private List<String> ccs;

		private List<String> customFields;

		private List<String> customFieldsValues;

		private List<String> modules;

		private List<String> relatedProjects;

		private List<String> tags;

		private List<String> templateList;

		public String getAssignedToIds() {
			return this.assignedToIds;
		}

		public void setAssignedToIds(String assignedToIds) {
			this.assignedToIds = assignedToIds;
		}

		public Boolean getAsRootLevel() {
			return this.asRootLevel;
		}

		public void setAsRootLevel(Boolean asRootLevel) {
			this.asRootLevel = asRootLevel;
		}

		public Long getChildrenCount() {
			return this.childrenCount;
		}

		public void setChildrenCount(Long childrenCount) {
			this.childrenCount = childrenCount;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getExpectedAt() {
			return this.expectedAt;
		}

		public void setExpectedAt(Long expectedAt) {
			this.expectedAt = expectedAt;
		}

		public Long getFilteredChildrenCount() {
			return this.filteredChildrenCount;
		}

		public void setFilteredChildrenCount(Long filteredChildrenCount) {
			this.filteredChildrenCount = filteredChildrenCount;
		}

		public Long getFinishedChildrenCount() {
			return this.finishedChildrenCount;
		}

		public void setFinishedChildrenCount(Long finishedChildrenCount) {
			this.finishedChildrenCount = finishedChildrenCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIteration() {
			return this.iteration;
		}

		public void setIteration(String iteration) {
			this.iteration = iteration;
		}

		public String getIterationSign() {
			return this.iterationSign;
		}

		public void setIterationSign(String iterationSign) {
			this.iterationSign = iterationSign;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getParentSign() {
			return this.parentSign;
		}

		public void setParentSign(String parentSign) {
			this.parentSign = parentSign;
		}

		public String getParentWorkItem() {
			return this.parentWorkItem;
		}

		public void setParentWorkItem(String parentWorkItem) {
			this.parentWorkItem = parentWorkItem;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getPriorityEntity() {
			return this.priorityEntity;
		}

		public void setPriorityEntity(String priorityEntity) {
			this.priorityEntity = priorityEntity;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectSign() {
			return this.projectSign;
		}

		public void setProjectSign(String projectSign) {
			this.projectSign = projectSign;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getSign() {
			return this.sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getSignPath() {
			return this.signPath;
		}

		public void setSignPath(String signPath) {
			this.signPath = signPath;
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

		public Long getStatusId() {
			return this.statusId;
		}

		public void setStatusId(Long statusId) {
			this.statusId = statusId;
		}

		public Long getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(Long statusStage) {
			this.statusStage = statusStage;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<String> getAttachmentVOs() {
			return this.attachmentVOs;
		}

		public void setAttachmentVOs(List<String> attachmentVOs) {
			this.attachmentVOs = attachmentVOs;
		}

		public List<String> getCcs() {
			return this.ccs;
		}

		public void setCcs(List<String> ccs) {
			this.ccs = ccs;
		}

		public List<String> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<String> customFields) {
			this.customFields = customFields;
		}

		public List<String> getCustomFieldsValues() {
			return this.customFieldsValues;
		}

		public void setCustomFieldsValues(List<String> customFieldsValues) {
			this.customFieldsValues = customFieldsValues;
		}

		public List<String> getModules() {
			return this.modules;
		}

		public void setModules(List<String> modules) {
			this.modules = modules;
		}

		public List<String> getRelatedProjects() {
			return this.relatedProjects;
		}

		public void setRelatedProjects(List<String> relatedProjects) {
			this.relatedProjects = relatedProjects;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public List<String> getTemplateList() {
			return this.templateList;
		}

		public void setTemplateList(List<String> templateList) {
			this.templateList = templateList;
		}
	}

	@Override
	public QueryLinkeLinktWorkitemResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinktWorkitemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
