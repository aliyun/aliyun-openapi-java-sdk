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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.RunFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190930.RunFunctionResponse.RuntimeMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunFunctionResponseUnmarshaller {

	public static RunFunctionResponse unmarshall(RunFunctionResponse runFunctionResponse, UnmarshallerContext _ctx) {
		
		runFunctionResponse.setRequestId(_ctx.stringValue("RunFunctionResponse.RequestId"));
		runFunctionResponse.setHttpStatusCode(_ctx.stringValue("RunFunctionResponse.HttpStatusCode"));
		runFunctionResponse.setSuccess(_ctx.booleanValue("RunFunctionResponse.Success"));
		runFunctionResponse.setCode(_ctx.stringValue("RunFunctionResponse.Code"));
		runFunctionResponse.setMessage(_ctx.stringValue("RunFunctionResponse.Message"));
		runFunctionResponse.setRunResult(_ctx.stringValue("RunFunctionResponse.RunResult"));

		RuntimeMeta runtimeMeta = new RuntimeMeta();
		runtimeMeta.setLogSummary(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.LogSummary"));
		runtimeMeta.setLogRequestId(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.LogRequestId"));
		runtimeMeta.setMaxMemoryUsage(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.MaxMemoryUsage"));
		runtimeMeta.setBillingDuration(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.BillingDuration"));
		runtimeMeta.setInvocationDuration(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.InvocationDuration"));
		runFunctionResponse.setRuntimeMeta(runtimeMeta);
	 
	 	return runFunctionResponse;
	}
}