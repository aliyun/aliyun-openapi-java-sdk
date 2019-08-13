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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.QueryAlarmHistoryResponse;
import com.aliyuncs.emr.model.v20160408.QueryAlarmHistoryResponse.EmrAlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAlarmHistoryResponseUnmarshaller {

	public static QueryAlarmHistoryResponse unmarshall(QueryAlarmHistoryResponse queryAlarmHistoryResponse, UnmarshallerContext _ctx) {
		
		queryAlarmHistoryResponse.setRequestId(_ctx.stringValue("QueryAlarmHistoryResponse.RequestId"));
		queryAlarmHistoryResponse.setTotal(_ctx.stringValue("QueryAlarmHistoryResponse.Total"));
		queryAlarmHistoryResponse.setCursor(_ctx.stringValue("QueryAlarmHistoryResponse.Cursor"));

		List<EmrAlarmHistory> alarmHistoryList = new ArrayList<EmrAlarmHistory>();
		for (int i = 0; i < _ctx.lengthValue("QueryAlarmHistoryResponse.AlarmHistoryList.Length"); i++) {
			EmrAlarmHistory emrAlarmHistory = new EmrAlarmHistory();
			emrAlarmHistory.setClusterId(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].ClusterId"));
			emrAlarmHistory.setRole(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].Role"));
			emrAlarmHistory.setInstanceId(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].InstanceId"));
			emrAlarmHistory.setName(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].Name"));
			emrAlarmHistory.setMetricName(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].MetricName"));
			emrAlarmHistory.setAlarmTime(_ctx.longValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].AlarmTime"));
			emrAlarmHistory.setLastTime(_ctx.longValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].LastTime"));
			emrAlarmHistory.setState(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].State"));
			emrAlarmHistory.setStatus(_ctx.integerValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].Status"));
			emrAlarmHistory.setContactGroups(_ctx.stringValue("QueryAlarmHistoryResponse.AlarmHistoryList["+ i +"].ContactGroups"));

			alarmHistoryList.add(emrAlarmHistory);
		}
		queryAlarmHistoryResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return queryAlarmHistoryResponse;
	}
}