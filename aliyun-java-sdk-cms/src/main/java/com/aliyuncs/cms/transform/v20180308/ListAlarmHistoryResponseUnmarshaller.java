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

import com.aliyuncs.cms.model.v20180308.ListAlarmHistoryResponse;
import com.aliyuncs.cms.model.v20180308.ListAlarmHistoryResponse.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmHistoryResponseUnmarshaller {

	public static ListAlarmHistoryResponse unmarshall(ListAlarmHistoryResponse listAlarmHistoryResponse, UnmarshallerContext context) {
		
		listAlarmHistoryResponse.setRequestId(context.stringValue("ListAlarmHistoryResponse.RequestId"));
		listAlarmHistoryResponse.setSuccess(context.booleanValue("ListAlarmHistoryResponse.Success"));
		listAlarmHistoryResponse.setCode(context.stringValue("ListAlarmHistoryResponse.Code"));
		listAlarmHistoryResponse.setMessage(context.stringValue("ListAlarmHistoryResponse.Message"));
		listAlarmHistoryResponse.setCursor(context.stringValue("ListAlarmHistoryResponse.Cursor"));

		List<AlarmHistory> alarmHistoryList = new ArrayList<AlarmHistory>();
		for (int i = 0; i < context.lengthValue("ListAlarmHistoryResponse.AlarmHistoryList.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setId(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Id"));
			alarmHistory.setName(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Name"));
			alarmHistory.setNamespace(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Namespace"));
			alarmHistory.setMetricName(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].MetricName"));
			alarmHistory.setDimension(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Dimension"));
			alarmHistory.setEvaluationCount(context.integerValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].EvaluationCount"));
			alarmHistory.setValue(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Value"));
			alarmHistory.setAlarmTime(context.longValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].AlarmTime"));
			alarmHistory.setLastTime(context.longValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].LastTime"));
			alarmHistory.setState(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].State"));
			alarmHistory.setStatus(context.integerValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].Status"));
			alarmHistory.setContactGroups(context.stringValue("ListAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactGroups"));

			alarmHistoryList.add(alarmHistory);
		}
		listAlarmHistoryResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return listAlarmHistoryResponse;
	}
}