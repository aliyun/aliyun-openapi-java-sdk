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

import com.aliyuncs.sofa.model.v20190815.RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse;
import com.aliyuncs.sofa.model.v20190815.RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseUnmarshaller {

	public static RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse unmarshall(RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse, UnmarshallerContext _ctx) {
		
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setRequestId(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.RequestId"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setResultCode(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.ResultCode"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setResultMessage(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.ResultMessage"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setErrorMessage(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.ErrorMessage"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setErrorMsgParamsMap(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.ErrorMsgParamsMap"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setMessage(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Message"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setResponseStatusCode(_ctx.longValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.ResponseStatusCode"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setSuccess(_ctx.booleanValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Success"));

		Result result = new Result();
		result.setAuto(_ctx.booleanValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.Auto"));
		result.setContext(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.Context"));
		result.setDisplayName(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.DisplayName"));
		result.setInVisible(_ctx.booleanValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.InVisible"));
		result.setLastModified(_ctx.longValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.Modifier"));
		result.setPipeline(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.Pipeline"));
		result.setPipelineInstanceId(_ctx.longValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.PipelineInstanceId"));
		result.setPipelineTemplateId(_ctx.longValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.PipelineTemplateId"));
		result.setPipelineTrigger(_ctx.stringValue("RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.Result.PipelineTrigger"));
		retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse.setResult(result);
	 
	 	return retryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse;
	}
}