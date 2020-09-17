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

package com.aliyuncs.emap.transform.v20200608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emap.model.v20200608.ListSubAccountsResponse;
import com.aliyuncs.emap.model.v20200608.ListSubAccountsResponse.SubAccount;
import com.aliyuncs.emap.model.v20200608.ListSubAccountsResponse.SubAccount.PermissionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubAccountsResponseUnmarshaller {

	public static ListSubAccountsResponse unmarshall(ListSubAccountsResponse listSubAccountsResponse, UnmarshallerContext _ctx) {
		
		listSubAccountsResponse.setRequestId(_ctx.stringValue("ListSubAccountsResponse.RequestId"));
		listSubAccountsResponse.setMessage(_ctx.stringValue("ListSubAccountsResponse.Message"));
		listSubAccountsResponse.setErrorCode(_ctx.stringValue("ListSubAccountsResponse.ErrorCode"));
		listSubAccountsResponse.setErrorMessage(_ctx.stringValue("ListSubAccountsResponse.ErrorMessage"));
		listSubAccountsResponse.setDynamicMessage(_ctx.stringValue("ListSubAccountsResponse.DynamicMessage"));
		listSubAccountsResponse.setSuccess(_ctx.booleanValue("ListSubAccountsResponse.Success"));
		listSubAccountsResponse.setDynamicCode(_ctx.stringValue("ListSubAccountsResponse.DynamicCode"));
		listSubAccountsResponse.setCode(_ctx.stringValue("ListSubAccountsResponse.Code"));
		listSubAccountsResponse.setPageSize(_ctx.integerValue("ListSubAccountsResponse.PageSize"));
		listSubAccountsResponse.setPageNumber(_ctx.integerValue("ListSubAccountsResponse.PageNumber"));
		listSubAccountsResponse.setTotalCount(_ctx.longValue("ListSubAccountsResponse.TotalCount"));

		List<SubAccount> subAccounts = new ArrayList<SubAccount>();
		for (int i = 0; i < _ctx.lengthValue("ListSubAccountsResponse.SubAccounts.Length"); i++) {
			SubAccount subAccount = new SubAccount();
			subAccount.setName(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].Name"));
			subAccount.setId(_ctx.longValue("ListSubAccountsResponse.SubAccounts["+ i +"].Id"));
			subAccount.setCallerUid(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].CallerUid"));
			subAccount.setStatus(_ctx.integerValue("ListSubAccountsResponse.SubAccounts["+ i +"].Status"));

			List<PermissionData> permissions = new ArrayList<PermissionData>();
			for (int j = 0; j < _ctx.lengthValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions.Length"); j++) {
				PermissionData permissionData = new PermissionData();
				permissionData.setType(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions["+ j +"].Type"));
				permissionData.setOption(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions["+ j +"].Option"));
				permissionData.setDesc(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions["+ j +"].Desc"));
				permissionData.setUniqueId(_ctx.stringValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions["+ j +"].UniqueId"));
				permissionData.setId(_ctx.longValue("ListSubAccountsResponse.SubAccounts["+ i +"].Permissions["+ j +"].Id"));

				permissions.add(permissionData);
			}
			subAccount.setPermissions(permissions);

			subAccounts.add(subAccount);
		}
		listSubAccountsResponse.setSubAccounts(subAccounts);
	 
	 	return listSubAccountsResponse;
	}
}