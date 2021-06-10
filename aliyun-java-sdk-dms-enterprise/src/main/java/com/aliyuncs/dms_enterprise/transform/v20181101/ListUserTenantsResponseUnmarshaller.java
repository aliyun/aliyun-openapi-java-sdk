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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListUserTenantsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListUserTenantsResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserTenantsResponseUnmarshaller {

	public static ListUserTenantsResponse unmarshall(ListUserTenantsResponse listUserTenantsResponse, UnmarshallerContext _ctx) {
		
		listUserTenantsResponse.setRequestId(_ctx.stringValue("ListUserTenantsResponse.RequestId"));
		listUserTenantsResponse.setErrorCode(_ctx.stringValue("ListUserTenantsResponse.ErrorCode"));
		listUserTenantsResponse.setErrorMessage(_ctx.stringValue("ListUserTenantsResponse.ErrorMessage"));
		listUserTenantsResponse.setSuccess(_ctx.booleanValue("ListUserTenantsResponse.Success"));

		List<Tenant> tenantList = new ArrayList<Tenant>();
		for (int i = 0; i < _ctx.lengthValue("ListUserTenantsResponse.TenantList.Length"); i++) {
			Tenant tenant = new Tenant();
			tenant.setStatus(_ctx.stringValue("ListUserTenantsResponse.TenantList["+ i +"].Status"));
			tenant.setTid(_ctx.longValue("ListUserTenantsResponse.TenantList["+ i +"].Tid"));
			tenant.setTenantName(_ctx.stringValue("ListUserTenantsResponse.TenantList["+ i +"].TenantName"));

			tenantList.add(tenant);
		}
		listUserTenantsResponse.setTenantList(tenantList);
	 
	 	return listUserTenantsResponse;
	}
}