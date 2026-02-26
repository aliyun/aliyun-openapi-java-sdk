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

import com.aliyuncs.mse.model.v20190531.UpdateFlowRuleResponse;
import com.aliyuncs.mse.model.v20190531.UpdateFlowRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFlowRuleResponseUnmarshaller {

	public static UpdateFlowRuleResponse unmarshall(UpdateFlowRuleResponse updateFlowRuleResponse, UnmarshallerContext _ctx) {
		
		updateFlowRuleResponse.setRequestId(_ctx.stringValue("UpdateFlowRuleResponse.RequestId"));
		updateFlowRuleResponse.setMessage(_ctx.stringValue("UpdateFlowRuleResponse.Message"));
		updateFlowRuleResponse.setCode(_ctx.stringValue("UpdateFlowRuleResponse.Code"));
		updateFlowRuleResponse.setSuccess(_ctx.booleanValue("UpdateFlowRuleResponse.Success"));

		Data data = new Data();
		data.setNamespace(_ctx.stringValue("UpdateFlowRuleResponse.Data.Namespace"));
		data.setId(_ctx.longValue("UpdateFlowRuleResponse.Data.Id"));
		data.setAppName(_ctx.stringValue("UpdateFlowRuleResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("UpdateFlowRuleResponse.Data.Resource"));
		data.setControlBehavior(_ctx.integerValue("UpdateFlowRuleResponse.Data.ControlBehavior"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("UpdateFlowRuleResponse.Data.MaxQueueingTimeMs"));
		data.setThreshold(_ctx.floatValue("UpdateFlowRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("UpdateFlowRuleResponse.Data.Enable"));
		data.setAppId(_ctx.stringValue("UpdateFlowRuleResponse.Data.AppId"));
		updateFlowRuleResponse.setData(data);
	 
	 	return updateFlowRuleResponse;
	}
}