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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutWriteflagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutWriteflagResponseUnmarshaller {

	public static SetLinkeBahamutWriteflagResponse unmarshall(SetLinkeBahamutWriteflagResponse setLinkeBahamutWriteflagResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutWriteflagResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.RequestId"));
		setLinkeBahamutWriteflagResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.ResultCode"));
		setLinkeBahamutWriteflagResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.ResultMessage"));
		setLinkeBahamutWriteflagResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.ErrorMessage"));
		setLinkeBahamutWriteflagResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.ErrorMsgParamsMap"));
		setLinkeBahamutWriteflagResponse.setMessage(_ctx.stringValue("SetLinkeBahamutWriteflagResponse.Message"));
		setLinkeBahamutWriteflagResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutWriteflagResponse.ResponseStatusCode"));
		setLinkeBahamutWriteflagResponse.setResult(_ctx.booleanValue("SetLinkeBahamutWriteflagResponse.Result"));
		setLinkeBahamutWriteflagResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutWriteflagResponse.Success"));
	 
	 	return setLinkeBahamutWriteflagResponse;
	}
}