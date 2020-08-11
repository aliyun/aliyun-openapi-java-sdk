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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.ModifyFlowRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifyFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFlowRuleResponseUnmarshaller {

	public static ModifyFlowRuleResponse unmarshall(ModifyFlowRuleResponse modifyFlowRuleResponse, UnmarshallerContext _ctx) {
		
		modifyFlowRuleResponse.setRequestId(_ctx.stringValue("ModifyFlowRuleResponse.RequestId"));
		modifyFlowRuleResponse.setCode(_ctx.stringValue("ModifyFlowRuleResponse.Code"));
		modifyFlowRuleResponse.setMessage(_ctx.stringValue("ModifyFlowRuleResponse.Message"));
		modifyFlowRuleResponse.setSuccess(_ctx.booleanValue("ModifyFlowRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("ModifyFlowRuleResponse.Data.AppName"));
		data.setClusterEstimatedMaxQps(_ctx.floatValue("ModifyFlowRuleResponse.Data.ClusterEstimatedMaxQps"));
		data.setClusterFallbackStrategy(_ctx.integerValue("ModifyFlowRuleResponse.Data.ClusterFallbackStrategy"));
		data.setClusterFallbackThreshold(_ctx.integerValue("ModifyFlowRuleResponse.Data.ClusterFallbackThreshold"));
		data.setClusterMode(_ctx.booleanValue("ModifyFlowRuleResponse.Data.ClusterMode"));
		data.setClusterThresholdType(_ctx.integerValue("ModifyFlowRuleResponse.Data.ClusterThresholdType"));
		data.setControlBehavior(_ctx.integerValue("ModifyFlowRuleResponse.Data.ControlBehavior"));
		data.setThreshold(_ctx.floatValue("ModifyFlowRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("ModifyFlowRuleResponse.Data.Enable"));
		data.setLimitOrigin(_ctx.stringValue("ModifyFlowRuleResponse.Data.LimitOrigin"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("ModifyFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setNamespace(_ctx.stringValue("ModifyFlowRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("ModifyFlowRuleResponse.Data.RefResource"));
		data.setRelationStrategy(_ctx.integerValue("ModifyFlowRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("ModifyFlowRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("ModifyFlowRuleResponse.Data.RuleId"));
		data.setStatDurationMs(_ctx.integerValue("ModifyFlowRuleResponse.Data.StatDurationMs"));
		data.setWarmUpPeriodSec(_ctx.integerValue("ModifyFlowRuleResponse.Data.WarmUpPeriodSec"));
		modifyFlowRuleResponse.setData(data);
	 
	 	return modifyFlowRuleResponse;
	}
}