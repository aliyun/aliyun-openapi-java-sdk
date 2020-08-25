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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutVcsbranchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutVcsbranchResponseUnmarshaller {

	public static DeleteLinkeBahamutVcsbranchResponse unmarshall(DeleteLinkeBahamutVcsbranchResponse deleteLinkeBahamutVcsbranchResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutVcsbranchResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.RequestId"));
		deleteLinkeBahamutVcsbranchResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.ResultCode"));
		deleteLinkeBahamutVcsbranchResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.ResultMessage"));
		deleteLinkeBahamutVcsbranchResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.ErrorMessage"));
		deleteLinkeBahamutVcsbranchResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutVcsbranchResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.Message"));
		deleteLinkeBahamutVcsbranchResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutVcsbranchResponse.ResponseStatusCode"));
		deleteLinkeBahamutVcsbranchResponse.setResult(_ctx.stringValue("DeleteLinkeBahamutVcsbranchResponse.Result"));
		deleteLinkeBahamutVcsbranchResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutVcsbranchResponse.Success"));
	 
	 	return deleteLinkeBahamutVcsbranchResponse;
	}
}