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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.EnableDeployKeyResponse;
import com.aliyuncs.devops.model.v20210625.EnableDeployKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableDeployKeyResponseUnmarshaller {

	public static EnableDeployKeyResponse unmarshall(EnableDeployKeyResponse enableDeployKeyResponse, UnmarshallerContext _ctx) {
		
		enableDeployKeyResponse.setRequestId(_ctx.stringValue("EnableDeployKeyResponse.requestId"));
		enableDeployKeyResponse.setErrorCode(_ctx.stringValue("EnableDeployKeyResponse.errorCode"));
		enableDeployKeyResponse.setErrorMessage(_ctx.stringValue("EnableDeployKeyResponse.errorMessage"));
		enableDeployKeyResponse.setSuccess(_ctx.booleanValue("EnableDeployKeyResponse.success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("EnableDeployKeyResponse.result.result"));
		enableDeployKeyResponse.setResult(result);
	 
	 	return enableDeployKeyResponse;
	}
}