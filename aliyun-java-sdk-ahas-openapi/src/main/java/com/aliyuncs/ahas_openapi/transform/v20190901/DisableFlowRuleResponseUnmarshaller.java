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

import com.aliyuncs.ahas_openapi.model.v20190901.DisableFlowRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableFlowRuleResponseUnmarshaller {

	public static DisableFlowRuleResponse unmarshall(DisableFlowRuleResponse disableFlowRuleResponse, UnmarshallerContext _ctx) {
		
		disableFlowRuleResponse.setRequestId(_ctx.stringValue("DisableFlowRuleResponse.RequestId"));
		disableFlowRuleResponse.setMessage(_ctx.stringValue("DisableFlowRuleResponse.Message"));
		disableFlowRuleResponse.setCode(_ctx.stringValue("DisableFlowRuleResponse.Code"));
		disableFlowRuleResponse.setSuccess(_ctx.booleanValue("DisableFlowRuleResponse.Success"));

		Data data = new Data();
		data.setRefResource(_ctx.stringValue("DisableFlowRuleResponse.Data.RefResource"));
		data.setClusterFallbackThreshold(_ctx.integerValue("DisableFlowRuleResponse.Data.ClusterFallbackThreshold"));
		data.setNamespace(_ctx.stringValue("DisableFlowRuleResponse.Data.Namespace"));
		data.setLimitOrigin(_ctx.stringValue("DisableFlowRuleResponse.Data.LimitOrigin"));
		data.setStatDurationMs(_ctx.integerValue("DisableFlowRuleResponse.Data.StatDurationMs"));
		data.setClusterThresholdType(_ctx.integerValue("DisableFlowRuleResponse.Data.ClusterThresholdType"));
		data.setRuleId(_ctx.longValue("DisableFlowRuleResponse.Data.RuleId"));
		data.setRelationStrategy(_ctx.integerValue("DisableFlowRuleResponse.Data.RelationStrategy"));
		data.setAppName(_ctx.stringValue("DisableFlowRuleResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("DisableFlowRuleResponse.Data.Resource"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("DisableFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setClusterEstimatedMaxQps(_ctx.floatValue("DisableFlowRuleResponse.Data.ClusterEstimatedMaxQps"));
		data.setControlBehavior(_ctx.integerValue("DisableFlowRuleResponse.Data.ControlBehavior"));
		data.setWarmUpPeriodSec(_ctx.integerValue("DisableFlowRuleResponse.Data.WarmUpPeriodSec"));
		data.setClusterFallbackStrategy(_ctx.integerValue("DisableFlowRuleResponse.Data.ClusterFallbackStrategy"));
		data.setThreshold(_ctx.floatValue("DisableFlowRuleResponse.Data.Threshold"));
		data.setClusterMode(_ctx.booleanValue("DisableFlowRuleResponse.Data.ClusterMode"));
		data.setEnable(_ctx.booleanValue("DisableFlowRuleResponse.Data.Enable"));
		disableFlowRuleResponse.setData(data);
	 
	 	return disableFlowRuleResponse;
	}
}