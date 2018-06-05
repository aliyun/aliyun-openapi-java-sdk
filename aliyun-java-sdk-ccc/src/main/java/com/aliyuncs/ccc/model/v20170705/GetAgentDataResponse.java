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
import com.aliyuncs.ccc.transform.v20170705.GetAgentDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgentDataResponse extends AcsResponse {

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

			private String totalCalls;

			private String callsAnswered;

			private String callsAnsweredRate;

			private String callsAbandoned;

			private String callsAbandonedRate;

			private String averageTalkTime;

			private String averageSpeedOfAnswer;

			private String loggedInTime;

			private String talkTime;

			private String talkTimeRate;

			private String breakTime;

			private String breakTimeRate;

			private String loginTime;

			private String logoutTime;

			private String workTime;

			private String inboundCalls;

			private String inboundCallsAnswered;

			private String inboundCallsAnsweredRate;

			private String inboundCallsAbandoned;

			private String inboundCallsAbandonedRate;

			private String inboundRingTime;

			private String inboundTalkTime;

			private String outboundCalls;

			private String outboundCallsAnswered;

			private String outboundCallsAnsweredRate;

			private String outboundDialingTime;

			private String outboundTalkTime;

			private String inboundSatisfactionSurvey;

			private String inboundSatisfactionSurveyRate;

			private String inboundTakeSatisfactionSurvey;

			private String inboundTakeSatisfactionSurveyRate;

			private String inboundSatisfactionRate;

			private String inboundFeedbackSumNum;

			private String outboundSatisfactionSurvey;

			private String outboundSatisfactionSurveyRate;

			private String outboundTakeSatisfactionSurvey;

			private String outboundTakeSatisfactionSurveyRate;

			private String outboundSatisfactionRate;

			private String outboundFeedbackSumNum;

			private List<AppraiseCountDomain> inboundSatisfactionDetail;

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

			public String getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(String totalCalls) {
				this.totalCalls = totalCalls;
			}

			public String getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(String callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public String getCallsAnsweredRate() {
				return this.callsAnsweredRate;
			}

			public void setCallsAnsweredRate(String callsAnsweredRate) {
				this.callsAnsweredRate = callsAnsweredRate;
			}

			public String getCallsAbandoned() {
				return this.callsAbandoned;
			}

			public void setCallsAbandoned(String callsAbandoned) {
				this.callsAbandoned = callsAbandoned;
			}

			public String getCallsAbandonedRate() {
				return this.callsAbandonedRate;
			}

			public void setCallsAbandonedRate(String callsAbandonedRate) {
				this.callsAbandonedRate = callsAbandonedRate;
			}

			public String getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(String averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public String getAverageSpeedOfAnswer() {
				return this.averageSpeedOfAnswer;
			}

			public void setAverageSpeedOfAnswer(String averageSpeedOfAnswer) {
				this.averageSpeedOfAnswer = averageSpeedOfAnswer;
			}

			public String getLoggedInTime() {
				return this.loggedInTime;
			}

			public void setLoggedInTime(String loggedInTime) {
				this.loggedInTime = loggedInTime;
			}

			public String getTalkTime() {
				return this.talkTime;
			}

			public void setTalkTime(String talkTime) {
				this.talkTime = talkTime;
			}

			public String getTalkTimeRate() {
				return this.talkTimeRate;
			}

			public void setTalkTimeRate(String talkTimeRate) {
				this.talkTimeRate = talkTimeRate;
			}

			public String getBreakTime() {
				return this.breakTime;
			}

			public void setBreakTime(String breakTime) {
				this.breakTime = breakTime;
			}

			public String getBreakTimeRate() {
				return this.breakTimeRate;
			}

			public void setBreakTimeRate(String breakTimeRate) {
				this.breakTimeRate = breakTimeRate;
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

			public String getWorkTime() {
				return this.workTime;
			}

			public void setWorkTime(String workTime) {
				this.workTime = workTime;
			}

			public String getInboundCalls() {
				return this.inboundCalls;
			}

			public void setInboundCalls(String inboundCalls) {
				this.inboundCalls = inboundCalls;
			}

			public String getInboundCallsAnswered() {
				return this.inboundCallsAnswered;
			}

			public void setInboundCallsAnswered(String inboundCallsAnswered) {
				this.inboundCallsAnswered = inboundCallsAnswered;
			}

			public String getInboundCallsAnsweredRate() {
				return this.inboundCallsAnsweredRate;
			}

			public void setInboundCallsAnsweredRate(String inboundCallsAnsweredRate) {
				this.inboundCallsAnsweredRate = inboundCallsAnsweredRate;
			}

			public String getInboundCallsAbandoned() {
				return this.inboundCallsAbandoned;
			}

			public void setInboundCallsAbandoned(String inboundCallsAbandoned) {
				this.inboundCallsAbandoned = inboundCallsAbandoned;
			}

			public String getInboundCallsAbandonedRate() {
				return this.inboundCallsAbandonedRate;
			}

			public void setInboundCallsAbandonedRate(String inboundCallsAbandonedRate) {
				this.inboundCallsAbandonedRate = inboundCallsAbandonedRate;
			}

			public String getInboundRingTime() {
				return this.inboundRingTime;
			}

			public void setInboundRingTime(String inboundRingTime) {
				this.inboundRingTime = inboundRingTime;
			}

			public String getInboundTalkTime() {
				return this.inboundTalkTime;
			}

			public void setInboundTalkTime(String inboundTalkTime) {
				this.inboundTalkTime = inboundTalkTime;
			}

			public String getOutboundCalls() {
				return this.outboundCalls;
			}

			public void setOutboundCalls(String outboundCalls) {
				this.outboundCalls = outboundCalls;
			}

			public String getOutboundCallsAnswered() {
				return this.outboundCallsAnswered;
			}

			public void setOutboundCallsAnswered(String outboundCallsAnswered) {
				this.outboundCallsAnswered = outboundCallsAnswered;
			}

			public String getOutboundCallsAnsweredRate() {
				return this.outboundCallsAnsweredRate;
			}

			public void setOutboundCallsAnsweredRate(String outboundCallsAnsweredRate) {
				this.outboundCallsAnsweredRate = outboundCallsAnsweredRate;
			}

			public String getOutboundDialingTime() {
				return this.outboundDialingTime;
			}

			public void setOutboundDialingTime(String outboundDialingTime) {
				this.outboundDialingTime = outboundDialingTime;
			}

			public String getOutboundTalkTime() {
				return this.outboundTalkTime;
			}

			public void setOutboundTalkTime(String outboundTalkTime) {
				this.outboundTalkTime = outboundTalkTime;
			}

			public String getInboundSatisfactionSurvey() {
				return this.inboundSatisfactionSurvey;
			}

			public void setInboundSatisfactionSurvey(String inboundSatisfactionSurvey) {
				this.inboundSatisfactionSurvey = inboundSatisfactionSurvey;
			}

			public String getInboundSatisfactionSurveyRate() {
				return this.inboundSatisfactionSurveyRate;
			}

			public void setInboundSatisfactionSurveyRate(String inboundSatisfactionSurveyRate) {
				this.inboundSatisfactionSurveyRate = inboundSatisfactionSurveyRate;
			}

			public String getInboundTakeSatisfactionSurvey() {
				return this.inboundTakeSatisfactionSurvey;
			}

			public void setInboundTakeSatisfactionSurvey(String inboundTakeSatisfactionSurvey) {
				this.inboundTakeSatisfactionSurvey = inboundTakeSatisfactionSurvey;
			}

			public String getInboundTakeSatisfactionSurveyRate() {
				return this.inboundTakeSatisfactionSurveyRate;
			}

			public void setInboundTakeSatisfactionSurveyRate(String inboundTakeSatisfactionSurveyRate) {
				this.inboundTakeSatisfactionSurveyRate = inboundTakeSatisfactionSurveyRate;
			}

			public String getInboundSatisfactionRate() {
				return this.inboundSatisfactionRate;
			}

			public void setInboundSatisfactionRate(String inboundSatisfactionRate) {
				this.inboundSatisfactionRate = inboundSatisfactionRate;
			}

			public String getInboundFeedbackSumNum() {
				return this.inboundFeedbackSumNum;
			}

			public void setInboundFeedbackSumNum(String inboundFeedbackSumNum) {
				this.inboundFeedbackSumNum = inboundFeedbackSumNum;
			}

			public String getOutboundSatisfactionSurvey() {
				return this.outboundSatisfactionSurvey;
			}

			public void setOutboundSatisfactionSurvey(String outboundSatisfactionSurvey) {
				this.outboundSatisfactionSurvey = outboundSatisfactionSurvey;
			}

			public String getOutboundSatisfactionSurveyRate() {
				return this.outboundSatisfactionSurveyRate;
			}

			public void setOutboundSatisfactionSurveyRate(String outboundSatisfactionSurveyRate) {
				this.outboundSatisfactionSurveyRate = outboundSatisfactionSurveyRate;
			}

			public String getOutboundTakeSatisfactionSurvey() {
				return this.outboundTakeSatisfactionSurvey;
			}

			public void setOutboundTakeSatisfactionSurvey(String outboundTakeSatisfactionSurvey) {
				this.outboundTakeSatisfactionSurvey = outboundTakeSatisfactionSurvey;
			}

			public String getOutboundTakeSatisfactionSurveyRate() {
				return this.outboundTakeSatisfactionSurveyRate;
			}

			public void setOutboundTakeSatisfactionSurveyRate(String outboundTakeSatisfactionSurveyRate) {
				this.outboundTakeSatisfactionSurveyRate = outboundTakeSatisfactionSurveyRate;
			}

			public String getOutboundSatisfactionRate() {
				return this.outboundSatisfactionRate;
			}

			public void setOutboundSatisfactionRate(String outboundSatisfactionRate) {
				this.outboundSatisfactionRate = outboundSatisfactionRate;
			}

			public String getOutboundFeedbackSumNum() {
				return this.outboundFeedbackSumNum;
			}

			public void setOutboundFeedbackSumNum(String outboundFeedbackSumNum) {
				this.outboundFeedbackSumNum = outboundFeedbackSumNum;
			}

			public List<AppraiseCountDomain> getInboundSatisfactionDetail() {
				return this.inboundSatisfactionDetail;
			}

			public void setInboundSatisfactionDetail(List<AppraiseCountDomain> inboundSatisfactionDetail) {
				this.inboundSatisfactionDetail = inboundSatisfactionDetail;
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

				private String group;

				private String subgroup;

				private String count;

				public String getGroup() {
					return this.group;
				}

				public void setGroup(String group) {
					this.group = group;
				}

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
			}
		}
	}

	@Override
	public GetAgentDataResponse getInstance(UnmarshallerContext context) {
		return	GetAgentDataResponseUnmarshaller.unmarshall(this, context);
	}
}
