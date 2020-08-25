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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengettenantsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengettenantsResponseUnmarshaller {

	public static GetLinkeBahamutOpengettenantsResponse unmarshall(GetLinkeBahamutOpengettenantsResponse getLinkeBahamutOpengettenantsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengettenantsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.RequestId"));
		getLinkeBahamutOpengettenantsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.ResultCode"));
		getLinkeBahamutOpengettenantsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.ResultMessage"));
		getLinkeBahamutOpengettenantsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.ErrorMessage"));
		getLinkeBahamutOpengettenantsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengettenantsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.Message"));
		getLinkeBahamutOpengettenantsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengettenantsResponse.ResponseStatusCode"));
		getLinkeBahamutOpengettenantsResponse.setResult(_ctx.stringValue("GetLinkeBahamutOpengettenantsResponse.Result"));
		getLinkeBahamutOpengettenantsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengettenantsResponse.Success"));
	 
	 	return getLinkeBahamutOpengettenantsResponse;
	}
}