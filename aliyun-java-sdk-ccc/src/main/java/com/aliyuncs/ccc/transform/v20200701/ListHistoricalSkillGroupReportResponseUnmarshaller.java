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
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Back2Back;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Inbound.AccessChannelTypeDetail;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Overall;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalSkillGroupReportResponse.Data.Items.Overall.BreakCodeDetail;
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
			items.setSkillGroupName(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].SkillGroupName"));
			items.setSkillGroupId(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].SkillGroupId"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsOverflow(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsOverflow"));
			inbound.setCallsAbandonedInRing(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandonedInRing"));
			inbound.setCallsHandled(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setTotalAbandonedInRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonedInRingTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setAverageWaitTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageWaitTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setMaxAbandonTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsQueued(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsQueued"));
			inbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferIn"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setAverageAbandonedInRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonedInRingTime"));
			inbound.setAverageAbandonTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonTime"));
			inbound.setCallsRinged(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferOut"));
			inbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferIn"));
			inbound.setCallsAbandoned(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandoned"));
			inbound.setMaxAbandonedInQueueTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonedInQueueTime"));
			inbound.setTotalWaitTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalWaitTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAbandonRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AbandonRate"));
			inbound.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalAbandonTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonTime"));
			inbound.setCallsOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxAbandonedInRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxAbandonedInRingTime"));
			inbound.setMaxWaitTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxWaitTime"));
			inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageAbandonedInQueueTime"));
			inbound.setServiceLevel20(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setMaxHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionRate"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setCallsHold(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setCallsTimeout(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsTimeout"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setTotalAbandonedInQueueTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalAbandonedInQueueTime"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsQueuingTimeout(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsQueuingTimeout"));
			inbound.setCallsQueuingOverflow(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsQueuingOverflow"));
			inbound.setAverageFirstResponseTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageFirstResponseTime"));
			inbound.setAverageResponseTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageResponseTime"));
			inbound.setCallsQueuingFailed(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsQueuingFailed"));
			inbound.setServiceLevel15(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.ServiceLevel15"));
			inbound.setServiceLevel30(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.ServiceLevel30"));
			inbound.setTotalMessagesSent(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalMessagesSent"));
			inbound.setTotalMessagesSentByAgent(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalMessagesSentByAgent"));
			inbound.setTotalMessagesSentByCustomer(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalMessagesSentByCustomer"));

			List<AccessChannelTypeDetail> accessChannelTypeDetails = new ArrayList<AccessChannelTypeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AccessChannelTypeDetails.Length"); j++) {
				AccessChannelTypeDetail accessChannelTypeDetail = new AccessChannelTypeDetail();
				accessChannelTypeDetail.setAccessChannelType(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AccessChannelTypeDetails["+ j +"].AccessChannelType"));
				accessChannelTypeDetail.setCallsOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Inbound.AccessChannelTypeDetails["+ j +"].CallsOffered"));

				accessChannelTypeDetails.add(accessChannelTypeDetail);
			}
			inbound.setAccessChannelTypeDetails(accessChannelTypeDetails);
			items.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferOut"));
			outbound.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferIn"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsRinged"));
			outbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferIn"));
			outbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferOut"));
			outbound.setTotalRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAnswerRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsHold(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			items.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxHoldTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageBreakTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalHoldTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionRate"));
			overall.setMaxBreakTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxBreakTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageHoldTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalCalls"));

			List<BreakCodeDetail> breakCodeDetailList = new ArrayList<BreakCodeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList.Length"); j++) {
				BreakCodeDetail breakCodeDetail = new BreakCodeDetail();
				breakCodeDetail.setBreakCode(_ctx.stringValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].BreakCode"));
				breakCodeDetail.setCount(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Count"));
				breakCodeDetail.setDuration(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Duration"));

				breakCodeDetailList.add(breakCodeDetail);
			}
			overall.setBreakCodeDetailList(breakCodeDetailList);
			items.setOverall(overall);

			Back2Back back2Back = new Back2Back();
			back2Back.setCallsDialed(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsDialed"));
			back2Back.setAnswerRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AnswerRate"));
			back2Back.setCallsAnswered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsAnswered"));
			back2Back.setTotalTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalTalkTime"));
			back2Back.setMaxTalkTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxTalkTime"));
			back2Back.setAverageTalkTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageTalkTime"));
			back2Back.setTotalRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalRingTime"));
			back2Back.setMaxRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxRingTime"));
			back2Back.setAverageRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageRingTime"));
			back2Back.setTotalCustomerRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalCustomerRingTime"));
			back2Back.setMaxCustomerRingTime(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxCustomerRingTime"));
			back2Back.setAverageCustomerRingTime(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageCustomerRingTime"));
			back2Back.setAgentHandleRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AgentHandleRate"));
			back2Back.setCallsCustomerAnswered(_ctx.longValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsCustomerAnswered"));
			back2Back.setCustomerAnswerRate(_ctx.floatValue("ListHistoricalSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CustomerAnswerRate"));
			items.setBack2Back(back2Back);

			list.add(items);
		}
		data.setList(list);
		listHistoricalSkillGroupReportResponse.setData(data);
	 
	 	return listHistoricalSkillGroupReportResponse;
	}
}