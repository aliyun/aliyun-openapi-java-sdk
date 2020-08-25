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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskstatisticsinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskstatisticsinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaTaskstatisticsinfoResponseUnmarshaller {

	public static QueryLinkeLinkaTaskstatisticsinfoResponse unmarshall(QueryLinkeLinkaTaskstatisticsinfoResponse queryLinkeLinkaTaskstatisticsinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaTaskstatisticsinfoResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.RequestId"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.ResultCode"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.ResultMessage"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.ErrorCode"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.ErrorMsg"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.ResponseStatusCode"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Success"));

		Result result = new Result();
		result.setCodeLines(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.CodeLines"));
		result.setContentLines(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.ContentLines"));
		result.setCosts(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.Costs"));
		result.setDuplicateCodeLines(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.DuplicateCodeLines"));
		result.setMessage(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.Message"));
		result.setPublicApis(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.PublicApis"));
		result.setPublicCommentedApis(_ctx.longValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.PublicCommentedApis"));
		result.setStatus(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.Status"));
		result.setTaskId(_ctx.stringValue("QueryLinkeLinkaTaskstatisticsinfoResponse.Result.TaskId"));
		queryLinkeLinkaTaskstatisticsinfoResponse.setResult(result);
	 
	 	return queryLinkeLinkaTaskstatisticsinfoResponse;
	}
}