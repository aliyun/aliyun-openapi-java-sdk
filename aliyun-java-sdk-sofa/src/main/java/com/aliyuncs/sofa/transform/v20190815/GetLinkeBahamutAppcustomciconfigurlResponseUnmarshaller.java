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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppcustomciconfigurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppcustomciconfigurlResponseUnmarshaller {

	public static GetLinkeBahamutAppcustomciconfigurlResponse unmarshall(GetLinkeBahamutAppcustomciconfigurlResponse getLinkeBahamutAppcustomciconfigurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppcustomciconfigurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.RequestId"));
		getLinkeBahamutAppcustomciconfigurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.ResultCode"));
		getLinkeBahamutAppcustomciconfigurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.ResultMessage"));
		getLinkeBahamutAppcustomciconfigurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.ErrorMessage"));
		getLinkeBahamutAppcustomciconfigurlResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppcustomciconfigurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.Message"));
		getLinkeBahamutAppcustomciconfigurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppcustomciconfigurlResponse.ResponseStatusCode"));
		getLinkeBahamutAppcustomciconfigurlResponse.setResult(_ctx.stringValue("GetLinkeBahamutAppcustomciconfigurlResponse.Result"));
		getLinkeBahamutAppcustomciconfigurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppcustomciconfigurlResponse.Success"));
	 
	 	return getLinkeBahamutAppcustomciconfigurlResponse;
	}
}