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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRuleResponse;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRuleResponse.AppScalingRule;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRuleResponse.AppScalingRule.Metric;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.Metric1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationScalingRuleResponseUnmarshaller {

	public static DescribeApplicationScalingRuleResponse unmarshall(DescribeApplicationScalingRuleResponse describeApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		describeApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("DescribeApplicationScalingRuleResponse.RequestId"));
		describeApplicationScalingRuleResponse.setCode(_ctx.integerValue("DescribeApplicationScalingRuleResponse.Code"));
		describeApplicationScalingRuleResponse.setMessage(_ctx.stringValue("DescribeApplicationScalingRuleResponse.Message"));

		AppScalingRule appScalingRule = new AppScalingRule();
		appScalingRule.setAppId(_ctx.stringValue("DescribeApplicationScalingRuleResponse.AppScalingRule.AppId"));
		appScalingRule.setScaleRuleName(_ctx.stringValue("DescribeApplicationScalingRuleResponse.AppScalingRule.ScaleRuleName"));
		appScalingRule.setScaleRuleType(_ctx.stringValue("DescribeApplicationScalingRuleResponse.AppScalingRule.ScaleRuleType"));
		appScalingRule.setScaleRuleEnabled(_ctx.booleanValue("DescribeApplicationScalingRuleResponse.AppScalingRule.ScaleRuleEnabled"));
		appScalingRule.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.AppScalingRule.MinReplicas"));
		appScalingRule.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.AppScalingRule.MaxReplicas"));
		appScalingRule.setCreateTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.AppScalingRule.CreateTime"));
		appScalingRule.setUpdateTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.AppScalingRule.UpdateTime"));
		appScalingRule.setLastDisableTime(_ctx.longValue("DescribeApplicationScalingRuleResponse.AppScalingRule.LastDisableTime"));

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricType(_ctx.stringValue("DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricType"));
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		appScalingRule.setMetric(metric);
		describeApplicationScalingRuleResponse.setAppScalingRule(appScalingRule);
	 
	 	return describeApplicationScalingRuleResponse;
	}
}