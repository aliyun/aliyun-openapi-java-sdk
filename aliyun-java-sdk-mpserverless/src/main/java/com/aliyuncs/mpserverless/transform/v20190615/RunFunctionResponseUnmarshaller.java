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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.RunFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190615.RunFunctionResponse.RuntimeMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunFunctionResponseUnmarshaller {

	public static RunFunctionResponse unmarshall(RunFunctionResponse runFunctionResponse, UnmarshallerContext _ctx) {
		
		runFunctionResponse.setRequestId(_ctx.stringValue("RunFunctionResponse.RequestId"));
		runFunctionResponse.setHttpStatusCode(_ctx.stringValue("RunFunctionResponse.HttpStatusCode"));
		runFunctionResponse.setSuccess(_ctx.booleanValue("RunFunctionResponse.Success"));
		runFunctionResponse.setCode(_ctx.stringValue("RunFunctionResponse.Code"));
		runFunctionResponse.setMessage(_ctx.stringValue("RunFunctionResponse.Message"));
		runFunctionResponse.setResult(_ctx.stringValue("RunFunctionResponse.Result"));

		RuntimeMeta runtimeMeta = new RuntimeMeta();
		runtimeMeta.setMaxMemoryUsage(_ctx.integerValue("RunFunctionResponse.RuntimeMeta.MaxMemoryUsage"));
		runtimeMeta.setInvocationDuration(_ctx.integerValue("RunFunctionResponse.RuntimeMeta.InvocationDuration"));
		runtimeMeta.setBillingDuration(_ctx.integerValue("RunFunctionResponse.RuntimeMeta.BillingDuration"));
		runtimeMeta.setRequestId(_ctx.stringValue("RunFunctionResponse.RuntimeMeta.RequestId"));
		runFunctionResponse.setRuntimeMeta(runtimeMeta);
	 
	 	return runFunctionResponse;
	}
}