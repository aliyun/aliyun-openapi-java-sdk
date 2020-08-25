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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutSandboxsandboxdeploycheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutSandboxsandboxdeploycheckResponseUnmarshaller {

	public static CheckLinkeBahamutSandboxsandboxdeploycheckResponse unmarshall(CheckLinkeBahamutSandboxsandboxdeploycheckResponse checkLinkeBahamutSandboxsandboxdeploycheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.RequestId"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.ResultCode"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.ResultMessage"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.ErrorMessage"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.Message"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.ResponseStatusCode"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setResult(_ctx.stringValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.Result"));
		checkLinkeBahamutSandboxsandboxdeploycheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutSandboxsandboxdeploycheckResponse.Success"));
	 
	 	return checkLinkeBahamutSandboxsandboxdeploycheckResponse;
	}
}