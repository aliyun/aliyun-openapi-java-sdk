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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutVcsmrcommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutVcsmrcommentResponseUnmarshaller {

	public static DeleteLinkeBahamutVcsmrcommentResponse unmarshall(DeleteLinkeBahamutVcsmrcommentResponse deleteLinkeBahamutVcsmrcommentResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutVcsmrcommentResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.RequestId"));
		deleteLinkeBahamutVcsmrcommentResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.ResultCode"));
		deleteLinkeBahamutVcsmrcommentResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.ResultMessage"));
		deleteLinkeBahamutVcsmrcommentResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.ErrorMessage"));
		deleteLinkeBahamutVcsmrcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutVcsmrcommentResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.Message"));
		deleteLinkeBahamutVcsmrcommentResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutVcsmrcommentResponse.ResponseStatusCode"));
		deleteLinkeBahamutVcsmrcommentResponse.setResult(_ctx.stringValue("DeleteLinkeBahamutVcsmrcommentResponse.Result"));
		deleteLinkeBahamutVcsmrcommentResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutVcsmrcommentResponse.Success"));
	 
	 	return deleteLinkeBahamutVcsmrcommentResponse;
	}
}