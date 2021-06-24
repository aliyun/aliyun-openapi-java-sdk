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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.Issue;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.Issue.RecommendedAction;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.Issue.RecommendedAction.Parameter;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.Item;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.Item.ItemData;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticReportsResponse.Report.RecentEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnosticReportsResponseUnmarshaller {

	public static OpsDescribeDiagnosticReportsResponse unmarshall(OpsDescribeDiagnosticReportsResponse opsDescribeDiagnosticReportsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnosticReportsResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.RequestId"));
		opsDescribeDiagnosticReportsResponse.setNextToken(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.NextToken"));
		opsDescribeDiagnosticReportsResponse.setMaxResults(_ctx.integerValue("OpsDescribeDiagnosticReportsResponse.MaxResults"));

		List<Report> reports = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports.Length"); i++) {
			Report report = new Report();
			report.setStatus(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Status"));
			report.setSeverity(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Severity"));
			report.setCreationTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].CreationTime"));
			report.setReportId(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].ReportId"));
			report.setEndTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].EndTime"));
			report.setStartTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].StartTime"));
			report.setResourceType(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceType"));
			report.setFinishedTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].FinishedTime"));
			report.setResourceId(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceId"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setStatus(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].Status"));
				item.setSeverity(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].Severity"));
				item.setItemCategory(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemCategory"));
				item.setItemCode(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemCode"));
				item.setOccurrenceTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].OccurrenceTime"));
				item.setOccurrenceStartTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].OccurrenceStartTime"));
				item.setOccurrenceCounts(_ctx.longValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].OccurrenceCounts"));
				item.setReason(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].Reason"));

				List<ItemData> itemDatas = new ArrayList<ItemData>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas.Length"); k++) {
					ItemData itemData = new ItemData();
					itemData.setValue(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas["+ k +"].Value"));
					itemData.setName(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Items["+ j +"].ItemDatas["+ k +"].Name"));

					itemDatas.add(itemData);
				}
				item.setItemDatas(itemDatas);

				items.add(item);
			}
			report.setItems(items);

			List<Issue> issues = new ArrayList<Issue>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues.Length"); j++) {
				Issue issue = new Issue();
				issue.setSeverity(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Severity"));
				issue.setIssueCode(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].IssueCode"));
				issue.setMessage(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Message"));
				issue.setOccurrenceTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].OccurrenceTime"));
				issue.setOccurrenceStartTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].OccurrenceStartTime"));
				issue.setOccurrenceCounts(_ctx.longValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].OccurrenceCounts"));
				issue.setReason(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Reason"));
				issue.setIssueCategory(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].IssueCategory"));

				List<RecommendedAction> recommendedActions = new ArrayList<RecommendedAction>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions.Length"); k++) {
					RecommendedAction recommendedAction = new RecommendedAction();
					recommendedAction.setActionCode(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].ActionCode"));
					recommendedAction.setUrl(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Url"));

					List<Parameter> parameters = new ArrayList<Parameter>();
					for (int l = 0; l < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters.Length"); l++) {
						Parameter parameter = new Parameter();
						parameter.setKey(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters["+ l +"].Key"));
						parameter.setValue(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].RecommendedActions["+ k +"].Parameters["+ l +"].Value"));

						parameters.add(parameter);
					}
					recommendedAction.setParameters(parameters);

					recommendedActions.add(recommendedAction);
				}
				issue.setRecommendedActions(recommendedActions);

				issues.add(issue);
			}
			report.setIssues(issues);

			List<RecentEvent> recentEvents = new ArrayList<RecentEvent>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents.Length"); j++) {
				RecentEvent recentEvent = new RecentEvent();
				recentEvent.setEventID(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].EventID"));
				recentEvent.setEventName(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].EventName"));
				recentEvent.setPublishTime(_ctx.stringValue("OpsDescribeDiagnosticReportsResponse.Reports["+ i +"].RecentEvents["+ j +"].PublishTime"));

				recentEvents.add(recentEvent);
			}
			report.setRecentEvents(recentEvents);

			reports.add(report);
		}
		opsDescribeDiagnosticReportsResponse.setReports(reports);
	 
	 	return opsDescribeDiagnosticReportsResponse;
	}
}