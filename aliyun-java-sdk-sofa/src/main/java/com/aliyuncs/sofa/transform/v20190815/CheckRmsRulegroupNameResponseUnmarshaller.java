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

import com.aliyuncs.sofa.model.v20190815.CheckRmsRulegroupNameResponse;
import com.aliyuncs.sofa.model.v20190815.CheckRmsRulegroupNameResponse.Response;
import com.aliyuncs.sofa.model.v20190815.CheckRmsRulegroupNameResponse.Response.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckRmsRulegroupNameResponseUnmarshaller {

	public static CheckRmsRulegroupNameResponse unmarshall(CheckRmsRulegroupNameResponse checkRmsRulegroupNameResponse, UnmarshallerContext _ctx) {
		
		checkRmsRulegroupNameResponse.setRequestId(_ctx.stringValue("CheckRmsRulegroupNameResponse.RequestId"));
		checkRmsRulegroupNameResponse.setResultCode(_ctx.stringValue("CheckRmsRulegroupNameResponse.ResultCode"));
		checkRmsRulegroupNameResponse.setResultMessage(_ctx.stringValue("CheckRmsRulegroupNameResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("CheckRmsRulegroupNameResponse.Response.Layer"));

		Entity entity = new Entity();
		entity.setErrCode(_ctx.stringValue("CheckRmsRulegroupNameResponse.Response.Entity.ErrCode"));
		entity.setErrMsg(_ctx.stringValue("CheckRmsRulegroupNameResponse.Response.Entity.ErrMsg"));
		entity.setErrResolution(_ctx.stringValue("CheckRmsRulegroupNameResponse.Response.Entity.ErrResolution"));
		entity.setMessage(_ctx.stringValue("CheckRmsRulegroupNameResponse.Response.Entity.Message"));
		entity.setModule(_ctx.booleanValue("CheckRmsRulegroupNameResponse.Response.Entity.Module"));
		entity.setSuccess(_ctx.booleanValue("CheckRmsRulegroupNameResponse.Response.Entity.Success"));
		response.setEntity(entity);
		checkRmsRulegroupNameResponse.setResponse(response);
	 
	 	return checkRmsRulegroupNameResponse;
	}
}