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

import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutSandboxdeploybyreleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseLinkeBahamutSandboxdeploybyreleaseResponseUnmarshaller {

	public static ReleaseLinkeBahamutSandboxdeploybyreleaseResponse unmarshall(ReleaseLinkeBahamutSandboxdeploybyreleaseResponse releaseLinkeBahamutSandboxdeploybyreleaseResponse, UnmarshallerContext _ctx) {
		
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setRequestId(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.RequestId"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setResultCode(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.ResultCode"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setResultMessage(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.ResultMessage"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setErrorMessage(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.ErrorMessage"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.ErrorMsgParamsMap"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setMessage(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.Message"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setResponseStatusCode(_ctx.longValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.ResponseStatusCode"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setResult(_ctx.stringValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.Result"));
		releaseLinkeBahamutSandboxdeploybyreleaseResponse.setSuccess(_ctx.booleanValue("ReleaseLinkeBahamutSandboxdeploybyreleaseResponse.Success"));
	 
	 	return releaseLinkeBahamutSandboxdeploybyreleaseResponse;
	}
}