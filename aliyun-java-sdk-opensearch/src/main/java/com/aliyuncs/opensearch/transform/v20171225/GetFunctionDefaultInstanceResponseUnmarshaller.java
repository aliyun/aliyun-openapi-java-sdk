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

import com.aliyuncs.opensearch.model.v20171225.GetFunctionDefaultInstanceResponse;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionDefaultInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFunctionDefaultInstanceResponseUnmarshaller {

	public static GetFunctionDefaultInstanceResponse unmarshall(GetFunctionDefaultInstanceResponse getFunctionDefaultInstanceResponse, UnmarshallerContext _ctx) {
		
		getFunctionDefaultInstanceResponse.setRequestId(_ctx.stringValue("GetFunctionDefaultInstanceResponse.RequestId"));
		getFunctionDefaultInstanceResponse.setStatus(_ctx.stringValue("GetFunctionDefaultInstanceResponse.Status"));
		getFunctionDefaultInstanceResponse.setHttpCode(_ctx.longValue("GetFunctionDefaultInstanceResponse.HttpCode"));
		getFunctionDefaultInstanceResponse.setMessage(_ctx.stringValue("GetFunctionDefaultInstanceResponse.Message"));
		getFunctionDefaultInstanceResponse.setCode(_ctx.stringValue("GetFunctionDefaultInstanceResponse.Code"));
		getFunctionDefaultInstanceResponse.setLatency(_ctx.longValue("GetFunctionDefaultInstanceResponse.Latency"));
		getFunctionDefaultInstanceResponse.setInstanceName(_ctx.stringValue("GetFunctionDefaultInstanceResponse.InstanceName"));
		getFunctionDefaultInstanceResponse.setFunctionName(_ctx.stringValue("GetFunctionDefaultInstanceResponse.FunctionName"));

		Result result = new Result();
		result.setInstanceName(_ctx.stringValue("GetFunctionDefaultInstanceResponse.Result.InstanceName"));
		getFunctionDefaultInstanceResponse.setResult(result);
	 
	 	return getFunctionDefaultInstanceResponse;
	}
}