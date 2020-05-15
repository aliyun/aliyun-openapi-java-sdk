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

import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertruleResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertruleResponse.Response;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlertruleResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRmsAlertruleResponseUnmarshaller {

	public static DeleteRmsAlertruleResponse unmarshall(DeleteRmsAlertruleResponse deleteRmsAlertruleResponse, UnmarshallerContext _ctx) {
		
		deleteRmsAlertruleResponse.setRequestId(_ctx.stringValue("DeleteRmsAlertruleResponse.RequestId"));
		deleteRmsAlertruleResponse.setResultCode(_ctx.stringValue("DeleteRmsAlertruleResponse.ResultCode"));
		deleteRmsAlertruleResponse.setResultMessage(_ctx.stringValue("DeleteRmsAlertruleResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("DeleteRmsAlertruleResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("DeleteRmsAlertruleResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("DeleteRmsAlertruleResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("DeleteRmsAlertruleResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("DeleteRmsAlertruleResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("DeleteRmsAlertruleResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("DeleteRmsAlertruleResponse.Response.Entity.Success"));
		response.setEntity(entity);
		deleteRmsAlertruleResponse.setResponse(response);
	 
	 	return deleteRmsAlertruleResponse;
	}
}