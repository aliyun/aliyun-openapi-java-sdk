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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPipelinererunResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutPipelinererunResponseUnmarshaller {

	public static QueryLinkeBahamutPipelinererunResponse unmarshall(QueryLinkeBahamutPipelinererunResponse queryLinkeBahamutPipelinererunResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutPipelinererunResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.RequestId"));
		queryLinkeBahamutPipelinererunResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.ResultCode"));
		queryLinkeBahamutPipelinererunResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.ResultMessage"));
		queryLinkeBahamutPipelinererunResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.ErrorMessage"));
		queryLinkeBahamutPipelinererunResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutPipelinererunResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutPipelinererunResponse.Message"));
		queryLinkeBahamutPipelinererunResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutPipelinererunResponse.ResponseStatusCode"));
		queryLinkeBahamutPipelinererunResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutPipelinererunResponse.Success"));
	 
	 	return queryLinkeBahamutPipelinererunResponse;
	}
}