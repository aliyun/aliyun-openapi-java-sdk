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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutStctaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutStctaskResponseUnmarshaller {

	public static CheckLinkeBahamutStctaskResponse unmarshall(CheckLinkeBahamutStctaskResponse checkLinkeBahamutStctaskResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutStctaskResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.RequestId"));
		checkLinkeBahamutStctaskResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.ResultCode"));
		checkLinkeBahamutStctaskResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.ResultMessage"));
		checkLinkeBahamutStctaskResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.ErrorMessage"));
		checkLinkeBahamutStctaskResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutStctaskResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutStctaskResponse.Message"));
		checkLinkeBahamutStctaskResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutStctaskResponse.ResponseStatusCode"));
		checkLinkeBahamutStctaskResponse.setResult(_ctx.booleanValue("CheckLinkeBahamutStctaskResponse.Result"));
		checkLinkeBahamutStctaskResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutStctaskResponse.Success"));
	 
	 	return checkLinkeBahamutStctaskResponse;
	}
}