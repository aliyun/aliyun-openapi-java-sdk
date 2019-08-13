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

import com.aliyuncs.emr.model.v20160408.QueryAlarmRulesResponse;
import com.aliyuncs.emr.model.v20160408.QueryAlarmRulesResponse.Alarm;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAlarmRulesResponseUnmarshaller {

	public static QueryAlarmRulesResponse unmarshall(QueryAlarmRulesResponse queryAlarmRulesResponse, UnmarshallerContext _ctx) {
		
		queryAlarmRulesResponse.setRequestId(_ctx.stringValue("QueryAlarmRulesResponse.RequestId"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("QueryAlarmRulesResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setName(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Name"));
			alarm.setMetricName(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].MetricName"));
			alarm.setPeriod(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Period"));
			alarm.setThreshold(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEvaluationCount(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setStartTime(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].StartTime"));
			alarm.setEndTime(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].EndTime"));
			alarm.setSilenceTime(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].SilenceTime"));
			alarm.setNotifyType(_ctx.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].NotifyType"));
			alarm.setEnable(_ctx.booleanValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Enable"));
			alarm.setState(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].State"));
			alarm.setComparisonOperator(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setContactGroups(_ctx.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].ContactGroups"));

			alarmList.add(alarm);
		}
		queryAlarmRulesResponse.setAlarmList(alarmList);
	 
	 	return queryAlarmRulesResponse;
	}
}