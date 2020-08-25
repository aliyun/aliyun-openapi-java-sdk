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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponseUnmarshaller {

	public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse unmarshall(GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.RequestId"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ResultCode"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ResultMessage"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ErrorMessage"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Message"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Assignee"));
			resultItem.setAuthor(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Author"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Created"));
			resultItem.setExtraDiv(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].ExtraDiv"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Id"));
			resultItem.setIterationName(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].IterationName"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].LastModified"));
			resultItem.setMergeRequestId(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].MergeRequestId"));
			resultItem.setMergeRequestIid(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].MergeRequestIid"));
			resultItem.setMrState(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].MrState"));
			resultItem.setMrType(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].MrType"));
			resultItem.setMrWebUrl(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].MrWebUrl"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Name"));
			resultItem.setPipelineExecutionStatus(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].PipelineExecutionStatus"));
			resultItem.setPipelineTag(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].PipelineTag"));
			resultItem.setReviewed(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Reviewed"));
			resultItem.setShowState(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].ShowState"));
			resultItem.setSourceBranch(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].SourceBranch"));
			resultItem.setTimelimeComparingTime(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].TimelimeComparingTime"));
			resultItem.setTriggerByAdmin(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].TriggerByAdmin"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Type"));

			List<String> pipelineExecutionVOS = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].PipelineExecutionVOS.Length"); j++) {
				pipelineExecutionVOS.add(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].PipelineExecutionVOS["+ j +"]"));
			}
			resultItem.setPipelineExecutionVOS(pipelineExecutionVOS);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse;
	}
}