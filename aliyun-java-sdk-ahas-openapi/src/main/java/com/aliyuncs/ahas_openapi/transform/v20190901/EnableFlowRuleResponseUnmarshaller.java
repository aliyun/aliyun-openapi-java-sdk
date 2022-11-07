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

import com.aliyuncs.ahas_openapi.model.v20190901.EnableFlowRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableFlowRuleResponseUnmarshaller {

	public static EnableFlowRuleResponse unmarshall(EnableFlowRuleResponse enableFlowRuleResponse, UnmarshallerContext _ctx) {
		
		enableFlowRuleResponse.setRequestId(_ctx.stringValue("EnableFlowRuleResponse.RequestId"));
		enableFlowRuleResponse.setCode(_ctx.stringValue("EnableFlowRuleResponse.Code"));
		enableFlowRuleResponse.setMessage(_ctx.stringValue("EnableFlowRuleResponse.Message"));
		enableFlowRuleResponse.setSuccess(_ctx.booleanValue("EnableFlowRuleResponse.Success"));

		Data data = new Data();
		data.setRefResource(_ctx.stringValue("EnableFlowRuleResponse.Data.RefResource"));
		data.setClusterFallbackThreshold(_ctx.integerValue("EnableFlowRuleResponse.Data.ClusterFallbackThreshold"));
		data.setNamespace(_ctx.stringValue("EnableFlowRuleResponse.Data.Namespace"));
		data.setStatDurationMs(_ctx.integerValue("EnableFlowRuleResponse.Data.StatDurationMs"));
		data.setLimitOrigin(_ctx.stringValue("EnableFlowRuleResponse.Data.LimitOrigin"));
		data.setClusterThresholdType(_ctx.integerValue("EnableFlowRuleResponse.Data.ClusterThresholdType"));
		data.setRuleId(_ctx.longValue("EnableFlowRuleResponse.Data.RuleId"));
		data.setRelationStrategy(_ctx.integerValue("EnableFlowRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("EnableFlowRuleResponse.Data.Resource"));
		data.setAppName(_ctx.stringValue("EnableFlowRuleResponse.Data.AppName"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("EnableFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setControlBehavior(_ctx.integerValue("EnableFlowRuleResponse.Data.ControlBehavior"));
		data.setClusterEstimatedMaxQps(_ctx.floatValue("EnableFlowRuleResponse.Data.ClusterEstimatedMaxQps"));
		data.setWarmUpPeriodSec(_ctx.integerValue("EnableFlowRuleResponse.Data.WarmUpPeriodSec"));
		data.setClusterFallbackStrategy(_ctx.integerValue("EnableFlowRuleResponse.Data.ClusterFallbackStrategy"));
		data.setThreshold(_ctx.floatValue("EnableFlowRuleResponse.Data.Threshold"));
		data.setClusterMode(_ctx.booleanValue("EnableFlowRuleResponse.Data.ClusterMode"));
		data.setEnable(_ctx.booleanValue("EnableFlowRuleResponse.Data.Enable"));
		enableFlowRuleResponse.setData(data);
	 
	 	return enableFlowRuleResponse;
	}
}