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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAntflowtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAntflowtaskResponseUnmarshaller {

	public static GetLinkeBahamutAntflowtaskResponse unmarshall(GetLinkeBahamutAntflowtaskResponse getLinkeBahamutAntflowtaskResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAntflowtaskResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.RequestId"));
		getLinkeBahamutAntflowtaskResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.ResultCode"));
		getLinkeBahamutAntflowtaskResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.ResultMessage"));
		getLinkeBahamutAntflowtaskResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.ErrorMessage"));
		getLinkeBahamutAntflowtaskResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAntflowtaskResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAntflowtaskResponse.Message"));
		getLinkeBahamutAntflowtaskResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAntflowtaskResponse.ResponseStatusCode"));
		getLinkeBahamutAntflowtaskResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAntflowtaskResponse.Success"));
	 
	 	return getLinkeBahamutAntflowtaskResponse;
	}
}