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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.Issue;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.Issue.RecommendedAction;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.Issue.RecommendedAction.Parameter;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.Item;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.Item.ItemData;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnosticReportsResponse.Report.RecentEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticReportsResponseUnmarshaller {

	public static DescribeDiagnosticReportsResponse unmarshall(DescribeDiagnosticReportsResponse describeDiagnosticReportsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticReportsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticReportsResponse.RequestId"));
		describeDiagnosticReportsResponse.setNextToken(_ctx.stringValue("DescribeDiagnosticReportsResponse.NextToken"));
		describeDiagnosticReportsResponse.setMaxResults(_ctx.integerValue("DescribeDiagnosticReportsResponse.MaxResults"));

		List<Report> reports = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports.Length"); i++) {
			Report report = new Report();
			report.setStatus(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Status"));
			report.setSeverity(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Severity"));
			report.setEndTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].EndTime"));
			report.setCreationTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].CreationTime"));
			report.setStartTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].StartTime"));
			report.setResourceType(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceType"));
			report.setFinishedTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].FinishedTime"));
			report.setReportId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ReportId"));
			report.setPePassword(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].PePassword"));
			report.setResourceId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceId"));
			report.setInvokeSystem(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].InvokeSystem"));
			report.setOfflineDiagReportStatus(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].OfflineDiagReportStatus"));
			report.setDiagnosticCategory(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].DiagnosticCategory"));
			report.setIssueCategoryId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].IssueCategoryId"));

			List<Issue> issues = new ArrayList<Issue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues.Length"); j++) {
				Issue issue = new Issue();
				issue.setSeverity(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Severity"));
				issue.setMessage(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Message"));
				issue.setOccurrenceTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].OccurrenceTime"));
				issue.setIssueCode(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].IssueCode"));
				issue.setIssueCategory(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].IssueCategory"));

				List<RecommendedAction> recommendedActions = new ArrayList<RecommendedAction>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions.Length"); k++) {
					RecommendedAction recommendedAction = new RecommendedAction();
					recommendedAction.setUrl(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Url"));
					recommendedAction.setActionCode(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].ActionCode"));

					List<Parameter> parameters = new ArrayList<Parameter>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters.Length"); l++) {
						Parameter parameter = new Parameter();
						parameter.setKey(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters["+ l +"].Key"));
						parameter.setValue(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters["+ l +"].Value"));

						parameters.add(parameter);
					}
					recommendedAction.setParameters(parameters);

					recommendedActions.add(recommendedAction);
				}
				issue.setRecommendedActions(recommendedActions);

				issues.add(issue);
			}
			report.setIssues(issues);

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setStatus(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].Status"));
				item.setSeverity(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].Severity"));
				item.setItemCategory(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemCategory"));
				item.setItemCode(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemCode"));
				item.setOccurrenceTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].OccurrenceTime"));

				List<ItemData> itemDatas = new ArrayList<ItemData>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas.Length"); k++) {
					ItemData itemData = new ItemData();
					itemData.setName(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas["+ k +"].Name"));
					itemData.setValue(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas["+ k +"].Value"));

					itemDatas.add(itemData);
				}
				item.setItemDatas(itemDatas);

				items.add(item);
			}
			report.setItems(items);

			List<RecentEvent> recentEvents = new ArrayList<RecentEvent>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents.Length"); j++) {
				RecentEvent recentEvent = new RecentEvent();
				recentEvent.setEventID(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].EventID"));
				recentEvent.setEventName(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].EventName"));
				recentEvent.setPublishTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].PublishTime"));

				recentEvents.add(recentEvent);
			}
			report.setRecentEvents(recentEvents);

			reports.add(report);
		}
		describeDiagnosticReportsResponse.setReports(reports);
	 
	 	return describeDiagnosticReportsResponse;
	}
}