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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutEnvconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutEnvconfigResponseUnmarshaller {

	public static GetLinkeBahamutEnvconfigResponse unmarshall(GetLinkeBahamutEnvconfigResponse getLinkeBahamutEnvconfigResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutEnvconfigResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.RequestId"));
		getLinkeBahamutEnvconfigResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.ResultCode"));
		getLinkeBahamutEnvconfigResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.ResultMessage"));
		getLinkeBahamutEnvconfigResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.ErrorMessage"));
		getLinkeBahamutEnvconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.ErrorMsgParamsMap"));
		getLinkeBahamutEnvconfigResponse.setMessage(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.Message"));
		getLinkeBahamutEnvconfigResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutEnvconfigResponse.ResponseStatusCode"));
		getLinkeBahamutEnvconfigResponse.setResult(_ctx.stringValue("GetLinkeBahamutEnvconfigResponse.Result"));
		getLinkeBahamutEnvconfigResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutEnvconfigResponse.Success"));
	 
	 	return getLinkeBahamutEnvconfigResponse;
	}
}