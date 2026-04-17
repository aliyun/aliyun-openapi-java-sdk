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

import com.aliyuncs.hitsdb.model.v20200615.GetAutoScalingRuleResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetAutoScalingRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScalingRuleResponseUnmarshaller {

	public static GetAutoScalingRuleResponse unmarshall(GetAutoScalingRuleResponse getAutoScalingRuleResponse, UnmarshallerContext _ctx) {
		
		getAutoScalingRuleResponse.setRequestId(_ctx.stringValue("GetAutoScalingRuleResponse.RequestId"));
		getAutoScalingRuleResponse.setDynamicCode(_ctx.stringValue("GetAutoScalingRuleResponse.DynamicCode"));
		getAutoScalingRuleResponse.setDynamicMessage(_ctx.stringValue("GetAutoScalingRuleResponse.DynamicMessage"));
		getAutoScalingRuleResponse.setAccessDeniedDetail(_ctx.stringValue("GetAutoScalingRuleResponse.AccessDeniedDetail"));
		getAutoScalingRuleResponse.setSuccess(_ctx.booleanValue("GetAutoScalingRuleResponse.Success"));
		getAutoScalingRuleResponse.setCode(_ctx.stringValue("GetAutoScalingRuleResponse.Code"));
		getAutoScalingRuleResponse.setMessage(_ctx.stringValue("GetAutoScalingRuleResponse.Message"));
		getAutoScalingRuleResponse.setHttpStatusCode(_ctx.integerValue("GetAutoScalingRuleResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetAutoScalingRuleResponse.Data.InstanceId"));
		data.setConfigId(_ctx.stringValue("GetAutoScalingRuleResponse.Data.ConfigId"));
		data.setRuleId(_ctx.stringValue("GetAutoScalingRuleResponse.Data.RuleId"));
		data.setRuleName(_ctx.stringValue("GetAutoScalingRuleResponse.Data.RuleName"));
		data.setRuleType(_ctx.stringValue("GetAutoScalingRuleResponse.Data.RuleType"));
		data.setEnabled(_ctx.booleanValue("GetAutoScalingRuleResponse.Data.Enabled"));
		data.setOperationType(_ctx.stringValue("GetAutoScalingRuleResponse.Data.OperationType"));
		data.setTriggerCronExpr(_ctx.stringValue("GetAutoScalingRuleResponse.Data.TriggerCronExpr"));
		data.setTargetNodes(_ctx.integerValue("GetAutoScalingRuleResponse.Data.TargetNodes"));
		data.setTargetMetric(_ctx.stringValue("GetAutoScalingRuleResponse.Data.TargetMetric"));
		data.setThresholdLower(_ctx.integerValue("GetAutoScalingRuleResponse.Data.ThresholdLower"));
		data.setThresholdUpper(_ctx.integerValue("GetAutoScalingRuleResponse.Data.ThresholdUpper"));
		data.setObservationWindow(_ctx.integerValue("GetAutoScalingRuleResponse.Data.ObservationWindow"));
		data.setSilenceTime(_ctx.integerValue("GetAutoScalingRuleResponse.Data.SilenceTime"));
		data.setScaleOutStep(_ctx.integerValue("GetAutoScalingRuleResponse.Data.ScaleOutStep"));
		data.setScaleInStep(_ctx.integerValue("GetAutoScalingRuleResponse.Data.ScaleInStep"));
		data.setStartTime(_ctx.stringValue("GetAutoScalingRuleResponse.Data.StartTime"));
		data.setEndTime(_ctx.stringValue("GetAutoScalingRuleResponse.Data.EndTime"));
		getAutoScalingRuleResponse.setData(data);
	 
	 	return getAutoScalingRuleResponse;
	}
}