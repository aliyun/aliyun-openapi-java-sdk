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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeBahamutAppcustomciexecutionexecutionidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeBahamutAppcustomciexecutionexecutionidResponseUnmarshaller {

	public static CancelLinkeBahamutAppcustomciexecutionexecutionidResponse unmarshall(CancelLinkeBahamutAppcustomciexecutionexecutionidResponse cancelLinkeBahamutAppcustomciexecutionexecutionidResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setRequestId(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.RequestId"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setResultCode(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.ResultCode"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setResultMessage(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.ResultMessage"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setErrorMessage(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.ErrorMessage"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setErrorMsgParamsMap(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.ErrorMsgParamsMap"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setMessage(_ctx.stringValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.Message"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.ResponseStatusCode"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setResult(_ctx.booleanValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.Result"));
		cancelLinkeBahamutAppcustomciexecutionexecutionidResponse.setSuccess(_ctx.booleanValue("CancelLinkeBahamutAppcustomciexecutionexecutionidResponse.Success"));
	 
	 	return cancelLinkeBahamutAppcustomciexecutionexecutionidResponse;
	}
}