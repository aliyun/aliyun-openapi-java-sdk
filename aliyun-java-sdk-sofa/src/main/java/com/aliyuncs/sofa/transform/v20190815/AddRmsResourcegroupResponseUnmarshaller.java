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

import com.aliyuncs.sofa.model.v20190815.AddRmsResourcegroupResponse;
import com.aliyuncs.sofa.model.v20190815.AddRmsResourcegroupResponse.Response;
import com.aliyuncs.sofa.model.v20190815.AddRmsResourcegroupResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRmsResourcegroupResponseUnmarshaller {

	public static AddRmsResourcegroupResponse unmarshall(AddRmsResourcegroupResponse addRmsResourcegroupResponse, UnmarshallerContext _ctx) {
		
		addRmsResourcegroupResponse.setRequestId(_ctx.stringValue("AddRmsResourcegroupResponse.RequestId"));
		addRmsResourcegroupResponse.setResultCode(_ctx.stringValue("AddRmsResourcegroupResponse.ResultCode"));
		addRmsResourcegroupResponse.setResultMessage(_ctx.stringValue("AddRmsResourcegroupResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("AddRmsResourcegroupResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("AddRmsResourcegroupResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("AddRmsResourcegroupResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("AddRmsResourcegroupResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("AddRmsResourcegroupResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("AddRmsResourcegroupResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("AddRmsResourcegroupResponse.Response.Entity.Success"));
		response.setEntity(entity);
		addRmsResourcegroupResponse.setResponse(response);
	 
	 	return addRmsResourcegroupResponse;
	}
}