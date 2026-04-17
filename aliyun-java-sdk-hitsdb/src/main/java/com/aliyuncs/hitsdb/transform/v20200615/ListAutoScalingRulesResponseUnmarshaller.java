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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRulesResponse;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRulesResponse.Data;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRulesResponse.Data.ScaleRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoScalingRulesResponseUnmarshaller {

	public static ListAutoScalingRulesResponse unmarshall(ListAutoScalingRulesResponse listAutoScalingRulesResponse, UnmarshallerContext _ctx) {
		
		listAutoScalingRulesResponse.setRequestId(_ctx.stringValue("ListAutoScalingRulesResponse.RequestId"));
		listAutoScalingRulesResponse.setDynamicCode(_ctx.stringValue("ListAutoScalingRulesResponse.DynamicCode"));
		listAutoScalingRulesResponse.setDynamicMessage(_ctx.stringValue("ListAutoScalingRulesResponse.DynamicMessage"));
		listAutoScalingRulesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAutoScalingRulesResponse.AccessDeniedDetail"));
		listAutoScalingRulesResponse.setSuccess(_ctx.booleanValue("ListAutoScalingRulesResponse.Success"));
		listAutoScalingRulesResponse.setCode(_ctx.stringValue("ListAutoScalingRulesResponse.Code"));
		listAutoScalingRulesResponse.setMessage(_ctx.stringValue("ListAutoScalingRulesResponse.Message"));
		listAutoScalingRulesResponse.setHttpStatusCode(_ctx.integerValue("ListAutoScalingRulesResponse.HttpStatusCode"));

		Data data = new Data();

		List<ScaleRule> scaleRules = new ArrayList<ScaleRule>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoScalingRulesResponse.Data.ScaleRules.Length"); i++) {
			ScaleRule scaleRule = new ScaleRule();
			scaleRule.setInstanceId(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].InstanceId"));
			scaleRule.setConfigId(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ConfigId"));
			scaleRule.setRuleId(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].RuleId"));
			scaleRule.setRuleName(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].RuleName"));
			scaleRule.setRuleType(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].RuleType"));
			scaleRule.setEnabled(_ctx.booleanValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].Enabled"));
			scaleRule.setOperationType(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].OperationType"));
			scaleRule.setTriggerCronExpr(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].TriggerCronExpr"));
			scaleRule.setTargetNodes(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].TargetNodes"));
			scaleRule.setTargetMetric(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].TargetMetric"));
			scaleRule.setThresholdLower(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ThresholdLower"));
			scaleRule.setThresholdUpper(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ThresholdUpper"));
			scaleRule.setObservationWindow(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ObservationWindow"));
			scaleRule.setSilenceTime(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].SilenceTime"));
			scaleRule.setScaleOutStep(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ScaleOutStep"));
			scaleRule.setScaleInStep(_ctx.integerValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].ScaleInStep"));
			scaleRule.setStartTime(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].StartTime"));
			scaleRule.setEndTime(_ctx.stringValue("ListAutoScalingRulesResponse.Data.ScaleRules["+ i +"].EndTime"));

			scaleRules.add(scaleRule);
		}
		data.setScaleRules(scaleRules);
		listAutoScalingRulesResponse.setData(data);
	 
	 	return listAutoScalingRulesResponse;
	}
}