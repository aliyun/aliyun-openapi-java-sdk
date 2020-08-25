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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAdminsecretdicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAdminsecretdicResponseUnmarshaller {

	public static DeleteLinkeBahamutAdminsecretdicResponse unmarshall(DeleteLinkeBahamutAdminsecretdicResponse deleteLinkeBahamutAdminsecretdicResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAdminsecretdicResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.RequestId"));
		deleteLinkeBahamutAdminsecretdicResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.ResultCode"));
		deleteLinkeBahamutAdminsecretdicResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.ResultMessage"));
		deleteLinkeBahamutAdminsecretdicResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.ErrorMessage"));
		deleteLinkeBahamutAdminsecretdicResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAdminsecretdicResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAdminsecretdicResponse.Message"));
		deleteLinkeBahamutAdminsecretdicResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAdminsecretdicResponse.ResponseStatusCode"));
		deleteLinkeBahamutAdminsecretdicResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutAdminsecretdicResponse.Result"));
		deleteLinkeBahamutAdminsecretdicResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAdminsecretdicResponse.Success"));
	 
	 	return deleteLinkeBahamutAdminsecretdicResponse;
	}
}