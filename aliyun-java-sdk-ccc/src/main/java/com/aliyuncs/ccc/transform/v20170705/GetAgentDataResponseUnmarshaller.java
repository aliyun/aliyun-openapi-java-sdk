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
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.GenerateAgentStatistic;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.GenerateAgentStatistic.Inbound;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.GenerateAgentStatistic.Outbound;
import com.aliyuncs.ccc.model.v20170705.GetAgentDataResponse.DataList.GenerateAgentStatistic.Overall;
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

		List<GenerateAgentStatistic> list = new ArrayList<GenerateAgentStatistic>();
		for (int i = 0; i < context.lengthValue("GetAgentDataResponse.DataList.List.Length"); i++) {
			GenerateAgentStatistic generateAgentStatistic = new GenerateAgentStatistic();
			generateAgentStatistic.setAgentId(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentId"));
			generateAgentStatistic.setLoginName(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginName"));
			generateAgentStatistic.setAgentName(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentName"));
			generateAgentStatistic.setSkillGroupIds(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			generateAgentStatistic.setSkillGroupNames(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			generateAgentStatistic.setInstanceId(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			generateAgentStatistic.setRecordDate(context.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			generateAgentStatistic.setTotalLoggedInTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalLoggedInTime"));
			generateAgentStatistic.setTotalBreakTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalBreakTime"));
			generateAgentStatistic.setOccupancyRate(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].OccupancyRate"));
			generateAgentStatistic.setTotalReadyTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalReadyTime"));
			generateAgentStatistic.setMaxReadyTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].MaxReadyTime"));
			generateAgentStatistic.setAverageReadyTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].AverageReadyTime"));

			Inbound inbound = new Inbound();
			inbound.setTotalTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setMaxHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setTotalWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionSurveysOffered(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setSatisfactionIndex(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsOffered(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageRingTime"));
			generateAgentStatistic.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setMaxHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setTotalWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionSurveysOffered(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setSatisfactionIndex(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsDialed(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalDialingTime1(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageDialingTime"));
			generateAgentStatistic.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalHoldTime"));
			overall.setMaxHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxHoldTime"));
			overall.setAverageHoldTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionSurveysOffered(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setSatisfactionIndex(context.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setTotalCalls(context.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalCalls"));
			generateAgentStatistic.setOverall(overall);

			list.add(generateAgentStatistic);
		}
		dataList.setList(list);
		getAgentDataResponse.setDataList(dataList);
	 
	 	return getAgentDataResponse;
	}
}