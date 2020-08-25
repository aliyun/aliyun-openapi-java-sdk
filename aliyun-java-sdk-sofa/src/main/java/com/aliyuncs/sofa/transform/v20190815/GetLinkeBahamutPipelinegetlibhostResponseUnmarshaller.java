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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetlibhostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetlibhostResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetlibhostResponse unmarshall(GetLinkeBahamutPipelinegetlibhostResponse getLinkeBahamutPipelinegetlibhostResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetlibhostResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.RequestId"));
		getLinkeBahamutPipelinegetlibhostResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.ResultCode"));
		getLinkeBahamutPipelinegetlibhostResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.ResultMessage"));
		getLinkeBahamutPipelinegetlibhostResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetlibhostResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetlibhostResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.Message"));
		getLinkeBahamutPipelinegetlibhostResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetlibhostResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetlibhostResponse.setResult(_ctx.stringValue("GetLinkeBahamutPipelinegetlibhostResponse.Result"));
		getLinkeBahamutPipelinegetlibhostResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetlibhostResponse.Success"));
	 
	 	return getLinkeBahamutPipelinegetlibhostResponse;
	}
}