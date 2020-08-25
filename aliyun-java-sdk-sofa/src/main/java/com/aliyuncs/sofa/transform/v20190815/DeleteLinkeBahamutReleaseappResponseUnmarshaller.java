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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutReleaseappResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutReleaseappResponseUnmarshaller {

	public static DeleteLinkeBahamutReleaseappResponse unmarshall(DeleteLinkeBahamutReleaseappResponse deleteLinkeBahamutReleaseappResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutReleaseappResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.RequestId"));
		deleteLinkeBahamutReleaseappResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.ResultCode"));
		deleteLinkeBahamutReleaseappResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.ResultMessage"));
		deleteLinkeBahamutReleaseappResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.ErrorMessage"));
		deleteLinkeBahamutReleaseappResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutReleaseappResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.Message"));
		deleteLinkeBahamutReleaseappResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutReleaseappResponse.ResponseStatusCode"));
		deleteLinkeBahamutReleaseappResponse.setResult(_ctx.stringValue("DeleteLinkeBahamutReleaseappResponse.Result"));
		deleteLinkeBahamutReleaseappResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutReleaseappResponse.Success"));
	 
	 	return deleteLinkeBahamutReleaseappResponse;
	}
}