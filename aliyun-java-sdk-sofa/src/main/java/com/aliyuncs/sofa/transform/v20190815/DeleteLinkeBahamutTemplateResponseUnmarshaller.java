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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutTemplateResponseUnmarshaller {

	public static DeleteLinkeBahamutTemplateResponse unmarshall(DeleteLinkeBahamutTemplateResponse deleteLinkeBahamutTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutTemplateResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.RequestId"));
		deleteLinkeBahamutTemplateResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.ResultCode"));
		deleteLinkeBahamutTemplateResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.ResultMessage"));
		deleteLinkeBahamutTemplateResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.ErrorMessage"));
		deleteLinkeBahamutTemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutTemplateResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutTemplateResponse.Message"));
		deleteLinkeBahamutTemplateResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutTemplateResponse.ResponseStatusCode"));
		deleteLinkeBahamutTemplateResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutTemplateResponse.Result"));
		deleteLinkeBahamutTemplateResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutTemplateResponse.Success"));
	 
	 	return deleteLinkeBahamutTemplateResponse;
	}
}