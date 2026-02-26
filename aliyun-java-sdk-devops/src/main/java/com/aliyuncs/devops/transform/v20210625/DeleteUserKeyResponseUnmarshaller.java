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

import com.aliyuncs.devops.model.v20210625.DeleteUserKeyResponse;
import com.aliyuncs.devops.model.v20210625.DeleteUserKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserKeyResponseUnmarshaller {

	public static DeleteUserKeyResponse unmarshall(DeleteUserKeyResponse deleteUserKeyResponse, UnmarshallerContext _ctx) {
		
		deleteUserKeyResponse.setRequestId(_ctx.stringValue("DeleteUserKeyResponse.requestId"));
		deleteUserKeyResponse.setErrorCode(_ctx.stringValue("DeleteUserKeyResponse.errorCode"));
		deleteUserKeyResponse.setErrorMessage(_ctx.stringValue("DeleteUserKeyResponse.errorMessage"));
		deleteUserKeyResponse.setSuccess(_ctx.booleanValue("DeleteUserKeyResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("DeleteUserKeyResponse.result.id"));
		result.setCreatedAt(_ctx.stringValue("DeleteUserKeyResponse.result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("DeleteUserKeyResponse.result.updatedAt"));
		result.setTitle(_ctx.stringValue("DeleteUserKeyResponse.result.title"));
		result.setFingerPrint(_ctx.stringValue("DeleteUserKeyResponse.result.fingerPrint"));
		result.setShaContext(_ctx.stringValue("DeleteUserKeyResponse.result.shaContext"));
		result.setPublicKey(_ctx.stringValue("DeleteUserKeyResponse.result.publicKey"));
		result.setContext(_ctx.stringValue("DeleteUserKeyResponse.result.context"));
		result.setExpireTime(_ctx.stringValue("DeleteUserKeyResponse.result.expireTime"));
		result.setLastUsedTime(_ctx.stringValue("DeleteUserKeyResponse.result.lastUsedTime"));
		result.setKeyScope(_ctx.stringValue("DeleteUserKeyResponse.result.keyScope"));
		deleteUserKeyResponse.setResult(result);
	 
	 	return deleteUserKeyResponse;
	}
}