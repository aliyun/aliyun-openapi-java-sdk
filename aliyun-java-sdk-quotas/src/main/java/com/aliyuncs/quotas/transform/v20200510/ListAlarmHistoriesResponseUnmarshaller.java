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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.ListAlarmHistoriesResponse;
import com.aliyuncs.quotas.model.v20200510.ListAlarmHistoriesResponse.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmHistoriesResponseUnmarshaller {

	public static ListAlarmHistoriesResponse unmarshall(ListAlarmHistoriesResponse listAlarmHistoriesResponse, UnmarshallerContext _ctx) {
		
		listAlarmHistoriesResponse.setRequestId(_ctx.stringValue("ListAlarmHistoriesResponse.RequestId"));
		listAlarmHistoriesResponse.setTotalCount(_ctx.integerValue("ListAlarmHistoriesResponse.TotalCount"));
		listAlarmHistoriesResponse.setNextToken(_ctx.stringValue("ListAlarmHistoriesResponse.NextToken"));
		listAlarmHistoriesResponse.setMaxResults(_ctx.integerValue("ListAlarmHistoriesResponse.MaxResults"));

		List<AlarmHistory> alarmHistories = new ArrayList<AlarmHistory>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmHistoriesResponse.AlarmHistories.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setQuotaUsage(_ctx.floatValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].QuotaUsage"));
			alarmHistory.setThresholdPercent(_ctx.floatValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].ThresholdPercent"));
			alarmHistory.setCreateTime(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].CreateTime"));
			alarmHistory.setQuotaActionCode(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].QuotaActionCode"));
			alarmHistory.setAlarmName(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].AlarmName"));
			alarmHistory.setNotifyTarget(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].NotifyTarget"));
			alarmHistory.setThreshold(_ctx.floatValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].Threshold"));
			alarmHistory.setProductCode(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].ProductCode"));

			List<String> notifyChannels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].NotifyChannels.Length"); j++) {
				notifyChannels.add(_ctx.stringValue("ListAlarmHistoriesResponse.AlarmHistories["+ i +"].NotifyChannels["+ j +"]"));
			}
			alarmHistory.setNotifyChannels(notifyChannels);

			alarmHistories.add(alarmHistory);
		}
		listAlarmHistoriesResponse.setAlarmHistories(alarmHistories);
	 
	 	return listAlarmHistoriesResponse;
	}
}