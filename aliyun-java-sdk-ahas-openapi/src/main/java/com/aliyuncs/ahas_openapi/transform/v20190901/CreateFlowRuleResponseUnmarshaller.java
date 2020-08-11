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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateFlowRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowRuleResponseUnmarshaller {

	public static CreateFlowRuleResponse unmarshall(CreateFlowRuleResponse createFlowRuleResponse, UnmarshallerContext _ctx) {
		
		createFlowRuleResponse.setRequestId(_ctx.stringValue("CreateFlowRuleResponse.RequestId"));
		createFlowRuleResponse.setCode(_ctx.stringValue("CreateFlowRuleResponse.Code"));
		createFlowRuleResponse.setMessage(_ctx.stringValue("CreateFlowRuleResponse.Message"));
		createFlowRuleResponse.setSuccess(_ctx.booleanValue("CreateFlowRuleResponse.Success"));

		Data data = new Data();
		data.setRuleId(_ctx.longValue("CreateFlowRuleResponse.Data.RuleId"));
		data.setAppName(_ctx.stringValue("CreateFlowRuleResponse.Data.AppName"));
		data.setNamespace(_ctx.stringValue("CreateFlowRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("CreateFlowRuleResponse.Data.RefResource"));
		data.setResource(_ctx.stringValue("CreateFlowRuleResponse.Data.Resource"));
		data.setLimitOrigin(_ctx.stringValue("CreateFlowRuleResponse.Data.LimitOrigin"));
		data.setControlBehavior(_ctx.integerValue("CreateFlowRuleResponse.Data.ControlBehavior"));
		data.setRelationStrategy(_ctx.integerValue("CreateFlowRuleResponse.Data.RelationStrategy"));
		data.setThreshold(_ctx.floatValue("CreateFlowRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("CreateFlowRuleResponse.Data.Enable"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("CreateFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setWarmUpPeriodSec(_ctx.integerValue("CreateFlowRuleResponse.Data.WarmUpPeriodSec"));
		data.setClusterMode(_ctx.booleanValue("CreateFlowRuleResponse.Data.ClusterMode"));
		data.setClusterThresholdType(_ctx.integerValue("CreateFlowRuleResponse.Data.ClusterThresholdType"));
		data.setClusterFallbackStrategy(_ctx.integerValue("CreateFlowRuleResponse.Data.ClusterFallbackStrategy"));
		data.setClusterFallbackThreshold(_ctx.integerValue("CreateFlowRuleResponse.Data.ClusterFallbackThreshold"));
		data.setStatDurationMs(_ctx.integerValue("CreateFlowRuleResponse.Data.StatDurationMs"));
		data.setClusterEstimatedMaxQps(_ctx.floatValue("CreateFlowRuleResponse.Data.ClusterEstimatedMaxQps"));
		createFlowRuleResponse.setData(data);
	 
	 	return createFlowRuleResponse;
	}
}