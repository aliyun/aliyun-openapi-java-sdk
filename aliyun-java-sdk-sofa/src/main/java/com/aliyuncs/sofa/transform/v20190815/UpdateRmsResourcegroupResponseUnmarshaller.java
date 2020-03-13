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

import com.aliyuncs.sofa.model.v20190815.UpdateRmsResourcegroupResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsResourcegroupResponse.Response;
import com.aliyuncs.sofa.model.v20190815.UpdateRmsResourcegroupResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRmsResourcegroupResponseUnmarshaller {

	public static UpdateRmsResourcegroupResponse unmarshall(UpdateRmsResourcegroupResponse updateRmsResourcegroupResponse, UnmarshallerContext _ctx) {
		
		updateRmsResourcegroupResponse.setRequestId(_ctx.stringValue("UpdateRmsResourcegroupResponse.RequestId"));
		updateRmsResourcegroupResponse.setResultCode(_ctx.stringValue("UpdateRmsResourcegroupResponse.ResultCode"));
		updateRmsResourcegroupResponse.setResultMessage(_ctx.stringValue("UpdateRmsResourcegroupResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("UpdateRmsResourcegroupResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("UpdateRmsResourcegroupResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("UpdateRmsResourcegroupResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("UpdateRmsResourcegroupResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("UpdateRmsResourcegroupResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("UpdateRmsResourcegroupResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("UpdateRmsResourcegroupResponse.Response.Entity.Success"));
		response.setEntity(entity);
		updateRmsResourcegroupResponse.setResponse(response);
	 
	 	return updateRmsResourcegroupResponse;
	}
}