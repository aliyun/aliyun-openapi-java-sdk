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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListTenantsResponse;
import com.aliyuncs.openitag.model.v20220616.ListTenantsResponse.TenantsItem;
import com.aliyuncs.openitag.model.v20220616.ListTenantsResponse.TenantsItem.Creator;
import com.aliyuncs.openitag.model.v20220616.ListTenantsResponse.TenantsItem.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantsResponseUnmarshaller {

	public static ListTenantsResponse unmarshall(ListTenantsResponse listTenantsResponse, UnmarshallerContext _ctx) {
		
		listTenantsResponse.setRequestId(_ctx.stringValue("ListTenantsResponse.RequestId"));
		listTenantsResponse.setCode(_ctx.integerValue("ListTenantsResponse.Code"));
		listTenantsResponse.setMessage(_ctx.stringValue("ListTenantsResponse.Message"));
		listTenantsResponse.setDetails(_ctx.stringValue("ListTenantsResponse.Details"));
		listTenantsResponse.setSuccess(_ctx.booleanValue("ListTenantsResponse.Success"));
		listTenantsResponse.setPageNumber(_ctx.integerValue("ListTenantsResponse.PageNumber"));
		listTenantsResponse.setPageSize(_ctx.integerValue("ListTenantsResponse.PageSize"));
		listTenantsResponse.setTotalPage(_ctx.integerValue("ListTenantsResponse.TotalPage"));
		listTenantsResponse.setTotalCount(_ctx.integerValue("ListTenantsResponse.TotalCount"));
		listTenantsResponse.setErrorCode(_ctx.stringValue("ListTenantsResponse.ErrorCode"));

		List<TenantsItem> tenants = new ArrayList<TenantsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantsResponse.Tenants.Length"); i++) {
			TenantsItem tenantsItem = new TenantsItem();
			tenantsItem.setGmtCreateTime(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].GmtCreateTime"));
			tenantsItem.setGmtModifiedTime(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].GmtModifiedTime"));
			tenantsItem.setTenantId(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].TenantId"));
			tenantsItem.setTenantName(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].TenantName"));
			tenantsItem.setUUID(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].UUID"));
			tenantsItem.setDescription(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Description"));
			tenantsItem.setRole(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Role"));

			Creator creator = new Creator();
			creator.setUserId(_ctx.longValue("ListTenantsResponse.Tenants["+ i +"].Creator.UserId"));
			creator.setAccountType(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Creator.AccountNo"));
			creator.setUserName(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Creator.UserName"));
			creator.setRole(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Creator.Role"));
			tenantsItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.longValue("ListTenantsResponse.Tenants["+ i +"].Modifier.UserId"));
			modifier.setAccountType(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Modifier.AccountNo"));
			modifier.setUserName(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Modifier.UserName"));
			modifier.setRole(_ctx.stringValue("ListTenantsResponse.Tenants["+ i +"].Modifier.Role"));
			tenantsItem.setModifier(modifier);

			tenants.add(tenantsItem);
		}
		listTenantsResponse.setTenants(tenants);
	 
	 	return listTenantsResponse;
	}
}