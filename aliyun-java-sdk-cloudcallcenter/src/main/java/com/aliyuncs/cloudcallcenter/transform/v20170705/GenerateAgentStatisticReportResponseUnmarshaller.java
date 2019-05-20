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

import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse.DataList;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse.DataList.GenerateAgentStatistic;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse.DataList.GenerateAgentStatistic.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse.DataList.GenerateAgentStatistic.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateAgentStatisticReportResponse.DataList.GenerateAgentStatistic.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateAgentStatisticReportResponseUnmarshaller {

	public static GenerateAgentStatisticReportResponse unmarshall(GenerateAgentStatisticReportResponse generateAgentStatisticReportResponse, UnmarshallerContext context) {
		
		generateAgentStatisticReportResponse.setRequestId(context.stringValue("GenerateAgentStatisticReportResponse.RequestId"));
		generateAgentStatisticReportResponse.setSuccess(context.booleanValue("GenerateAgentStatisticReportResponse.Success"));
		generateAgentStatisticReportResponse.setCode(context.stringValue("GenerateAgentStatisticReportResponse.Code"));
		generateAgentStatisticReportResponse.setMessage(context.stringValue("GenerateAgentStatisticReportResponse.Message"));
		generateAgentStatisticReportResponse.setHttpStatusCode(context.integerValue("GenerateAgentStatisticReportResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("GenerateAgentStatisticReportResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("GenerateAgentStatisticReportResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("GenerateAgentStatisticReportResponse.DataList.PageSize"));

		List<GenerateAgentStatistic> list = new ArrayList<GenerateAgentStatistic>();
		for (int i = 0; i < context.lengthValue("GenerateAgentStatisticReportResponse.DataList.List.Length"); i++) {
			GenerateAgentStatistic generateAgentStatistic = new GenerateAgentStatistic();
			generateAgentStatistic.setAgentId(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].AgentId"));
			generateAgentStatistic.setLoginName(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].LoginName"));
			generateAgentStatistic.setAgentName(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].AgentName"));
			generateAgentStatistic.setSkillGroupIds(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].SkillGroupIds"));
			generateAgentStatistic.setSkillGroupNames(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].SkillGroupNames"));
			generateAgentStatistic.setInstanceId(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].InstanceId"));
			generateAgentStatistic.setRecordDate(context.stringValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].RecordDate"));
			generateAgentStatistic.setTotalLoggedInTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].TotalLoggedInTime"));
			generateAgentStatistic.setTotalBreakTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].TotalBreakTime"));
			generateAgentStatistic.setOccupancyRate(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].OccupancyRate"));
			generateAgentStatistic.setTotalReadyTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].TotalReadyTime"));
			generateAgentStatistic.setMaxReadyTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].MaxReadyTime"));
			generateAgentStatistic.setAverageReadyTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].AverageReadyTime"));

			Inbound inbound = new Inbound();
			inbound.setTotalTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setMaxHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setTotalWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionSurveysOffered(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setSatisfactionIndex(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsOffered(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Inbound.AverageRingTime"));
			generateAgentStatistic.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setMaxHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setTotalWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionSurveysOffered(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setSatisfactionIndex(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsDialed(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalDialingTime1(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Outbound.AverageDialingTime"));
			generateAgentStatistic.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.TotalHoldTime"));
			overall.setMaxHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.MaxHoldTime"));
			overall.setAverageHoldTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionSurveysOffered(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setSatisfactionIndex(context.floatValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setTotalCalls(context.longValue("GenerateAgentStatisticReportResponse.DataList.List["+ i +"].Overall.TotalCalls"));
			generateAgentStatistic.setOverall(overall);

			list.add(generateAgentStatistic);
		}
		dataList.setList(list);
		generateAgentStatisticReportResponse.setDataList(dataList);
	 
	 	return generateAgentStatisticReportResponse;
	}
}