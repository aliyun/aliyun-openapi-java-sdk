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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdminiterationtemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutAdminiterationtemplateResponseUnmarshaller {

	public static SaveLinkeBahamutAdminiterationtemplateResponse unmarshall(SaveLinkeBahamutAdminiterationtemplateResponse saveLinkeBahamutAdminiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutAdminiterationtemplateResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.RequestId"));
		saveLinkeBahamutAdminiterationtemplateResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.ResultCode"));
		saveLinkeBahamutAdminiterationtemplateResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.ResultMessage"));
		saveLinkeBahamutAdminiterationtemplateResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.ErrorMessage"));
		saveLinkeBahamutAdminiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutAdminiterationtemplateResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateResponse.Message"));
		saveLinkeBahamutAdminiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutAdminiterationtemplateResponse.ResponseStatusCode"));
		saveLinkeBahamutAdminiterationtemplateResponse.setResult(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateResponse.Result"));
		saveLinkeBahamutAdminiterationtemplateResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateResponse.Success"));
	 
	 	return saveLinkeBahamutAdminiterationtemplateResponse;
	}
}