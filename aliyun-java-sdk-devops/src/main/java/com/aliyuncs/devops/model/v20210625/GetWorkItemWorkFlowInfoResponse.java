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
import com.aliyuncs.devops.transform.v20210625.GetWorkItemWorkFlowInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkItemWorkFlowInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Workflow workflow;

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

	public Workflow getWorkflow() {
		return this.workflow;
	}

	public void setWorkflow(Workflow workflow) {
		this.workflow = workflow;
	}

	public static class Workflow {

		private String identifier;

		private String name;

		private String description;

		private String ownerSpaceIdentifier;

		private String ownerSpaceType;

		private String defaultStatusIdentifier;

		private String statusOrder;

		private String resourceType;

		private String source;

		private Long gmtCreate;

		private Long gmtModified;

		private String creator;

		private String modifier;

		private List<WorkflowAction> workflowActions;

		private List<Statuse> statuses;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOwnerSpaceIdentifier() {
			return this.ownerSpaceIdentifier;
		}

		public void setOwnerSpaceIdentifier(String ownerSpaceIdentifier) {
			this.ownerSpaceIdentifier = ownerSpaceIdentifier;
		}

		public String getOwnerSpaceType() {
			return this.ownerSpaceType;
		}

		public void setOwnerSpaceType(String ownerSpaceType) {
			this.ownerSpaceType = ownerSpaceType;
		}

		public String getDefaultStatusIdentifier() {
			return this.defaultStatusIdentifier;
		}

		public void setDefaultStatusIdentifier(String defaultStatusIdentifier) {
			this.defaultStatusIdentifier = defaultStatusIdentifier;
		}

		public String getStatusOrder() {
			return this.statusOrder;
		}

		public void setStatusOrder(String statusOrder) {
			this.statusOrder = statusOrder;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
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

		public List<WorkflowAction> getWorkflowActions() {
			return this.workflowActions;
		}

		public void setWorkflowActions(List<WorkflowAction> workflowActions) {
			this.workflowActions = workflowActions;
		}

		public List<Statuse> getStatuses() {
			return this.statuses;
		}

		public void setStatuses(List<Statuse> statuses) {
			this.statuses = statuses;
		}

		public static class WorkflowAction {

			private Long id;

			private String name;

			private String workflowIdentifier;

			private String workflowStatusIdentifier;

			private String nextWorkflowStatusIdentifier;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWorkflowIdentifier() {
				return this.workflowIdentifier;
			}

			public void setWorkflowIdentifier(String workflowIdentifier) {
				this.workflowIdentifier = workflowIdentifier;
			}

			public String getWorkflowStatusIdentifier() {
				return this.workflowStatusIdentifier;
			}

			public void setWorkflowStatusIdentifier(String workflowStatusIdentifier) {
				this.workflowStatusIdentifier = workflowStatusIdentifier;
			}

			public String getNextWorkflowStatusIdentifier() {
				return this.nextWorkflowStatusIdentifier;
			}

			public void setNextWorkflowStatusIdentifier(String nextWorkflowStatusIdentifier) {
				this.nextWorkflowStatusIdentifier = nextWorkflowStatusIdentifier;
			}
		}

		public static class Statuse {

			private String identifier;

			private String name;

			private String workflowStageName;

			private String workflowStageIdentifier;

			private String source;

			private Long gmtCreate;

			private Long gmtModified;

			private String creator;

			private String modifier;

			private String description;

			private String resourceType;

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

			public String getWorkflowStageName() {
				return this.workflowStageName;
			}

			public void setWorkflowStageName(String workflowStageName) {
				this.workflowStageName = workflowStageName;
			}

			public String getWorkflowStageIdentifier() {
				return this.workflowStageIdentifier;
			}

			public void setWorkflowStageIdentifier(String workflowStageIdentifier) {
				this.workflowStageIdentifier = workflowStageIdentifier;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}
		}
	}

	@Override
	public GetWorkItemWorkFlowInfoResponse getInstance(UnmarshallerContext context) {
		return	GetWorkItemWorkFlowInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
