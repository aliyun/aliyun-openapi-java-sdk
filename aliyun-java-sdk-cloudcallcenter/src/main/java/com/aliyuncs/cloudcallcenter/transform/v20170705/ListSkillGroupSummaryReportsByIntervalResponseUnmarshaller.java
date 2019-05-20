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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data.SkillGroupReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data.SkillGroupReport.SkillGroupReportByInterval;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data.SkillGroupReport.SkillGroupReportByInterval.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data.SkillGroupReport.SkillGroupReportByInterval.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.Data.SkillGroupReport.SkillGroupReportByInterval.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsByIntervalResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsByIntervalResponse unmarshall(ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByIntervalResponse, UnmarshallerContext context) {
		
		listSkillGroupSummaryReportsByIntervalResponse.setRequestId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.RequestId"));
		listSkillGroupSummaryReportsByIntervalResponse.setSuccess(context.booleanValue("ListSkillGroupSummaryReportsByIntervalResponse.Success"));
		listSkillGroupSummaryReportsByIntervalResponse.setCode(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Code"));
		listSkillGroupSummaryReportsByIntervalResponse.setMessage(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Message"));
		listSkillGroupSummaryReportsByIntervalResponse.setHttpStatusCode(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.PageSize"));

		List<SkillGroupReport> list = new ArrayList<SkillGroupReport>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List.Length"); i++) {
			SkillGroupReport skillGroupReport = new SkillGroupReport();
			skillGroupReport.setObjectId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].ObjectId"));

			List<SkillGroupReportByInterval> intervalList = new ArrayList<SkillGroupReportByInterval>();
			for (int j = 0; j < context.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList.Length"); j++) {
				SkillGroupReportByInterval skillGroupReportByInterval = new SkillGroupReportByInterval();
				skillGroupReportByInterval.setRecordDate(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].RecordDate"));
				skillGroupReportByInterval.setInstanceId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				skillGroupReportByInterval.setSkillGroupId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].SkillGroupId"));
				skillGroupReportByInterval.setSkillGroupName(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].SkillGroupName"));

				Overall overall = new Overall();
				overall.setTotalCalls(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				overall.setTotalLoggedInTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setTotalBreakTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setOccupancyRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setTotalReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setMaxReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setAverageReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				overall.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				skillGroupReportByInterval.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setCallsOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setCallsHandled(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setHandleRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setTotalRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setMaxRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				inbound.setAverageRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setServiceLevel20(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				skillGroupReportByInterval.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setCallsDialed(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setMaxDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setAverageDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				outbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
				skillGroupReportByInterval.setOutbound(outbound);

				intervalList.add(skillGroupReportByInterval);
			}
			skillGroupReport.setIntervalList(intervalList);

			list.add(skillGroupReport);
		}
		data.setList(list);
		listSkillGroupSummaryReportsByIntervalResponse.setData(data);
	 
	 	return listSkillGroupSummaryReportsByIntervalResponse;
	}
}