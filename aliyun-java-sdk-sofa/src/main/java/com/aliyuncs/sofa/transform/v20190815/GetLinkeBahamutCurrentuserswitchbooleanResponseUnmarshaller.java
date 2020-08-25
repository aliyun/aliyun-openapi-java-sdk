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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCurrentuserswitchbooleanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCurrentuserswitchbooleanResponseUnmarshaller {

	public static GetLinkeBahamutCurrentuserswitchbooleanResponse unmarshall(GetLinkeBahamutCurrentuserswitchbooleanResponse getLinkeBahamutCurrentuserswitchbooleanResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCurrentuserswitchbooleanResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.RequestId"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.ResultCode"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.ResultMessage"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.ErrorMessage"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.Message"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.ResponseStatusCode"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setResult(_ctx.stringValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.Result"));
		getLinkeBahamutCurrentuserswitchbooleanResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCurrentuserswitchbooleanResponse.Success"));
	 
	 	return getLinkeBahamutCurrentuserswitchbooleanResponse;
	}
}