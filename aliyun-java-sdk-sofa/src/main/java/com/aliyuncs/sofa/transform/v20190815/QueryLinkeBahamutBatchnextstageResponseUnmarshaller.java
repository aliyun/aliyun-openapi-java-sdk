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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBatchnextstageResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutBatchnextstageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutBatchnextstageResponseUnmarshaller {

	public static QueryLinkeBahamutBatchnextstageResponse unmarshall(QueryLinkeBahamutBatchnextstageResponse queryLinkeBahamutBatchnextstageResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutBatchnextstageResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.RequestId"));
		queryLinkeBahamutBatchnextstageResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.ResultCode"));
		queryLinkeBahamutBatchnextstageResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.ResultMessage"));
		queryLinkeBahamutBatchnextstageResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.ErrorMessage"));
		queryLinkeBahamutBatchnextstageResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutBatchnextstageResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.Message"));
		queryLinkeBahamutBatchnextstageResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutBatchnextstageResponse.ResponseStatusCode"));
		queryLinkeBahamutBatchnextstageResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutBatchnextstageResponse.Success"));

		Result result = new Result();
		result.setIsAllSuccess(_ctx.booleanValue("QueryLinkeBahamutBatchnextstageResponse.Result.IsAllSuccess"));
		result.setIsSuccess(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.Result.IsSuccess"));
		result.setShowInfo(_ctx.stringValue("QueryLinkeBahamutBatchnextstageResponse.Result.ShowInfo"));
		queryLinkeBahamutBatchnextstageResponse.setResult(result);
	 
	 	return queryLinkeBahamutBatchnextstageResponse;
	}
}