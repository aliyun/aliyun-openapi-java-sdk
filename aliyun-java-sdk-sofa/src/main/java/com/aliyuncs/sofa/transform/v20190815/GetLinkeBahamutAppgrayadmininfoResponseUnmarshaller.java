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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppgrayadmininfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppgrayadmininfoResponseUnmarshaller {

	public static GetLinkeBahamutAppgrayadmininfoResponse unmarshall(GetLinkeBahamutAppgrayadmininfoResponse getLinkeBahamutAppgrayadmininfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppgrayadmininfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.RequestId"));
		getLinkeBahamutAppgrayadmininfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.ResultCode"));
		getLinkeBahamutAppgrayadmininfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.ResultMessage"));
		getLinkeBahamutAppgrayadmininfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.ErrorMessage"));
		getLinkeBahamutAppgrayadmininfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppgrayadmininfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.Message"));
		getLinkeBahamutAppgrayadmininfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppgrayadmininfoResponse.ResponseStatusCode"));
		getLinkeBahamutAppgrayadmininfoResponse.setResult(_ctx.stringValue("GetLinkeBahamutAppgrayadmininfoResponse.Result"));
		getLinkeBahamutAppgrayadmininfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppgrayadmininfoResponse.Success"));
	 
	 	return getLinkeBahamutAppgrayadmininfoResponse;
	}
}