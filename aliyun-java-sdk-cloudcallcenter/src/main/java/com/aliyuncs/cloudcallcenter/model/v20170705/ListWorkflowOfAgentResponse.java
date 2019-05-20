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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListWorkflowOfAgentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkflowOfAgentResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private AgentEventLogs agentEventLogs;

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

	public AgentEventLogs getAgentEventLogs() {
		return this.agentEventLogs;
	}

	public void setAgentEventLogs(AgentEventLogs agentEventLogs) {
		this.agentEventLogs = agentEventLogs;
	}

	public static class AgentEventLogs {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<AgentEventlog> list;

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

		public List<AgentEventlog> getList() {
			return this.list;
		}

		public void setList(List<AgentEventlog> list) {
			this.list = list;
		}

		public static class AgentEventlog {

			private String agentNo;

			private String event;

			private String connId;

			private String callType;

			private String callingNumber;

			private String calledNumber;

			private String startTime;

			private String callId;

			public String getAgentNo() {
				return this.agentNo;
			}

			public void setAgentNo(String agentNo) {
				this.agentNo = agentNo;
			}

			public String getEvent() {
				return this.event;
			}

			public void setEvent(String event) {
				this.event = event;
			}

			public String getConnId() {
				return this.connId;
			}

			public void setConnId(String connId) {
				this.connId = connId;
			}

			public String getCallType() {
				return this.callType;
			}

			public void setCallType(String callType) {
				this.callType = callType;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}
		}
	}

	@Override
	public ListWorkflowOfAgentResponse getInstance(UnmarshallerContext context) {
		return	ListWorkflowOfAgentResponseUnmarshaller.unmarshall(this, context);
	}
}
