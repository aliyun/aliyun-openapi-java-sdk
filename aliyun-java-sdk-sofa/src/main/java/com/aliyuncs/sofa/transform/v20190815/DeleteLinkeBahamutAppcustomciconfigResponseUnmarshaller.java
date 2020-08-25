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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppcustomciconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAppcustomciconfigResponseUnmarshaller {

	public static DeleteLinkeBahamutAppcustomciconfigResponse unmarshall(DeleteLinkeBahamutAppcustomciconfigResponse deleteLinkeBahamutAppcustomciconfigResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAppcustomciconfigResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.RequestId"));
		deleteLinkeBahamutAppcustomciconfigResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.ResultCode"));
		deleteLinkeBahamutAppcustomciconfigResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.ResultMessage"));
		deleteLinkeBahamutAppcustomciconfigResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.ErrorMessage"));
		deleteLinkeBahamutAppcustomciconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAppcustomciconfigResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAppcustomciconfigResponse.Message"));
		deleteLinkeBahamutAppcustomciconfigResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAppcustomciconfigResponse.ResponseStatusCode"));
		deleteLinkeBahamutAppcustomciconfigResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutAppcustomciconfigResponse.Result"));
		deleteLinkeBahamutAppcustomciconfigResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAppcustomciconfigResponse.Success"));
	 
	 	return deleteLinkeBahamutAppcustomciconfigResponse;
	}
}