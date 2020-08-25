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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCurrentuserswitchontrialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCurrentuserswitchontrialResponseUnmarshaller {

	public static GetLinkeBahamutCurrentuserswitchontrialResponse unmarshall(GetLinkeBahamutCurrentuserswitchontrialResponse getLinkeBahamutCurrentuserswitchontrialResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCurrentuserswitchontrialResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.RequestId"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.ResultCode"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.ResultMessage"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.ErrorMessage"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchontrialResponse.Message"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCurrentuserswitchontrialResponse.ResponseStatusCode"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setResult(_ctx.booleanValue("GetLinkeBahamutCurrentuserswitchontrialResponse.Result"));
		getLinkeBahamutCurrentuserswitchontrialResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCurrentuserswitchontrialResponse.Success"));
	 
	 	return getLinkeBahamutCurrentuserswitchontrialResponse;
	}
}