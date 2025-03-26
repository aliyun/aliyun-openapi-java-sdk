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
import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse.Alarm.Expression;
import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse.Alarm.HybridMetric;
import com.aliyuncs.ess.model.v20140828.DescribeAlarmsResponse.Alarm.HybridMetric.Dimension2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmsResponseUnmarshaller {

	public static DescribeAlarmsResponse unmarshall(DescribeAlarmsResponse describeAlarmsResponse, UnmarshallerContext _ctx) {
		
		describeAlarmsResponse.setRequestId(_ctx.stringValue("DescribeAlarmsResponse.RequestId"));
		describeAlarmsResponse.setPageSize(_ctx.integerValue("DescribeAlarmsResponse.PageSize"));
		describeAlarmsResponse.setPageNumber(_ctx.integerValue("DescribeAlarmsResponse.PageNumber"));
		describeAlarmsResponse.setTotalCount(_ctx.integerValue("DescribeAlarmsResponse.TotalCount"));

		List<Alarm> alarmList = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setAlarmTaskId(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].AlarmTaskId"));
			alarm.setMetricName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricName"));
			alarm.setEvaluationCount(_ctx.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].EvaluationCount"));
			alarm.setState(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].State"));
			alarm.setPeriod(_ctx.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].Period"));
			alarm.setScalingGroupId(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ScalingGroupId"));
			alarm.setComparisonOperator(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ComparisonOperator"));
			alarm.setEffective(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Effective"));
			alarm.setDescription(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Description"));
			alarm.setMetricType(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].MetricType"));
			alarm.setName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Name"));
			alarm.setThreshold(_ctx.floatValue("DescribeAlarmsResponse.AlarmList["+ i +"].Threshold"));
			alarm.setEnable(_ctx.booleanValue("DescribeAlarmsResponse.AlarmList["+ i +"].Enable"));
			alarm.setStatistics(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Statistics"));
			alarm.setExpressionsLogicOperator(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].ExpressionsLogicOperator"));
			alarm.setHybridMonitorNamespace(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMonitorNamespace"));
			alarm.setPromQL(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].PromQL"));

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

			List<Expression> expressions = new ArrayList<Expression>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions.Length"); j++) {
				Expression expression = new Expression();
				expression.setMetricName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions["+ j +"].MetricName"));
				expression.setComparisonOperator(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions["+ j +"].ComparisonOperator"));
				expression.setPeriod(_ctx.integerValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions["+ j +"].Period"));
				expression.setStatistics(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions["+ j +"].Statistics"));
				expression.setThreshold(_ctx.floatValue("DescribeAlarmsResponse.AlarmList["+ i +"].Expressions["+ j +"].Threshold"));

				expressions.add(expression);
			}
			alarm.setExpressions(expressions);

			List<HybridMetric> hybridMetrics = new ArrayList<HybridMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics.Length"); j++) {
				HybridMetric hybridMetric = new HybridMetric();
				hybridMetric.setId(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Id"));
				hybridMetric.setExpression(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Expression"));
				hybridMetric.setMetricName(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].MetricName"));
				hybridMetric.setStatistic(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Statistic"));

				List<Dimension2> dimensions1 = new ArrayList<Dimension2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Dimensions.Length"); k++) {
					Dimension2 dimension2 = new Dimension2();
					dimension2.setDimensionKey(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionKey"));
					dimension2.setDimensionValue(_ctx.stringValue("DescribeAlarmsResponse.AlarmList["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionValue"));

					dimensions1.add(dimension2);
				}
				hybridMetric.setDimensions1(dimensions1);

				hybridMetrics.add(hybridMetric);
			}
			alarm.setHybridMetrics(hybridMetrics);

			alarmList.add(alarm);
		}
		describeAlarmsResponse.setAlarmList(alarmList);
	 
	 	return describeAlarmsResponse;
	}
}