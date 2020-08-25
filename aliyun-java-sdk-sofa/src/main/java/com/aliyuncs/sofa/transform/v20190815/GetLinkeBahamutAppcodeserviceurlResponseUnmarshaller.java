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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppcodeserviceurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppcodeserviceurlResponseUnmarshaller {

	public static GetLinkeBahamutAppcodeserviceurlResponse unmarshall(GetLinkeBahamutAppcodeserviceurlResponse getLinkeBahamutAppcodeserviceurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppcodeserviceurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.RequestId"));
		getLinkeBahamutAppcodeserviceurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.ResultCode"));
		getLinkeBahamutAppcodeserviceurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.ResultMessage"));
		getLinkeBahamutAppcodeserviceurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.ErrorMessage"));
		getLinkeBahamutAppcodeserviceurlResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppcodeserviceurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.Message"));
		getLinkeBahamutAppcodeserviceurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppcodeserviceurlResponse.ResponseStatusCode"));
		getLinkeBahamutAppcodeserviceurlResponse.setResult(_ctx.stringValue("GetLinkeBahamutAppcodeserviceurlResponse.Result"));
		getLinkeBahamutAppcodeserviceurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppcodeserviceurlResponse.Success"));
	 
	 	return getLinkeBahamutAppcodeserviceurlResponse;
	}
}