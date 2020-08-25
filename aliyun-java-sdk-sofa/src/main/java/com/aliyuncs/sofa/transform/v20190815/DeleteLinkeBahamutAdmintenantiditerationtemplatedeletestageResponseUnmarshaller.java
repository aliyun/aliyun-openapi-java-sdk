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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponseUnmarshaller {

	public static DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse unmarshall(DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.RequestId"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.ResultCode"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.ResultMessage"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.ErrorMessage"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.Message"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.ResponseStatusCode"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.Result"));
		deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse.Success"));
	 
	 	return deleteLinkeBahamutAdmintenantiditerationtemplatedeletestageResponse;
	}
}