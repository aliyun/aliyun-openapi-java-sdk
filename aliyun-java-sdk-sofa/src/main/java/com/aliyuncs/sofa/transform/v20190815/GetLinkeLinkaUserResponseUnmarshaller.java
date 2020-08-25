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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinkaUserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinkaUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinkaUserResponseUnmarshaller {

	public static GetLinkeLinkaUserResponse unmarshall(GetLinkeLinkaUserResponse getLinkeLinkaUserResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinkaUserResponse.setRequestId(_ctx.stringValue("GetLinkeLinkaUserResponse.RequestId"));
		getLinkeLinkaUserResponse.setResultCode(_ctx.stringValue("GetLinkeLinkaUserResponse.ResultCode"));
		getLinkeLinkaUserResponse.setResultMessage(_ctx.stringValue("GetLinkeLinkaUserResponse.ResultMessage"));
		getLinkeLinkaUserResponse.setErrorCode(_ctx.stringValue("GetLinkeLinkaUserResponse.ErrorCode"));
		getLinkeLinkaUserResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinkaUserResponse.ErrorMsg"));
		getLinkeLinkaUserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinkaUserResponse.ResponseStatusCode"));
		getLinkeLinkaUserResponse.setSuccess(_ctx.booleanValue("GetLinkeLinkaUserResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.Account"));
		result.setDepartment(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.EmpId"));
		result.setName(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeLinkaUserResponse.Result.Nick"));
		getLinkeLinkaUserResponse.setResult(result);
	 
	 	return getLinkeLinkaUserResponse;
	}
}