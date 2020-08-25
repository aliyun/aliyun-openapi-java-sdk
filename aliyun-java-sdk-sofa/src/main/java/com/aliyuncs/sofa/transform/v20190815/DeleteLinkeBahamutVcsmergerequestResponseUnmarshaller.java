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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static DeleteLinkeBahamutVcsmergerequestResponse unmarshall(DeleteLinkeBahamutVcsmergerequestResponse deleteLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.RequestId"));
		deleteLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.ResultCode"));
		deleteLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		deleteLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		deleteLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmergerequestResponse.Message"));
		deleteLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		deleteLinkeBahamutVcsmergerequestResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutVcsmergerequestResponse.Result"));
		deleteLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutVcsmergerequestResponse.Success"));
	 
	 	return deleteLinkeBahamutVcsmergerequestResponse;
	}
}