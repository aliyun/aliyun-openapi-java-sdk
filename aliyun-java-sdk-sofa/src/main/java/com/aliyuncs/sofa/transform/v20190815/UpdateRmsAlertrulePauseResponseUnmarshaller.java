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

import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertrulePauseResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertrulePauseResponse.Response;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsAlertrulePauseResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRmsAlertrulePauseResponseUnmarshaller {

	public static UpdateRmsAlertrulePauseResponse unmarshall(UpdateRmsAlertrulePauseResponse updateRmsAlertrulePauseResponse, UnmarshallerContext _ctx) {
		
		updateRmsAlertrulePauseResponse.setRequestId(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.RequestId"));
		updateRmsAlertrulePauseResponse.setResultCode(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.ResultCode"));
		updateRmsAlertrulePauseResponse.setResultMessage(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("UpdateRmsAlertrulePauseResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("UpdateRmsAlertrulePauseResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("UpdateRmsAlertrulePauseResponse.Response.Entity.Success"));
		response.setEntity(entity);
		updateRmsAlertrulePauseResponse.setResponse(response);
	 
	 	return updateRmsAlertrulePauseResponse;
	}
}