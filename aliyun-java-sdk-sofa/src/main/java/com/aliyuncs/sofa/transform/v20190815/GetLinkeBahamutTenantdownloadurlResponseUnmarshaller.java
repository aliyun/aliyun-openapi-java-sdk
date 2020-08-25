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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantdownloadurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTenantdownloadurlResponseUnmarshaller {

	public static GetLinkeBahamutTenantdownloadurlResponse unmarshall(GetLinkeBahamutTenantdownloadurlResponse getLinkeBahamutTenantdownloadurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTenantdownloadurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.RequestId"));
		getLinkeBahamutTenantdownloadurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.ResultCode"));
		getLinkeBahamutTenantdownloadurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.ResultMessage"));
		getLinkeBahamutTenantdownloadurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.ErrorMessage"));
		getLinkeBahamutTenantdownloadurlResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTenantdownloadurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.Message"));
		getLinkeBahamutTenantdownloadurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTenantdownloadurlResponse.ResponseStatusCode"));
		getLinkeBahamutTenantdownloadurlResponse.setResult(_ctx.stringValue("GetLinkeBahamutTenantdownloadurlResponse.Result"));
		getLinkeBahamutTenantdownloadurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTenantdownloadurlResponse.Success"));
	 
	 	return getLinkeBahamutTenantdownloadurlResponse;
	}
}