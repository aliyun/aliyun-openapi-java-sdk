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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutWebapideletelterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutWebapideletelterationResponseUnmarshaller {

	public static DeleteLinkeBahamutWebapideletelterationResponse unmarshall(DeleteLinkeBahamutWebapideletelterationResponse deleteLinkeBahamutWebapideletelterationResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutWebapideletelterationResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.RequestId"));
		deleteLinkeBahamutWebapideletelterationResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.ResultCode"));
		deleteLinkeBahamutWebapideletelterationResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.ResultMessage"));
		deleteLinkeBahamutWebapideletelterationResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.ErrorMessage"));
		deleteLinkeBahamutWebapideletelterationResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutWebapideletelterationResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutWebapideletelterationResponse.Message"));
		deleteLinkeBahamutWebapideletelterationResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutWebapideletelterationResponse.ResponseStatusCode"));
		deleteLinkeBahamutWebapideletelterationResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutWebapideletelterationResponse.Success"));
	 
	 	return deleteLinkeBahamutWebapideletelterationResponse;
	}
}