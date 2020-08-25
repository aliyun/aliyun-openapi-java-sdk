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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetlterationunitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetlterationunitResponseUnmarshaller {

	public static GetLinkeBahamutOpengetlterationunitResponse unmarshall(GetLinkeBahamutOpengetlterationunitResponse getLinkeBahamutOpengetlterationunitResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetlterationunitResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.RequestId"));
		getLinkeBahamutOpengetlterationunitResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.ResultCode"));
		getLinkeBahamutOpengetlterationunitResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.ResultMessage"));
		getLinkeBahamutOpengetlterationunitResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.ErrorMessage"));
		getLinkeBahamutOpengetlterationunitResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetlterationunitResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.Message"));
		getLinkeBahamutOpengetlterationunitResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetlterationunitResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetlterationunitResponse.setResult(_ctx.stringValue("GetLinkeBahamutOpengetlterationunitResponse.Result"));
		getLinkeBahamutOpengetlterationunitResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetlterationunitResponse.Success"));
	 
	 	return getLinkeBahamutOpengetlterationunitResponse;
	}
}