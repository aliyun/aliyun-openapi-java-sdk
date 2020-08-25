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

import com.aliyuncs.sofa.model.v20190815.InitLinkeBahamutCurrentuserswitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitLinkeBahamutCurrentuserswitchResponseUnmarshaller {

	public static InitLinkeBahamutCurrentuserswitchResponse unmarshall(InitLinkeBahamutCurrentuserswitchResponse initLinkeBahamutCurrentuserswitchResponse, UnmarshallerContext _ctx) {
		
		initLinkeBahamutCurrentuserswitchResponse.setRequestId(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.RequestId"));
		initLinkeBahamutCurrentuserswitchResponse.setResultCode(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.ResultCode"));
		initLinkeBahamutCurrentuserswitchResponse.setResultMessage(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.ResultMessage"));
		initLinkeBahamutCurrentuserswitchResponse.setErrorMessage(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.ErrorMessage"));
		initLinkeBahamutCurrentuserswitchResponse.setErrorMsgParamsMap(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.ErrorMsgParamsMap"));
		initLinkeBahamutCurrentuserswitchResponse.setMessage(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.Message"));
		initLinkeBahamutCurrentuserswitchResponse.setResponseStatusCode(_ctx.longValue("InitLinkeBahamutCurrentuserswitchResponse.ResponseStatusCode"));
		initLinkeBahamutCurrentuserswitchResponse.setResult(_ctx.stringValue("InitLinkeBahamutCurrentuserswitchResponse.Result"));
		initLinkeBahamutCurrentuserswitchResponse.setSuccess(_ctx.booleanValue("InitLinkeBahamutCurrentuserswitchResponse.Success"));
	 
	 	return initLinkeBahamutCurrentuserswitchResponse;
	}
}