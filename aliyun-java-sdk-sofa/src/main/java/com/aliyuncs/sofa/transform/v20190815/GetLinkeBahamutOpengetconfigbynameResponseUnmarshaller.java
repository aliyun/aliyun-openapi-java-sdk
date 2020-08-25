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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetconfigbynameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetconfigbynameResponseUnmarshaller {

	public static GetLinkeBahamutOpengetconfigbynameResponse unmarshall(GetLinkeBahamutOpengetconfigbynameResponse getLinkeBahamutOpengetconfigbynameResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetconfigbynameResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.RequestId"));
		getLinkeBahamutOpengetconfigbynameResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.ResultCode"));
		getLinkeBahamutOpengetconfigbynameResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.ResultMessage"));
		getLinkeBahamutOpengetconfigbynameResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.ErrorMessage"));
		getLinkeBahamutOpengetconfigbynameResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetconfigbynameResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.Message"));
		getLinkeBahamutOpengetconfigbynameResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetconfigbynameResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetconfigbynameResponse.setResult(_ctx.stringValue("GetLinkeBahamutOpengetconfigbynameResponse.Result"));
		getLinkeBahamutOpengetconfigbynameResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetconfigbynameResponse.Success"));
	 
	 	return getLinkeBahamutOpengetconfigbynameResponse;
	}
}