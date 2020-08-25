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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAddaddinstanceResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAddaddinstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAddaddinstanceResponseUnmarshaller {

	public static AddLinkeBahamutAddaddinstanceResponse unmarshall(AddLinkeBahamutAddaddinstanceResponse addLinkeBahamutAddaddinstanceResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAddaddinstanceResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.RequestId"));
		addLinkeBahamutAddaddinstanceResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.ResultCode"));
		addLinkeBahamutAddaddinstanceResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.ResultMessage"));
		addLinkeBahamutAddaddinstanceResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.ErrorMessage"));
		addLinkeBahamutAddaddinstanceResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAddaddinstanceResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Message"));
		addLinkeBahamutAddaddinstanceResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAddaddinstanceResponse.ResponseStatusCode"));
		addLinkeBahamutAddaddinstanceResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAddaddinstanceResponse.Success"));

		Result result = new Result();
		result.setAuto(_ctx.booleanValue("AddLinkeBahamutAddaddinstanceResponse.Result.Auto"));
		result.setContext(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Result.Context"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Result.DisplayName"));
		result.setInVisible(_ctx.booleanValue("AddLinkeBahamutAddaddinstanceResponse.Result.InVisible"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAddaddinstanceResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Result.Modifier"));
		result.setPipeline(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Result.Pipeline"));
		result.setPipelineInstanceId(_ctx.longValue("AddLinkeBahamutAddaddinstanceResponse.Result.PipelineInstanceId"));
		result.setPipelineTemplateId(_ctx.longValue("AddLinkeBahamutAddaddinstanceResponse.Result.PipelineTemplateId"));
		result.setPipelineTrigger(_ctx.stringValue("AddLinkeBahamutAddaddinstanceResponse.Result.PipelineTrigger"));
		addLinkeBahamutAddaddinstanceResponse.setResult(result);
	 
	 	return addLinkeBahamutAddaddinstanceResponse;
	}
}