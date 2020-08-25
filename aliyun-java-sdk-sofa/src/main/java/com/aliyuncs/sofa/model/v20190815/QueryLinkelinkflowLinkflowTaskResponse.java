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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkelinkflowLinkflowTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkelinkflowLinkflowTaskResponse extends AcsResponse {

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

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String assignedUser;

		private String assignee;

		private Long endTime;

		private Boolean finished;

		private String formKey;

		private String id;

		private String key;

		private String name;

		private String processDefinitionId;

		private String processInstance;

		private String processInstanceId;

		private Long startTime;

		private List<String> candidates;

		private List<String> candidateGroups;

		private List<String> candidateGroupUsers;

		private List<String> candidateUsers;

		public String getAssignedUser() {
			return this.assignedUser;
		}

		public void setAssignedUser(String assignedUser) {
			this.assignedUser = assignedUser;
		}

		public String getAssignee() {
			return this.assignee;
		}

		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}

		public String getFormKey() {
			return this.formKey;
		}

		public void setFormKey(String formKey) {
			this.formKey = formKey;
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

		public String getProcessInstance() {
			return this.processInstance;
		}

		public void setProcessInstance(String processInstance) {
			this.processInstance = processInstance;
		}

		public String getProcessInstanceId() {
			return this.processInstanceId;
		}

		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public List<String> getCandidates() {
			return this.candidates;
		}

		public void setCandidates(List<String> candidates) {
			this.candidates = candidates;
		}

		public List<String> getCandidateGroups() {
			return this.candidateGroups;
		}

		public void setCandidateGroups(List<String> candidateGroups) {
			this.candidateGroups = candidateGroups;
		}

		public List<String> getCandidateGroupUsers() {
			return this.candidateGroupUsers;
		}

		public void setCandidateGroupUsers(List<String> candidateGroupUsers) {
			this.candidateGroupUsers = candidateGroupUsers;
		}

		public List<String> getCandidateUsers() {
			return this.candidateUsers;
		}

		public void setCandidateUsers(List<String> candidateUsers) {
			this.candidateUsers = candidateUsers;
		}
	}

	@Override
	public QueryLinkelinkflowLinkflowTaskResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkelinkflowLinkflowTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
