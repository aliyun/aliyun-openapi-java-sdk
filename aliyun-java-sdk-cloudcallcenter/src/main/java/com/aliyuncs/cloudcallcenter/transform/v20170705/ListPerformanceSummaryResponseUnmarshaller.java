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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPerformanceSummaryResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPerformanceSummaryResponse.Report;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPerformanceSummaryResponse.Report.OverallRealTime;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPerformanceSummaryResponse.Report.PerformanceSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPerformanceSummaryResponseUnmarshaller {

	public static ListPerformanceSummaryResponse unmarshall(ListPerformanceSummaryResponse listPerformanceSummaryResponse, UnmarshallerContext context) {
		
		listPerformanceSummaryResponse.setRequestId(context.stringValue("ListPerformanceSummaryResponse.RequestId"));
		listPerformanceSummaryResponse.setSuccess(context.booleanValue("ListPerformanceSummaryResponse.Success"));
		listPerformanceSummaryResponse.setCode(context.stringValue("ListPerformanceSummaryResponse.Code"));
		listPerformanceSummaryResponse.setMessage(context.stringValue("ListPerformanceSummaryResponse.Message"));
		listPerformanceSummaryResponse.setHttpStatusCode(context.integerValue("ListPerformanceSummaryResponse.HttpStatusCode"));

		Report report = new Report();
		report.setInstance(context.stringValue("ListPerformanceSummaryResponse.Report.Instance"));
		report.setPhoneNumber(context.stringValue("ListPerformanceSummaryResponse.Report.PhoneNumber"));

		OverallRealTime overallRealTime = new OverallRealTime();
		overallRealTime.setSkillGroup(context.stringValue("ListPerformanceSummaryResponse.Report.OverallRealTime.SkillGroup"));
		overallRealTime.setTotalCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.TotalCalls"));
		overallRealTime.setTotalInboundCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.TotalInboundCalls"));
		overallRealTime.setActiveCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.ActiveCalls"));
		overallRealTime.setTotalUsersInQueue(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.TotalUsersInQueue"));
		overallRealTime.setTotalAbandonedCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.TotalAbandonedCalls"));
		overallRealTime.setTotalOnlineAgents(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.TotalOnlineAgents"));
		overallRealTime.setAgentUtilizationPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.OverallRealTime.AgentUtilizationPercentage"));
		overallRealTime.setSatisfactionPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.OverallRealTime.SatisfactionPercentage"));
		overallRealTime.setAverageSpeedOfAnswer(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.AverageSpeedOfAnswer"));
		overallRealTime.setAverageTalkTime(context.integerValue("ListPerformanceSummaryResponse.Report.OverallRealTime.AverageTalkTime"));
		overallRealTime.setTimestamp(context.stringValue("ListPerformanceSummaryResponse.Report.OverallRealTime.Timestamp"));
		report.setOverallRealTime(overallRealTime);

		List<PerformanceSummary> overallHistory = new ArrayList<PerformanceSummary>();
		for (int i = 0; i < context.lengthValue("ListPerformanceSummaryResponse.Report.OverallHistory.Length"); i++) {
			PerformanceSummary performanceSummary = new PerformanceSummary();
			performanceSummary.setSkillGroup(context.stringValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].SkillGroup"));
			performanceSummary.setTotalCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].TotalCalls"));
			performanceSummary.setTotalInboundCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].TotalInboundCalls"));
			performanceSummary.setActiveCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].ActiveCalls"));
			performanceSummary.setTotalUsersInQueue(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].TotalUsersInQueue"));
			performanceSummary.setTotalAbandonedCalls(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].TotalAbandonedCalls"));
			performanceSummary.setTotalOnlineAgents(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].TotalOnlineAgents"));
			performanceSummary.setAgentUtilizationPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].AgentUtilizationPercentage"));
			performanceSummary.setSatisfactionPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].SatisfactionPercentage"));
			performanceSummary.setAverageSpeedOfAnswer(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].AverageSpeedOfAnswer"));
			performanceSummary.setAverageTalkTime(context.integerValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].AverageTalkTime"));
			performanceSummary.setTimestamp(context.stringValue("ListPerformanceSummaryResponse.Report.OverallHistory["+ i +"].Timestamp"));

			overallHistory.add(performanceSummary);
		}
		report.setOverallHistory(overallHistory);

		List<PerformanceSummary> skillGroupsRealTime = new ArrayList<PerformanceSummary>();
		for (int i = 0; i < context.lengthValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime.Length"); i++) {
			PerformanceSummary performanceSummary = new PerformanceSummary();
			performanceSummary.setSkillGroup(context.stringValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].SkillGroup"));
			performanceSummary.setTotalCalls(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].TotalCalls"));
			performanceSummary.setTotalInboundCalls(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].TotalInboundCalls"));
			performanceSummary.setActiveCalls(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].ActiveCalls"));
			performanceSummary.setTotalUsersInQueue(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].TotalUsersInQueue"));
			performanceSummary.setTotalAbandonedCalls(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].TotalAbandonedCalls"));
			performanceSummary.setTotalOnlineAgents(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].TotalOnlineAgents"));
			performanceSummary.setAgentUtilizationPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].AgentUtilizationPercentage"));
			performanceSummary.setSatisfactionPercentage(context.floatValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].SatisfactionPercentage"));
			performanceSummary.setAverageSpeedOfAnswer(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].AverageSpeedOfAnswer"));
			performanceSummary.setAverageTalkTime(context.integerValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].AverageTalkTime"));
			performanceSummary.setTimestamp(context.stringValue("ListPerformanceSummaryResponse.Report.SkillGroupsRealTime["+ i +"].Timestamp"));

			skillGroupsRealTime.add(performanceSummary);
		}
		report.setSkillGroupsRealTime(skillGroupsRealTime);
		listPerformanceSummaryResponse.setReport(report);
	 
	 	return listPerformanceSummaryResponse;
	}
}