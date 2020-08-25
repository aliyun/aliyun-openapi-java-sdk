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

import com.aliyuncs.sofa.model.v20190815.EnableLinkeBahamutAdminiterationtemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableLinkeBahamutAdminiterationtemplateResponseUnmarshaller {

	public static EnableLinkeBahamutAdminiterationtemplateResponse unmarshall(EnableLinkeBahamutAdminiterationtemplateResponse enableLinkeBahamutAdminiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		enableLinkeBahamutAdminiterationtemplateResponse.setRequestId(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.RequestId"));
		enableLinkeBahamutAdminiterationtemplateResponse.setResultCode(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.ResultCode"));
		enableLinkeBahamutAdminiterationtemplateResponse.setResultMessage(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.ResultMessage"));
		enableLinkeBahamutAdminiterationtemplateResponse.setErrorMessage(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.ErrorMessage"));
		enableLinkeBahamutAdminiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.ErrorMsgParamsMap"));
		enableLinkeBahamutAdminiterationtemplateResponse.setMessage(_ctx.stringValue("EnableLinkeBahamutAdminiterationtemplateResponse.Message"));
		enableLinkeBahamutAdminiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("EnableLinkeBahamutAdminiterationtemplateResponse.ResponseStatusCode"));
		enableLinkeBahamutAdminiterationtemplateResponse.setResult(_ctx.booleanValue("EnableLinkeBahamutAdminiterationtemplateResponse.Result"));
		enableLinkeBahamutAdminiterationtemplateResponse.setSuccess(_ctx.booleanValue("EnableLinkeBahamutAdminiterationtemplateResponse.Success"));
	 
	 	return enableLinkeBahamutAdminiterationtemplateResponse;
	}
}