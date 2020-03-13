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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleResponse.Response;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRmsAlertRuleResponseUnmarshaller {

	public static UpdateRmsAlertRuleResponse unmarshall(UpdateRmsAlertRuleResponse updateRmsAlertRuleResponse, UnmarshallerContext _ctx) {
		
		updateRmsAlertRuleResponse.setRequestId(_ctx.stringValue("UpdateRmsAlertRuleResponse.RequestId"));
		updateRmsAlertRuleResponse.setResultCode(_ctx.stringValue("UpdateRmsAlertRuleResponse.ResultCode"));
		updateRmsAlertRuleResponse.setResultMessage(_ctx.stringValue("UpdateRmsAlertRuleResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("UpdateRmsAlertRuleResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("UpdateRmsAlertRuleResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("UpdateRmsAlertRuleResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("UpdateRmsAlertRuleResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("UpdateRmsAlertRuleResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("UpdateRmsAlertRuleResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("UpdateRmsAlertRuleResponse.Response.Entity.Success"));
		response.setEntity(entity);
		updateRmsAlertRuleResponse.setResponse(response);
	 
	 	return updateRmsAlertRuleResponse;
	}
}