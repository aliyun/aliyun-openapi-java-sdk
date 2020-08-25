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

import com.aliyuncs.sofa.model.v20190815.RetryLinkeBahamutPipelineretryoldResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryLinkeBahamutPipelineretryoldResponseUnmarshaller {

	public static RetryLinkeBahamutPipelineretryoldResponse unmarshall(RetryLinkeBahamutPipelineretryoldResponse retryLinkeBahamutPipelineretryoldResponse, UnmarshallerContext _ctx) {
		
		retryLinkeBahamutPipelineretryoldResponse.setRequestId(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.RequestId"));
		retryLinkeBahamutPipelineretryoldResponse.setResultCode(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.ResultCode"));
		retryLinkeBahamutPipelineretryoldResponse.setResultMessage(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.ResultMessage"));
		retryLinkeBahamutPipelineretryoldResponse.setErrorMessage(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.ErrorMessage"));
		retryLinkeBahamutPipelineretryoldResponse.setErrorMsgParamsMap(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.ErrorMsgParamsMap"));
		retryLinkeBahamutPipelineretryoldResponse.setMessage(_ctx.stringValue("RetryLinkeBahamutPipelineretryoldResponse.Message"));
		retryLinkeBahamutPipelineretryoldResponse.setResponseStatusCode(_ctx.longValue("RetryLinkeBahamutPipelineretryoldResponse.ResponseStatusCode"));
		retryLinkeBahamutPipelineretryoldResponse.setSuccess(_ctx.booleanValue("RetryLinkeBahamutPipelineretryoldResponse.Success"));
	 
	 	return retryLinkeBahamutPipelineretryoldResponse;
	}
}