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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetAlarmLogResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.GetAlarmLogResponse.AlarmLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlarmLogResponseUnmarshaller {

	public static GetAlarmLogResponse unmarshall(GetAlarmLogResponse getAlarmLogResponse, UnmarshallerContext _ctx) {
		
		getAlarmLogResponse.setRequestId(_ctx.stringValue("GetAlarmLogResponse.RequestId"));
		getAlarmLogResponse.setPageNumber(_ctx.integerValue("GetAlarmLogResponse.PageNumber"));
		getAlarmLogResponse.setPageSize(_ctx.integerValue("GetAlarmLogResponse.PageSize"));
		getAlarmLogResponse.setTotalCount(_ctx.integerValue("GetAlarmLogResponse.TotalCount"));

		List<AlarmLog> alarmLogList = new ArrayList<AlarmLog>();
		for (int i = 0; i < _ctx.lengthValue("GetAlarmLogResponse.AlarmLogList.Length"); i++) {
			AlarmLog alarmLog = new AlarmLog();
			alarmLog.setAlarmItemName(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].AlarmItemName"));
			alarmLog.setAlarmCondition(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].AlarmCondition"));
			alarmLog.setOccurrenceTime(_ctx.longValue("GetAlarmLogResponse.AlarmLogList["+ i +"].OccurrenceTime"));
			alarmLog.setAlarmContent(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].AlarmContent"));
			alarmLog.setAppVersion(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].AppVersion"));
			alarmLog.setAlarmItemType(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].AlarmItemType"));

			List<String> notifyTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlarmLogResponse.AlarmLogList["+ i +"].NotifyTypes.Length"); j++) {
				notifyTypes.add(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].NotifyTypes["+ j +"]"));
			}
			alarmLog.setNotifyTypes(notifyTypes);

			List<String> subscribers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlarmLogResponse.AlarmLogList["+ i +"].Subscribers.Length"); j++) {
				subscribers.add(_ctx.stringValue("GetAlarmLogResponse.AlarmLogList["+ i +"].Subscribers["+ j +"]"));
			}
			alarmLog.setSubscribers(subscribers);

			alarmLogList.add(alarmLog);
		}
		getAlarmLogResponse.setAlarmLogList(alarmLogList);
	 
	 	return getAlarmLogResponse;
	}
}