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

import com.aliyuncs.codeup.model.v20200414.CreateSshKeyResponse;
import com.aliyuncs.codeup.model.v20200414.CreateSshKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSshKeyResponseUnmarshaller {

	public static CreateSshKeyResponse unmarshall(CreateSshKeyResponse createSshKeyResponse, UnmarshallerContext _ctx) {
		
		createSshKeyResponse.setRequestId(_ctx.stringValue("CreateSshKeyResponse.RequestId"));
		createSshKeyResponse.setErrorCode(_ctx.stringValue("CreateSshKeyResponse.ErrorCode"));
		createSshKeyResponse.setErrorMessage(_ctx.stringValue("CreateSshKeyResponse.ErrorMessage"));
		createSshKeyResponse.setSuccess(_ctx.booleanValue("CreateSshKeyResponse.Success"));

		Result result = new Result();
		result.setCreatedAt(_ctx.stringValue("CreateSshKeyResponse.Result.CreatedAt"));
		result.setFingerPrint(_ctx.stringValue("CreateSshKeyResponse.Result.FingerPrint"));
		result.setId(_ctx.longValue("CreateSshKeyResponse.Result.Id"));
		result.setKey(_ctx.stringValue("CreateSshKeyResponse.Result.Key"));
		result.setKeyScope(_ctx.stringValue("CreateSshKeyResponse.Result.KeyScope"));
		result.setTitle(_ctx.stringValue("CreateSshKeyResponse.Result.Title"));
		createSshKeyResponse.setResult(result);
	 
	 	return createSshKeyResponse;
	}
}