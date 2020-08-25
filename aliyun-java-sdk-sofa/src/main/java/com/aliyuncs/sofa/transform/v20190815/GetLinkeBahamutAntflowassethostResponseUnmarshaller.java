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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAntflowassethostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAntflowassethostResponseUnmarshaller {

	public static GetLinkeBahamutAntflowassethostResponse unmarshall(GetLinkeBahamutAntflowassethostResponse getLinkeBahamutAntflowassethostResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAntflowassethostResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.RequestId"));
		getLinkeBahamutAntflowassethostResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.ResultCode"));
		getLinkeBahamutAntflowassethostResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.ResultMessage"));
		getLinkeBahamutAntflowassethostResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.ErrorMessage"));
		getLinkeBahamutAntflowassethostResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAntflowassethostResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.Message"));
		getLinkeBahamutAntflowassethostResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAntflowassethostResponse.ResponseStatusCode"));
		getLinkeBahamutAntflowassethostResponse.setResult(_ctx.stringValue("GetLinkeBahamutAntflowassethostResponse.Result"));
		getLinkeBahamutAntflowassethostResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAntflowassethostResponse.Success"));
	 
	 	return getLinkeBahamutAntflowassethostResponse;
	}
}