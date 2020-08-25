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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationunitbatchnextstageResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationunitbatchnextstageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationunitbatchnextstageResponseUnmarshaller {

	public static QueryLinkeBahamutIterationunitbatchnextstageResponse unmarshall(QueryLinkeBahamutIterationunitbatchnextstageResponse queryLinkeBahamutIterationunitbatchnextstageResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationunitbatchnextstageResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.RequestId"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.ResultCode"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.ResultMessage"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.ErrorMessage"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.Message"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.Success"));

		Result result = new Result();
		result.setIsAllSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.Result.IsAllSuccess"));
		result.setIsSuccess(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.Result.IsSuccess"));
		result.setShowInfo(_ctx.stringValue("QueryLinkeBahamutIterationunitbatchnextstageResponse.Result.ShowInfo"));
		queryLinkeBahamutIterationunitbatchnextstageResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationunitbatchnextstageResponse;
	}
}