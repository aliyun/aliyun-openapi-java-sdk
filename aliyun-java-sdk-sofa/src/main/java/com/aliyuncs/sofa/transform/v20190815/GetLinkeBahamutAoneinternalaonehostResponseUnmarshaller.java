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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalaonehostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalaonehostResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalaonehostResponse unmarshall(GetLinkeBahamutAoneinternalaonehostResponse getLinkeBahamutAoneinternalaonehostResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalaonehostResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.RequestId"));
		getLinkeBahamutAoneinternalaonehostResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.ResultCode"));
		getLinkeBahamutAoneinternalaonehostResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.ResultMessage"));
		getLinkeBahamutAoneinternalaonehostResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalaonehostResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalaonehostResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.Message"));
		getLinkeBahamutAoneinternalaonehostResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalaonehostResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalaonehostResponse.setResult(_ctx.stringValue("GetLinkeBahamutAoneinternalaonehostResponse.Result"));
		getLinkeBahamutAoneinternalaonehostResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalaonehostResponse.Success"));
	 
	 	return getLinkeBahamutAoneinternalaonehostResponse;
	}
}