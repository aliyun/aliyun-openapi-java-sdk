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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.GetTenantResponse;
import com.aliyuncs.openitag.model.v20220616.GetTenantResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTenantResponseUnmarshaller {

	public static GetTenantResponse unmarshall(GetTenantResponse getTenantResponse, UnmarshallerContext _ctx) {
		
		getTenantResponse.setRequestId(_ctx.stringValue("GetTenantResponse.RequestId"));
		getTenantResponse.setCode(_ctx.integerValue("GetTenantResponse.Code"));
		getTenantResponse.setMessage(_ctx.stringValue("GetTenantResponse.Message"));
		getTenantResponse.setDetails(_ctx.stringValue("GetTenantResponse.Details"));
		getTenantResponse.setSuccess(_ctx.booleanValue("GetTenantResponse.Success"));
		getTenantResponse.setErrorCode(_ctx.stringValue("GetTenantResponse.ErrorCode"));

		Tenant tenant = new Tenant();
		tenant.setDescription(_ctx.stringValue("GetTenantResponse.Tenant.Description"));
		tenant.setTenantName(_ctx.stringValue("GetTenantResponse.Tenant.TenantName"));
		tenant.setUUID(_ctx.stringValue("GetTenantResponse.Tenant.UUID"));
		tenant.setTenantId(_ctx.stringValue("GetTenantResponse.Tenant.TenantId"));
		tenant.setStatus(_ctx.stringValue("GetTenantResponse.Tenant.Status"));
		getTenantResponse.setTenant(tenant);
	 
	 	return getTenantResponse;
	}
}