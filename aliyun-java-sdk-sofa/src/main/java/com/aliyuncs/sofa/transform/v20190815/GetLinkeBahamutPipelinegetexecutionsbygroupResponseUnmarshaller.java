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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetexecutionsbygroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinegetexecutionsbygroupResponseUnmarshaller {

	public static GetLinkeBahamutPipelinegetexecutionsbygroupResponse unmarshall(GetLinkeBahamutPipelinegetexecutionsbygroupResponse getLinkeBahamutPipelinegetexecutionsbygroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.RequestId"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ResultCode"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ResultMessage"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ErrorMessage"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Message"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContext(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Context"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Description"));
			resultItem.setEndTime(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].EndTime"));
			resultItem.setError(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Error"));
			resultItem.setExecutionId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].ExecutionId"));
			resultItem.setExtraKey(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].ExtraKey"));
			resultItem.setGmtModified(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].GmtModified"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Id"));
			resultItem.setInstanceId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].InstanceId"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Name"));
			resultItem.setPipelineId(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].PipelineId"));
			resultItem.setResult(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Result"));
			resultItem.setStartTime(_ctx.longValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].StartTime"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Status"));

			List<String> historyOperators = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].HistoryOperators.Length"); j++) {
				historyOperators.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].HistoryOperators["+ j +"]"));
			}
			resultItem.setHistoryOperators(historyOperators);

			List<String> stageExecutions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].StageExecutions.Length"); j++) {
				stageExecutions.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].StageExecutions["+ j +"]"));
			}
			resultItem.setStageExecutions(stageExecutions);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("GetLinkeBahamutPipelinegetexecutionsbygroupResponse.Result["+ i +"].Tags["+ j +"]"));
			}
			resultItem.setTags(tags);

			result.add(resultItem);
		}
		getLinkeBahamutPipelinegetexecutionsbygroupResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinegetexecutionsbygroupResponse;
	}
}