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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeAlertHistoryListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertHistoryListResponse.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertHistoryListResponseUnmarshaller {

	public static DescribeAlertHistoryListResponse unmarshall(DescribeAlertHistoryListResponse describeAlertHistoryListResponse, UnmarshallerContext context) {
		
		describeAlertHistoryListResponse.setRequestId(context.stringValue("DescribeAlertHistoryListResponse.RequestId"));
		describeAlertHistoryListResponse.setSuccess(context.booleanValue("DescribeAlertHistoryListResponse.Success"));
		describeAlertHistoryListResponse.setCode(context.stringValue("DescribeAlertHistoryListResponse.Code"));
		describeAlertHistoryListResponse.setMessage(context.stringValue("DescribeAlertHistoryListResponse.Message"));
		describeAlertHistoryListResponse.setTotal(context.stringValue("DescribeAlertHistoryListResponse.Total"));

		List<AlarmHistory> alarmHistoryList = new ArrayList<AlarmHistory>();
		for (int i = 0; i < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setRuleId(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].RuleId"));
			alarmHistory.setAlertName(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].AlertName"));
			alarmHistory.setGroupId(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].GroupId"));
			alarmHistory.setNamespace(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Namespace"));
			alarmHistory.setMetricName(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].MetricName"));
			alarmHistory.setDimensions(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Dimensions"));
			alarmHistory.setExpression(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Expression"));
			alarmHistory.setEvaluationCount(context.integerValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].EvaluationCount"));
			alarmHistory.setValue(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Value"));
			alarmHistory.setAlertTime(context.longValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].AlertTime"));
			alarmHistory.setLastTime(context.longValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].LastTime"));
			alarmHistory.setLevel(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Level"));
			alarmHistory.setRuleName(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].RuleName"));
			alarmHistory.setAlertState(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].AlertState"));
			alarmHistory.setStatus(context.integerValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Status"));
			alarmHistory.setWebhooks(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Webhooks"));
			alarmHistory.setInstanceName(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].InstanceName"));

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarmHistory.setContactGroups(contactGroups);

			List<String> contacts = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Contacts.Length"); j++) {
				contacts.add(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Contacts["+ j +"]"));
			}
			alarmHistory.setContacts(contacts);

			List<String> contactALIIMs = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactALIIMs.Length"); j++) {
				contactALIIMs.add(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactALIIMs["+ j +"]"));
			}
			alarmHistory.setContactALIIMs(contactALIIMs);

			List<String> contactSmses = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactSmses.Length"); j++) {
				contactSmses.add(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactSmses["+ j +"]"));
			}
			alarmHistory.setContactSmses(contactSmses);

			List<String> contactMails = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactMails.Length"); j++) {
				contactMails.add(context.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactMails["+ j +"]"));
			}
			alarmHistory.setContactMails(contactMails);

			alarmHistoryList.add(alarmHistory);
		}
		describeAlertHistoryListResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return describeAlertHistoryListResponse;
	}
}