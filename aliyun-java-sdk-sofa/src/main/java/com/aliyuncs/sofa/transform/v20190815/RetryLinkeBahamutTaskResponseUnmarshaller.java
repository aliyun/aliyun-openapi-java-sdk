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

import com.aliyuncs.sofa.model.v20190815.RetryLinkeBahamutTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryLinkeBahamutTaskResponseUnmarshaller {

	public static RetryLinkeBahamutTaskResponse unmarshall(RetryLinkeBahamutTaskResponse retryLinkeBahamutTaskResponse, UnmarshallerContext _ctx) {
		
		retryLinkeBahamutTaskResponse.setRequestId(_ctx.stringValue("RetryLinkeBahamutTaskResponse.RequestId"));
		retryLinkeBahamutTaskResponse.setResultCode(_ctx.stringValue("RetryLinkeBahamutTaskResponse.ResultCode"));
		retryLinkeBahamutTaskResponse.setResultMessage(_ctx.stringValue("RetryLinkeBahamutTaskResponse.ResultMessage"));
		retryLinkeBahamutTaskResponse.setErrorMessage(_ctx.stringValue("RetryLinkeBahamutTaskResponse.ErrorMessage"));
		retryLinkeBahamutTaskResponse.setErrorMsgParamsMap(_ctx.stringValue("RetryLinkeBahamutTaskResponse.ErrorMsgParamsMap"));
		retryLinkeBahamutTaskResponse.setMessage(_ctx.stringValue("RetryLinkeBahamutTaskResponse.Message"));
		retryLinkeBahamutTaskResponse.setResponseStatusCode(_ctx.longValue("RetryLinkeBahamutTaskResponse.ResponseStatusCode"));
		retryLinkeBahamutTaskResponse.setSuccess(_ctx.booleanValue("RetryLinkeBahamutTaskResponse.Success"));
	 
	 	return retryLinkeBahamutTaskResponse;
	}
}