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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkelinkflowLinkflowProcessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkelinkflowLinkflowProcessResponse extends AcsResponse {

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

		private String bizId;

		private String definitionId;

		private String definitionKey;

		private Boolean finished;

		private String id;

		private String name;

		private String starter;

		private Long startTime;

		private String startUserId;

		private String status;

		private String tenantId;

		private String url;

		private String variables;

		private List<String> assigneeUserIds;

		private List<String> candidateUsers;

		private List<String> candidateUserIds;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getDefinitionId() {
			return this.definitionId;
		}

		public void setDefinitionId(String definitionId) {
			this.definitionId = definitionId;
		}

		public String getDefinitionKey() {
			return this.definitionKey;
		}

		public void setDefinitionKey(String definitionKey) {
			this.definitionKey = definitionKey;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStarter() {
			return this.starter;
		}

		public void setStarter(String starter) {
			this.starter = starter;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getStartUserId() {
			return this.startUserId;
		}

		public void setStartUserId(String startUserId) {
			this.startUserId = startUserId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getVariables() {
			return this.variables;
		}

		public void setVariables(String variables) {
			this.variables = variables;
		}

		public List<String> getAssigneeUserIds() {
			return this.assigneeUserIds;
		}

		public void setAssigneeUserIds(List<String> assigneeUserIds) {
			this.assigneeUserIds = assigneeUserIds;
		}

		public List<String> getCandidateUsers() {
			return this.candidateUsers;
		}

		public void setCandidateUsers(List<String> candidateUsers) {
			this.candidateUsers = candidateUsers;
		}

		public List<String> getCandidateUserIds() {
			return this.candidateUserIds;
		}

		public void setCandidateUserIds(List<String> candidateUserIds) {
			this.candidateUserIds = candidateUserIds;
		}
	}

	@Override
	public QueryLinkelinkflowLinkflowProcessResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkelinkflowLinkflowProcessResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
