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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantuploadinfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTenantuploadinfoResponseUnmarshaller {

	public static GetLinkeBahamutTenantuploadinfoResponse unmarshall(GetLinkeBahamutTenantuploadinfoResponse getLinkeBahamutTenantuploadinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTenantuploadinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.RequestId"));
		getLinkeBahamutTenantuploadinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.ResultCode"));
		getLinkeBahamutTenantuploadinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.ResultMessage"));
		getLinkeBahamutTenantuploadinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.ErrorMessage"));
		getLinkeBahamutTenantuploadinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTenantuploadinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.Message"));
		getLinkeBahamutTenantuploadinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTenantuploadinfoResponse.ResponseStatusCode"));
		getLinkeBahamutTenantuploadinfoResponse.setResult(_ctx.stringValue("GetLinkeBahamutTenantuploadinfoResponse.Result"));
		getLinkeBahamutTenantuploadinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTenantuploadinfoResponse.Success"));
	 
	 	return getLinkeBahamutTenantuploadinfoResponse;
	}
}