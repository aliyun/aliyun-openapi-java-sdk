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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseUnmarshaller {

	public static GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse unmarshall(GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.RequestId"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.ResultCode"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.ResultMessage"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.ErrorMessage"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Message"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.ResponseStatusCode"));
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Assignee"));
		result.setAuthor(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Author"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Created"));
		result.setExtraDiv(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.ExtraDiv"));
		result.setId(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Id"));
		result.setIterationName(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.IterationName"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.LastModified"));
		result.setMergeRequestId(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.MergeRequestId"));
		result.setMergeRequestIid(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.MergeRequestIid"));
		result.setMrState(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.MrState"));
		result.setMrType(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.MrType"));
		result.setMrWebUrl(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.MrWebUrl"));
		result.setName(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Name"));
		result.setPipelineExecutionStatus(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.PipelineExecutionStatus"));
		result.setPipelineTag(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.PipelineTag"));
		result.setReviewed(_ctx.booleanValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Reviewed"));
		result.setShowState(_ctx.booleanValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.ShowState"));
		result.setSourceBranch(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.SourceBranch"));
		result.setTimelimeComparingTime(_ctx.longValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.TimelimeComparingTime"));
		result.setTriggerByAdmin(_ctx.booleanValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.TriggerByAdmin"));
		result.setType(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Type"));

		List<String> pipelineExecutionVOS = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.PipelineExecutionVOS.Length"); i++) {
			pipelineExecutionVOS.add(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.PipelineExecutionVOS["+ i +"]"));
		}
		result.setPipelineExecutionVOS(pipelineExecutionVOS);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse.setResult(result);
	 
	 	return getLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse;
	}
}