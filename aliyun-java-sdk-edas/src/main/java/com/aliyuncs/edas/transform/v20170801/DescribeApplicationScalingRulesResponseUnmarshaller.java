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

import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules.Rule;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules.Rule.Metric;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules.Rule.Metric.Metric1;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules.Rule.Trigger;
import com.aliyuncs.edas.model.v20170801.DescribeApplicationScalingRulesResponse.AppScalingRules.Rule.Trigger.Trigger2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationScalingRulesResponseUnmarshaller {

	public static DescribeApplicationScalingRulesResponse unmarshall(DescribeApplicationScalingRulesResponse describeApplicationScalingRulesResponse, UnmarshallerContext _ctx) {
		
		describeApplicationScalingRulesResponse.setRequestId(_ctx.stringValue("DescribeApplicationScalingRulesResponse.RequestId"));
		describeApplicationScalingRulesResponse.setCode(_ctx.integerValue("DescribeApplicationScalingRulesResponse.Code"));
		describeApplicationScalingRulesResponse.setMessage(_ctx.stringValue("DescribeApplicationScalingRulesResponse.Message"));

		AppScalingRules appScalingRules = new AppScalingRules();
		appScalingRules.setCurrentPage(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.CurrentPage"));
		appScalingRules.setPageSize(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.PageSize"));
		appScalingRules.setTotalSize(_ctx.longValue("DescribeApplicationScalingRulesResponse.AppScalingRules.TotalSize"));

		List<Rule> result = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].AppId"));
			rule.setScaleRuleName(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].ScaleRuleName"));
			rule.setScaleRuleType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].ScaleRuleType"));
			rule.setScaleRuleEnabled(_ctx.booleanValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].ScaleRuleEnabled"));
			rule.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].MinReplicas"));
			rule.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].MaxReplicas"));
			rule.setCreateTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].CreateTime"));
			rule.setUpdateTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].UpdateTime"));
			rule.setLastDisableTime(_ctx.longValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].LastDisableTime"));

			Metric metric = new Metric();
			metric.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Metric.MaxReplicas"));
			metric.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Metric.MinReplicas"));

			List<Metric1> metrics = new ArrayList<Metric1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Metric.Metrics.Length"); j++) {
				Metric1 metric1 = new Metric1();
				metric1.setMetricType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Metric.Metrics["+ j +"].MetricType"));
				metric1.setMetricTargetAverageUtilization(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Metric.Metrics["+ j +"].MetricTargetAverageUtilization"));

				metrics.add(metric1);
			}
			metric.setMetrics(metrics);
			rule.setMetric(metric);

			Trigger trigger = new Trigger();
			trigger.setMaxReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.MaxReplicas"));
			trigger.setMinReplicas(_ctx.integerValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.MinReplicas"));

			List<Trigger2> triggers = new ArrayList<Trigger2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.Triggers.Length"); j++) {
				Trigger2 trigger2 = new Trigger2();
				trigger2.setType(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.Triggers["+ j +"].Type"));
				trigger2.setName(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.Triggers["+ j +"].Name"));
				trigger2.setMetaData(_ctx.stringValue("DescribeApplicationScalingRulesResponse.AppScalingRules.Result["+ i +"].Trigger.Triggers["+ j +"].MetaData"));

				triggers.add(trigger2);
			}
			trigger.setTriggers(triggers);
			rule.setTrigger(trigger);

			result.add(rule);
		}
		appScalingRules.setResult(result);
		describeApplicationScalingRulesResponse.setAppScalingRules(appScalingRules);
	 
	 	return describeApplicationScalingRulesResponse;
	}
}