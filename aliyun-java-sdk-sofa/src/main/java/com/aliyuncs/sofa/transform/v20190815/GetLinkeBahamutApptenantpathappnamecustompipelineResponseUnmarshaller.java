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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApptenantpathappnamecustompipelineResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutApptenantpathappnamecustompipelineResponseUnmarshaller {

	public static GetLinkeBahamutApptenantpathappnamecustompipelineResponse unmarshall(GetLinkeBahamutApptenantpathappnamecustompipelineResponse getLinkeBahamutApptenantpathappnamecustompipelineResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.RequestId"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ResultCode"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ResultMessage"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ErrorMessage"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ErrorMsgParamsMap"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setMessage(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Message"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.ResponseStatusCode"));
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContext(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].Context"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].DisplayName"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].Id"));
			resultItem.setIterationTemplateId(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].IterationTemplateId"));
			resultItem.setIterationTemplateName(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].IterationTemplateName"));
			resultItem.setModifier(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].Modifier"));
			resultItem.setPipeline(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].Pipeline"));
			resultItem.setPipelineName(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].PipelineName"));
			resultItem.setStageTemplateId(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].StageTemplateId"));
			resultItem.setStageTemplateName(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].StageTemplateName"));
			resultItem.setTrigger(_ctx.stringValue("GetLinkeBahamutApptenantpathappnamecustompipelineResponse.Result["+ i +"].Trigger"));

			result.add(resultItem);
		}
		getLinkeBahamutApptenantpathappnamecustompipelineResponse.setResult(result);
	 
	 	return getLinkeBahamutApptenantpathappnamecustompipelineResponse;
	}
}