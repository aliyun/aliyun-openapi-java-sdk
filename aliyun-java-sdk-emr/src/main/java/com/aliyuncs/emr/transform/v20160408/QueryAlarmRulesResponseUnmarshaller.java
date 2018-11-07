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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAlarmRulesResponseUnmarshaller {

	public static QueryAlarmRulesResponse unmarshall(QueryAlarmRulesResponse queryAlarmRulesResponse, UnmarshallerContext context) {
		
		queryAlarmRulesResponse.setRequestId(context.stringValue("QueryAlarmRulesResponse.RequestId"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("QueryAlarmRulesResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setName(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Name"));
			alarm.setMetricName(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].MetricName"));
			alarm.setPeriod(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Period"));
			alarm.setThreshold(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEvaluationCount(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setStartTime(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].StartTime"));
			alarm.setEndTime(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].EndTime"));
			alarm.setSilenceTime(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].SilenceTime"));
			alarm.setNotifyType(context.integerValue("QueryAlarmRulesResponse.AlarmList["+ i +"].NotifyType"));
			alarm.setEnable(context.booleanValue("QueryAlarmRulesResponse.AlarmList["+ i +"].Enable"));
			alarm.setState(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].State"));
			alarm.setComparisonOperator(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setContactGroups(context.stringValue("QueryAlarmRulesResponse.AlarmList["+ i +"].ContactGroups"));

			alarmList.add(alarm);
		}
		queryAlarmRulesResponse.setAlarmList(alarmList);
	 
	 	return queryAlarmRulesResponse;
	}
}