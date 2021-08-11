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

import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse.AppScalingRule;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse.AppScalingRule.Metric;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.Metric1;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger;
import com.aliyuncs.edas.model.v20170801.UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.Trigger2;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationScalingRuleResponseUnmarshaller {

	public static UpdateApplicationScalingRuleResponse unmarshall(UpdateApplicationScalingRuleResponse updateApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		updateApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("UpdateApplicationScalingRuleResponse.RequestId"));
		updateApplicationScalingRuleResponse.setCode(_ctx.integerValue("UpdateApplicationScalingRuleResponse.Code"));
		updateApplicationScalingRuleResponse.setMessage(_ctx.stringValue("UpdateApplicationScalingRuleResponse.Message"));

		AppScalingRule appScalingRule = new AppScalingRule();
		appScalingRule.setAppId(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.AppId"));
		appScalingRule.setScaleRuleName(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleName"));
		appScalingRule.setScaleRuleType(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleType"));
		appScalingRule.setScaleRuleEnabled(_ctx.booleanValue("UpdateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleEnabled"));
		appScalingRule.setMinReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.MinReplicas"));
		appScalingRule.setMaxReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.MaxReplicas"));
		appScalingRule.setCreateTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.AppScalingRule.CreateTime"));
		appScalingRule.setUpdateTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.AppScalingRule.UpdateTime"));
		appScalingRule.setLastDisableTime(_ctx.longValue("UpdateApplicationScalingRuleResponse.AppScalingRule.LastDisableTime"));

		Metric metric = new Metric();
		metric.setMaxReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.MaxReplicas"));
		metric.setMinReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.MinReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricType(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricType"));
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		appScalingRule.setMetric(metric);

		Trigger trigger = new Trigger();
		trigger.setMaxReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.MaxReplicas"));
		trigger.setMinReplicas(_ctx.integerValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.MinReplicas"));

		List<Trigger2> triggers = new ArrayList<Trigger2>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers.Length"); i++) {
			Trigger2 trigger2 = new Trigger2();
			trigger2.setType(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Type"));
			trigger2.setName(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Name"));
			trigger2.setMetaData(_ctx.stringValue("UpdateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].MetaData"));

			triggers.add(trigger2);
		}
		trigger.setTriggers(triggers);
		appScalingRule.setTrigger(trigger);
		updateApplicationScalingRuleResponse.setAppScalingRule(appScalingRule);
	 
	 	return updateApplicationScalingRuleResponse;
	}
}