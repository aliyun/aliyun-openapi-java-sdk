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
import com.aliyuncs.cloudcallcenter.transform.v20170705.FindAgentDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindAgentDataResponse extends AcsResponse {

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

		private List<AgentReportData> list;

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

		public List<AgentReportData> getList() {
			return this.list;
		}

		public void setList(List<AgentReportData> list) {
			this.list = list;
		}

		public static class AgentReportData {

			private String userId;

			private String loginName;

			private String displayName;

			private String skillGroupIds;

			private String skillGroupNames;

			private String instanceId;

			private String recordDate;

			private String agentStatus;

			private String totalWorkNumber;

			private String totalTalkNumber;

			private String talkPercentage;

			private String abandonedNumber;

			private String abandonedPercentage;

			private String averageTalkTime;

			private String averageRingingTime;

			private String loginDuration;

			private String talkDuration;

			private String talkDurationPercentage;

			private String notReadyDuration;

			private String notReadyPercentage;

			private String loginTime;

			private String logoutTime;

			private String ringingNum;

			private String inboundTalkNum;

			private String inboundTalkPercentage;

			private String inboundAbandonedNum;

			private String inboundAbandonedNumPercentage;

			private String ringingDuration;

			private String inboundTalkDuration;

			private String dialingNum;

			private String outboundTalkNum;

			private String outboundTalkPercentage;

			private String dialingDuration;

			private String outboundTalkDuration;

			private String workDuration;

			private String inboundLaunchAppraiseNum;

			private String inboundLaunchAppraisePercentage;

			private String inboundParticipateInAppraiseNum;

			private String inboundParticipateInAppraisePercentage;

			private String inboundAppraisePercentage;

			private String inboundFeedbackSumNum;

			private String outboundLaunchAppraiseNum;

			private String outboundLaunchAppraisePercentage;

			private String outboundParticipateInAppraiseNum;

			private String outboundParticipateInAppraisePercentage;

			private String outboundAppraisePercentage;

			private String outboundFeedbackSumNum;

			private List<AppraiseCountDomain> inboundAppraiseNum;

			private List<AppraiseCountDomain> inboundFeedbackNum;

			private List<AppraiseCountDomain> outboundAppraiseNum;

			private List<AppraiseCountDomain> outboundFeedbackNum;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getSkillGroupIds() {
				return this.skillGroupIds;
			}

			public void setSkillGroupIds(String skillGroupIds) {
				this.skillGroupIds = skillGroupIds;
			}

			public String getSkillGroupNames() {
				return this.skillGroupNames;
			}

			public void setSkillGroupNames(String skillGroupNames) {
				this.skillGroupNames = skillGroupNames;
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

			public String getAgentStatus() {
				return this.agentStatus;
			}

			public void setAgentStatus(String agentStatus) {
				this.agentStatus = agentStatus;
			}

			public String getTotalWorkNumber() {
				return this.totalWorkNumber;
			}

			public void setTotalWorkNumber(String totalWorkNumber) {
				this.totalWorkNumber = totalWorkNumber;
			}

			public String getTotalTalkNumber() {
				return this.totalTalkNumber;
			}

			public void setTotalTalkNumber(String totalTalkNumber) {
				this.totalTalkNumber = totalTalkNumber;
			}

			public String getTalkPercentage() {
				return this.talkPercentage;
			}

			public void setTalkPercentage(String talkPercentage) {
				this.talkPercentage = talkPercentage;
			}

			public String getAbandonedNumber() {
				return this.abandonedNumber;
			}

			public void setAbandonedNumber(String abandonedNumber) {
				this.abandonedNumber = abandonedNumber;
			}

			public String getAbandonedPercentage() {
				return this.abandonedPercentage;
			}

			public void setAbandonedPercentage(String abandonedPercentage) {
				this.abandonedPercentage = abandonedPercentage;
			}

			public String getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(String averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public String getAverageRingingTime() {
				return this.averageRingingTime;
			}

			public void setAverageRingingTime(String averageRingingTime) {
				this.averageRingingTime = averageRingingTime;
			}

			public String getLoginDuration() {
				return this.loginDuration;
			}

			public void setLoginDuration(String loginDuration) {
				this.loginDuration = loginDuration;
			}

			public String getTalkDuration() {
				return this.talkDuration;
			}

			public void setTalkDuration(String talkDuration) {
				this.talkDuration = talkDuration;
			}

			public String getTalkDurationPercentage() {
				return this.talkDurationPercentage;
			}

			public void setTalkDurationPercentage(String talkDurationPercentage) {
				this.talkDurationPercentage = talkDurationPercentage;
			}

			public String getNotReadyDuration() {
				return this.notReadyDuration;
			}

			public void setNotReadyDuration(String notReadyDuration) {
				this.notReadyDuration = notReadyDuration;
			}

			public String getNotReadyPercentage() {
				return this.notReadyPercentage;
			}

			public void setNotReadyPercentage(String notReadyPercentage) {
				this.notReadyPercentage = notReadyPercentage;
			}

			public String getLoginTime() {
				return this.loginTime;
			}

			public void setLoginTime(String loginTime) {
				this.loginTime = loginTime;
			}

			public String getLogoutTime() {
				return this.logoutTime;
			}

			public void setLogoutTime(String logoutTime) {
				this.logoutTime = logoutTime;
			}

			public String getRingingNum() {
				return this.ringingNum;
			}

			public void setRingingNum(String ringingNum) {
				this.ringingNum = ringingNum;
			}

			public String getInboundTalkNum() {
				return this.inboundTalkNum;
			}

			public void setInboundTalkNum(String inboundTalkNum) {
				this.inboundTalkNum = inboundTalkNum;
			}

			public String getInboundTalkPercentage() {
				return this.inboundTalkPercentage;
			}

			public void setInboundTalkPercentage(String inboundTalkPercentage) {
				this.inboundTalkPercentage = inboundTalkPercentage;
			}

			public String getInboundAbandonedNum() {
				return this.inboundAbandonedNum;
			}

			public void setInboundAbandonedNum(String inboundAbandonedNum) {
				this.inboundAbandonedNum = inboundAbandonedNum;
			}

			public String getInboundAbandonedNumPercentage() {
				return this.inboundAbandonedNumPercentage;
			}

			public void setInboundAbandonedNumPercentage(String inboundAbandonedNumPercentage) {
				this.inboundAbandonedNumPercentage = inboundAbandonedNumPercentage;
			}

			public String getRingingDuration() {
				return this.ringingDuration;
			}

			public void setRingingDuration(String ringingDuration) {
				this.ringingDuration = ringingDuration;
			}

			public String getInboundTalkDuration() {
				return this.inboundTalkDuration;
			}

			public void setInboundTalkDuration(String inboundTalkDuration) {
				this.inboundTalkDuration = inboundTalkDuration;
			}

			public String getDialingNum() {
				return this.dialingNum;
			}

			public void setDialingNum(String dialingNum) {
				this.dialingNum = dialingNum;
			}

			public String getOutboundTalkNum() {
				return this.outboundTalkNum;
			}

			public void setOutboundTalkNum(String outboundTalkNum) {
				this.outboundTalkNum = outboundTalkNum;
			}

			public String getOutboundTalkPercentage() {
				return this.outboundTalkPercentage;
			}

			public void setOutboundTalkPercentage(String outboundTalkPercentage) {
				this.outboundTalkPercentage = outboundTalkPercentage;
			}

			public String getDialingDuration() {
				return this.dialingDuration;
			}

			public void setDialingDuration(String dialingDuration) {
				this.dialingDuration = dialingDuration;
			}

			public String getOutboundTalkDuration() {
				return this.outboundTalkDuration;
			}

			public void setOutboundTalkDuration(String outboundTalkDuration) {
				this.outboundTalkDuration = outboundTalkDuration;
			}

			public String getWorkDuration() {
				return this.workDuration;
			}

			public void setWorkDuration(String workDuration) {
				this.workDuration = workDuration;
			}

			public String getInboundLaunchAppraiseNum() {
				return this.inboundLaunchAppraiseNum;
			}

			public void setInboundLaunchAppraiseNum(String inboundLaunchAppraiseNum) {
				this.inboundLaunchAppraiseNum = inboundLaunchAppraiseNum;
			}

			public String getInboundLaunchAppraisePercentage() {
				return this.inboundLaunchAppraisePercentage;
			}

			public void setInboundLaunchAppraisePercentage(String inboundLaunchAppraisePercentage) {
				this.inboundLaunchAppraisePercentage = inboundLaunchAppraisePercentage;
			}

			public String getInboundParticipateInAppraiseNum() {
				return this.inboundParticipateInAppraiseNum;
			}

			public void setInboundParticipateInAppraiseNum(String inboundParticipateInAppraiseNum) {
				this.inboundParticipateInAppraiseNum = inboundParticipateInAppraiseNum;
			}

			public String getInboundParticipateInAppraisePercentage() {
				return this.inboundParticipateInAppraisePercentage;
			}

			public void setInboundParticipateInAppraisePercentage(String inboundParticipateInAppraisePercentage) {
				this.inboundParticipateInAppraisePercentage = inboundParticipateInAppraisePercentage;
			}

			public String getInboundAppraisePercentage() {
				return this.inboundAppraisePercentage;
			}

			public void setInboundAppraisePercentage(String inboundAppraisePercentage) {
				this.inboundAppraisePercentage = inboundAppraisePercentage;
			}

			public String getInboundFeedbackSumNum() {
				return this.inboundFeedbackSumNum;
			}

			public void setInboundFeedbackSumNum(String inboundFeedbackSumNum) {
				this.inboundFeedbackSumNum = inboundFeedbackSumNum;
			}

			public String getOutboundLaunchAppraiseNum() {
				return this.outboundLaunchAppraiseNum;
			}

			public void setOutboundLaunchAppraiseNum(String outboundLaunchAppraiseNum) {
				this.outboundLaunchAppraiseNum = outboundLaunchAppraiseNum;
			}

			public String getOutboundLaunchAppraisePercentage() {
				return this.outboundLaunchAppraisePercentage;
			}

			public void setOutboundLaunchAppraisePercentage(String outboundLaunchAppraisePercentage) {
				this.outboundLaunchAppraisePercentage = outboundLaunchAppraisePercentage;
			}

			public String getOutboundParticipateInAppraiseNum() {
				return this.outboundParticipateInAppraiseNum;
			}

			public void setOutboundParticipateInAppraiseNum(String outboundParticipateInAppraiseNum) {
				this.outboundParticipateInAppraiseNum = outboundParticipateInAppraiseNum;
			}

			public String getOutboundParticipateInAppraisePercentage() {
				return this.outboundParticipateInAppraisePercentage;
			}

			public void setOutboundParticipateInAppraisePercentage(String outboundParticipateInAppraisePercentage) {
				this.outboundParticipateInAppraisePercentage = outboundParticipateInAppraisePercentage;
			}

			public String getOutboundAppraisePercentage() {
				return this.outboundAppraisePercentage;
			}

			public void setOutboundAppraisePercentage(String outboundAppraisePercentage) {
				this.outboundAppraisePercentage = outboundAppraisePercentage;
			}

			public String getOutboundFeedbackSumNum() {
				return this.outboundFeedbackSumNum;
			}

			public void setOutboundFeedbackSumNum(String outboundFeedbackSumNum) {
				this.outboundFeedbackSumNum = outboundFeedbackSumNum;
			}

			public List<AppraiseCountDomain> getInboundAppraiseNum() {
				return this.inboundAppraiseNum;
			}

			public void setInboundAppraiseNum(List<AppraiseCountDomain> inboundAppraiseNum) {
				this.inboundAppraiseNum = inboundAppraiseNum;
			}

			public List<AppraiseCountDomain> getInboundFeedbackNum() {
				return this.inboundFeedbackNum;
			}

			public void setInboundFeedbackNum(List<AppraiseCountDomain> inboundFeedbackNum) {
				this.inboundFeedbackNum = inboundFeedbackNum;
			}

			public List<AppraiseCountDomain> getOutboundAppraiseNum() {
				return this.outboundAppraiseNum;
			}

			public void setOutboundAppraiseNum(List<AppraiseCountDomain> outboundAppraiseNum) {
				this.outboundAppraiseNum = outboundAppraiseNum;
			}

			public List<AppraiseCountDomain> getOutboundFeedbackNum() {
				return this.outboundFeedbackNum;
			}

			public void setOutboundFeedbackNum(List<AppraiseCountDomain> outboundFeedbackNum) {
				this.outboundFeedbackNum = outboundFeedbackNum;
			}

			public static class AppraiseCountDomain {

				private String subgroup;

				private String count;

				private String group;

				public String getSubgroup() {
					return this.subgroup;
				}

				public void setSubgroup(String subgroup) {
					this.subgroup = subgroup;
				}

				public String getCount() {
					return this.count;
				}

				public void setCount(String count) {
					this.count = count;
				}

				public String getGroup() {
					return this.group;
				}

				public void setGroup(String group) {
					this.group = group;
				}
			}
		}
	}

	@Override
	public FindAgentDataResponse getInstance(UnmarshallerContext context) {
		return	FindAgentDataResponseUnmarshaller.unmarshall(this, context);
	}
}
