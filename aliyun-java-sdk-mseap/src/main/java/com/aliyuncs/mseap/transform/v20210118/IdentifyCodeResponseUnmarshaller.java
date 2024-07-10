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

import com.aliyuncs.mseap.model.v20210118.IdentifyCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IdentifyCodeResponseUnmarshaller {

	public static IdentifyCodeResponse unmarshall(IdentifyCodeResponse identifyCodeResponse, UnmarshallerContext _ctx) {
		
		identifyCodeResponse.setRequestId(_ctx.stringValue("IdentifyCodeResponse.RequestId"));
		identifyCodeResponse.setAllowRetry(_ctx.booleanValue("IdentifyCodeResponse.AllowRetry"));
		identifyCodeResponse.setErrorMsg(_ctx.stringValue("IdentifyCodeResponse.ErrorMsg"));
		identifyCodeResponse.setHttpStatusCode(_ctx.integerValue("IdentifyCodeResponse.HttpStatusCode"));
		identifyCodeResponse.setDynamicCode(_ctx.stringValue("IdentifyCodeResponse.DynamicCode"));
		identifyCodeResponse.setErrorCode(_ctx.stringValue("IdentifyCodeResponse.ErrorCode"));
		identifyCodeResponse.setDynamicMessage(_ctx.stringValue("IdentifyCodeResponse.DynamicMessage"));
		identifyCodeResponse.setModule(_ctx.stringValue("IdentifyCodeResponse.Module"));
		identifyCodeResponse.setSuccess(_ctx.booleanValue("IdentifyCodeResponse.Success"));
		identifyCodeResponse.setAppName(_ctx.stringValue("IdentifyCodeResponse.AppName"));
	 
	 	return identifyCodeResponse;
	}
}