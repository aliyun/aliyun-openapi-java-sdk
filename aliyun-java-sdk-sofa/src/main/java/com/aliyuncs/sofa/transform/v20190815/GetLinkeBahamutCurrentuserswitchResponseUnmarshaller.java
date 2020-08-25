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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCurrentuserswitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCurrentuserswitchResponseUnmarshaller {

	public static GetLinkeBahamutCurrentuserswitchResponse unmarshall(GetLinkeBahamutCurrentuserswitchResponse getLinkeBahamutCurrentuserswitchResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCurrentuserswitchResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.RequestId"));
		getLinkeBahamutCurrentuserswitchResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.ResultCode"));
		getLinkeBahamutCurrentuserswitchResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.ResultMessage"));
		getLinkeBahamutCurrentuserswitchResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.ErrorMessage"));
		getLinkeBahamutCurrentuserswitchResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCurrentuserswitchResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.Message"));
		getLinkeBahamutCurrentuserswitchResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCurrentuserswitchResponse.ResponseStatusCode"));
		getLinkeBahamutCurrentuserswitchResponse.setResult(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchResponse.Result"));
		getLinkeBahamutCurrentuserswitchResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCurrentuserswitchResponse.Success"));
	 
	 	return getLinkeBahamutCurrentuserswitchResponse;
	}
}