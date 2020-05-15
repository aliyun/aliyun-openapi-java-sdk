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

import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleSubscribeResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleSubscribeResponse.Response;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertRuleSubscribeResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRmsAlertRuleSubscribeResponseUnmarshaller {

	public static UpdateRmsAlertRuleSubscribeResponse unmarshall(UpdateRmsAlertRuleSubscribeResponse updateRmsAlertRuleSubscribeResponse, UnmarshallerContext _ctx) {
		
		updateRmsAlertRuleSubscribeResponse.setRequestId(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.RequestId"));
		updateRmsAlertRuleSubscribeResponse.setResultCode(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.ResultCode"));
		updateRmsAlertRuleSubscribeResponse.setResultMessage(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("UpdateRmsAlertRuleSubscribeResponse.Response.Entity.Success"));
		response.setEntity(entity);
		updateRmsAlertRuleSubscribeResponse.setResponse(response);
	 
	 	return updateRmsAlertRuleSubscribeResponse;
	}
}