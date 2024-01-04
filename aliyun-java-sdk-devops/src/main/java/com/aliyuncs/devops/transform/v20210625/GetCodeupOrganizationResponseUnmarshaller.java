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

import com.aliyuncs.devops.model.v20210625.GetCodeupOrganizationResponse;
import com.aliyuncs.devops.model.v20210625.GetCodeupOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCodeupOrganizationResponseUnmarshaller {

	public static GetCodeupOrganizationResponse unmarshall(GetCodeupOrganizationResponse getCodeupOrganizationResponse, UnmarshallerContext _ctx) {
		
		getCodeupOrganizationResponse.setErrorMessage(_ctx.stringValue("GetCodeupOrganizationResponse.errorMessage"));
		getCodeupOrganizationResponse.setRequestId(_ctx.stringValue("GetCodeupOrganizationResponse.requestId"));
		getCodeupOrganizationResponse.setErrorCode(_ctx.stringValue("GetCodeupOrganizationResponse.errorCode"));
		getCodeupOrganizationResponse.setSuccess(_ctx.booleanValue("GetCodeupOrganizationResponse.success"));

		Result result = new Result();
		result.setNamespaceId(_ctx.longValue("GetCodeupOrganizationResponse.result.namespaceId"));
		result.setUserRole(_ctx.stringValue("GetCodeupOrganizationResponse.result.userRole"));
		result.setPath(_ctx.stringValue("GetCodeupOrganizationResponse.result.path"));
		result.setCreatedAt(_ctx.stringValue("GetCodeupOrganizationResponse.result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("GetCodeupOrganizationResponse.result.updatedAt"));
		result.setId(_ctx.longValue("GetCodeupOrganizationResponse.result.id"));
		result.setOrganizationId(_ctx.stringValue("GetCodeupOrganizationResponse.result.organizationId"));
		getCodeupOrganizationResponse.setResult(result);
	 
	 	return getCodeupOrganizationResponse;
	}
}