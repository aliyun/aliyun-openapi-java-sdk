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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStcresultResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStcresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutStcresultResponseUnmarshaller {

	public static GetLinkeBahamutStcresultResponse unmarshall(GetLinkeBahamutStcresultResponse getLinkeBahamutStcresultResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutStcresultResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutStcresultResponse.RequestId"));
		getLinkeBahamutStcresultResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutStcresultResponse.ResultCode"));
		getLinkeBahamutStcresultResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutStcresultResponse.ResultMessage"));
		getLinkeBahamutStcresultResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutStcresultResponse.ErrorMessage"));
		getLinkeBahamutStcresultResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutStcresultResponse.ErrorMsgParamsMap"));
		getLinkeBahamutStcresultResponse.setMessage(_ctx.stringValue("GetLinkeBahamutStcresultResponse.Message"));
		getLinkeBahamutStcresultResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutStcresultResponse.ResponseStatusCode"));
		getLinkeBahamutStcresultResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutStcresultResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutStcresultResponse.Result.AppName"));
		result.setErrorMes(_ctx.stringValue("GetLinkeBahamutStcresultResponse.Result.ErrorMes"));
		result.setResult(_ctx.stringValue("GetLinkeBahamutStcresultResponse.Result.Result"));
		result.setSuccess(_ctx.booleanValue("GetLinkeBahamutStcresultResponse.Result.Success"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutStcresultResponse.Result.TenantId"));
		getLinkeBahamutStcresultResponse.setResult(result);
	 
	 	return getLinkeBahamutStcresultResponse;
	}
}