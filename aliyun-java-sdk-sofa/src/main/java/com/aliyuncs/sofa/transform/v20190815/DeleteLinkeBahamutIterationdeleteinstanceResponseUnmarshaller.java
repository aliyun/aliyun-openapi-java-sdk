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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutIterationdeleteinstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutIterationdeleteinstanceResponseUnmarshaller {

	public static DeleteLinkeBahamutIterationdeleteinstanceResponse unmarshall(DeleteLinkeBahamutIterationdeleteinstanceResponse deleteLinkeBahamutIterationdeleteinstanceResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutIterationdeleteinstanceResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.RequestId"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.ResultCode"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.ResultMessage"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.ErrorMessage"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.Message"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.ResponseStatusCode"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.Result"));
		deleteLinkeBahamutIterationdeleteinstanceResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutIterationdeleteinstanceResponse.Success"));
	 
	 	return deleteLinkeBahamutIterationdeleteinstanceResponse;
	}
}