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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantUserRolesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantUserRolesResponseUnmarshaller {

	public static DescribeTenantUserRolesResponse unmarshall(DescribeTenantUserRolesResponse describeTenantUserRolesResponse, UnmarshallerContext _ctx) {
		
		describeTenantUserRolesResponse.setRequestId(_ctx.stringValue("DescribeTenantUserRolesResponse.RequestId"));

		List<String> role = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantUserRolesResponse.Role.Length"); i++) {
			role.add(_ctx.stringValue("DescribeTenantUserRolesResponse.Role["+ i +"]"));
		}
		describeTenantUserRolesResponse.setRole(role);
	 
	 	return describeTenantUserRolesResponse;
	}
}