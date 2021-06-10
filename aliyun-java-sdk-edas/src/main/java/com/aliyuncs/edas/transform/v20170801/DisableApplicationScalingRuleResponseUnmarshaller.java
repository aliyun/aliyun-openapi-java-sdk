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

import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse;
import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse.AppScalingRule;
import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse.AppScalingRule.Metric;
import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse.AppScalingRule.Metric.Metric1;
import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse.AppScalingRule.Trigger;
import com.aliyuncs.edas.model.v20170801.DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.Trigger2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableApplicationScalingRuleResponseUnmarshaller {

	public static DisableApplicationScalingRuleResponse unmarshall(DisableApplicationScalingRuleResponse disableApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		disableApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("DisableApplicationScalingRuleResponse.RequestId"));
		disableApplicationScalingRuleResponse.setCode(_ctx.integerValue("DisableApplicationScalingRuleResponse.Code"));
		disableApplicationScalingRuleResponse.setMessage(_ctx.stringValue("DisableApplicationScalingRuleResponse.Message"));

		AppScalingRule appScalingRule = new AppScalingRule();
		appScalingRule.setAppId(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.AppId"));
		appScalingRule.setScaleRuleName(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleName"));
		appScalingRule.setScaleRuleType(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleType"));
		appScalingRule.setScaleRuleEnabled(_ctx.booleanValue("DisableApplicationScalingRuleResponse.AppScalingRule.ScaleRuleEnabled"));
		appScalingRule.setMinReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.MinReplicas"));
		appScalingRule.setMaxReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.MaxReplicas"));
		appScalingRule.setCreateTime(_ctx.longValue("DisableApplicationScalingRuleResponse.AppScalingRule.CreateTime"));
		appScalingRule.setUpdateTime(_ctx.longValue("DisableApplicationScalingRuleResponse.AppScalingRule.UpdateTime"));
		appScalingRule.setLastDisableTime(_ctx.longValue("DisableApplicationScalingRuleResponse.AppScalingRule.LastDisableTime"));

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("DisableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricType(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricType"));
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		appScalingRule.setMetric(metric);

		Trigger trigger = new Trigger();
		trigger.setMaxReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.MaxReplicas"));
		trigger.setMinReplicas(_ctx.integerValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.MinReplicas"));

		List<Trigger2> triggers = new ArrayList<Trigger2>();
		for (int i = 0; i < _ctx.lengthValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers.Length"); i++) {
			Trigger2 trigger2 = new Trigger2();
			trigger2.setType(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Type"));
			trigger2.setName(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Name"));
			trigger2.setMetaData(_ctx.stringValue("DisableApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].MetaData"));

			triggers.add(trigger2);
		}
		trigger.setTriggers(triggers);
		appScalingRule.setTrigger(trigger);
		disableApplicationScalingRuleResponse.setAppScalingRule(appScalingRule);
	 
	 	return disableApplicationScalingRuleResponse;
	}
}