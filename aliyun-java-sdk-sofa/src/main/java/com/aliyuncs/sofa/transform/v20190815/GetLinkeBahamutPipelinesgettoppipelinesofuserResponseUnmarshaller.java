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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgettoppipelinesofuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinesgettoppipelinesofuserResponseUnmarshaller {

	public static GetLinkeBahamutPipelinesgettoppipelinesofuserResponse unmarshall(GetLinkeBahamutPipelinesgettoppipelinesofuserResponse getLinkeBahamutPipelinesgettoppipelinesofuserResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.RequestId"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ResultCode"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ResultMessage"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ErrorMessage"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Message"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Assignee"));
			resultItem.setAuthor(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Author"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Created"));
			resultItem.setExtraDiv(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].ExtraDiv"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Id"));
			resultItem.setIterationName(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].IterationName"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].LastModified"));
			resultItem.setMergeRequestId(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setMergeRequestIid(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].MergeRequestIid"));
			resultItem.setMrState(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].MrState"));
			resultItem.setMrType(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].MrType"));
			resultItem.setMrWebUrl(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].MrWebUrl"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Name"));
			resultItem.setPipelineExecutionStatus(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].PipelineExecutionStatus"));
			resultItem.setPipelineTag(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].PipelineTag"));
			resultItem.setReviewed(_ctx.booleanValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Reviewed"));
			resultItem.setShowState(_ctx.booleanValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].ShowState"));
			resultItem.setSourceBranch(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].SourceBranch"));
			resultItem.setTimelimeComparingTime(_ctx.longValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].TimelimeComparingTime"));
			resultItem.setTriggerByAdmin(_ctx.booleanValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].TriggerByAdmin"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Type"));

			List<String> pipelineExecutionVOS = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].PipelineExecutionVOS.Length"); j++) {
				pipelineExecutionVOS.add(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].PipelineExecutionVOS["+ j +"]"));
			}
			resultItem.setPipelineExecutionVOS(pipelineExecutionVOS);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutPipelinesgettoppipelinesofuserResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutPipelinesgettoppipelinesofuserResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinesgettoppipelinesofuserResponse;
	}
}