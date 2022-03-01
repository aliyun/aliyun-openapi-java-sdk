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

import com.aliyuncs.baas.model.v20181221.ResetFabricOrganizationUserPasswordResponse;
import com.aliyuncs.baas.model.v20181221.ResetFabricOrganizationUserPasswordResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetFabricOrganizationUserPasswordResponseUnmarshaller {

	public static ResetFabricOrganizationUserPasswordResponse unmarshall(ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPasswordResponse, UnmarshallerContext _ctx) {
		
		resetFabricOrganizationUserPasswordResponse.setRequestId(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.RequestId"));
		resetFabricOrganizationUserPasswordResponse.setSuccess(_ctx.booleanValue("ResetFabricOrganizationUserPasswordResponse.Success"));
		resetFabricOrganizationUserPasswordResponse.setErrorCode(_ctx.integerValue("ResetFabricOrganizationUserPasswordResponse.ErrorCode"));

		Result result = new Result();
		result.setPassword(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.Password"));
		result.setExpireTime(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.ExpireTime"));
		result.setCreateTime(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.CreateTime"));
		result.setOrganizationId(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.OrganizationId"));
		result.setUsername(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.Username"));
		result.setFullname(_ctx.stringValue("ResetFabricOrganizationUserPasswordResponse.Result.Fullname"));
		resetFabricOrganizationUserPasswordResponse.setResult(result);
	 
	 	return resetFabricOrganizationUserPasswordResponse;
	}
}