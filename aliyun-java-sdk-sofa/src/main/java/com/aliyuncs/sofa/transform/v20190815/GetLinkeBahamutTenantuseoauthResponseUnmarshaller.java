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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantuseoauthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTenantuseoauthResponseUnmarshaller {

	public static GetLinkeBahamutTenantuseoauthResponse unmarshall(GetLinkeBahamutTenantuseoauthResponse getLinkeBahamutTenantuseoauthResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTenantuseoauthResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.RequestId"));
		getLinkeBahamutTenantuseoauthResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.ResultCode"));
		getLinkeBahamutTenantuseoauthResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.ResultMessage"));
		getLinkeBahamutTenantuseoauthResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.ErrorMessage"));
		getLinkeBahamutTenantuseoauthResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTenantuseoauthResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTenantuseoauthResponse.Message"));
		getLinkeBahamutTenantuseoauthResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTenantuseoauthResponse.ResponseStatusCode"));
		getLinkeBahamutTenantuseoauthResponse.setResult(_ctx.booleanValue("GetLinkeBahamutTenantuseoauthResponse.Result"));
		getLinkeBahamutTenantuseoauthResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTenantuseoauthResponse.Success"));
	 
	 	return getLinkeBahamutTenantuseoauthResponse;
	}
}