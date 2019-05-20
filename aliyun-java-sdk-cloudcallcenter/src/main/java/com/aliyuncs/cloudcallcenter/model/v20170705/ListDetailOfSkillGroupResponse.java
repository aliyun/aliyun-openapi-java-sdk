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
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListDetailOfSkillGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDetailOfSkillGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private DataList dataList;

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

	public DataList getDataList() {
		return this.dataList;
	}

	public void setDataList(DataList dataList) {
		this.dataList = dataList;
	}

	public static class DataList {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<SkillGroupData> list;

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

		public List<SkillGroupData> getList() {
			return this.list;
		}

		public void setList(List<SkillGroupData> list) {
			this.list = list;
		}

		public static class SkillGroupData {

			private String skillGroupId;

			private String instanceId;

			private String recordDate;

			private String agentNumber;

			private String loggedInAgentNumber;

			private String talkAgentNumber;

			private String readyAgentNumber;

			private String notReadyAgentNumber;

			private String callWaitNumber;

			private String inboundCallNumber;

			private String outboundCallNumber;

			private String averageAgentTalkTime;

			private String maxCallWaitTime;

			private String answeredIntr20Percentage;

			private String averageLoginTime;

			private String averageTalkTime;

			private String averageTalkPercentage;

			private String inboundAppraisePercentage;

			private String outboundAppraisePercentage;

			private String appraisePercentage;

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRecordDate() {
				return this.recordDate;
			}

			public void setRecordDate(String recordDate) {
				this.recordDate = recordDate;
			}

			public String getAgentNumber() {
				return this.agentNumber;
			}

			public void setAgentNumber(String agentNumber) {
				this.agentNumber = agentNumber;
			}

			public String getLoggedInAgentNumber() {
				return this.loggedInAgentNumber;
			}

			public void setLoggedInAgentNumber(String loggedInAgentNumber) {
				this.loggedInAgentNumber = loggedInAgentNumber;
			}

			public String getTalkAgentNumber() {
				return this.talkAgentNumber;
			}

			public void setTalkAgentNumber(String talkAgentNumber) {
				this.talkAgentNumber = talkAgentNumber;
			}

			public String getReadyAgentNumber() {
				return this.readyAgentNumber;
			}

			public void setReadyAgentNumber(String readyAgentNumber) {
				this.readyAgentNumber = readyAgentNumber;
			}

			public String getNotReadyAgentNumber() {
				return this.notReadyAgentNumber;
			}

			public void setNotReadyAgentNumber(String notReadyAgentNumber) {
				this.notReadyAgentNumber = notReadyAgentNumber;
			}

			public String getCallWaitNumber() {
				return this.callWaitNumber;
			}

			public void setCallWaitNumber(String callWaitNumber) {
				this.callWaitNumber = callWaitNumber;
			}

			public String getInboundCallNumber() {
				return this.inboundCallNumber;
			}

			public void setInboundCallNumber(String inboundCallNumber) {
				this.inboundCallNumber = inboundCallNumber;
			}

			public String getOutboundCallNumber() {
				return this.outboundCallNumber;
			}

			public void setOutboundCallNumber(String outboundCallNumber) {
				this.outboundCallNumber = outboundCallNumber;
			}

			public String getAverageAgentTalkTime() {
				return this.averageAgentTalkTime;
			}

			public void setAverageAgentTalkTime(String averageAgentTalkTime) {
				this.averageAgentTalkTime = averageAgentTalkTime;
			}

			public String getMaxCallWaitTime() {
				return this.maxCallWaitTime;
			}

			public void setMaxCallWaitTime(String maxCallWaitTime) {
				this.maxCallWaitTime = maxCallWaitTime;
			}

			public String getAnsweredIntr20Percentage() {
				return this.answeredIntr20Percentage;
			}

			public void setAnsweredIntr20Percentage(String answeredIntr20Percentage) {
				this.answeredIntr20Percentage = answeredIntr20Percentage;
			}

			public String getAverageLoginTime() {
				return this.averageLoginTime;
			}

			public void setAverageLoginTime(String averageLoginTime) {
				this.averageLoginTime = averageLoginTime;
			}

			public String getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(String averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public String getAverageTalkPercentage() {
				return this.averageTalkPercentage;
			}

			public void setAverageTalkPercentage(String averageTalkPercentage) {
				this.averageTalkPercentage = averageTalkPercentage;
			}

			public String getInboundAppraisePercentage() {
				return this.inboundAppraisePercentage;
			}

			public void setInboundAppraisePercentage(String inboundAppraisePercentage) {
				this.inboundAppraisePercentage = inboundAppraisePercentage;
			}

			public String getOutboundAppraisePercentage() {
				return this.outboundAppraisePercentage;
			}

			public void setOutboundAppraisePercentage(String outboundAppraisePercentage) {
				this.outboundAppraisePercentage = outboundAppraisePercentage;
			}

			public String getAppraisePercentage() {
				return this.appraisePercentage;
			}

			public void setAppraisePercentage(String appraisePercentage) {
				this.appraisePercentage = appraisePercentage;
			}
		}
	}

	@Override
	public ListDetailOfSkillGroupResponse getInstance(UnmarshallerContext context) {
		return	ListDetailOfSkillGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
