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

import com.aliyuncs.codeup.model.v20200414.GetCodeupOrganizationResponse;
import com.aliyuncs.codeup.model.v20200414.GetCodeupOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCodeupOrganizationResponseUnmarshaller {

	public static GetCodeupOrganizationResponse unmarshall(GetCodeupOrganizationResponse getCodeupOrganizationResponse, UnmarshallerContext _ctx) {
		
		getCodeupOrganizationResponse.setRequestId(_ctx.stringValue("GetCodeupOrganizationResponse.RequestId"));
		getCodeupOrganizationResponse.setErrorCode(_ctx.stringValue("GetCodeupOrganizationResponse.ErrorCode"));
		getCodeupOrganizationResponse.setSuccess(_ctx.booleanValue("GetCodeupOrganizationResponse.Success"));
		getCodeupOrganizationResponse.setErrorMessage(_ctx.stringValue("GetCodeupOrganizationResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetCodeupOrganizationResponse.Result.Id"));
		result.setOrganizationId(_ctx.stringValue("GetCodeupOrganizationResponse.Result.OrganizationId"));
		result.setPath(_ctx.stringValue("GetCodeupOrganizationResponse.Result.Path"));
		result.setCreatedAt(_ctx.stringValue("GetCodeupOrganizationResponse.Result.CreatedAt"));
		result.setUpdatedAt(_ctx.stringValue("GetCodeupOrganizationResponse.Result.UpdatedAt"));
		result.setNamespaceId(_ctx.longValue("GetCodeupOrganizationResponse.Result.NamespaceId"));
		result.setUserRole(_ctx.stringValue("GetCodeupOrganizationResponse.Result.UserRole"));
		getCodeupOrganizationResponse.setResult(result);
	 
	 	return getCodeupOrganizationResponse;
	}
}