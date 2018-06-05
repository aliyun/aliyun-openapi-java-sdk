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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.AgentReportData;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.AgentReportData.AppraiseCountDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentDataResponseUnmarshaller {

	public static GetAgentDataResponse unmarshall(GetAgentDataResponse getAgentDataResponse, UnmarshallerContext context) {
		
		getAgentDataResponse.setRequestId(context.stringValue("GetAgentDataResponse.RequestId"));
		getAgentDataResponse.setSuccess(context.booleanValue("GetAgentDataResponse.Success"));
		getAgentDataResponse.setCode(context.stringValue("GetAgentDataResponse.Code"));
		getAgentDataResponse.setMessage(context.stringValue("GetAgentDataResponse.Message"));
		getAgentDataResponse.setHttpStatusCode(context.integerValue("GetAgentDataResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("GetAgentDataResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("GetAgentDataResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("GetAgentDataResponse.DataList.PageSize"));

		List<AgentReportData> list = new ArrayList<AgentReportData>();
		for (int i = 0; i < context.lengthValue("GetAgentDataResponse.DataList.List.Length"); i++) {
			AgentReportData agentReportData = new AgentReportData();
			agentReportData.setUserId(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].UserId"));
			agentReportData.setLoginName(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginName"));
			agentReportData.setDisplayName(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].DisplayName"));
			agentReportData.setSkillGroupIds(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			agentReportData.setSkillGroupNames(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			agentReportData.setInstanceId(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			agentReportData.setRecordDate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			agentReportData.setAgentStatus(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentStatus"));
			agentReportData.setTotalCalls(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TotalCalls"));
			agentReportData.setCallsAnswered(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].CallsAnswered"));
			agentReportData.setCallsAnsweredRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].CallsAnsweredRate"));
			agentReportData.setCallsAbandoned(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].CallsAbandoned"));
			agentReportData.setCallsAbandonedRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].CallsAbandonedRate"));
			agentReportData.setAverageTalkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AverageTalkTime"));
			agentReportData.setAverageSpeedOfAnswer(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AverageSpeedOfAnswer"));
			agentReportData.setLoggedInTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoggedInTime"));
			agentReportData.setTalkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TalkTime"));
			agentReportData.setTalkTimeRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TalkTimeRate"));
			agentReportData.setBreakTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].BreakTime"));
			agentReportData.setBreakTimeRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].BreakTimeRate"));
			agentReportData.setLoginTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginTime"));
			agentReportData.setLogoutTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LogoutTime"));
			agentReportData.setWorkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].WorkTime"));
			agentReportData.setInboundCalls(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundCalls"));
			agentReportData.setInboundCallsAnswered(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundCallsAnswered"));
			agentReportData.setInboundCallsAnsweredRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundCallsAnsweredRate"));
			agentReportData.setInboundCallsAbandoned(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundCallsAbandoned"));
			agentReportData.setInboundCallsAbandonedRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundCallsAbandonedRate"));
			agentReportData.setInboundRingTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundRingTime"));
			agentReportData.setInboundTalkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTalkTime"));
			agentReportData.setOutboundCalls(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundCalls"));
			agentReportData.setOutboundCallsAnswered(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundCallsAnswered"));
			agentReportData.setOutboundCallsAnsweredRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundCallsAnsweredRate"));
			agentReportData.setOutboundDialingTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundDialingTime"));
			agentReportData.setOutboundTalkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTalkTime"));
			agentReportData.setInboundSatisfactionSurvey(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionSurvey"));
			agentReportData.setInboundSatisfactionSurveyRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionSurveyRate"));
			agentReportData.setInboundTakeSatisfactionSurvey(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTakeSatisfactionSurvey"));
			agentReportData.setInboundTakeSatisfactionSurveyRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTakeSatisfactionSurveyRate"));
			agentReportData.setInboundSatisfactionRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionRate"));
			agentReportData.setInboundFeedbackSumNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackSumNum"));
			agentReportData.setOutboundSatisfactionSurvey(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundSatisfactionSurvey"));
			agentReportData.setOutboundSatisfactionSurveyRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundSatisfactionSurveyRate"));
			agentReportData.setOutboundTakeSatisfactionSurvey(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTakeSatisfactionSurvey"));
			agentReportData.setOutboundTakeSatisfactionSurveyRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTakeSatisfactionSurveyRate"));
			agentReportData.setOutboundSatisfactionRate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundSatisfactionRate"));
			agentReportData.setOutboundFeedbackSumNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackSumNum"));

			List<AppraiseCountDomain> inboundSatisfactionDetail = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionDetail.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionDetail["+ j +"].Group"));
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionDetail["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundSatisfactionDetail["+ j +"].Count"));

				inboundSatisfactionDetail.add(appraiseCountDomain);
			}
			agentReportData.setInboundSatisfactionDetail(inboundSatisfactionDetail);

			List<AppraiseCountDomain> inboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Group"));
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Count"));

				inboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundFeedbackNum(inboundFeedbackNum);

			List<AppraiseCountDomain> outboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Group"));
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Count"));

				outboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundAppraiseNum(outboundAppraiseNum);

			List<AppraiseCountDomain> outboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Group"));
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Count"));

				outboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundFeedbackNum(outboundFeedbackNum);

			list.add(agentReportData);
		}
		dataList.setList(list);
		getAgentDataResponse.setDataList(dataList);
	 
	 	return getAgentDataResponse;
	}
}