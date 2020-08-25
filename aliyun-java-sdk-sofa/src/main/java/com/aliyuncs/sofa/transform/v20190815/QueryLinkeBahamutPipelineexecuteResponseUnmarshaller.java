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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPipelineexecuteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutPipelineexecuteResponseUnmarshaller {

	public static QueryLinkeBahamutPipelineexecuteResponse unmarshall(QueryLinkeBahamutPipelineexecuteResponse queryLinkeBahamutPipelineexecuteResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutPipelineexecuteResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.RequestId"));
		queryLinkeBahamutPipelineexecuteResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.ResultCode"));
		queryLinkeBahamutPipelineexecuteResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.ResultMessage"));
		queryLinkeBahamutPipelineexecuteResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.ErrorMessage"));
		queryLinkeBahamutPipelineexecuteResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutPipelineexecuteResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutPipelineexecuteResponse.Message"));
		queryLinkeBahamutPipelineexecuteResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutPipelineexecuteResponse.ResponseStatusCode"));
		queryLinkeBahamutPipelineexecuteResponse.setResult(_ctx.longValue("QueryLinkeBahamutPipelineexecuteResponse.Result"));
		queryLinkeBahamutPipelineexecuteResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutPipelineexecuteResponse.Success"));
	 
	 	return queryLinkeBahamutPipelineexecuteResponse;
	}
}