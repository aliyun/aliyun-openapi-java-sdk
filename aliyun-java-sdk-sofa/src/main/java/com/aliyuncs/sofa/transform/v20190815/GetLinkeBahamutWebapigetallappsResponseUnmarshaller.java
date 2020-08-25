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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetallappsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetallappsResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetallappsResponse unmarshall(GetLinkeBahamutWebapigetallappsResponse getLinkeBahamutWebapigetallappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetallappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.RequestId"));
		getLinkeBahamutWebapigetallappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.ResultCode"));
		getLinkeBahamutWebapigetallappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.ResultMessage"));
		getLinkeBahamutWebapigetallappsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.ErrorMessage"));
		getLinkeBahamutWebapigetallappsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetallappsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.Message"));
		getLinkeBahamutWebapigetallappsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetallappsResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetallappsResponse.setResult(_ctx.stringValue("GetLinkeBahamutWebapigetallappsResponse.Result"));
		getLinkeBahamutWebapigetallappsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetallappsResponse.Success"));
	 
	 	return getLinkeBahamutWebapigetallappsResponse;
	}
}