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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetcomponentresultResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetcomponentresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetcomponentresultResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetcomponentresultResponse unmarshall(GetLinkeBahamutWebapigetcomponentresultResponse getLinkeBahamutWebapigetcomponentresultResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetcomponentresultResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.RequestId"));
		getLinkeBahamutWebapigetcomponentresultResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.ResultCode"));
		getLinkeBahamutWebapigetcomponentresultResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.ResultMessage"));
		getLinkeBahamutWebapigetcomponentresultResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.ErrorMessage"));
		getLinkeBahamutWebapigetcomponentresultResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetcomponentresultResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Message"));
		getLinkeBahamutWebapigetcomponentresultResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetcomponentresultResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetcomponentresultResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetcomponentresultResponse.Success"));

		Result result = new Result();
		result.setCausedBy(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.CausedBy"));
		result.setComponentDisplayName(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ComponentDisplayName"));
		result.setComponentId(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ComponentId"));
		result.setComponentName(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ComponentName"));
		result.setComponentType(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ComponentType"));
		result.setData(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.Data"));
		result.setDetailStatus(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.DetailStatus"));
		result.setErrorMsg(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ErrorMsg"));
		result.setExecutionResult(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ExecutionResult"));
		result.setExecutionTaskId(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ExecutionTaskId"));
		result.setExpressionData(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ExpressionData"));
		result.setExpressionDesc(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ExpressionDesc"));
		result.setExpressionRule(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.ExpressionRule"));
		result.setFailReason(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.FailReason"));
		result.setHtmlText(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.HtmlText"));
		result.setLoggerUrl(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.LoggerUrl"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.Status"));
		result.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.Success"));
		result.setTipHtml(_ctx.stringValue("GetLinkeBahamutWebapigetcomponentresultResponse.Result.TipHtml"));
		getLinkeBahamutWebapigetcomponentresultResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetcomponentresultResponse;
	}
}