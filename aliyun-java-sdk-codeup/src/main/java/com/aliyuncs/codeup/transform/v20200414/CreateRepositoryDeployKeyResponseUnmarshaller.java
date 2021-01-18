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

import com.aliyuncs.codeup.model.v20200414.CreateRepositoryDeployKeyResponse;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryDeployKeyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryDeployKeyResponseUnmarshaller {

	public static CreateRepositoryDeployKeyResponse unmarshall(CreateRepositoryDeployKeyResponse createRepositoryDeployKeyResponse, UnmarshallerContext _ctx) {
		
		createRepositoryDeployKeyResponse.setRequestId(_ctx.stringValue("CreateRepositoryDeployKeyResponse.RequestId"));
		createRepositoryDeployKeyResponse.setErrorCode(_ctx.stringValue("CreateRepositoryDeployKeyResponse.ErrorCode"));
		createRepositoryDeployKeyResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryDeployKeyResponse.ErrorMessage"));
		createRepositoryDeployKeyResponse.setSuccess(_ctx.booleanValue("CreateRepositoryDeployKeyResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryDeployKeyResponse.Result.Id"));
		result.setTitle(_ctx.stringValue("CreateRepositoryDeployKeyResponse.Result.Title"));
		result.setKey(_ctx.stringValue("CreateRepositoryDeployKeyResponse.Result.Key"));
		result.setFingerPrint(_ctx.stringValue("CreateRepositoryDeployKeyResponse.Result.FingerPrint"));
		result.setCreatedAt(_ctx.stringValue("CreateRepositoryDeployKeyResponse.Result.CreatedAt"));
		createRepositoryDeployKeyResponse.setResult(result);
	 
	 	return createRepositoryDeployKeyResponse;
	}
}