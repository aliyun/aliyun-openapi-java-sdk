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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentDataResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentDataResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentDataResponse.DataList.AgentReportData;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentDataResponse.DataList.AgentReportData.AppraiseCountDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentDataResponseUnmarshaller {

	public static ListAgentDataResponse unmarshall(ListAgentDataResponse listAgentDataResponse, UnmarshallerContext context) {
		
		listAgentDataResponse.setRequestId(context.stringValue("ListAgentDataResponse.RequestId"));
		listAgentDataResponse.setSuccess(context.booleanValue("ListAgentDataResponse.Success"));
		listAgentDataResponse.setCode(context.stringValue("ListAgentDataResponse.Code"));
		listAgentDataResponse.setMessage(context.stringValue("ListAgentDataResponse.Message"));
		listAgentDataResponse.setHttpStatusCode(context.integerValue("ListAgentDataResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("ListAgentDataResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("ListAgentDataResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("ListAgentDataResponse.DataList.PageSize"));

		List<AgentReportData> list = new ArrayList<AgentReportData>();
		for (int i = 0; i < context.lengthValue("ListAgentDataResponse.DataList.List.Length"); i++) {
			AgentReportData agentReportData = new AgentReportData();
			agentReportData.setUserId(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].UserId"));
			agentReportData.setLoginName(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].LoginName"));
			agentReportData.setDisplayName(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].DisplayName"));
			agentReportData.setSkillGroupIds(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			agentReportData.setSkillGroupNames(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			agentReportData.setInstanceId(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			agentReportData.setRecordDate(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			agentReportData.setAgentStatus(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].AgentStatus"));
			agentReportData.setTotalWorkNumber(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].TotalWorkNumber"));
			agentReportData.setTotalTalkNumber(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].TotalTalkNumber"));
			agentReportData.setTalkPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].TalkPercentage"));
			agentReportData.setAbandonedNumber(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].AbandonedNumber"));
			agentReportData.setAbandonedPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].AbandonedPercentage"));
			agentReportData.setAverageTalkTime(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].AverageTalkTime"));
			agentReportData.setAverageRingingTime(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].AverageRingingTime"));
			agentReportData.setLoginDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].LoginDuration"));
			agentReportData.setTalkDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].TalkDuration"));
			agentReportData.setTalkDurationPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].TalkDurationPercentage"));
			agentReportData.setNotReadyDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].NotReadyDuration"));
			agentReportData.setNotReadyPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].NotReadyPercentage"));
			agentReportData.setLoginTime(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].LoginTime"));
			agentReportData.setLogoutTime(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].LogoutTime"));
			agentReportData.setRingingNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].RingingNum"));
			agentReportData.setInboundTalkNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundTalkNum"));
			agentReportData.setInboundTalkPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundTalkPercentage"));
			agentReportData.setInboundAbandonedNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNum"));
			agentReportData.setInboundAbandonedNumPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAbandonedNumPercentage"));
			agentReportData.setRingingDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].RingingDuration"));
			agentReportData.setInboundTalkDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundTalkDuration"));
			agentReportData.setDialingNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].DialingNum"));
			agentReportData.setOutboundTalkNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundTalkNum"));
			agentReportData.setOutboundTalkPercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundTalkPercentage"));
			agentReportData.setDialingDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].DialingDuration"));
			agentReportData.setOutboundTalkDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundTalkDuration"));
			agentReportData.setWorkDuration(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].WorkDuration"));
			agentReportData.setInboundLaunchAppraiseNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraiseNum"));
			agentReportData.setInboundLaunchAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundLaunchAppraisePercentage"));
			agentReportData.setInboundParticipateInAppraiseNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraiseNum"));
			agentReportData.setInboundParticipateInAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundParticipateInAppraisePercentage"));
			agentReportData.setInboundAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAppraisePercentage"));
			agentReportData.setInboundFeedbackSumNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundFeedbackSumNum"));
			agentReportData.setOutboundLaunchAppraiseNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraiseNum"));
			agentReportData.setOutboundLaunchAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundLaunchAppraisePercentage"));
			agentReportData.setOutboundParticipateInAppraiseNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraiseNum"));
			agentReportData.setOutboundParticipateInAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundParticipateInAppraisePercentage"));
			agentReportData.setOutboundAppraisePercentage(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundAppraisePercentage"));
			agentReportData.setOutboundFeedbackSumNum(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackSumNum"));

			List<AppraiseCountDomain> inboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundAppraiseNum["+ j +"].Group"));

				inboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundAppraiseNum(inboundAppraiseNum);

			List<AppraiseCountDomain> inboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("ListAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].InboundFeedbackNum["+ j +"].Group"));

				inboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setInboundFeedbackNum(inboundFeedbackNum);

			List<AppraiseCountDomain> outboundAppraiseNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundAppraiseNum["+ j +"].Group"));

				outboundAppraiseNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundAppraiseNum(outboundAppraiseNum);

			List<AppraiseCountDomain> outboundFeedbackNum = new ArrayList<AppraiseCountDomain>();
			for (int j = 0; j < context.lengthValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum.Length"); j++) {
				AppraiseCountDomain appraiseCountDomain = new AppraiseCountDomain();
				appraiseCountDomain.setSubgroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Subgroup"));
				appraiseCountDomain.setCount(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Count"));
				appraiseCountDomain.setGroup(context.stringValue("ListAgentDataResponse.DataList.List["+ i +"].OutboundFeedbackNum["+ j +"].Group"));

				outboundFeedbackNum.add(appraiseCountDomain);
			}
			agentReportData.setOutboundFeedbackNum(outboundFeedbackNum);

			list.add(agentReportData);
		}
		dataList.setList(list);
		listAgentDataResponse.setDataList(dataList);
	 
	 	return listAgentDataResponse;
	}
}