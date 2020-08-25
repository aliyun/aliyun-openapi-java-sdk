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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutComponentexecutionsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutComponentexecutionsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutComponentexecutionsResponseUnmarshaller {

	public static GetLinkeBahamutComponentexecutionsResponse unmarshall(GetLinkeBahamutComponentexecutionsResponse getLinkeBahamutComponentexecutionsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutComponentexecutionsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.RequestId"));
		getLinkeBahamutComponentexecutionsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.ResultCode"));
		getLinkeBahamutComponentexecutionsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.ResultMessage"));
		getLinkeBahamutComponentexecutionsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.ErrorMessage"));
		getLinkeBahamutComponentexecutionsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutComponentexecutionsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Message"));
		getLinkeBahamutComponentexecutionsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutComponentexecutionsResponse.ResponseStatusCode"));
		getLinkeBahamutComponentexecutionsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutComponentexecutionsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutComponentexecutionsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCausedBy(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].CausedBy"));
			resultItem.setComponentDisplayName(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ComponentDisplayName"));
			resultItem.setComponentId(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ComponentId"));
			resultItem.setComponentName(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ComponentName"));
			resultItem.setComponentType(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ComponentType"));
			resultItem.setData(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].Data"));
			resultItem.setDetailStatus(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].DetailStatus"));
			resultItem.setErrorMsg(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ErrorMsg"));
			resultItem.setExecutionResult(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ExecutionResult"));
			resultItem.setExecutionTaskId(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ExecutionTaskId"));
			resultItem.setExpressionData(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ExpressionData"));
			resultItem.setExpressionDesc(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ExpressionDesc"));
			resultItem.setExpressionRule(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].ExpressionRule"));
			resultItem.setFailReason(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].FailReason"));
			resultItem.setHtmlText(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].HtmlText"));
			resultItem.setLoggerUrl(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].LoggerUrl"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].Status"));
			resultItem.setSuccess(_ctx.booleanValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].Success"));
			resultItem.setTipHtml(_ctx.stringValue("GetLinkeBahamutComponentexecutionsResponse.Result["+ i +"].TipHtml"));

			result.add(resultItem);
		}
		getLinkeBahamutComponentexecutionsResponse.setResult(result);
	 
	 	return getLinkeBahamutComponentexecutionsResponse;
	}
}