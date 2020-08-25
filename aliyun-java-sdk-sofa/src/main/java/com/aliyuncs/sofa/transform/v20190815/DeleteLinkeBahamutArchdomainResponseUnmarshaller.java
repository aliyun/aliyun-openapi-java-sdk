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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutArchdomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutArchdomainResponseUnmarshaller {

	public static DeleteLinkeBahamutArchdomainResponse unmarshall(DeleteLinkeBahamutArchdomainResponse deleteLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.RequestId"));
		deleteLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.ResultCode"));
		deleteLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.ResultMessage"));
		deleteLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.ErrorMessage"));
		deleteLinkeBahamutArchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainResponse.Message"));
		deleteLinkeBahamutArchdomainResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutArchdomainResponse.ResponseStatusCode"));
		deleteLinkeBahamutArchdomainResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutArchdomainResponse.Result"));
		deleteLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutArchdomainResponse.Success"));
	 
	 	return deleteLinkeBahamutArchdomainResponse;
	}
}