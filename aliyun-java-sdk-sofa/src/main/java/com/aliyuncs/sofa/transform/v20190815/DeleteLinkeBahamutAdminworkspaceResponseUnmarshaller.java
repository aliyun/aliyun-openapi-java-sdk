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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAdminworkspaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAdminworkspaceResponseUnmarshaller {

	public static DeleteLinkeBahamutAdminworkspaceResponse unmarshall(DeleteLinkeBahamutAdminworkspaceResponse deleteLinkeBahamutAdminworkspaceResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAdminworkspaceResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.RequestId"));
		deleteLinkeBahamutAdminworkspaceResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.ResultCode"));
		deleteLinkeBahamutAdminworkspaceResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.ResultMessage"));
		deleteLinkeBahamutAdminworkspaceResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.ErrorMessage"));
		deleteLinkeBahamutAdminworkspaceResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAdminworkspaceResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.Message"));
		deleteLinkeBahamutAdminworkspaceResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAdminworkspaceResponse.ResponseStatusCode"));
		deleteLinkeBahamutAdminworkspaceResponse.setResult(_ctx.stringValue("DeleteLinkeBahamutAdminworkspaceResponse.Result"));
		deleteLinkeBahamutAdminworkspaceResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAdminworkspaceResponse.Success"));
	 
	 	return deleteLinkeBahamutAdminworkspaceResponse;
	}
}