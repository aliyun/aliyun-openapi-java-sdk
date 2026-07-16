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
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.Alarm.Dimension2;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.AlarmDimension;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.HybridMetric;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.HybridMetric.Dimension;
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.StepAdjustment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRulesResponseUnmarshaller {

	public static DescribeScalingRulesResponse unmarshall(DescribeScalingRulesResponse describeScalingRulesResponse, UnmarshallerContext _ctx) {
		
		describeScalingRulesResponse.setRequestId(_ctx.stringValue("DescribeScalingRulesResponse.RequestId"));
		describeScalingRulesResponse.setTotalCount(_ctx.integerValue("DescribeScalingRulesResponse.TotalCount"));
		describeScalingRulesResponse.setPageSize(_ctx.integerValue("DescribeScalingRulesResponse.PageSize"));
		describeScalingRulesResponse.setPageNumber(_ctx.integerValue("DescribeScalingRulesResponse.PageNumber"));

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setCooldown(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setPredictiveValueBehavior(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBehavior"));
			scalingRule.setMetricType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricType"));
			scalingRule.setScalingRuleAri(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleAri"));
			scalingRule.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricName"));
			scalingRule.setScalingRuleName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleName"));
			scalingRule.setScaleOutEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScaleOutEvaluationCount"));
			scalingRule.setInitialMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].InitialMaxSize"));
			scalingRule.setScalingRuleType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleType"));
			scalingRule.setEstimatedInstanceWarmup(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].EstimatedInstanceWarmup"));
			scalingRule.setPredictiveTaskBufferTime(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveTaskBufferTime"));
			scalingRule.setPredictiveValueBuffer(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBuffer"));
			scalingRule.setTargetValue(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].TargetValue"));
			scalingRule.setScalingGroupId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingGroupId"));
			scalingRule.setScalingRuleId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleId"));
			scalingRule.setMinAdjustmentMagnitude(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinAdjustmentMagnitude"));
			scalingRule.setDisableScaleIn(_ctx.booleanValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].DisableScaleIn"));
			scalingRule.setMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MaxSize"));
			scalingRule.setAdjustmentType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setMinSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinSize"));
			scalingRule.setAdjustmentValue(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setHybridMonitorNamespace(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMonitorNamespace"));
			scalingRule.setPredictiveScalingMode(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveScalingMode"));
			scalingRule.setScaleInEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScaleInEvaluationCount"));

			List<StepAdjustment> stepAdjustments = new ArrayList<StepAdjustment>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments.Length"); j++) {
				StepAdjustment stepAdjustment = new StepAdjustment();
				stepAdjustment.setMetricIntervalUpperBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalUpperBound"));
				stepAdjustment.setMetricIntervalLowerBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalLowerBound"));
				stepAdjustment.setScalingAdjustment(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].ScalingAdjustment"));

				stepAdjustments.add(stepAdjustment);
			}
			scalingRule.setStepAdjustments(stepAdjustments);

			List<HybridMetric> hybridMetrics = new ArrayList<HybridMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics.Length"); j++) {
				HybridMetric hybridMetric = new HybridMetric();
				hybridMetric.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].MetricName"));
				hybridMetric.setStatistic(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Statistic"));
				hybridMetric.setExpression(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Expression"));
				hybridMetric.setId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Id"));

				List<Dimension> dimensions = new ArrayList<Dimension>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions.Length"); k++) {
					Dimension dimension = new Dimension();
					dimension.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionValue"));
					dimension.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].HybridMetrics["+ j +"].Dimensions["+ k +"].DimensionKey"));

					dimensions.add(dimension);
				}
				hybridMetric.setDimensions(dimensions);

				hybridMetrics.add(hybridMetric);
			}
			scalingRule.setHybridMetrics(hybridMetrics);

			List<Alarm> alarms = new ArrayList<Alarm>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms.Length"); j++) {
				Alarm alarm = new Alarm();
				alarm.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricName"));
				alarm.setComparisonOperator(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].ComparisonOperator"));
				alarm.setMetricType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricType"));
				alarm.setEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].EvaluationCount"));
				alarm.setPeriod(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Period"));
				alarm.setAlarmTaskName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskName"));
				alarm.setAlarmTaskId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskId"));
				alarm.setStatistics(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Statistics"));
				alarm.setThreshold(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Threshold"));

				List<Dimension2> dimensions1 = new ArrayList<Dimension2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions.Length"); k++) {
					Dimension2 dimension2 = new Dimension2();
					dimension2.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionValue"));
					dimension2.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionKey"));

					dimensions1.add(dimension2);
				}
				alarm.setDimensions1(dimensions1);

				alarms.add(alarm);
			}
			scalingRule.setAlarms(alarms);

			List<AlarmDimension> alarmDimensions = new ArrayList<AlarmDimension>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions.Length"); j++) {
				AlarmDimension alarmDimension = new AlarmDimension();
				alarmDimension.setDimensionValue(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions["+ j +"].DimensionValue"));
				alarmDimension.setDimensionKey(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AlarmDimensions["+ j +"].DimensionKey"));

				alarmDimensions.add(alarmDimension);
			}
			scalingRule.setAlarmDimensions(alarmDimensions);

			scalingRules.add(scalingRule);
		}
		describeScalingRulesResponse.setScalingRules(scalingRules);
	 
	 	return describeScalingRulesResponse;
	}
}