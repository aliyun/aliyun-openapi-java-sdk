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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutIterationunitcodechangecheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutIterationunitcodechangecheckResponseUnmarshaller {

	public static CheckLinkeBahamutIterationunitcodechangecheckResponse unmarshall(CheckLinkeBahamutIterationunitcodechangecheckResponse checkLinkeBahamutIterationunitcodechangecheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutIterationunitcodechangecheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.RequestId"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.ResultCode"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.ResultMessage"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.ErrorMessage"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.Message"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.ResponseStatusCode"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setResult(_ctx.booleanValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.Result"));
		checkLinkeBahamutIterationunitcodechangecheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutIterationunitcodechangecheckResponse.Success"));
	 
	 	return checkLinkeBahamutIterationunitcodechangecheckResponse;
	}
}