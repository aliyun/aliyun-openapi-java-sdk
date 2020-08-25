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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseUnmarshaller {

	public static GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse unmarshall(GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.RequestId"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.ResultCode"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.ResultMessage"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.ErrorMessage"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Message"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.ResponseStatusCode"));
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Success"));

		Result result = new Result();
		result.setStageId(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Result.StageId"));

		List<String> executions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Result.Executions.Length"); i++) {
			executions.add(_ctx.stringValue("GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.Result.Executions["+ i +"]"));
		}
		result.setExecutions(executions);
		getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse.setResult(result);
	 
	 	return getLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse;
	}
}