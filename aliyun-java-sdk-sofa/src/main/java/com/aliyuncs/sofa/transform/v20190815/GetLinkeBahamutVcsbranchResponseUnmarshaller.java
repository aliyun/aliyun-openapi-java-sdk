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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsbranchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsbranchResponseUnmarshaller {

	public static GetLinkeBahamutVcsbranchResponse unmarshall(GetLinkeBahamutVcsbranchResponse getLinkeBahamutVcsbranchResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsbranchResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.RequestId"));
		getLinkeBahamutVcsbranchResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.ResultCode"));
		getLinkeBahamutVcsbranchResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.ResultMessage"));
		getLinkeBahamutVcsbranchResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.ErrorMessage"));
		getLinkeBahamutVcsbranchResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsbranchResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.Message"));
		getLinkeBahamutVcsbranchResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsbranchResponse.ResponseStatusCode"));
		getLinkeBahamutVcsbranchResponse.setResult(_ctx.stringValue("GetLinkeBahamutVcsbranchResponse.Result"));
		getLinkeBahamutVcsbranchResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsbranchResponse.Success"));
	 
	 	return getLinkeBahamutVcsbranchResponse;
	}
}