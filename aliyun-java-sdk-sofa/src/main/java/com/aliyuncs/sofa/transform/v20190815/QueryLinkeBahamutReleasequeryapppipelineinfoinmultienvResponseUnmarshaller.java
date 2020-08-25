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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponseUnmarshaller {

	public static QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse unmarshall(QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.RequestId"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.ResultCode"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.ResultMessage"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.ErrorMessage"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Message"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.ResponseStatusCode"));
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Success"));

		Result result = new Result();
		result.setContext(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Context"));
		result.setDescription(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Description"));
		result.setEndTime(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.EndTime"));
		result.setError(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Error"));
		result.setExecutionId(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.ExecutionId"));
		result.setExtraKey(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.ExtraKey"));
		result.setGmtModified(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Id"));
		result.setInstanceId(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.InstanceId"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Name"));
		result.setPipelineId(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.PipelineId"));
		result.setResult(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Result"));
		result.setStartTime(_ctx.longValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.StartTime"));
		result.setStatus(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Status"));

		List<String> historyOperators = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.HistoryOperators.Length"); i++) {
			historyOperators.add(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.HistoryOperators["+ i +"]"));
		}
		result.setHistoryOperators(historyOperators);

		List<String> stageExecutions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.StageExecutions.Length"); i++) {
			stageExecutions.add(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.StageExecutions["+ i +"]"));
		}
		result.setStageExecutions(stageExecutions);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse.setResult(result);
	 
	 	return queryLinkeBahamutReleasequeryapppipelineinfoinmultienvResponse;
	}
}