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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListLegacyAgentStatusLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLegacyAgentStatusLogsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<AgentStatusLog> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AgentStatusLog> getList() {
			return this.list;
		}

		public void setList(List<AgentStatusLog> list) {
			this.list = list;
		}

		public static class AgentStatusLog {

			private String transferNo;

			private String targetSelect;

			private String targetRequest;

			private String status;

			private String statisticDate;

			private Integer statisticTime;

			private String phoneNo;

			private String monitedAgentPhoneNo;

			private String monitedAgentNo;

			private String groupNo;

			private String connId;

			private String callType;

			private String callId;

			private String callerId;

			private String calleeId;

			private String callDir;

			private String agentNo;

			private String agentDropCall;

			private String aliHangupCause;

			private String transferNumber;

			private String extend1;

			private String extend2;

			private String extend3;

			private String extend4;

			private String tenantId;

			private Boolean outboundScenario;

			public String getTransferNo() {
				return this.transferNo;
			}

			public void setTransferNo(String transferNo) {
				this.transferNo = transferNo;
			}

			public String getTargetSelect() {
				return this.targetSelect;
			}

			public void setTargetSelect(String targetSelect) {
				this.targetSelect = targetSelect;
			}

			public String getTargetRequest() {
				return this.targetRequest;
			}

			public void setTargetRequest(String targetRequest) {
				this.targetRequest = targetRequest;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStatisticDate() {
				return this.statisticDate;
			}

			public void setStatisticDate(String statisticDate) {
				this.statisticDate = statisticDate;
			}

			public Integer getStatisticTime() {
				return this.statisticTime;
			}

			public void setStatisticTime(Integer statisticTime) {
				this.statisticTime = statisticTime;
			}

			public String getPhoneNo() {
				return this.phoneNo;
			}

			public void setPhoneNo(String phoneNo) {
				this.phoneNo = phoneNo;
			}

			public String getMonitedAgentPhoneNo() {
				return this.monitedAgentPhoneNo;
			}

			public void setMonitedAgentPhoneNo(String monitedAgentPhoneNo) {
				this.monitedAgentPhoneNo = monitedAgentPhoneNo;
			}

			public String getMonitedAgentNo() {
				return this.monitedAgentNo;
			}

			public void setMonitedAgentNo(String monitedAgentNo) {
				this.monitedAgentNo = monitedAgentNo;
			}

			public String getGroupNo() {
				return this.groupNo;
			}

			public void setGroupNo(String groupNo) {
				this.groupNo = groupNo;
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

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}

			public String getCallerId() {
				return this.callerId;
			}

			public void setCallerId(String callerId) {
				this.callerId = callerId;
			}

			public String getCalleeId() {
				return this.calleeId;
			}

			public void setCalleeId(String calleeId) {
				this.calleeId = calleeId;
			}

			public String getCallDir() {
				return this.callDir;
			}

			public void setCallDir(String callDir) {
				this.callDir = callDir;
			}

			public String getAgentNo() {
				return this.agentNo;
			}

			public void setAgentNo(String agentNo) {
				this.agentNo = agentNo;
			}

			public String getAgentDropCall() {
				return this.agentDropCall;
			}

			public void setAgentDropCall(String agentDropCall) {
				this.agentDropCall = agentDropCall;
			}

			public String getAliHangupCause() {
				return this.aliHangupCause;
			}

			public void setAliHangupCause(String aliHangupCause) {
				this.aliHangupCause = aliHangupCause;
			}

			public String getTransferNumber() {
				return this.transferNumber;
			}

			public void setTransferNumber(String transferNumber) {
				this.transferNumber = transferNumber;
			}

			public String getExtend1() {
				return this.extend1;
			}

			public void setExtend1(String extend1) {
				this.extend1 = extend1;
			}

			public String getExtend2() {
				return this.extend2;
			}

			public void setExtend2(String extend2) {
				this.extend2 = extend2;
			}

			public String getExtend3() {
				return this.extend3;
			}

			public void setExtend3(String extend3) {
				this.extend3 = extend3;
			}

			public String getExtend4() {
				return this.extend4;
			}

			public void setExtend4(String extend4) {
				this.extend4 = extend4;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Boolean getOutboundScenario() {
				return this.outboundScenario;
			}

			public void setOutboundScenario(Boolean outboundScenario) {
				this.outboundScenario = outboundScenario;
			}
		}
	}

	@Override
	public ListLegacyAgentStatusLogsResponse getInstance(UnmarshallerContext context) {
		return	ListLegacyAgentStatusLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
