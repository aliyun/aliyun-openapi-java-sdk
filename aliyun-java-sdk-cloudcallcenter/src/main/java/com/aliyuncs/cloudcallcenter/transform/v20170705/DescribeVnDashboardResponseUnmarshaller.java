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

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnDashboardResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnDashboardResponse.Report;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnDashboardResponseUnmarshaller {

	public static DescribeVnDashboardResponse unmarshall(DescribeVnDashboardResponse describeVnDashboardResponse, UnmarshallerContext context) {
		
		describeVnDashboardResponse.setRequestId(context.stringValue("DescribeVnDashboardResponse.RequestId"));
		describeVnDashboardResponse.setAvailableConcurrencyCount(context.longValue("DescribeVnDashboardResponse.AvailableConcurrencyCount"));
		describeVnDashboardResponse.setTotalConcurrencyCount(context.longValue("DescribeVnDashboardResponse.TotalConcurrencyCount"));
		describeVnDashboardResponse.setOccupiedConcurrencyCount(context.longValue("DescribeVnDashboardResponse.OccupiedConcurrencyCount"));
		describeVnDashboardResponse.setTotalSolvedQuestionCount(context.longValue("DescribeVnDashboardResponse.TotalSolvedQuestionCount"));
		describeVnDashboardResponse.setMaxConcurrencyCount(context.longValue("DescribeVnDashboardResponse.MaxConcurrencyCount"));
		describeVnDashboardResponse.setTotalConversationCount(context.longValue("DescribeVnDashboardResponse.TotalConversationCount"));
		describeVnDashboardResponse.setSolvedQuestionRate(context.stringValue("DescribeVnDashboardResponse.SolvedQuestionRate"));
		describeVnDashboardResponse.setInterval(context.integerValue("DescribeVnDashboardResponse.Interval"));

		List<Report> reports = new ArrayList<Report>();
		for (int i = 0; i < context.lengthValue("DescribeVnDashboardResponse.Reports.Length"); i++) {
			Report report = new Report();
			report.setReportDate(context.longValue("DescribeVnDashboardResponse.Reports["+ i +"].ReportDate"));
			report.setSolvedQuestionCount(context.longValue("DescribeVnDashboardResponse.Reports["+ i +"].SolvedQuestionCount"));
			report.setConversationCount(context.longValue("DescribeVnDashboardResponse.Reports["+ i +"].ConversationCount"));

			reports.add(report);
		}
		describeVnDashboardResponse.setReports(reports);
	 
	 	return describeVnDashboardResponse;
	}
}