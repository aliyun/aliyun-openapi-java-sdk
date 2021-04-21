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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.GetCodeCompletionResponse;
import com.aliyuncs.codeup.model.v20200414.GetCodeCompletionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCodeCompletionResponseUnmarshaller {

	public static GetCodeCompletionResponse unmarshall(GetCodeCompletionResponse getCodeCompletionResponse, UnmarshallerContext _ctx) {
		
		getCodeCompletionResponse.setRequestId(_ctx.stringValue("GetCodeCompletionResponse.RequestId"));
		getCodeCompletionResponse.setErrorCode(_ctx.stringValue("GetCodeCompletionResponse.ErrorCode"));
		getCodeCompletionResponse.setSuccess(_ctx.booleanValue("GetCodeCompletionResponse.Success"));
		getCodeCompletionResponse.setErrorMessage(_ctx.stringValue("GetCodeCompletionResponse.ErrorMessage"));

		Result result = new Result();
		result.setBody(_ctx.stringValue("GetCodeCompletionResponse.Result.Body"));
		result.setClientTimestamp(_ctx.stringValue("GetCodeCompletionResponse.Result.ClientTimestamp"));
		result.setReceiveTimestamp(_ctx.stringValue("GetCodeCompletionResponse.Result.ReceiveTimestamp"));
		result.setInvokeTimestamp(_ctx.stringValue("GetCodeCompletionResponse.Result.InvokeTimestamp"));
		result.setFetchTimestamp(_ctx.stringValue("GetCodeCompletionResponse.Result.FetchTimestamp"));
		result.setRspTimestamp(_ctx.stringValue("GetCodeCompletionResponse.Result.RspTimestamp"));
		getCodeCompletionResponse.setResult(result);
	 
	 	return getCodeCompletionResponse;
	}
}