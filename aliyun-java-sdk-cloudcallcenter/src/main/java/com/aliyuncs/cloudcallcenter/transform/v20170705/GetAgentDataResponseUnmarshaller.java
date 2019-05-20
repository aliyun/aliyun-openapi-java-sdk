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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentDataResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentDataResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentDataResponse.DataList.AgentReportData;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentDataResponse.DataList.AgentReportData.AppraiseCountDomain;
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
			agentReportData.setTotalWorkNumber(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TotalWorkNumber"));
			agentReportData.setTotalTalkNumber(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TotalTalkNumber"));
			agentReportData.setTalkPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TalkPercentage"));
			agentReportData.setAbandonedNumber(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AbandonedNumber"));
			agentReportData.setAbandonedPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AbandonedPercentage"));
			agentReportData.setAverageTalkTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AverageTalkTime"));
			agentReportData.setAverageRingingTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AverageRingingTime"));
			agentReportData.setLoginDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginDuration"));
			agentReportData.setTalkDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TalkDuration"));
			agentReportData.setTalkDurationPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].TalkDurationPercentage"));
			agentReportData.setNotReadyDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].NotReadyDuration"));
			agentReportData.setNotReadyPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].NotReadyPercentage"));
			agentReportData.setLoginTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginTime"));
			agentReportData.setLogoutTime(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LogoutTime"));
			agentReportData.setWorkDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].WorkDuration"));
			agentReportData.setRingingNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RingingNum"));
			agentReportData.setInboundTalkNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTalkNum"));
			agentReportData.setInboundTalkPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTalkPercentage"));
			agentReportData.setInboundAbandonedNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNum"));
			agentReportData.setInboundAbandonedNumPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNumPercentage"));
			agentReportData.setRingingDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RingingDuration"));
			agentReportData.setInboundTalkDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundTalkDuration"));
			agentReportData.setDialingNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].DialingNum"));
			agentReportData.setOutboundTalkNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTalkNum"));
			agentReportData.setOutboundTalkPercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTalkPercentage"));
			agentReportData.setDialingDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].DialingDuration"));
			agentReportData.setOutboundTalkDuration(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundTalkDuration"));
			agentReportData.setWorkDuration1(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].WorkDuration"));
			agentReportData.setInboundLaunchAppraiseNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraiseNum"));
			agentReportData.setInboundLaunchAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraisePercentage"));
			agentReportData.setInboundParticipateInAppraiseNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraiseNum"));
			agentReportData.setInboundParticipateInAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraisePercentage"));
			agentReportData.setInboundAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAppraisePercentage"));
			agentReportData.setInboundFeedbackSumNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackSumNum"));
			agentReportData.setOutboundLaunchAppraiseNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraiseNum"));
			agentReportData.setOutboundLaunchAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraisePercentage"));
			agentReportData.setOutboundParticipateInAppraiseNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraiseNum"));
			agentReportData.setOutboundParticipateInAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraisePercentage"));
			agentReportData.setOutboundAppraisePercentage(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraisePercentage"));
			agentReportData.setOutboundFeedbackSumNum(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackSumNum"));

			List<AppraiseCountDomain> inboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Group"));

				inboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundAppraiseNum(inboundAppraiseNum);

			List<AppraiseCountDomain> inboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Group"));

				inboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundFeedbackNum(inboundFeedbackNum);

			List<AppraiseCountDomain> outboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Group"));

				outboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundAppraiseNum(outboundAppraiseNum);

			List<AppraiseCountDomain> outboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Group"));

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