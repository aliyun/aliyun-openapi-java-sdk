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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCommonconfiggetbytypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCommonconfiggetbytypeResponseUnmarshaller {

	public static GetLinkeBahamutCommonconfiggetbytypeResponse unmarshall(GetLinkeBahamutCommonconfiggetbytypeResponse getLinkeBahamutCommonconfiggetbytypeResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCommonconfiggetbytypeResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.RequestId"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.ResultCode"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.ResultMessage"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.ErrorMessage"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.Message"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCommonconfiggetbytypeResponse.ResponseStatusCode"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setResult(_ctx.stringValue("GetLinkeBahamutCommonconfiggetbytypeResponse.Result"));
		getLinkeBahamutCommonconfiggetbytypeResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCommonconfiggetbytypeResponse.Success"));
	 
	 	return getLinkeBahamutCommonconfiggetbytypeResponse;
	}
}