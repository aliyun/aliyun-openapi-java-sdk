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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.CreateFlowRuleResponse;
import com.aliyuncs.mse.model.v20190531.CreateFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowRuleResponseUnmarshaller {

	public static CreateFlowRuleResponse unmarshall(CreateFlowRuleResponse createFlowRuleResponse, UnmarshallerContext _ctx) {
		
		createFlowRuleResponse.setRequestId(_ctx.stringValue("CreateFlowRuleResponse.RequestId"));
		createFlowRuleResponse.setMessage(_ctx.stringValue("CreateFlowRuleResponse.Message"));
		createFlowRuleResponse.setCode(_ctx.stringValue("CreateFlowRuleResponse.Code"));
		createFlowRuleResponse.setSuccess(_ctx.booleanValue("CreateFlowRuleResponse.Success"));

		Data data = new Data();
		data.setNamespace(_ctx.stringValue("CreateFlowRuleResponse.Data.Namespace"));
		data.setId(_ctx.longValue("CreateFlowRuleResponse.Data.Id"));
		data.setAppName(_ctx.stringValue("CreateFlowRuleResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("CreateFlowRuleResponse.Data.Resource"));
		data.setControlBehavior(_ctx.integerValue("CreateFlowRuleResponse.Data.ControlBehavior"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("CreateFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setThreshold(_ctx.floatValue("CreateFlowRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("CreateFlowRuleResponse.Data.Enable"));
		data.setAppId(_ctx.stringValue("CreateFlowRuleResponse.Data.AppId"));
		data.setRegionId(_ctx.stringValue("CreateFlowRuleResponse.Data.RegionId"));
		createFlowRuleResponse.setData(data);
	 
	 	return createFlowRuleResponse;
	}
}