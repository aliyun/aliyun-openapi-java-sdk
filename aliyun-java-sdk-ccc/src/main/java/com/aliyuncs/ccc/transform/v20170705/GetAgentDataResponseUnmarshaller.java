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

	public static GetAgentDataResponse unmarshall(GetAgentDataResponse getAgentDataResponse, UnmarshallerContext _ctx) {
		
		getAgentDataResponse.setRequestId(_ctx.stringValue("GetAgentDataResponse.RequestId"));
		getAgentDataResponse.setSuccess(_ctx.booleanValue("GetAgentDataResponse.Success"));
		getAgentDataResponse.setCode(_ctx.stringValue("GetAgentDataResponse.Code"));
		getAgentDataResponse.setMessage(_ctx.stringValue("GetAgentDataResponse.Message"));
		getAgentDataResponse.setHttpStatusCode(_ctx.integerValue("GetAgentDataResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(_ctx.integerValue("GetAgentDataResponse.DataList.TotalCount"));
		dataList.setPageNumber(_ctx.integerValue("GetAgentDataResponse.DataList.PageNumber"));
		dataList.setPageSize(_ctx.integerValue("GetAgentDataResponse.DataList.PageSize"));

		List<GenerateAgentStatistic> list = new ArrayList<GenerateAgentStatistic>();
		for (int i = 0; i < _ctx.lengthValue("GetAgentDataResponse.DataList.List.Length"); i++) {
			GenerateAgentStatistic generateAgentStatistic = new GenerateAgentStatistic();
			generateAgentStatistic.setAgentId(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentId"));
			generateAgentStatistic.setLoginName(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginName"));
			generateAgentStatistic.setAgentName(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentName"));
			generateAgentStatistic.setSkillGroupIds(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			generateAgentStatistic.setSkillGroupNames(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			generateAgentStatistic.setInstanceId(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			generateAgentStatistic.setRecordDate(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			generateAgentStatistic.setTotalLoggedInTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalLoggedInTime"));
			generateAgentStatistic.setTotalBreakTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalBreakTime"));
			generateAgentStatistic.setOccupancyRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].OccupancyRate"));
			generateAgentStatistic.setTotalReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalReadyTime"));
			generateAgentStatistic.setMaxReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].MaxReadyTime"));
			generateAgentStatistic.setAverageReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].AverageReadyTime"));

			Inbound inbound = new Inbound();
			inbound.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageRingTime"));
			generateAgentStatistic.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsDialed(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalDialingTime1(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageDialingTime"));
			generateAgentStatistic.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalHoldTime"));
			overall.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxHoldTime"));
			overall.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setTotalCalls(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalCalls"));
			generateAgentStatistic.setOverall(overall);

			list.add(generateAgentStatistic);
		}
		dataList.setList(list);
		getAgentDataResponse.setDataList(dataList);
	 
	 	return getAgentDataResponse;
	}
}