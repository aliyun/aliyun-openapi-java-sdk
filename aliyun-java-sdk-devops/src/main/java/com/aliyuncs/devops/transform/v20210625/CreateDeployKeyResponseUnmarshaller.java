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

import com.aliyuncs.devops.model.v20210625.CreateDeployKeyResponse;
import com.aliyuncs.devops.model.v20210625.CreateDeployKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeployKeyResponseUnmarshaller {

	public static CreateDeployKeyResponse unmarshall(CreateDeployKeyResponse createDeployKeyResponse, UnmarshallerContext _ctx) {
		
		createDeployKeyResponse.setRequestId(_ctx.stringValue("CreateDeployKeyResponse.requestId"));
		createDeployKeyResponse.setErrorCode(_ctx.stringValue("CreateDeployKeyResponse.errorCode"));
		createDeployKeyResponse.setErrorMessage(_ctx.stringValue("CreateDeployKeyResponse.errorMessage"));
		createDeployKeyResponse.setSuccess(_ctx.booleanValue("CreateDeployKeyResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateDeployKeyResponse.result.id"));
		result.setTitle(_ctx.stringValue("CreateDeployKeyResponse.result.title"));
		result.setKey(_ctx.stringValue("CreateDeployKeyResponse.result.key"));
		result.setFingerprint(_ctx.stringValue("CreateDeployKeyResponse.result.fingerprint"));
		result.setCreatedAt(_ctx.stringValue("CreateDeployKeyResponse.result.createdAt"));
		createDeployKeyResponse.setResult(result);
	 
	 	return createDeployKeyResponse;
	}
}