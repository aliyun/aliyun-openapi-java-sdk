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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetexecutionResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetexecutionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetexecutionResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetexecutionResponse unmarshall(GetLinkeBahamutPipelinegetexecutionResponse getLinkeBahamutPipelinegetexecutionResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetexecutionResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.RequestId"));
		getLinkeBahamutPipelinegetexecutionResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.ResultCode"));
		getLinkeBahamutPipelinegetexecutionResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.ResultMessage"));
		getLinkeBahamutPipelinegetexecutionResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetexecutionResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetexecutionResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Message"));
		getLinkeBahamutPipelinegetexecutionResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetexecutionResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetexecutionResponse.Success"));

		Result result = new Result();
		result.setContext(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Context"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Description"));
		result.setEndTime(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.EndTime"));
		result.setError(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Error"));
		result.setExecutionId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.ExecutionId"));
		result.setExtraKey(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.ExtraKey"));
		result.setGmtModified(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Id"));
		result.setInstanceId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.InstanceId"));
		result.setName(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Name"));
		result.setPipelineId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.PipelineId"));
		result.setResult(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Result"));
		result.setStartTime(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.StartTime"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Status"));

		List<String> historyOperators = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.HistoryOperators.Length"); i++) {
			historyOperators.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.HistoryOperators["+ i +"]"));
		}
		result.setHistoryOperators(historyOperators);

		List<String> stageExecutions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.StageExecutions.Length"); i++) {
			stageExecutions.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.StageExecutions["+ i +"]"));
		}
		result.setStageExecutions(stageExecutions);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		getLinkeBahamutPipelinegetexecutionResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinegetexecutionResponse;
	}
}