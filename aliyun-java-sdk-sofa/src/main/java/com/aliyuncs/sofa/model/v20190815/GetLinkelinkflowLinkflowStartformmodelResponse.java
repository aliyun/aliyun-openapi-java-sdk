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
import com.aliyuncs.sofa.transform.v20190815.GetLinkelinkflowLinkflowStartformmodelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkelinkflowLinkflowStartformmodelResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long current;

	private String errorCode;

	private String errorMsg;

	private Long pageSize;

	private Long responseStatusCode;

	private Boolean success;

	private Long total;

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

	public Long getCurrent() {
		return this.current;
	}

	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String description;

		private String formInstanceId;

		private String formModel;

		private String id;

		private String key;

		private String name;

		private String processDefinitionId;

		private String processInstanceId;

		private String scopeDefinitionId;

		private String scopeId;

		private String scopeType;

		private String selectedOutcome;

		private String submittedBy;

		private Long submittedDate;

		private String taskId;

		private String tenantId;

		private Long version;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFormInstanceId() {
			return this.formInstanceId;
		}

		public void setFormInstanceId(String formInstanceId) {
			this.formInstanceId = formInstanceId;
		}

		public String getFormModel() {
			return this.formModel;
		}

		public void setFormModel(String formModel) {
			this.formModel = formModel;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProcessDefinitionId() {
			return this.processDefinitionId;
		}

		public void setProcessDefinitionId(String processDefinitionId) {
			this.processDefinitionId = processDefinitionId;
		}

		public String getProcessInstanceId() {
			return this.processInstanceId;
		}

		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}

		public String getScopeDefinitionId() {
			return this.scopeDefinitionId;
		}

		public void setScopeDefinitionId(String scopeDefinitionId) {
			this.scopeDefinitionId = scopeDefinitionId;
		}

		public String getScopeId() {
			return this.scopeId;
		}

		public void setScopeId(String scopeId) {
			this.scopeId = scopeId;
		}

		public String getScopeType() {
			return this.scopeType;
		}

		public void setScopeType(String scopeType) {
			this.scopeType = scopeType;
		}

		public String getSelectedOutcome() {
			return this.selectedOutcome;
		}

		public void setSelectedOutcome(String selectedOutcome) {
			this.selectedOutcome = selectedOutcome;
		}

		public String getSubmittedBy() {
			return this.submittedBy;
		}

		public void setSubmittedBy(String submittedBy) {
			this.submittedBy = submittedBy;
		}

		public Long getSubmittedDate() {
			return this.submittedDate;
		}

		public void setSubmittedDate(Long submittedDate) {
			this.submittedDate = submittedDate;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	}

	@Override
	public GetLinkelinkflowLinkflowStartformmodelResponse getInstance(UnmarshallerContext context) {
		return	GetLinkelinkflowLinkflowStartformmodelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
