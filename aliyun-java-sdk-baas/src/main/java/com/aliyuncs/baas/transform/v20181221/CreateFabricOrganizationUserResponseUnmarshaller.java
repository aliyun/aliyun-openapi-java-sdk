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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.CreateFabricOrganizationUserResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricOrganizationUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricOrganizationUserResponseUnmarshaller {

	public static CreateFabricOrganizationUserResponse unmarshall(CreateFabricOrganizationUserResponse createFabricOrganizationUserResponse, UnmarshallerContext _ctx) {
		
		createFabricOrganizationUserResponse.setRequestId(_ctx.stringValue("CreateFabricOrganizationUserResponse.RequestId"));
		createFabricOrganizationUserResponse.setSuccess(_ctx.booleanValue("CreateFabricOrganizationUserResponse.Success"));
		createFabricOrganizationUserResponse.setErrorCode(_ctx.integerValue("CreateFabricOrganizationUserResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.OrganizationId"));
		result.setUsername(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.Username"));
		result.setPassword(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.Password"));
		result.setFullname(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.Fullname"));
		result.setCreateTime(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.CreateTime"));
		result.setExpireTime(_ctx.stringValue("CreateFabricOrganizationUserResponse.Result.ExpireTime"));
		createFabricOrganizationUserResponse.setResult(result);
	 
	 	return createFabricOrganizationUserResponse;
	}
}