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

import com.aliyuncs.sofa.model.v20190815.AddRmsAlarmBlacklistResponse;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlarmBlacklistResponse.Response;
import com.aliyuncs.sofa.model.v20190815.AddRmsAlarmBlacklistResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRmsAlarmBlacklistResponseUnmarshaller {

	public static AddRmsAlarmBlacklistResponse unmarshall(AddRmsAlarmBlacklistResponse addRmsAlarmBlacklistResponse, UnmarshallerContext _ctx) {
		
		addRmsAlarmBlacklistResponse.setRequestId(_ctx.stringValue("AddRmsAlarmBlacklistResponse.RequestId"));
		addRmsAlarmBlacklistResponse.setResultCode(_ctx.stringValue("AddRmsAlarmBlacklistResponse.ResultCode"));
		addRmsAlarmBlacklistResponse.setResultMessage(_ctx.stringValue("AddRmsAlarmBlacklistResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("AddRmsAlarmBlacklistResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("AddRmsAlarmBlacklistResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("AddRmsAlarmBlacklistResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("AddRmsAlarmBlacklistResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("AddRmsAlarmBlacklistResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("AddRmsAlarmBlacklistResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("AddRmsAlarmBlacklistResponse.Response.Entity.Success"));
		response.setEntity(entity);
		addRmsAlarmBlacklistResponse.setResponse(response);
	 
	 	return addRmsAlarmBlacklistResponse;
	}
}