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
		getAgentDataResponse.setHttpStatusCode(_ctx.integerValue("GetAgentDataResponse.HttpStatusCode"));
		getAgentDataResponse.setCode(_ctx.stringValue("GetAgentDataResponse.Code"));
		getAgentDataResponse.setMessage(_ctx.stringValue("GetAgentDataResponse.Message"));
		getAgentDataResponse.setSuccess(_ctx.booleanValue("GetAgentDataResponse.Success"));

		DataList dataList = new DataList();
		dataList.setPageNumber(_ctx.integerValue("GetAgentDataResponse.DataList.PageNumber"));
		dataList.setPageSize(_ctx.integerValue("GetAgentDataResponse.DataList.PageSize"));
		dataList.setTotalCount(_ctx.integerValue("GetAgentDataResponse.DataList.TotalCount"));

		List<GenerateAgentStatistic> list = new ArrayList<GenerateAgentStatistic>();
		for (int i = 0; i < _ctx.lengthValue("GetAgentDataResponse.DataList.List.Length"); i++) {
			GenerateAgentStatistic generateAgentStatistic = new GenerateAgentStatistic();
			generateAgentStatistic.setTotalLoggedInTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalLoggedInTime"));
			generateAgentStatistic.setOccupancyRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].OccupancyRate"));
			generateAgentStatistic.setLoginName(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].LoginName"));
			generateAgentStatistic.setAgentId(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentId"));
			generateAgentStatistic.setRecordDate(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].RecordDate"));
			generateAgentStatistic.setAgentName(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].AgentName"));
			generateAgentStatistic.setInstanceId(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].InstanceId"));
			generateAgentStatistic.setAverageReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].AverageReadyTime"));
			generateAgentStatistic.setMaxReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].MaxReadyTime"));
			generateAgentStatistic.setSkillGroupNames(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupNames"));
			generateAgentStatistic.setSkillGroupIds(_ctx.stringValue("GetAgentDataResponse.DataList.List["+ i +"].SkillGroupIds"));
			generateAgentStatistic.setTotalBreakTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalBreakTime"));
			generateAgentStatistic.setTotalReadyTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].TotalReadyTime"));

			Inbound inbound = new Inbound();
			inbound.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setAverageRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Inbound.MaxRingTime"));
			generateAgentStatistic.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsDialed(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageDialingTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Outbound.AverageDialingTime"));
			generateAgentStatistic.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxHoldTime"));
			overall.setTotalWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxWorkTime"));
			overall.setTotalHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalHoldTime"));
			overall.setAverageTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setAverageHoldTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.AverageHoldTime"));
			overall.setMaxTalkTime(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("GetAgentDataResponse.DataList.List["+ i +"].Overall.TotalCalls"));
			generateAgentStatistic.setOverall(overall);

			list.add(generateAgentStatistic);
		}
		dataList.setList(list);
		getAgentDataResponse.setDataList(dataList);
	 
	 	return getAgentDataResponse;
	}
}