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
import com.aliyuncs.ccc.transform.v20200701.ListAttemptsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAttemptsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<AttemptList> list;

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

		public List<AttemptList> getList() {
			return this.list;
		}

		public void setList(List<AttemptList> list) {
			this.list = list;
		}

		public static class AttemptList {

			private String attemptId;

			private String contactId;

			private String caseId;

			private String campaignId;

			private String instanceId;

			private String queueId;

			private String caller;

			private String callee;

			private String agentId;

			private Long dialTime;

			private Long dialDuration;

			private Long customerEstablishedTime;

			private Long customerReleasedTime;

			private Long enterIvrTime;

			private Long ivrDuration;

			private Long enqueueTime;

			private Long queueDuration;

			private Long assignAgentTime;

			private Long agentRingDuration;

			private Long agentEstablishedTime;

			public String getAttemptId() {
				return this.attemptId;
			}

			public void setAttemptId(String attemptId) {
				this.attemptId = attemptId;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public String getCaseId() {
				return this.caseId;
			}

			public void setCaseId(String caseId) {
				this.caseId = caseId;
			}

			public String getCampaignId() {
				return this.campaignId;
			}

			public void setCampaignId(String campaignId) {
				this.campaignId = campaignId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getQueueId() {
				return this.queueId;
			}

			public void setQueueId(String queueId) {
				this.queueId = queueId;
			}

			public String getCaller() {
				return this.caller;
			}

			public void setCaller(String caller) {
				this.caller = caller;
			}

			public String getCallee() {
				return this.callee;
			}

			public void setCallee(String callee) {
				this.callee = callee;
			}

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public Long getDialTime() {
				return this.dialTime;
			}

			public void setDialTime(Long dialTime) {
				this.dialTime = dialTime;
			}

			public Long getDialDuration() {
				return this.dialDuration;
			}

			public void setDialDuration(Long dialDuration) {
				this.dialDuration = dialDuration;
			}

			public Long getCustomerEstablishedTime() {
				return this.customerEstablishedTime;
			}

			public void setCustomerEstablishedTime(Long customerEstablishedTime) {
				this.customerEstablishedTime = customerEstablishedTime;
			}

			public Long getCustomerReleasedTime() {
				return this.customerReleasedTime;
			}

			public void setCustomerReleasedTime(Long customerReleasedTime) {
				this.customerReleasedTime = customerReleasedTime;
			}

			public Long getEnterIvrTime() {
				return this.enterIvrTime;
			}

			public void setEnterIvrTime(Long enterIvrTime) {
				this.enterIvrTime = enterIvrTime;
			}

			public Long getIvrDuration() {
				return this.ivrDuration;
			}

			public void setIvrDuration(Long ivrDuration) {
				this.ivrDuration = ivrDuration;
			}

			public Long getEnqueueTime() {
				return this.enqueueTime;
			}

			public void setEnqueueTime(Long enqueueTime) {
				this.enqueueTime = enqueueTime;
			}

			public Long getQueueDuration() {
				return this.queueDuration;
			}

			public void setQueueDuration(Long queueDuration) {
				this.queueDuration = queueDuration;
			}

			public Long getAssignAgentTime() {
				return this.assignAgentTime;
			}

			public void setAssignAgentTime(Long assignAgentTime) {
				this.assignAgentTime = assignAgentTime;
			}

			public Long getAgentRingDuration() {
				return this.agentRingDuration;
			}

			public void setAgentRingDuration(Long agentRingDuration) {
				this.agentRingDuration = agentRingDuration;
			}

			public Long getAgentEstablishedTime() {
				return this.agentEstablishedTime;
			}

			public void setAgentEstablishedTime(Long agentEstablishedTime) {
				this.agentEstablishedTime = agentEstablishedTime;
			}
		}
	}

	@Override
	public ListAttemptsResponse getInstance(UnmarshallerContext context) {
		return	ListAttemptsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
