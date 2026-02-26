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

import com.aliyuncs.mseap.model.v20210118.PushRpaTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushRpaTaskResponseUnmarshaller {

	public static PushRpaTaskResponse unmarshall(PushRpaTaskResponse pushRpaTaskResponse, UnmarshallerContext _ctx) {
		
		pushRpaTaskResponse.setRequestId(_ctx.stringValue("PushRpaTaskResponse.RequestId"));
		pushRpaTaskResponse.setAllowRetry(_ctx.booleanValue("PushRpaTaskResponse.AllowRetry"));
		pushRpaTaskResponse.setErrorMsg(_ctx.stringValue("PushRpaTaskResponse.ErrorMsg"));
		pushRpaTaskResponse.setHttpStatusCode(_ctx.integerValue("PushRpaTaskResponse.HttpStatusCode"));
		pushRpaTaskResponse.setDynamicCode(_ctx.stringValue("PushRpaTaskResponse.DynamicCode"));
		pushRpaTaskResponse.setErrorCode(_ctx.stringValue("PushRpaTaskResponse.ErrorCode"));
		pushRpaTaskResponse.setDynamicMessage(_ctx.stringValue("PushRpaTaskResponse.DynamicMessage"));
		pushRpaTaskResponse.setModule(_ctx.stringValue("PushRpaTaskResponse.Module"));
		pushRpaTaskResponse.setSuccess(_ctx.booleanValue("PushRpaTaskResponse.Success"));
		pushRpaTaskResponse.setAppName(_ctx.stringValue("PushRpaTaskResponse.AppName"));
	 
	 	return pushRpaTaskResponse;
	}
}