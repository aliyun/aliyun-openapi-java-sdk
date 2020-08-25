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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutVcscommitcommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutVcscommitcommentResponseUnmarshaller {

	public static DeleteLinkeBahamutVcscommitcommentResponse unmarshall(DeleteLinkeBahamutVcscommitcommentResponse deleteLinkeBahamutVcscommitcommentResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutVcscommitcommentResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.RequestId"));
		deleteLinkeBahamutVcscommitcommentResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.ResultCode"));
		deleteLinkeBahamutVcscommitcommentResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.ResultMessage"));
		deleteLinkeBahamutVcscommitcommentResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.ErrorMessage"));
		deleteLinkeBahamutVcscommitcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutVcscommitcommentResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.Message"));
		deleteLinkeBahamutVcscommitcommentResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutVcscommitcommentResponse.ResponseStatusCode"));
		deleteLinkeBahamutVcscommitcommentResponse.setResult(_ctx.stringValue("DeleteLinkeBahamutVcscommitcommentResponse.Result"));
		deleteLinkeBahamutVcscommitcommentResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutVcscommitcommentResponse.Success"));
	 
	 	return deleteLinkeBahamutVcscommitcommentResponse;
	}
}