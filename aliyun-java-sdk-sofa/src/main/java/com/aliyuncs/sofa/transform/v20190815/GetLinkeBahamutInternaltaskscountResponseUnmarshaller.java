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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutInternaltaskscountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutInternaltaskscountResponseUnmarshaller {

	public static GetLinkeBahamutInternaltaskscountResponse unmarshall(GetLinkeBahamutInternaltaskscountResponse getLinkeBahamutInternaltaskscountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutInternaltaskscountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.RequestId"));
		getLinkeBahamutInternaltaskscountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.ResultCode"));
		getLinkeBahamutInternaltaskscountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.ResultMessage"));
		getLinkeBahamutInternaltaskscountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.ErrorMessage"));
		getLinkeBahamutInternaltaskscountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutInternaltaskscountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutInternaltaskscountResponse.Message"));
		getLinkeBahamutInternaltaskscountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutInternaltaskscountResponse.ResponseStatusCode"));
		getLinkeBahamutInternaltaskscountResponse.setResult(_ctx.longValue("GetLinkeBahamutInternaltaskscountResponse.Result"));
		getLinkeBahamutInternaltaskscountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutInternaltaskscountResponse.Success"));
	 
	 	return getLinkeBahamutInternaltaskscountResponse;
	}
}