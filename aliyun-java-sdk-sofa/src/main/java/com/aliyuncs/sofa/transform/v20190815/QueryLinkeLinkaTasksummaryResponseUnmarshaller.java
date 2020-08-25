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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTasksummaryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTasksummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaTasksummaryResponseUnmarshaller {

	public static QueryLinkeLinkaTasksummaryResponse unmarshall(QueryLinkeLinkaTasksummaryResponse queryLinkeLinkaTasksummaryResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaTasksummaryResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.RequestId"));
		queryLinkeLinkaTasksummaryResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.ResultCode"));
		queryLinkeLinkaTasksummaryResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.ResultMessage"));
		queryLinkeLinkaTasksummaryResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.ErrorCode"));
		queryLinkeLinkaTasksummaryResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.ErrorMsg"));
		queryLinkeLinkaTasksummaryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaTasksummaryResponse.ResponseStatusCode"));
		queryLinkeLinkaTasksummaryResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaTasksummaryResponse.Success"));

		Result result = new Result();
		result.setBranch(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Branch"));
		result.setCommitId(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.CommitId"));
		result.setCosts(_ctx.longValue("QueryLinkeLinkaTasksummaryResponse.Result.Costs"));
		result.setCreatedAt(_ctx.longValue("QueryLinkeLinkaTasksummaryResponse.Result.CreatedAt"));
		result.setDiff(_ctx.booleanValue("QueryLinkeLinkaTasksummaryResponse.Result.Diff"));
		result.setDiffOverflow(_ctx.booleanValue("QueryLinkeLinkaTasksummaryResponse.Result.DiffOverflow"));
		result.setMessage(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Message"));
		result.setSource(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Source"));
		result.setStartCommitId(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.StartCommitId"));
		result.setStatus(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Status"));
		result.setSummary(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Summary"));
		result.setTaskId(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.TaskId"));
		result.setUrl(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.Url"));

		List<String> tooLargeFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaTasksummaryResponse.Result.TooLargeFiles.Length"); i++) {
			tooLargeFiles.add(_ctx.stringValue("QueryLinkeLinkaTasksummaryResponse.Result.TooLargeFiles["+ i +"]"));
		}
		result.setTooLargeFiles(tooLargeFiles);
		queryLinkeLinkaTasksummaryResponse.setResult(result);
	 
	 	return queryLinkeLinkaTasksummaryResponse;
	}
}