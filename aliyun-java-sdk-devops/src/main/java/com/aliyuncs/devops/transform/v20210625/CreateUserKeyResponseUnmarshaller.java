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

import com.aliyuncs.devops.model.v20210625.CreateUserKeyResponse;
import com.aliyuncs.devops.model.v20210625.CreateUserKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserKeyResponseUnmarshaller {

	public static CreateUserKeyResponse unmarshall(CreateUserKeyResponse createUserKeyResponse, UnmarshallerContext _ctx) {
		
		createUserKeyResponse.setRequestId(_ctx.stringValue("CreateUserKeyResponse.requestId"));
		createUserKeyResponse.setErrorCode(_ctx.stringValue("CreateUserKeyResponse.errorCode"));
		createUserKeyResponse.setErrorMessage(_ctx.stringValue("CreateUserKeyResponse.errorMessage"));
		createUserKeyResponse.setSuccess(_ctx.booleanValue("CreateUserKeyResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateUserKeyResponse.result.id"));
		result.setTitle(_ctx.stringValue("CreateUserKeyResponse.result.title"));
		result.setPublicKey(_ctx.stringValue("CreateUserKeyResponse.result.publicKey"));
		result.setFingerPrint(_ctx.stringValue("CreateUserKeyResponse.result.fingerPrint"));
		result.setKeyScope(_ctx.stringValue("CreateUserKeyResponse.result.keyScope"));
		result.setCreatedAt(_ctx.stringValue("CreateUserKeyResponse.result.createdAt"));
		result.setExpireTime(_ctx.stringValue("CreateUserKeyResponse.result.expireTime"));
		result.setLastUsedTime(_ctx.stringValue("CreateUserKeyResponse.result.lastUsedTime"));
		createUserKeyResponse.setResult(result);
	 
	 	return createUserKeyResponse;
	}
}