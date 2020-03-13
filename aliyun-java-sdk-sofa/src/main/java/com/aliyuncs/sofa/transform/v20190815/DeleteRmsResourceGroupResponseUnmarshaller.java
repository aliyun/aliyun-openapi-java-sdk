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

import com.aliyuncs.sofa.model.v20190815.DeleteRmsResourceGroupResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsResourceGroupResponse.Response;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsResourceGroupResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRmsResourceGroupResponseUnmarshaller {

	public static DeleteRmsResourceGroupResponse unmarshall(DeleteRmsResourceGroupResponse deleteRmsResourceGroupResponse, UnmarshallerContext _ctx) {
		
		deleteRmsResourceGroupResponse.setRequestId(_ctx.stringValue("DeleteRmsResourceGroupResponse.RequestId"));
		deleteRmsResourceGroupResponse.setResultCode(_ctx.stringValue("DeleteRmsResourceGroupResponse.ResultCode"));
		deleteRmsResourceGroupResponse.setResultMessage(_ctx.stringValue("DeleteRmsResourceGroupResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("DeleteRmsResourceGroupResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("DeleteRmsResourceGroupResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("DeleteRmsResourceGroupResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("DeleteRmsResourceGroupResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("DeleteRmsResourceGroupResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("DeleteRmsResourceGroupResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("DeleteRmsResourceGroupResponse.Response.Entity.Success"));
		response.setEntity(entity);
		deleteRmsResourceGroupResponse.setResponse(response);
	 
	 	return deleteRmsResourceGroupResponse;
	}
}