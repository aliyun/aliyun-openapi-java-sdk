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

import com.aliyuncs.mseap.model.v20210118.PullRpaModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullRpaModelResponseUnmarshaller {

	public static PullRpaModelResponse unmarshall(PullRpaModelResponse pullRpaModelResponse, UnmarshallerContext _ctx) {
		
		pullRpaModelResponse.setRequestId(_ctx.stringValue("PullRpaModelResponse.RequestId"));
		pullRpaModelResponse.setAllowRetry(_ctx.booleanValue("PullRpaModelResponse.AllowRetry"));
		pullRpaModelResponse.setErrorMsg(_ctx.stringValue("PullRpaModelResponse.ErrorMsg"));
		pullRpaModelResponse.setHttpStatusCode(_ctx.integerValue("PullRpaModelResponse.HttpStatusCode"));
		pullRpaModelResponse.setDynamicCode(_ctx.stringValue("PullRpaModelResponse.DynamicCode"));
		pullRpaModelResponse.setErrorCode(_ctx.stringValue("PullRpaModelResponse.ErrorCode"));
		pullRpaModelResponse.setDynamicMessage(_ctx.stringValue("PullRpaModelResponse.DynamicMessage"));
		pullRpaModelResponse.setModule(_ctx.stringValue("PullRpaModelResponse.Module"));
		pullRpaModelResponse.setSuccess(_ctx.booleanValue("PullRpaModelResponse.Success"));
		pullRpaModelResponse.setAppName(_ctx.stringValue("PullRpaModelResponse.AppName"));
	 
	 	return pullRpaModelResponse;
	}
}