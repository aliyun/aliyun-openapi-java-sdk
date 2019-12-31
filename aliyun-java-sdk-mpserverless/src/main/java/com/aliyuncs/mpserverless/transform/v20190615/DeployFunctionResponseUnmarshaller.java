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

import com.aliyuncs.mpserverless.model.v20190615.DeployFunctionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployFunctionResponseUnmarshaller {

	public static DeployFunctionResponse unmarshall(DeployFunctionResponse deployFunctionResponse, UnmarshallerContext _ctx) {
		
		deployFunctionResponse.setRequestId(_ctx.stringValue("DeployFunctionResponse.RequestId"));
		deployFunctionResponse.setHttpStatusCode(_ctx.stringValue("DeployFunctionResponse.HttpStatusCode"));
		deployFunctionResponse.setSuccess(_ctx.booleanValue("DeployFunctionResponse.Success"));
		deployFunctionResponse.setCode(_ctx.stringValue("DeployFunctionResponse.Code"));
		deployFunctionResponse.setMessage(_ctx.stringValue("DeployFunctionResponse.Message"));
	 
	 	return deployFunctionResponse;
	}
}