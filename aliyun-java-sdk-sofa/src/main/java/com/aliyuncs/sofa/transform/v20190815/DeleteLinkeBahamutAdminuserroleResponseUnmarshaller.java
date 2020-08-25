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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAdminuserroleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAdminuserroleResponseUnmarshaller {

	public static DeleteLinkeBahamutAdminuserroleResponse unmarshall(DeleteLinkeBahamutAdminuserroleResponse deleteLinkeBahamutAdminuserroleResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAdminuserroleResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.RequestId"));
		deleteLinkeBahamutAdminuserroleResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.ResultCode"));
		deleteLinkeBahamutAdminuserroleResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.ResultMessage"));
		deleteLinkeBahamutAdminuserroleResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.ErrorMessage"));
		deleteLinkeBahamutAdminuserroleResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAdminuserroleResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAdminuserroleResponse.Message"));
		deleteLinkeBahamutAdminuserroleResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAdminuserroleResponse.ResponseStatusCode"));
		deleteLinkeBahamutAdminuserroleResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutAdminuserroleResponse.Result"));
		deleteLinkeBahamutAdminuserroleResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAdminuserroleResponse.Success"));
	 
	 	return deleteLinkeBahamutAdminuserroleResponse;
	}
}