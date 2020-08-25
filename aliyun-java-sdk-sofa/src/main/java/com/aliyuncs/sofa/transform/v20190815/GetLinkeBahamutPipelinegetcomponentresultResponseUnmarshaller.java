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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetcomponentresultResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetcomponentresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetcomponentresultResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetcomponentresultResponse unmarshall(GetLinkeBahamutPipelinegetcomponentresultResponse getLinkeBahamutPipelinegetcomponentresultResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetcomponentresultResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.RequestId"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.ResultCode"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.ResultMessage"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Message"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetcomponentresultResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Success"));

		Result result = new Result();
		result.setCausedBy(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.CausedBy"));
		result.setComponentDisplayName(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ComponentDisplayName"));
		result.setComponentId(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ComponentId"));
		result.setComponentName(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ComponentName"));
		result.setComponentType(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ComponentType"));
		result.setData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.Data"));
		result.setDetailStatus(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.DetailStatus"));
		result.setErrorMsg(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ErrorMsg"));
		result.setExecutionResult(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ExecutionResult"));
		result.setExecutionTaskId(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ExecutionTaskId"));
		result.setExpressionData(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ExpressionData"));
		result.setExpressionDesc(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ExpressionDesc"));
		result.setExpressionRule(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.ExpressionRule"));
		result.setFailReason(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.FailReason"));
		result.setHtmlText(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.HtmlText"));
		result.setLoggerUrl(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.LoggerUrl"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.Status"));
		result.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.Success"));
		result.setTipHtml(_ctx.stringValue("GetLinkeBahamutPipelinegetcomponentresultResponse.Result.TipHtml"));
		getLinkeBahamutPipelinegetcomponentresultResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinegetcomponentresultResponse;
	}
}