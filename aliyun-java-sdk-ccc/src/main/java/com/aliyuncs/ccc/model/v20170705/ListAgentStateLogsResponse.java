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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListAgentStateLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentStateLogsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private AgentStateLogPage agentStateLogPage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public AgentStateLogPage getAgentStateLogPage() {
		return this.agentStateLogPage;
	}

	public void setAgentStateLogPage(AgentStateLogPage agentStateLogPage) {
		this.agentStateLogPage = agentStateLogPage;
	}

	public static class AgentStateLogPage {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<AgentStateLog> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<AgentStateLog> getList() {
			return this.list;
		}

		public void setList(List<AgentStateLog> list) {
			this.list = list;
		}

		public static class AgentStateLog {

			private String instanceId;

			private Long ramId;

			private String state;

			private String stateCode;

			private Long stateTime;

			private String contactId;

			private String connectId;

			private String skillGroupIds;

			private String counterParty;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getRamId() {
				return this.ramId;
			}

			public void setRamId(Long ramId) {
				this.ramId = ramId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStateCode() {
				return this.stateCode;
			}

			public void setStateCode(String stateCode) {
				this.stateCode = stateCode;
			}

			public Long getStateTime() {
				return this.stateTime;
			}

			public void setStateTime(Long stateTime) {
				this.stateTime = stateTime;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public String getConnectId() {
				return this.connectId;
			}

			public void setConnectId(String connectId) {
				this.connectId = connectId;
			}

			public String getSkillGroupIds() {
				return this.skillGroupIds;
			}

			public void setSkillGroupIds(String skillGroupIds) {
				this.skillGroupIds = skillGroupIds;
			}

			public String getCounterParty() {
				return this.counterParty;
			}

			public void setCounterParty(String counterParty) {
				this.counterParty = counterParty;
			}
		}
	}

	@Override
	public ListAgentStateLogsResponse getInstance(UnmarshallerContext context) {
		return	ListAgentStateLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
