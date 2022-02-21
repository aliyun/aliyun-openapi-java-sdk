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

	public static DescribeAlertHistoryListResponse unmarshall(DescribeAlertHistoryListResponse describeAlertHistoryListResponse, UnmarshallerContext _ctx) {
		
		describeAlertHistoryListResponse.setRequestId(_ctx.stringValue("DescribeAlertHistoryListResponse.RequestId"));
		describeAlertHistoryListResponse.setCode(_ctx.stringValue("DescribeAlertHistoryListResponse.Code"));
		describeAlertHistoryListResponse.setMessage(_ctx.stringValue("DescribeAlertHistoryListResponse.Message"));
		describeAlertHistoryListResponse.setTotal(_ctx.stringValue("DescribeAlertHistoryListResponse.Total"));
		describeAlertHistoryListResponse.setSuccess(_ctx.booleanValue("DescribeAlertHistoryListResponse.Success"));

		List<AlarmHistory> alarmHistoryList = new ArrayList<AlarmHistory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setStatus(_ctx.integerValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Status"));
			alarmHistory.setMetricName(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].MetricName"));
			alarmHistory.setEvaluationCount(_ctx.integerValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].EvaluationCount"));
			alarmHistory.setState(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].State"));
			alarmHistory.setPreLevel(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].PreLevel"));
			alarmHistory.setNamespace(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Namespace"));
			alarmHistory.setWebhooks(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Webhooks"));
			alarmHistory.setRuleName(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].RuleName"));
			alarmHistory.setRuleId(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].RuleId"));
			alarmHistory.setLastTime(_ctx.longValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].LastTime"));
			alarmHistory.setValue(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Value"));
			alarmHistory.setExpression(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Expression"));
			alarmHistory.setGroupId(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].GroupId"));
			alarmHistory.setAlertTime(_ctx.longValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].AlertTime"));
			alarmHistory.setInstanceName(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].InstanceName"));
			alarmHistory.setDimensions(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Dimensions"));
			alarmHistory.setLevel(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Level"));

			List<String> contacts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Contacts.Length"); j++) {
				contacts.add(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].Contacts["+ j +"]"));
			}
			alarmHistory.setContacts(contacts);

			List<String> contactALIIMs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactALIIMs.Length"); j++) {
				contactALIIMs.add(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactALIIMs["+ j +"]"));
			}
			alarmHistory.setContactALIIMs(contactALIIMs);

			List<String> contactMails = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactMails.Length"); j++) {
				contactMails.add(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactMails["+ j +"]"));
			}
			alarmHistory.setContactMails(contactMails);

			List<String> contactSmses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactSmses.Length"); j++) {
				contactSmses.add(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactSmses["+ j +"]"));
			}
			alarmHistory.setContactSmses(contactSmses);

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(_ctx.stringValue("DescribeAlertHistoryListResponse.AlarmHistoryList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarmHistory.setContactGroups(contactGroups);

			alarmHistoryList.add(alarmHistory);
		}
		describeAlertHistoryListResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return describeAlertHistoryListResponse;
	}
}