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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStcinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStcinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutStcinfoResponseUnmarshaller {

	public static GetLinkeBahamutStcinfoResponse unmarshall(GetLinkeBahamutStcinfoResponse getLinkeBahamutStcinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutStcinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.RequestId"));
		getLinkeBahamutStcinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.ResultCode"));
		getLinkeBahamutStcinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.ResultMessage"));
		getLinkeBahamutStcinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.ErrorMessage"));
		getLinkeBahamutStcinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutStcinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.Message"));
		getLinkeBahamutStcinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutStcinfoResponse.ResponseStatusCode"));
		getLinkeBahamutStcinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutStcinfoResponse.Success"));

		Result result = new Result();
		result.setBlocked(_ctx.booleanValue("GetLinkeBahamutStcinfoResponse.Result.Blocked"));
		result.setOnlyBlockStc(_ctx.booleanValue("GetLinkeBahamutStcinfoResponse.Result.OnlyBlockStc"));
		result.setPass(_ctx.booleanValue("GetLinkeBahamutStcinfoResponse.Result.Pass"));
		result.setStcManagerNames(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.Result.StcManagerNames"));
		result.setStcManagerNos(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.Result.StcManagerNos"));
		result.setUnit(_ctx.stringValue("GetLinkeBahamutStcinfoResponse.Result.Unit"));
		getLinkeBahamutStcinfoResponse.setResult(result);
	 
	 	return getLinkeBahamutStcinfoResponse;
	}
}