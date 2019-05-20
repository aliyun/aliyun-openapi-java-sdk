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

import com.aliyuncs.cloudcallcenter.model.v20170705.FindAgentDataResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.FindAgentDataResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.FindAgentDataResponse.DataList.AgentReportData;
import com.aliyuncs.cloudcallcenter.model.v20170705.FindAgentDataResponse.DataList.AgentReportData.AppraiseCountDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAgentDataResponseUnmarshaller {

	public static FindAgentDataResponse unmarshall(FindAgentDataResponse findAgentDataResponse, UnmarshallerContext context) {
		
		findAgentDataResponse.setRequestId(context.stringValue("FindAgentDataResponse.RequestId"));
		findAgentDataResponse.setSuccess(context.booleanValue("FindAgentDataResponse.Success"));
		findAgentDataResponse.setCode(context.stringValue("FindAgentDataResponse.Code"));
		findAgentDataResponse.setMessage(context.stringValue("FindAgentDataResponse.Message"));
		findAgentDataResponse.setHttpStatusCode(context.integerValue("FindAgentDataResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("FindAgentDataResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("FindAgentDataResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("FindAgentDataResponse.DataList.PageSize"));

		List<AgentReportData> list = new ArrayList<AgentReportData>();
		for (int i = 0; i < context.lengthValue("FindAgentDataResponse.DataList.List.Length"); i++) {
			AgentReportData agentReportData = new AgentReportData();
			agentReportData.setUserId(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].UserId"));
			agentReportData.setLoginName(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].LoginName"));
			agentReportData.setDisplayName(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].DisplayName"));
			agentReportData.setSkillGroupIds(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			agentReportData.setSkillGroupNames(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			agentReportData.setInstanceId(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			agentReportData.setRecordDate(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			agentReportData.setAgentStatus(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].AgentStatus"));
			agentReportData.setTotalWorkNumber(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].TotalWorkNumber"));
			agentReportData.setTotalTalkNumber(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].TotalTalkNumber"));
			agentReportData.setTalkPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].TalkPercentage"));
			agentReportData.setAbandonedNumber(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].AbandonedNumber"));
			agentReportData.setAbandonedPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].AbandonedPercentage"));
			agentReportData.setAverageTalkTime(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].AverageTalkTime"));
			agentReportData.setAverageRingingTime(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].AverageRingingTime"));
			agentReportData.setLoginDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].LoginDuration"));
			agentReportData.setTalkDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].TalkDuration"));
			agentReportData.setTalkDurationPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].TalkDurationPercentage"));
			agentReportData.setNotReadyDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].NotReadyDuration"));
			agentReportData.setNotReadyPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].NotReadyPercentage"));
			agentReportData.setLoginTime(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].LoginTime"));
			agentReportData.setLogoutTime(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].LogoutTime"));
			agentReportData.setRingingNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].RingingNum"));
			agentReportData.setInboundTalkNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundTalkNum"));
			agentReportData.setInboundTalkPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundTalkPercentage"));
			agentReportData.setInboundAbandonedNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNum"));
			agentReportData.setInboundAbandonedNumPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNumPercentage"));
			agentReportData.setRingingDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].RingingDuration"));
			agentReportData.setInboundTalkDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundTalkDuration"));
			agentReportData.setDialingNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].DialingNum"));
			agentReportData.setOutboundTalkNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundTalkNum"));
			agentReportData.setOutboundTalkPercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundTalkPercentage"));
			agentReportData.setDialingDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].DialingDuration"));
			agentReportData.setOutboundTalkDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundTalkDuration"));
			agentReportData.setWorkDuration(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].WorkDuration"));
			agentReportData.setInboundLaunchAppraiseNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraiseNum"));
			agentReportData.setInboundLaunchAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraisePercentage"));
			agentReportData.setInboundParticipateInAppraiseNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraiseNum"));
			agentReportData.setInboundParticipateInAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraisePercentage"));
			agentReportData.setInboundAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAppraisePercentage"));
			agentReportData.setInboundFeedbackSumNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundFeedbackSumNum"));
			agentReportData.setOutboundLaunchAppraiseNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraiseNum"));
			agentReportData.setOutboundLaunchAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraisePercentage"));
			agentReportData.setOutboundParticipateInAppraiseNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraiseNum"));
			agentReportData.setOutboundParticipateInAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraisePercentage"));
			agentReportData.setOutboundAppraisePercentage(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundAppraisePercentage"));
			agentReportData.setOutboundFeedbackSumNum(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackSumNum"));

			List<AppraiseCountDomain> inboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Group"));

				inboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundAppraiseNum(inboundAppraiseNum);

			List<AppraiseCountDomain> inboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("FindAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Group"));

				inboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundFeedbackNum(inboundFeedbackNum);

			List<AppraiseCountDomain> outboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Group"));

				outboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundAppraiseNum(outboundAppraiseNum);

			List<AppraiseCountDomain> outboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("FindAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Group"));

				outboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundFeedbackNum(outboundFeedbackNum);

			list.add(agentReportData);
		}
		dataList.setList(list);
		findAgentDataResponse.setDataList(dataList);
	 
	 	return findAgentDataResponse;
	}
}