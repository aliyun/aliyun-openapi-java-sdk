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

import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertRuleSubscribeResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertRuleSubscribeResponse.Response;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertRuleSubscribeResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRmsAlertRuleSubscribeResponseUnmarshaller {

	public static DeleteRmsAlertRuleSubscribeResponse unmarshall(DeleteRmsAlertRuleSubscribeResponse deleteRmsAlertRuleSubscribeResponse, UnmarshallerContext _ctx) {
		
		deleteRmsAlertRuleSubscribeResponse.setRequestId(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.RequestId"));
		deleteRmsAlertRuleSubscribeResponse.setResultCode(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.ResultCode"));
		deleteRmsAlertRuleSubscribeResponse.setResultMessage(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("DeleteRmsAlertRuleSubscribeResponse.Response.Entity.Success"));
		response.setEntity(entity);
		deleteRmsAlertRuleSubscribeResponse.setResponse(response);
	 
	 	return deleteRmsAlertRuleSubscribeResponse;
	}
}