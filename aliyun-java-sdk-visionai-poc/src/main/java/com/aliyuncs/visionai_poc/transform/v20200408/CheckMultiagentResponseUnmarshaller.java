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

package com.aliyuncs.visionai_poc.transform.v20200408;

import com.aliyuncs.visionai_poc.model.v20200408.CheckMultiagentResponse;
import com.aliyuncs.visionai_poc.model.v20200408.CheckMultiagentResponse.Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMultiagentResponseUnmarshaller {

	public static CheckMultiagentResponse unmarshall(CheckMultiagentResponse checkMultiagentResponse, UnmarshallerContext _ctx) {
		
		checkMultiagentResponse.setCode(_ctx.stringValue("CheckMultiagentResponse.Code"));
		checkMultiagentResponse.setSuccess(_ctx.booleanValue("CheckMultiagentResponse.Success"));
		checkMultiagentResponse.setMessage(_ctx.stringValue("CheckMultiagentResponse.Message"));

		Response response = new Response();
		response.setData(_ctx.stringValue("CheckMultiagentResponse.Response.Data"));
		response.setSuccess(_ctx.booleanValue("CheckMultiagentResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("CheckMultiagentResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("CheckMultiagentResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("CheckMultiagentResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("CheckMultiagentResponse.Response.ErrorMessage"));
		checkMultiagentResponse.setResponse(response);
	 
	 	return checkMultiagentResponse;
	}
}