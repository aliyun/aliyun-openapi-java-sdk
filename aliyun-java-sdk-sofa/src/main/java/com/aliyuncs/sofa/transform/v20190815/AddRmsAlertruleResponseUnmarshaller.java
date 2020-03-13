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

import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleResponse;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleResponse.Response;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRmsAlertruleResponseUnmarshaller {

	public static AddRmsAlertruleResponse unmarshall(AddRmsAlertruleResponse addRmsAlertruleResponse, UnmarshallerContext _ctx) {
		
		addRmsAlertruleResponse.setRequestId(_ctx.stringValue("AddRmsAlertruleResponse.RequestId"));
		addRmsAlertruleResponse.setResultCode(_ctx.stringValue("AddRmsAlertruleResponse.ResultCode"));
		addRmsAlertruleResponse.setResultMessage(_ctx.stringValue("AddRmsAlertruleResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("AddRmsAlertruleResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("AddRmsAlertruleResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("AddRmsAlertruleResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("AddRmsAlertruleResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("AddRmsAlertruleResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("AddRmsAlertruleResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("AddRmsAlertruleResponse.Response.Entity.Success"));
		response.setEntity(entity);
		addRmsAlertruleResponse.setResponse(response);
	 
	 	return addRmsAlertruleResponse;
	}
}