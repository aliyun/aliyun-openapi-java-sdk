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

import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.Alarm;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.Alarm.Dimension;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.AlarmDimension;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.HybridMetric;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.HybridMetric.Dimension2;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.StepAdjustment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRulesResponseUnmarshaller {

	public static DescribeScalingRulesResponse unmarshall(DescribeScalingRulesResponse describeScalingRulesResponse, UnmarshallerContext _ctx) {
		
		describeScalingRulesResponse.setRequestId(_ctx.stringValue("DescribeScalingRulesResponse.RequestId"));
		describeScalingRulesResponse.setPageNumber(_ctx.integerValue("DescribeScalingRulesResponse.PageNumber"));
		describeScalingRulesResponse.setPageSize(_ctx.integerValue("DescribeScalingRulesResponse.PageSize"));
		describeScalingRulesResponse.setTotalCount(_ctx.integerValue("DescribeScalingRulesResponse.TotalCount"));

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricName"));
			scalingRule.setAdjustmentType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setInitialMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].InitialMaxSize"));
			scalingRule.setEstimatedInstanceWarmup(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].EstimatedInstanceWarmup"));
			scalingRule.setScaleOutEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScaleOutEvaluationCount"));
			scalingRule.setPredictiveScalingMode(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveScalingMode"));
			scalingRule.setMinAdjustmentMagnitude(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinAdjustmentMagnitude"));
			scalingRule.setScalingRuleAri(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleAri"));
			scalingRule.setPredictiveTaskBufferTime(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveTaskBufferTime"));
			scalingRule.setMinSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinSize"));
			scalingRule.setScalingGroupId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingGroupId"));
			scalingRule.setPredictiveValueBehavior(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBehavior"));
			scalingRule.setTargetValue(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].TargetValue"));
			scalingRule.setCooldown(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MaxSize"));
			scalingRule.setPredictiveValueBuffer(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBuffer"));
			scalingRule.setScalingRuleType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleType"));
			scalingRule.setAdjustmentValue(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setScaleInEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScaleInEvaluationCount"));
			scalingRule.setDisableScaleIn(_ctx.booleanValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].DisableScaleIn"));
			scalingRule.setScalingRuleName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleName"));
			scalingRule.setScalingRuleId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleId"));
			scalingRule.setMetricType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricType"));
			scalingRule.setHybridMonitorNamespace(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMonitorNamespace"));

			List<Alarm> alarms = new ArrayList<Alarm>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms.Length"); j++) {
				Alarm alarm = new Alarm();
				alarm.setAlarmTaskId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskId"));
				alarm.setComparisonOperator(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].ComparisonOperator"));
				alarm.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricName"));
				alarm.setEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].EvaluationCount"));
				alarm.setAlarmTaskName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskName"));
				alarm.setMetricType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricType"));
				alarm.setThreshold(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Threshold"));
				alarm.setStatistics(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Statistics"));

				List<Dimension> dimensions = new ArrayList<Dimension>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions.Length"); k++) {
					Dimension dimension = new Dimension();
					dimension.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionKey"));
					dimension.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionValue"));

					dimensions.add(dimension);
				}
				alarm.setDimensions(dimensions);

				alarms.add(alarm);
			}
			scalingRule.setAlarms(alarms);

			List<StepAdjustment> stepAdjustments = new ArrayList<StepAdjustment>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments.Length"); j++) {
				StepAdjustment stepAdjustment = new StepAdjustment();
				stepAdjustment.setMetricIntervalUpperBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalUpperBound"));
				stepAdjustment.setScalingAdjustment(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].ScalingAdjustment"));
				stepAdjustment.setMetricIntervalLowerBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalLowerBound"));

				stepAdjustments.add(stepAdjustment);
			}
			scalingRule.setStepAdjustments(stepAdjustments);

			List<AlarmDimension> alarmDimensions = new ArrayList<AlarmDimension>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions.Length"); j++) {
				AlarmDimension alarmDimension = new AlarmDimension();
				alarmDimension.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions["+ j +"].DimensionKey"));
				alarmDimension.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions["+ j +"].DimensionValue"));

				alarmDimensions.add(alarmDimension);
			}
			scalingRule.setAlarmDimensions(alarmDimensions);

			List<HybridMetric> hybridMetrics = new ArrayList<HybridMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics.Length"); j++) {
				HybridMetric hybridMetric = new HybridMetric();
				hybridMetric.setId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Id"));
				hybridMetric.setExpression(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Expression"));
				hybridMetric.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].MetricName"));
				hybridMetric.setStatistic(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Statistic"));

				List<Dimension2> dimensions1 = new ArrayList<Dimension2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions.Length"); k++) {
					Dimension2 dimension2 = new Dimension2();
					dimension2.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionKey"));
					dimension2.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionValue"));

					dimensions1.add(dimension2);
				}
				hybridMetric.setDimensions1(dimensions1);

				hybridMetrics.add(hybridMetric);
			}
			scalingRule.setHybridMetrics(hybridMetrics);

			scalingRules.add(scalingRule);
		}
		describeScalingRulesResponse.setScalingRules(scalingRules);
	 
	 	return describeScalingRulesResponse;
	}
}