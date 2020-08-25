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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetappsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetappsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPaasgetappsResponseUnmarshaller {

	public static GetLinkeBahamutPaasgetappsResponse unmarshall(GetLinkeBahamutPaasgetappsResponse getLinkeBahamutPaasgetappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPaasgetappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.RequestId"));
		getLinkeBahamutPaasgetappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.ResultCode"));
		getLinkeBahamutPaasgetappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.ResultMessage"));
		getLinkeBahamutPaasgetappsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.ErrorMessage"));
		getLinkeBahamutPaasgetappsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPaasgetappsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.Message"));
		getLinkeBahamutPaasgetappsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPaasgetappsResponse.ResponseStatusCode"));
		getLinkeBahamutPaasgetappsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPaasgetappsResponse.Success"));

		Result result = new Result();
		result.setApps(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.Result.Apps"));
		result.setTenant(_ctx.stringValue("GetLinkeBahamutPaasgetappsResponse.Result.Tenant"));
		getLinkeBahamutPaasgetappsResponse.setResult(result);
	 
	 	return getLinkeBahamutPaasgetappsResponse;
	}
}