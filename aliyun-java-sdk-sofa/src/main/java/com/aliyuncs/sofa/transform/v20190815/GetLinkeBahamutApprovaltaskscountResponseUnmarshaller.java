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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApprovaltaskscountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutApprovaltaskscountResponseUnmarshaller {

	public static GetLinkeBahamutApprovaltaskscountResponse unmarshall(GetLinkeBahamutApprovaltaskscountResponse getLinkeBahamutApprovaltaskscountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutApprovaltaskscountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.RequestId"));
		getLinkeBahamutApprovaltaskscountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.ResultCode"));
		getLinkeBahamutApprovaltaskscountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.ResultMessage"));
		getLinkeBahamutApprovaltaskscountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.ErrorMessage"));
		getLinkeBahamutApprovaltaskscountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutApprovaltaskscountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutApprovaltaskscountResponse.Message"));
		getLinkeBahamutApprovaltaskscountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutApprovaltaskscountResponse.ResponseStatusCode"));
		getLinkeBahamutApprovaltaskscountResponse.setResult(_ctx.longValue("GetLinkeBahamutApprovaltaskscountResponse.Result"));
		getLinkeBahamutApprovaltaskscountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutApprovaltaskscountResponse.Success"));
	 
	 	return getLinkeBahamutApprovaltaskscountResponse;
	}
}