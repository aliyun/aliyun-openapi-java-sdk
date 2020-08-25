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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsequenceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationsequenceResponseUnmarshaller {

	public static GetLinkeBahamutIterationsequenceResponse unmarshall(GetLinkeBahamutIterationsequenceResponse getLinkeBahamutIterationsequenceResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationsequenceResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.RequestId"));
		getLinkeBahamutIterationsequenceResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.ResultCode"));
		getLinkeBahamutIterationsequenceResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.ResultMessage"));
		getLinkeBahamutIterationsequenceResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.ErrorMessage"));
		getLinkeBahamutIterationsequenceResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationsequenceResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.Message"));
		getLinkeBahamutIterationsequenceResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationsequenceResponse.ResponseStatusCode"));
		getLinkeBahamutIterationsequenceResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationsequenceResponse.Result"));
		getLinkeBahamutIterationsequenceResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationsequenceResponse.Success"));
	 
	 	return getLinkeBahamutIterationsequenceResponse;
	}
}