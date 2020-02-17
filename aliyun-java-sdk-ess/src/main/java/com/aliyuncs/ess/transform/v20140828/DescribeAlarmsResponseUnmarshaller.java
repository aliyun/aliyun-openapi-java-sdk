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
import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse.Alarm.Dimension;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext _ctx) {
		
		describeAlarmsResponse.setRequestId(_ctx.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setTotalCount(_ctx.integerValue("DescribeAlarmsResponse.TotalCount"));
		describeAlarmsResponse.setPageNumber(_ctx.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setPageSize(_ctx.integerValue("DescribeAlarmsResponse.PageSize"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setAlarmTaskId(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].AlarmTaskId"));
			alarm.setName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Name"));
			alarm.setDescription(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Description"));
			alarm.setMetricType(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricType"));
			alarm.setMetricName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricName"));
			alarm.setPeriod(_ctx.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].Period"));
			alarm.setStatistics(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Statistics"));
			alarm.setComparisonOperator(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setThreshold(_ctx.floatValue("DescribeAlarmsResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEvaluationCount(_ctx.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setState(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].State"));
			alarm.setScalingGroupId(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ScalingGroupId"));
			alarm.setEnable(_ctx.booleanValue("DescribeAlarmsResponse.AlarmList["+ i +"].Enable"));

			List<String> alarmActions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].AlarmActions.Length"); j++) {
				alarmActions.add(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].AlarmActions["+ j +"]"));
			}
			alarm.setAlarmActions(alarmActions);

			List<Dimension> dimensions = new ArrayList<Dimension>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].Dimensions.Length"); j++) {
				Dimension dimension = new Dimension();
				dimension.setDimensionKey(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Dimensions["+ j +"].DimensionKey"));
				dimension.setDimensionValue(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Dimensions["+ j +"].DimensionValue"));

				dimensions.add(dimension);
			}
			alarm.setDimensions(dimensions);

			alarmList.add(alarm);
		}
		describeAlarmsResponse.setAlarmList(alarmList);
	 
	 	return describeAlarmsResponse;
	}
}