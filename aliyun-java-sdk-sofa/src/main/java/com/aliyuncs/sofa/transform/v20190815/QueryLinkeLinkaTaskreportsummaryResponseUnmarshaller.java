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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskreportsummaryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskreportsummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaTaskreportsummaryResponseUnmarshaller {

	public static QueryLinkeLinkaTaskreportsummaryResponse unmarshall(QueryLinkeLinkaTaskreportsummaryResponse queryLinkeLinkaTaskreportsummaryResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaTaskreportsummaryResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.RequestId"));
		queryLinkeLinkaTaskreportsummaryResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.ResultCode"));
		queryLinkeLinkaTaskreportsummaryResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.ResultMessage"));
		queryLinkeLinkaTaskreportsummaryResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.ErrorCode"));
		queryLinkeLinkaTaskreportsummaryResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.ErrorMsg"));
		queryLinkeLinkaTaskreportsummaryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaTaskreportsummaryResponse.ResponseStatusCode"));
		queryLinkeLinkaTaskreportsummaryResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaTaskreportsummaryResponse.Success"));

		Result result = new Result();
		result.setBranch(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Branch"));
		result.setCommitId(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.CommitId"));
		result.setCosts(_ctx.longValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Costs"));
		result.setCreatedAt(_ctx.longValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.CreatedAt"));
		result.setDiff(_ctx.booleanValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Diff"));
		result.setDiffOverflow(_ctx.booleanValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.DiffOverflow"));
		result.setMessage(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Message"));
		result.setSource(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Source"));
		result.setStartCommitId(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.StartCommitId"));
		result.setStatus(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Status"));
		result.setSummary(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Summary"));
		result.setTaskId(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.TaskId"));
		result.setUrl(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.Url"));

		List<String> tooLargeFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.TooLargeFiles.Length"); i++) {
			tooLargeFiles.add(_ctx.stringValue("QueryLinkeLinkaTaskreportsummaryResponse.Result.TooLargeFiles["+ i +"]"));
		}
		result.setTooLargeFiles(tooLargeFiles);
		queryLinkeLinkaTaskreportsummaryResponse.setResult(result);
	 
	 	return queryLinkeLinkaTaskreportsummaryResponse;
	}
}