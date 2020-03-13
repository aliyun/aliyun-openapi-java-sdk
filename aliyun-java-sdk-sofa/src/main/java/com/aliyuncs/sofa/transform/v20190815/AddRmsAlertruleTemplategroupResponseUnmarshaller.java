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

import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleTemplategroupResponse;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleTemplategroupResponse.Response;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlertruleTemplategroupResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRmsAlertruleTemplategroupResponseUnmarshaller {

	public static AddRmsAlertruleTemplategroupResponse unmarshall(AddRmsAlertruleTemplategroupResponse addRmsAlertruleTemplategroupResponse, UnmarshallerContext _ctx) {
		
		addRmsAlertruleTemplategroupResponse.setRequestId(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.RequestId"));
		addRmsAlertruleTemplategroupResponse.setResultCode(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.ResultCode"));
		addRmsAlertruleTemplategroupResponse.setResultMessage(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("AddRmsAlertruleTemplategroupResponse.Response.Entity.Success"));
		response.setEntity(entity);
		addRmsAlertruleTemplategroupResponse.setResponse(response);
	 
	 	return addRmsAlertruleTemplategroupResponse;
	}
}