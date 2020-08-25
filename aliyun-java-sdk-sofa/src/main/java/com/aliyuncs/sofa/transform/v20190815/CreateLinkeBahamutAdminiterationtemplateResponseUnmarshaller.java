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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAdminiterationtemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAdminiterationtemplateResponseUnmarshaller {

	public static CreateLinkeBahamutAdminiterationtemplateResponse unmarshall(CreateLinkeBahamutAdminiterationtemplateResponse createLinkeBahamutAdminiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAdminiterationtemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.RequestId"));
		createLinkeBahamutAdminiterationtemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.ResultCode"));
		createLinkeBahamutAdminiterationtemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.ResultMessage"));
		createLinkeBahamutAdminiterationtemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.ErrorMessage"));
		createLinkeBahamutAdminiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAdminiterationtemplateResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAdminiterationtemplateResponse.Message"));
		createLinkeBahamutAdminiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAdminiterationtemplateResponse.ResponseStatusCode"));
		createLinkeBahamutAdminiterationtemplateResponse.setResult(_ctx.booleanValue("CreateLinkeBahamutAdminiterationtemplateResponse.Result"));
		createLinkeBahamutAdminiterationtemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAdminiterationtemplateResponse.Success"));
	 
	 	return createLinkeBahamutAdminiterationtemplateResponse;
	}
}