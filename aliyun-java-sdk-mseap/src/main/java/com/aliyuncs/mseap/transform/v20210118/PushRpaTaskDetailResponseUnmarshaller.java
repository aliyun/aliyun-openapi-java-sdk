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

import com.aliyuncs.mseap.model.v20210118.PushRpaTaskDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushRpaTaskDetailResponseUnmarshaller {

	public static PushRpaTaskDetailResponse unmarshall(PushRpaTaskDetailResponse pushRpaTaskDetailResponse, UnmarshallerContext _ctx) {
		
		pushRpaTaskDetailResponse.setRequestId(_ctx.stringValue("PushRpaTaskDetailResponse.RequestId"));
		pushRpaTaskDetailResponse.setAllowRetry(_ctx.booleanValue("PushRpaTaskDetailResponse.AllowRetry"));
		pushRpaTaskDetailResponse.setErrorMsg(_ctx.stringValue("PushRpaTaskDetailResponse.ErrorMsg"));
		pushRpaTaskDetailResponse.setHttpStatusCode(_ctx.integerValue("PushRpaTaskDetailResponse.HttpStatusCode"));
		pushRpaTaskDetailResponse.setDynamicCode(_ctx.stringValue("PushRpaTaskDetailResponse.DynamicCode"));
		pushRpaTaskDetailResponse.setErrorCode(_ctx.stringValue("PushRpaTaskDetailResponse.ErrorCode"));
		pushRpaTaskDetailResponse.setDynamicMessage(_ctx.stringValue("PushRpaTaskDetailResponse.DynamicMessage"));
		pushRpaTaskDetailResponse.setModule(_ctx.stringValue("PushRpaTaskDetailResponse.Module"));
		pushRpaTaskDetailResponse.setSuccess(_ctx.booleanValue("PushRpaTaskDetailResponse.Success"));
		pushRpaTaskDetailResponse.setAppName(_ctx.stringValue("PushRpaTaskDetailResponse.AppName"));
	 
	 	return pushRpaTaskDetailResponse;
	}
}