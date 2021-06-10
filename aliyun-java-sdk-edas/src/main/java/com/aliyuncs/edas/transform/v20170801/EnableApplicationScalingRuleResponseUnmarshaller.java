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

import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse;
import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse.AppScalingRule;
import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse.AppScalingRule.Metric;
import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse.AppScalingRule.Metric.Metric1;
import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse.AppScalingRule.Trigger;
import com.aliyuncs.edas.model.v20170801.EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.Trigger2;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableApplicationScalingRuleResponseUnmarshaller {

	public static EnableApplicationScalingRuleResponse unmarshall(EnableApplicationScalingRuleResponse enableApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		enableApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("EnableApplicationScalingRuleResponse.RequestId"));
		enableApplicationScalingRuleResponse.setCode(_ctx.integerValue("EnableApplicationScalingRuleResponse.Code"));
		enableApplicationScalingRuleResponse.setMessage(_ctx.stringValue("EnableApplicationScalingRuleResponse.Message"));

		AppScalingRule appScalingRule = new AppScalingRule();
		appScalingRule.setAppId(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.AppId"));
		appScalingRule.setScaleRuleName(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleName"));
		appScalingRule.setScaleRuleType(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleType"));
		appScalingRule.setScaleRuleEnabled(_ctx.booleanValue("EnableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleEnabled"));
		appScalingRule.setMinReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.MinReplicas"));
		appScalingRule.setMaxReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.MaxReplicas"));
		appScalingRule.setCreateTime(_ctx.longValue("EnableApplicationScalingRuleResponse.AppScalingRule.CreateTime"));
		appScalingRule.setUpdateTime(_ctx.longValue("EnableApplicationScalingRuleResponse.AppScalingRule.UpdateTime"));
		appScalingRule.setLastDisableTime(_ctx.longValue("EnableApplicationScalingRuleResponse.AppScalingRule.LastDisableTime"));

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("EnableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricType(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricType"));
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		appScalingRule.setMetric(metric);

		Trigger trigger = new Trigger();
		trigger.setMaxReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.MaxReplicas"));
		trigger.setMinReplicas(_ctx.integerValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.MinReplicas"));

		List<Trigger2> triggers = new ArrayList<Trigger2>();
		for (int i = 0; i < _ctx.lengthValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers.Length"); i++) {
			Trigger2 trigger2 = new Trigger2();
			trigger2.setType(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Type"));
			trigger2.setName(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Name"));
			trigger2.setMetaData(_ctx.stringValue("EnableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].MetaData"));

			triggers.add(trigger2);
		}
		trigger.setTriggers(triggers);
		appScalingRule.setTrigger(trigger);
		enableApplicationScalingRuleResponse.setAppScalingRule(appScalingRule);
	 
	 	return enableApplicationScalingRuleResponse;
	}
}