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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutCurrentuserswitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutCurrentuserswitchResponseUnmarshaller {

	public static CreateLinkeBahamutCurrentuserswitchResponse unmarshall(CreateLinkeBahamutCurrentuserswitchResponse createLinkeBahamutCurrentuserswitchResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutCurrentuserswitchResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.RequestId"));
		createLinkeBahamutCurrentuserswitchResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.ResultCode"));
		createLinkeBahamutCurrentuserswitchResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.ResultMessage"));
		createLinkeBahamutCurrentuserswitchResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.ErrorMessage"));
		createLinkeBahamutCurrentuserswitchResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.ErrorMsgParamsMap"));
		createLinkeBahamutCurrentuserswitchResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.Message"));
		createLinkeBahamutCurrentuserswitchResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutCurrentuserswitchResponse.ResponseStatusCode"));
		createLinkeBahamutCurrentuserswitchResponse.setResult(_ctx.stringValue("CreateLinkeBahamutCurrentuserswitchResponse.Result"));
		createLinkeBahamutCurrentuserswitchResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutCurrentuserswitchResponse.Success"));
	 
	 	return createLinkeBahamutCurrentuserswitchResponse;
	}
}