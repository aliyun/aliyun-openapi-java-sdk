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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.ResetOrganizationUserPasswordResponse;
import com.aliyuncs.baas.model.v20180731.ResetOrganizationUserPasswordResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetOrganizationUserPasswordResponseUnmarshaller {

	public static ResetOrganizationUserPasswordResponse unmarshall(ResetOrganizationUserPasswordResponse resetOrganizationUserPasswordResponse, UnmarshallerContext context) {
		
		resetOrganizationUserPasswordResponse.setRequestId(context.stringValue("ResetOrganizationUserPasswordResponse.RequestId"));
		resetOrganizationUserPasswordResponse.setSuccess(context.booleanValue("ResetOrganizationUserPasswordResponse.Success"));
		resetOrganizationUserPasswordResponse.setErrorCode(context.integerValue("ResetOrganizationUserPasswordResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("ResetOrganizationUserPasswordResponse.Result.OrganizationId"));
		result.setUsername(context.stringValue("ResetOrganizationUserPasswordResponse.Result.Username"));
		result.setPassword(context.stringValue("ResetOrganizationUserPasswordResponse.Result.Password"));
		result.setFullname(context.stringValue("ResetOrganizationUserPasswordResponse.Result.Fullname"));
		result.setCreateTime(context.stringValue("ResetOrganizationUserPasswordResponse.Result.CreateTime"));
		result.setExpireTime(context.stringValue("ResetOrganizationUserPasswordResponse.Result.ExpireTime"));
		resetOrganizationUserPasswordResponse.setResult(result);
	 
	 	return resetOrganizationUserPasswordResponse;
	}
}