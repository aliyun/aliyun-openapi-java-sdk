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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainiterationcountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainiterationcountResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainiterationcountResponse unmarshall(GetLinkeBahamutArchdomainiterationcountResponse getLinkeBahamutArchdomainiterationcountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainiterationcountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.RequestId"));
		getLinkeBahamutArchdomainiterationcountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.ResultCode"));
		getLinkeBahamutArchdomainiterationcountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.ResultMessage"));
		getLinkeBahamutArchdomainiterationcountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.ErrorMessage"));
		getLinkeBahamutArchdomainiterationcountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainiterationcountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainiterationcountResponse.Message"));
		getLinkeBahamutArchdomainiterationcountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainiterationcountResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainiterationcountResponse.setResult(_ctx.longValue("GetLinkeBahamutArchdomainiterationcountResponse.Result"));
		getLinkeBahamutArchdomainiterationcountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainiterationcountResponse.Success"));
	 
	 	return getLinkeBahamutArchdomainiterationcountResponse;
	}
}