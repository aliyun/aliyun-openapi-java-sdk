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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.GetFunctionTaskResponse;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionTaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFunctionTaskResponseUnmarshaller {

	public static GetFunctionTaskResponse unmarshall(GetFunctionTaskResponse getFunctionTaskResponse, UnmarshallerContext _ctx) {
		
		getFunctionTaskResponse.setRequestId(_ctx.stringValue("GetFunctionTaskResponse.RequestId"));
		getFunctionTaskResponse.setStatus(_ctx.stringValue("GetFunctionTaskResponse.Status"));
		getFunctionTaskResponse.setHttpCode(_ctx.longValue("GetFunctionTaskResponse.HttpCode"));
		getFunctionTaskResponse.setMessage(_ctx.stringValue("GetFunctionTaskResponse.Message"));
		getFunctionTaskResponse.setCode(_ctx.stringValue("GetFunctionTaskResponse.Code"));
		getFunctionTaskResponse.setLatency(_ctx.longValue("GetFunctionTaskResponse.Latency"));

		Result result = new Result();
		result.setEndTime(_ctx.longValue("GetFunctionTaskResponse.Result.EndTime"));
		result.setExtendInfo(_ctx.stringValue("GetFunctionTaskResponse.Result.ExtendInfo"));
		result.setFunctionName(_ctx.stringValue("GetFunctionTaskResponse.Result.FunctionName"));
		result.setGeneration(_ctx.stringValue("GetFunctionTaskResponse.Result.Generation"));
		result.setProgress(_ctx.longValue("GetFunctionTaskResponse.Result.Progress"));
		result.setRunId(_ctx.stringValue("GetFunctionTaskResponse.Result.RunId"));
		result.setStartTime(_ctx.longValue("GetFunctionTaskResponse.Result.StartTime"));
		result.setStatus(_ctx.stringValue("GetFunctionTaskResponse.Result.Status"));
		getFunctionTaskResponse.setResult(result);
	 
	 	return getFunctionTaskResponse;
	}
}