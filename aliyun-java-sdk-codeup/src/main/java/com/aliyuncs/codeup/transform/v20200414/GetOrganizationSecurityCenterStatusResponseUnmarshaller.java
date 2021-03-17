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

import com.aliyuncs.codeup.model.v20200414.GetOrganizationSecurityCenterStatusResponse;
import com.aliyuncs.codeup.model.v20200414.GetOrganizationSecurityCenterStatusResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrganizationSecurityCenterStatusResponseUnmarshaller {

	public static GetOrganizationSecurityCenterStatusResponse unmarshall(GetOrganizationSecurityCenterStatusResponse getOrganizationSecurityCenterStatusResponse, UnmarshallerContext _ctx) {
		
		getOrganizationSecurityCenterStatusResponse.setRequestId(_ctx.stringValue("GetOrganizationSecurityCenterStatusResponse.RequestId"));
		getOrganizationSecurityCenterStatusResponse.setErrorCode(_ctx.stringValue("GetOrganizationSecurityCenterStatusResponse.ErrorCode"));
		getOrganizationSecurityCenterStatusResponse.setErrorMessage(_ctx.stringValue("GetOrganizationSecurityCenterStatusResponse.ErrorMessage"));
		getOrganizationSecurityCenterStatusResponse.setSuccess(_ctx.booleanValue("GetOrganizationSecurityCenterStatusResponse.Success"));

		Result result = new Result();
		result.setEnable(_ctx.booleanValue("GetOrganizationSecurityCenterStatusResponse.Result.Enable"));
		getOrganizationSecurityCenterStatusResponse.setResult(result);
	 
	 	return getOrganizationSecurityCenterStatusResponse;
	}
}