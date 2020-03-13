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

import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlarmBlacklistResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlarmBlacklistResponse.Response;
import com.aliyuncs.sofa.model.v20190815.DeleteRmsAlarmBlacklistResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRmsAlarmBlacklistResponseUnmarshaller {

	public static DeleteRmsAlarmBlacklistResponse unmarshall(DeleteRmsAlarmBlacklistResponse deleteRmsAlarmBlacklistResponse, UnmarshallerContext _ctx) {
		
		deleteRmsAlarmBlacklistResponse.setRequestId(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.RequestId"));
		deleteRmsAlarmBlacklistResponse.setResultCode(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.ResultCode"));
		deleteRmsAlarmBlacklistResponse.setResultMessage(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("DeleteRmsAlarmBlacklistResponse.Response.Entity.Success"));
		response.setEntity(entity);
		deleteRmsAlarmBlacklistResponse.setResponse(response);
	 
	 	return deleteRmsAlarmBlacklistResponse;
	}
}