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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.DescribeAlarmHistoryResponse;
import com.aliyuncs.cms.model.v20180308.DescribeAlarmHistoryResponse.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmHistoryResponseUnmarshaller {

	public static DescribeAlarmHistoryResponse unmarshall(DescribeAlarmHistoryResponse describeAlarmHistoryResponse, UnmarshallerContext context) {
		
		describeAlarmHistoryResponse.setRequestId(context.stringValue("DescribeAlarmHistoryResponse.RequestId"));
		describeAlarmHistoryResponse.setSuccess(context.booleanValue("DescribeAlarmHistoryResponse.Success"));
		describeAlarmHistoryResponse.setCode(context.stringValue("DescribeAlarmHistoryResponse.Code"));
		describeAlarmHistoryResponse.setMessage(context.stringValue("DescribeAlarmHistoryResponse.Message"));
		describeAlarmHistoryResponse.setTotal(context.stringValue("DescribeAlarmHistoryResponse.Total"));

		List<AlarmHistory> alarmHistoryList = new ArrayList<AlarmHistory>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setId(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Id"));
			alarmHistory.setAlertName(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].AlertName"));
			alarmHistory.setGroupId(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].GroupId"));
			alarmHistory.setNamespace(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Namespace"));
			alarmHistory.setMetricName(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].MetricName"));
			alarmHistory.setDimensions(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Dimensions"));
			alarmHistory.setExpression(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Expression"));
			alarmHistory.setEvaluationCount(context.integerValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].EvaluationCount"));
			alarmHistory.setValue(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Value"));
			alarmHistory.setAlertTime(context.longValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].AlertTime"));
			alarmHistory.setLastTime(context.longValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].LastTime"));
			alarmHistory.setLevel(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Level"));
			alarmHistory.setPreLevel(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].PreLevel"));
			alarmHistory.setRuleName(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].RuleName"));
			alarmHistory.setState(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].State"));
			alarmHistory.setStatus(context.integerValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Status"));
			alarmHistory.setUserId(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].UserId"));
			alarmHistory.setWebhooks(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Webhooks"));
			alarmHistory.setInstanceName(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].InstanceName"));

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarmHistory.setContactGroups(contactGroups);

			List<String> contacts = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Contacts.Length"); j++) {
				contacts.add(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].Contacts["+ j +"]"));
			}
			alarmHistory.setContacts(contacts);

			List<String> contactALIIMs = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactALIIMs.Length"); j++) {
				contactALIIMs.add(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactALIIMs["+ j +"]"));
			}
			alarmHistory.setContactALIIMs(contactALIIMs);

			List<String> contactSmses = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactSmses.Length"); j++) {
				contactSmses.add(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactSmses["+ j +"]"));
			}
			alarmHistory.setContactSmses(contactSmses);

			List<String> contactMails = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactMails.Length"); j++) {
				contactMails.add(context.stringValue("DescribeAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactMails["+ j +"]"));
			}
			alarmHistory.setContactMails(contactMails);

			alarmHistoryList.add(alarmHistory);
		}
		describeAlarmHistoryResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return describeAlarmHistoryResponse;
	}
}