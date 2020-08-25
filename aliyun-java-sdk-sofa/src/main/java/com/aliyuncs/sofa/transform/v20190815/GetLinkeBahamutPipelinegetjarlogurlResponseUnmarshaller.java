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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetjarlogurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetjarlogurlResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetjarlogurlResponse unmarshall(GetLinkeBahamutPipelinegetjarlogurlResponse getLinkeBahamutPipelinegetjarlogurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetjarlogurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.RequestId"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.ResultCode"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.ResultMessage"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.Message"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetjarlogurlResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setResult(_ctx.stringValue("GetLinkeBahamutPipelinegetjarlogurlResponse.Result"));
		getLinkeBahamutPipelinegetjarlogurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetjarlogurlResponse.Success"));
	 
	 	return getLinkeBahamutPipelinegetjarlogurlResponse;
	}
}