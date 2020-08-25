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

import com.aliyuncs.sofa.model.v20190815.RetryLinkeBahamutPipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryLinkeBahamutPipelineResponseUnmarshaller {

	public static RetryLinkeBahamutPipelineResponse unmarshall(RetryLinkeBahamutPipelineResponse retryLinkeBahamutPipelineResponse, UnmarshallerContext _ctx) {
		
		retryLinkeBahamutPipelineResponse.setRequestId(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.RequestId"));
		retryLinkeBahamutPipelineResponse.setResultCode(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.ResultCode"));
		retryLinkeBahamutPipelineResponse.setResultMessage(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.ResultMessage"));
		retryLinkeBahamutPipelineResponse.setErrorMessage(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.ErrorMessage"));
		retryLinkeBahamutPipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.ErrorMsgParamsMap"));
		retryLinkeBahamutPipelineResponse.setMessage(_ctx.stringValue("RetryLinkeBahamutPipelineResponse.Message"));
		retryLinkeBahamutPipelineResponse.setResponseStatusCode(_ctx.longValue("RetryLinkeBahamutPipelineResponse.ResponseStatusCode"));
		retryLinkeBahamutPipelineResponse.setSuccess(_ctx.booleanValue("RetryLinkeBahamutPipelineResponse.Success"));
	 
	 	return retryLinkeBahamutPipelineResponse;
	}
}