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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHistoricalSkillGroupReportResponseUnmarshaller {

	public static ListHistoricalSkillGroupReportResponse unmarshall(ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReportResponse, UnmarshallerContext _ctx) {
		
		listHistoricalSkillGroupReportResponse.setRequestId(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.RequestId"));
		listHistoricalSkillGroupReportResponse.setCode(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Code"));
		listHistoricalSkillGroupReportResponse.setHttpStatusCode(_ctx.integerValue("ListHistoricalSkillGroupReportResponse.HttpStatusCode"));
		listHistoricalSkillGroupReportResponse.setMessage(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListHistoricalSkillGroupReportResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListHistoricalSkillGroupReportResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListHistoricalSkillGroupReportResponse.Data.TotalCount"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListHistoricalSkillGroupReportResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setSkillGroupId(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].SkillGroupId"));
			items.setSkillGroupName(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].SkillGroupName"));

			Inbound inbound = new Inbound();
			inbound.setAbandonRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AbandonRate"));
			inbound.setAverageAbandonTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonTime"));
			inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonedInQueueTime"));
			inbound.setAverageAbandonedInRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonedInRingTime"));
			inbound.setAverageRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAverageWaitTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageWaitTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsAbandoned(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandoned"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsAbandonedInRinging(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandonedInRinging"));
			inbound.setCallsConsulted(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsConsulted"));
			inbound.setCallsHandled(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsHold(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHold"));
			inbound.setCallsOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsQueued(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsQueued"));
			inbound.setCallsRinged(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsTransferred(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsTransferred"));
			inbound.setHandleRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setMaxAbandonTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonTime"));
			inbound.setMaxAbandonedInQueueTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonedInQueueTime"));
			inbound.setMaxAbandonedInRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonedInRingTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxWaitTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxWaitTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setServiceLevel20(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalAbandonTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonTime"));
			inbound.setTotalAbandonedInQueueTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonedInQueueTime"));
			inbound.setTotalAbandonedInRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonedInRingTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalWaitTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalWaitTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			items.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAnswerRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsAnswered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setCallsDialed(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setMaxDialingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setTotalDialingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			items.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setAverageBreakTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxBreakTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setTotalBreakTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalHoldTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			items.setOverall(overall);

			list.add(items);
		}
		data.setList(list);
		listHistoricalSkillGroupReportResponse.setData(data);
	 
	 	return listHistoricalSkillGroupReportResponse;
	}
}