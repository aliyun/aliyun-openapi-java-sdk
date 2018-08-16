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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse.Alarm;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext context) {
		
		describeAlarmsResponse.setRequestId(context.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setTotalCount(context.integerValue("DescribeAlarmsResponse.TotalCount"));
		describeAlarmsResponse.setPageNumber(context.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setPageSize(context.integerValue("DescribeAlarmsResponse.PageSize"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmsResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setAlarmTaskId(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].AlarmTaskId"));
			alarm.setName(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Name"));
			alarm.setDescription(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Description"));
			alarm.setMetricType(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricType"));
			alarm.setMetricName(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricName"));
			alarm.setDimensions(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Dimensions"));
			alarm.setPeriod(context.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].Period"));
			alarm.setStatistics(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Statistics"));
			alarm.setComparisonOperator(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setThreshold(context.floatValue("DescribeAlarmsResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEvaluationCount(context.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setState(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].State"));
			alarm.setScalingGroupId(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ScalingGroupId"));
			alarm.setEnable(context.booleanValue("DescribeAlarmsResponse.AlarmList["+ i +"].Enable"));

			List<String> alarmActions = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].alarmActions.Length"); j++) {
				alarmActions.add(context.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].alarmActions["+ j +"]"));
			}
			alarm.setAlarmActions(alarmActions);

			alarmList.add(alarm);
		}
		describeAlarmsResponse.setAlarmList(alarmList);
	 
	 	return describeAlarmsResponse;
	}
}