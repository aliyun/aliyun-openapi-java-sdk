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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetpipelinestatusbystageResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetpipelinestatusbystageResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetpipelinestatusbystageResponseUnmarshaller {

	public static GetLinkeBahamutGetpipelinestatusbystageResponse unmarshall(GetLinkeBahamutGetpipelinestatusbystageResponse getLinkeBahamutGetpipelinestatusbystageResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetpipelinestatusbystageResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.RequestId"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.ResultCode"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.ResultMessage"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.ErrorMessage"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Message"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.ResponseStatusCode"));
		getLinkeBahamutGetpipelinestatusbystageResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContext(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Context"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Description"));
			resultItem.setEndTime(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].EndTime"));
			resultItem.setError(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Error"));
			resultItem.setExecutionId(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].ExecutionId"));
			resultItem.setExtraKey(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].ExtraKey"));
			resultItem.setGmtModified(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].GmtModified"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Id"));
			resultItem.setInstanceId(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].InstanceId"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Name"));
			resultItem.setPipelineId(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].PipelineId"));
			resultItem.setResult(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Result"));
			resultItem.setStartTime(_ctx.longValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].StartTime"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Status"));

			List<String> historyOperators = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].HistoryOperators.Length"); j++) {
				historyOperators.add(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].HistoryOperators["+ j +"]"));
			}
			resultItem.setHistoryOperators(historyOperators);

			List<String> stageExecutions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].StageExecutions.Length"); j++) {
				stageExecutions.add(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].StageExecutions["+ j +"]"));
			}
			resultItem.setStageExecutions(stageExecutions);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("GetLinkeBahamutGetpipelinestatusbystageResponse.Result["+ i +"].Tags["+ j +"]"));
			}
			resultItem.setTags(tags);

			result.add(resultItem);
		}
		getLinkeBahamutGetpipelinestatusbystageResponse.setResult(result);
	 
	 	return getLinkeBahamutGetpipelinestatusbystageResponse;
	}
}