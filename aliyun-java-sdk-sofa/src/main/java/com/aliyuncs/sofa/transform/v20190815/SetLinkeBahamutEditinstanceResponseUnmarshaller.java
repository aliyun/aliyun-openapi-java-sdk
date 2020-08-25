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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutEditinstanceResponse;
import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutEditinstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutEditinstanceResponseUnmarshaller {

	public static SetLinkeBahamutEditinstanceResponse unmarshall(SetLinkeBahamutEditinstanceResponse setLinkeBahamutEditinstanceResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutEditinstanceResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.RequestId"));
		setLinkeBahamutEditinstanceResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.ResultCode"));
		setLinkeBahamutEditinstanceResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.ResultMessage"));
		setLinkeBahamutEditinstanceResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.ErrorMessage"));
		setLinkeBahamutEditinstanceResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.ErrorMsgParamsMap"));
		setLinkeBahamutEditinstanceResponse.setMessage(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Message"));
		setLinkeBahamutEditinstanceResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutEditinstanceResponse.ResponseStatusCode"));
		setLinkeBahamutEditinstanceResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutEditinstanceResponse.Success"));

		Result result = new Result();
		result.setAuto(_ctx.booleanValue("SetLinkeBahamutEditinstanceResponse.Result.Auto"));
		result.setContext(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Result.Context"));
		result.setDisplayName(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Result.DisplayName"));
		result.setInVisible(_ctx.booleanValue("SetLinkeBahamutEditinstanceResponse.Result.InVisible"));
		result.setLastModified(_ctx.longValue("SetLinkeBahamutEditinstanceResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Result.Modifier"));
		result.setPipeline(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Result.Pipeline"));
		result.setPipelineInstanceId(_ctx.longValue("SetLinkeBahamutEditinstanceResponse.Result.PipelineInstanceId"));
		result.setPipelineTemplateId(_ctx.longValue("SetLinkeBahamutEditinstanceResponse.Result.PipelineTemplateId"));
		result.setPipelineTrigger(_ctx.stringValue("SetLinkeBahamutEditinstanceResponse.Result.PipelineTrigger"));
		setLinkeBahamutEditinstanceResponse.setResult(result);
	 
	 	return setLinkeBahamutEditinstanceResponse;
	}
}