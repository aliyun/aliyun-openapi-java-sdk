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
import com.aliyuncs.ess.model.v20140828.DescribeScalingRulesResponse.ScalingRule.StepAdjustment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRulesResponseUnmarshaller {

	public static DescribeScalingRulesResponse unmarshall(DescribeScalingRulesResponse describeScalingRulesResponse, UnmarshallerContext _ctx) {
		
		describeScalingRulesResponse.setRequestId(_ctx.stringValue("DescribeScalingRulesResponse.RequestId"));
		describeScalingRulesResponse.setTotalCount(_ctx.integerValue("DescribeScalingRulesResponse.TotalCount"));
		describeScalingRulesResponse.setPageNumber(_ctx.integerValue("DescribeScalingRulesResponse.PageNumber"));
		describeScalingRulesResponse.setPageSize(_ctx.integerValue("DescribeScalingRulesResponse.PageSize"));

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setScalingRuleId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleId"));
			scalingRule.setScalingGroupId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingGroupId"));
			scalingRule.setScalingRuleName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleName"));
			scalingRule.setCooldown(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setMinAdjustmentMagnitude(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinAdjustmentMagnitude"));
			scalingRule.setAdjustmentType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setAdjustmentValue(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setMinSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinSize"));
			scalingRule.setMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MaxSize"));
			scalingRule.setScalingRuleAri(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleAri"));
			scalingRule.setScalingRuleType(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleType"));
			scalingRule.setEstimatedInstanceWarmup(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].EstimatedInstanceWarmup"));
			scalingRule.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricName"));
			scalingRule.setTargetValue(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].TargetValue"));
			scalingRule.setDisableScaleIn(_ctx.booleanValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].DisableScaleIn"));
			scalingRule.setPredictiveScalingMode(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveScalingMode"));
			scalingRule.setPredictiveValueBehavior(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBehavior"));
			scalingRule.setPredictiveValueBuffer(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBuffer"));
			scalingRule.setPredictiveTaskBufferTime(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveTaskBufferTime"));
			scalingRule.setInitialMaxSize(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].InitialMaxSize"));

			List<Alarm> alarms = new ArrayList<Alarm>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms.Length"); j++) {
				Alarm alarm = new Alarm();
				alarm.setAlarmTaskName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskName"));
				alarm.setAlarmTaskId(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskId"));
				alarm.setComparisonOperator(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].ComparisonOperator"));
				alarm.setStatistics(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Statistics"));
				alarm.setMetricName(_ctx.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricName"));
				alarm.setThreshold(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Threshold"));
				alarm.setEvaluationCount(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].EvaluationCount"));

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
				stepAdjustment.setMetricIntervalLowerBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalLowerBound"));
				stepAdjustment.setMetricIntervalUpperBound(_ctx.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalUpperBound"));
				stepAdjustment.setScalingAdjustment(_ctx.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].ScalingAdjustment"));

				stepAdjustments.add(stepAdjustment);
			}
			scalingRule.setStepAdjustments(stepAdjustments);

			scalingRules.add(scalingRule);
		}
		describeScalingRulesResponse.setScalingRules(scalingRules);
	 
	 	return describeScalingRulesResponse;
	}
}