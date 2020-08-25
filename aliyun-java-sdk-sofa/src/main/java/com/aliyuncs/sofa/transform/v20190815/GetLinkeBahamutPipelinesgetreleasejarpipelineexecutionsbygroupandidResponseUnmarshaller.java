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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseUnmarshaller {

	public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse unmarshall(GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.RequestId"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.ResultCode"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.ResultMessage"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.ErrorMessage"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Message"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Assignee"));
		result.setAuthor(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Author"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Created"));
		result.setExtraDiv(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.ExtraDiv"));
		result.setId(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Id"));
		result.setIterationName(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.IterationName"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.LastModified"));
		result.setMergeRequestId(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.MergeRequestId"));
		result.setMergeRequestIid(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.MergeRequestIid"));
		result.setMrState(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.MrState"));
		result.setMrType(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.MrType"));
		result.setMrWebUrl(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.MrWebUrl"));
		result.setName(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Name"));
		result.setPipelineExecutionStatus(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.PipelineExecutionStatus"));
		result.setPipelineTag(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.PipelineTag"));
		result.setReviewed(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Reviewed"));
		result.setShowState(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.ShowState"));
		result.setSourceBranch(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.SourceBranch"));
		result.setTimelimeComparingTime(_ctx.longValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.TimelimeComparingTime"));
		result.setTriggerByAdmin(_ctx.booleanValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.TriggerByAdmin"));
		result.setType(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Type"));

		List<String> pipelineExecutionVOS = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.PipelineExecutionVOS.Length"); i++) {
			pipelineExecutionVOS.add(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.PipelineExecutionVOS["+ i +"]"));
		}
		result.setPipelineExecutionVOS(pipelineExecutionVOS);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse;
	}
}