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

import com.aliyuncs.mseap.model.v20210118.CallbackTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CallbackTaskResponseUnmarshaller {

	public static CallbackTaskResponse unmarshall(CallbackTaskResponse callbackTaskResponse, UnmarshallerContext _ctx) {
		
		callbackTaskResponse.setRequestId(_ctx.stringValue("CallbackTaskResponse.RequestId"));
		callbackTaskResponse.setAllowRetry(_ctx.booleanValue("CallbackTaskResponse.AllowRetry"));
		callbackTaskResponse.setErrorMsg(_ctx.stringValue("CallbackTaskResponse.ErrorMsg"));
		callbackTaskResponse.setHttpStatusCode(_ctx.integerValue("CallbackTaskResponse.HttpStatusCode"));
		callbackTaskResponse.setDynamicCode(_ctx.stringValue("CallbackTaskResponse.DynamicCode"));
		callbackTaskResponse.setErrorCode(_ctx.stringValue("CallbackTaskResponse.ErrorCode"));
		callbackTaskResponse.setDynamicMessage(_ctx.stringValue("CallbackTaskResponse.DynamicMessage"));
		callbackTaskResponse.setModule(_ctx.booleanValue("CallbackTaskResponse.Module"));
		callbackTaskResponse.setSuccess(_ctx.booleanValue("CallbackTaskResponse.Success"));
		callbackTaskResponse.setAppName(_ctx.stringValue("CallbackTaskResponse.AppName"));
	 
	 	return callbackTaskResponse;
	}
}