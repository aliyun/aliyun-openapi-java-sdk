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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetUserActiveTenantResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetUserActiveTenantResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserActiveTenantResponseUnmarshaller {

	public static GetUserActiveTenantResponse unmarshall(GetUserActiveTenantResponse getUserActiveTenantResponse, UnmarshallerContext _ctx) {
		
		getUserActiveTenantResponse.setRequestId(_ctx.stringValue("GetUserActiveTenantResponse.RequestId"));
		getUserActiveTenantResponse.setErrorCode(_ctx.stringValue("GetUserActiveTenantResponse.ErrorCode"));
		getUserActiveTenantResponse.setErrorMessage(_ctx.stringValue("GetUserActiveTenantResponse.ErrorMessage"));
		getUserActiveTenantResponse.setSuccess(_ctx.booleanValue("GetUserActiveTenantResponse.Success"));

		Tenant tenant = new Tenant();
		tenant.setStatus(_ctx.stringValue("GetUserActiveTenantResponse.Tenant.Status"));
		tenant.setTenantName(_ctx.stringValue("GetUserActiveTenantResponse.Tenant.TenantName"));
		tenant.setTid(_ctx.longValue("GetUserActiveTenantResponse.Tenant.Tid"));
		getUserActiveTenantResponse.setTenant(tenant);
	 
	 	return getUserActiveTenantResponse;
	}
}