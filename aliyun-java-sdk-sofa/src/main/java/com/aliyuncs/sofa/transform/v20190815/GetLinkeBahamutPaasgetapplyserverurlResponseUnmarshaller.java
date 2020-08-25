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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPaasgetapplyserverurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPaasgetapplyserverurlResponseUnmarshaller {

	public static GetLinkeBahamutPaasgetapplyserverurlResponse unmarshall(GetLinkeBahamutPaasgetapplyserverurlResponse getLinkeBahamutPaasgetapplyserverurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPaasgetapplyserverurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.RequestId"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.ResultCode"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.ResultMessage"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.ErrorMessage"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.Message"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPaasgetapplyserverurlResponse.ResponseStatusCode"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setResult(_ctx.stringValue("GetLinkeBahamutPaasgetapplyserverurlResponse.Result"));
		getLinkeBahamutPaasgetapplyserverurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPaasgetapplyserverurlResponse.Success"));
	 
	 	return getLinkeBahamutPaasgetapplyserverurlResponse;
	}
}