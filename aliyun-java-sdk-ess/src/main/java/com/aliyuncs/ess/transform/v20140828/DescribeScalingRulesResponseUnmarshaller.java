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

	public static DescribeScalingRulesResponse unmarshall(DescribeScalingRulesResponse describeScalingRulesResponse, UnmarshallerContext context) {
		
		describeScalingRulesResponse.setRequestId(context.stringValue("DescribeScalingRulesResponse.RequestId"));
		describeScalingRulesResponse.setTotalCount(context.integerValue("DescribeScalingRulesResponse.TotalCount"));
		describeScalingRulesResponse.setPageNumber(context.integerValue("DescribeScalingRulesResponse.PageNumber"));
		describeScalingRulesResponse.setPageSize(context.integerValue("DescribeScalingRulesResponse.PageSize"));

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < context.lengthValue("DescribeScalingRulesResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setScalingRuleId(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleId"));
			scalingRule.setScalingGroupId(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingGroupId"));
			scalingRule.setScalingRuleName(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleName"));
			scalingRule.setCooldown(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setMinAdjustmentMagnitude(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinAdjustmentMagnitude"));
			scalingRule.setAdjustmentType(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setAdjustmentValue(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setMinSize(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MinSize"));
			scalingRule.setMaxSize(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MaxSize"));
			scalingRule.setScalingRuleAri(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleAri"));
			scalingRule.setScalingRuleType(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].ScalingRuleType"));
			scalingRule.setEstimatedInstanceWarmup(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].EstimatedInstanceWarmup"));
			scalingRule.setMetricName(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].MetricName"));
			scalingRule.setTargetValue(context.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].TargetValue"));
			scalingRule.setDisableScaleIn(context.booleanValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].DisableScaleIn"));
			scalingRule.setPredictiveScalingMode(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveScalingMode"));
			scalingRule.setPredictiveValueBehavior(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBehavior"));
			scalingRule.setPredictiveValueBuffer(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveValueBuffer"));
			scalingRule.setPredictiveTaskBufferTime(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].PredictiveTaskBufferTime"));
			scalingRule.setInitialMaxSize(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].InitialMaxSize"));

			List<Alarm> alarms = new ArrayList<Alarm>();
			for (int j = 0; j < context.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms.Length"); j++) {
				Alarm alarm = new Alarm();
				alarm.setAlarmTaskName(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskName"));
				alarm.setAlarmTaskId(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].AlarmTaskId"));
				alarm.setComparisonOperator(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].ComparisonOperator"));
				alarm.setStatistics(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Statistics"));
				alarm.setMetricName(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].MetricName"));
				alarm.setThreshold(context.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Threshold"));
				alarm.setEvaluationCount(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].EvaluationCount"));

				List<Dimension> dimensions = new ArrayList<Dimension>();
				for (int k = 0; k < context.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions.Length"); k++) {
					Dimension dimension = new Dimension();
					dimension.setDimensionKey(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionKey"));
					dimension.setDimensionValue(context.stringValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].Alarms["+ j +"].Dimensions["+ k +"].DimensionValue"));

					dimensions.add(dimension);
				}
				alarm.setDimensions(dimensions);

				alarms.add(alarm);
			}
			scalingRule.setAlarms(alarms);

			List<StepAdjustment> stepAdjustments = new ArrayList<StepAdjustment>();
			for (int j = 0; j < context.lengthValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments.Length"); j++) {
				StepAdjustment stepAdjustment = new StepAdjustment();
				stepAdjustment.setMetricIntervalLowerBound(context.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalLowerBound"));
				stepAdjustment.setMetricIntervalUpperBound(context.floatValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].MetricIntervalUpperBound"));
				stepAdjustment.setScalingAdjustment(context.integerValue("DescribeScalingRulesResponse.ScalingRules["+ i +"].StepAdjustments["+ j +"].ScalingAdjustment"));

				stepAdjustments.add(stepAdjustment);
			}
			scalingRule.setStepAdjustments(stepAdjustments);

			scalingRules.add(scalingRule);
		}
		describeScalingRulesResponse.setScalingRules(scalingRules);
	 
	 	return describeScalingRulesResponse;
	}
}