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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse unmarshall(UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.RequestId"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.ResultCode"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.ResultMessage"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.ErrorMessage"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.Message"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.Result"));
		updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse.Success"));
	 
	 	return updateLinkeBahamutAdminupdatedataupdateofflineauthcontrolResponse;
	}
}