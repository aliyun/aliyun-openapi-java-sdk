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

import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.Policy4;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.Policy;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Metric;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Metric.Metric1;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Trigger;
import com.aliyuncs.edas.model.v20170801.CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.Trigger2;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationScalingRuleResponseUnmarshaller {

	public static CreateApplicationScalingRuleResponse unmarshall(CreateApplicationScalingRuleResponse createApplicationScalingRuleResponse, UnmarshallerContext _ctx) {
		
		createApplicationScalingRuleResponse.setRequestId(_ctx.stringValue("CreateApplicationScalingRuleResponse.RequestId"));
		createApplicationScalingRuleResponse.setCode(_ctx.integerValue("CreateApplicationScalingRuleResponse.Code"));
		createApplicationScalingRuleResponse.setMessage(_ctx.stringValue("CreateApplicationScalingRuleResponse.Message"));

		AppScalingRule appScalingRule = new AppScalingRule();
		appScalingRule.setUpdateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.AppScalingRule.UpdateTime"));
		appScalingRule.setCreateTime(_ctx.longValue("CreateApplicationScalingRuleResponse.AppScalingRule.CreateTime"));
		appScalingRule.setAppId(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.AppId"));
		appScalingRule.setLastDisableTime(_ctx.longValue("CreateApplicationScalingRuleResponse.AppScalingRule.LastDisableTime"));
		appScalingRule.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.MaxReplicas"));
		appScalingRule.setScaleRuleEnabled(_ctx.booleanValue("CreateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleEnabled"));
		appScalingRule.setScaleRuleType(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleType"));
		appScalingRule.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.MinReplicas"));
		appScalingRule.setScaleRuleName(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.ScaleRuleName"));

		Metric metric = new Metric();
		metric.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Metric.MinReplicas"));
		metric.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Metric.MaxReplicas"));

		List<Metric1> metrics = new ArrayList<Metric1>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics.Length"); i++) {
			Metric1 metric1 = new Metric1();
			metric1.setMetricTargetAverageUtilization(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricTargetAverageUtilization"));
			metric1.setMetricType(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Metric.Metrics["+ i +"].MetricType"));

			metrics.add(metric1);
		}
		metric.setMetrics(metrics);
		appScalingRule.setMetric(metric);

		Trigger trigger = new Trigger();
		trigger.setMinReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.MinReplicas"));
		trigger.setMaxReplicas(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.MaxReplicas"));

		List<Trigger2> triggers = new ArrayList<Trigger2>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers.Length"); i++) {
			Trigger2 trigger2 = new Trigger2();
			trigger2.setType(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Type"));
			trigger2.setMetaData(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].MetaData"));
			trigger2.setName(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Trigger.Triggers["+ i +"].Name"));

			triggers.add(trigger2);
		}
		trigger.setTriggers(triggers);
		appScalingRule.setTrigger(trigger);

		Behaviour behaviour = new Behaviour();

		ScaleUp scaleUp = new ScaleUp();
		scaleUp.setStabilizationWindowSeconds(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.StabilizationWindowSeconds"));
		scaleUp.setSelectPolicy(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.SelectPolicy"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPeriodSeconds(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.Policies["+ i +"].PeriodSeconds"));
			policy.setType(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.Policies["+ i +"].Type"));
			policy.setValue(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleUp.Policies["+ i +"].Value"));

			policies.add(policy);
		}
		scaleUp.setPolicies(policies);
		behaviour.setScaleUp(scaleUp);

		ScaleDown scaleDown = new ScaleDown();
		scaleDown.setStabilizationWindowSeconds(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.StabilizationWindowSeconds"));
		scaleDown.setSelectPolicy(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.SelectPolicy"));

		List<Policy4> policies3 = new ArrayList<Policy4>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.Policies.Length"); i++) {
			Policy4 policy4 = new Policy4();
			policy4.setPeriodSeconds(_ctx.integerValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.Policies["+ i +"].PeriodSeconds"));
			policy4.setType(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.Policies["+ i +"].Type"));
			policy4.setValue(_ctx.stringValue("CreateApplicationScalingRuleResponse.AppScalingRule.Behaviour.ScaleDown.Policies["+ i +"].Value"));

			policies3.add(policy4);
		}
		scaleDown.setPolicies3(policies3);
		behaviour.setScaleDown(scaleDown);
		appScalingRule.setBehaviour(behaviour);
		createApplicationScalingRuleResponse.setAppScalingRule(appScalingRule);
	 
	 	return createApplicationScalingRuleResponse;
	}
}