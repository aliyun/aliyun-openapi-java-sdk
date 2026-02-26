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

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserStatusResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserStatusResponse.TenantUserItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTenantUserStatusResponseUnmarshaller {

	public static ModifyTenantUserStatusResponse unmarshall(ModifyTenantUserStatusResponse modifyTenantUserStatusResponse, UnmarshallerContext _ctx) {
		
		modifyTenantUserStatusResponse.setRequestId(_ctx.stringValue("ModifyTenantUserStatusResponse.RequestId"));

		List<TenantUserItem> tenantUser = new ArrayList<TenantUserItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyTenantUserStatusResponse.TenantUser.Length"); i++) {
			TenantUserItem tenantUserItem = new TenantUserItem();
			tenantUserItem.setUserStatus(_ctx.stringValue("ModifyTenantUserStatusResponse.TenantUser["+ i +"].UserStatus"));
			tenantUserItem.setUserName(_ctx.stringValue("ModifyTenantUserStatusResponse.TenantUser["+ i +"].UserName"));
			tenantUserItem.setTenantId(_ctx.stringValue("ModifyTenantUserStatusResponse.TenantUser["+ i +"].TenantId"));

			tenantUser.add(tenantUserItem);
		}
		modifyTenantUserStatusResponse.setTenantUser(tenantUser);
	 
	 	return modifyTenantUserStatusResponse;
	}
}