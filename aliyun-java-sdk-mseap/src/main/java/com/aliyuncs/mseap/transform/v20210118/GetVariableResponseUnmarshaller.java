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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.GetVariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVariableResponseUnmarshaller {

	public static GetVariableResponse unmarshall(GetVariableResponse getVariableResponse, UnmarshallerContext _ctx) {
		
		getVariableResponse.setRequestId(_ctx.stringValue("GetVariableResponse.RequestId"));
		getVariableResponse.setAllowRetry(_ctx.booleanValue("GetVariableResponse.AllowRetry"));
		getVariableResponse.setErrorMsg(_ctx.stringValue("GetVariableResponse.ErrorMsg"));
		getVariableResponse.setHttpStatusCode(_ctx.integerValue("GetVariableResponse.HttpStatusCode"));
		getVariableResponse.setDynamicCode(_ctx.stringValue("GetVariableResponse.DynamicCode"));
		getVariableResponse.setErrorCode(_ctx.stringValue("GetVariableResponse.ErrorCode"));
		getVariableResponse.setDynamicMessage(_ctx.stringValue("GetVariableResponse.DynamicMessage"));
		getVariableResponse.setModule(_ctx.stringValue("GetVariableResponse.Module"));
		getVariableResponse.setSuccess(_ctx.booleanValue("GetVariableResponse.Success"));
		getVariableResponse.setAppName(_ctx.stringValue("GetVariableResponse.AppName"));
	 
	 	return getVariableResponse;
	}
}