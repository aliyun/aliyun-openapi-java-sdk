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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListTenantNameResponse;
import com.aliyuncs.unimkt.model.v20181212.ListTenantNameResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantNameResponseUnmarshaller {

	public static ListTenantNameResponse unmarshall(ListTenantNameResponse listTenantNameResponse, UnmarshallerContext _ctx) {
		
		listTenantNameResponse.setRequestId(_ctx.stringValue("ListTenantNameResponse.RequestId"));
		listTenantNameResponse.setCode(_ctx.stringValue("ListTenantNameResponse.Code"));
		listTenantNameResponse.setSuccess(_ctx.booleanValue("ListTenantNameResponse.Success"));
		listTenantNameResponse.setMessage(_ctx.stringValue("ListTenantNameResponse.Message"));
		listTenantNameResponse.setPageNumber(_ctx.integerValue("ListTenantNameResponse.PageNumber"));
		listTenantNameResponse.setPageSize(_ctx.integerValue("ListTenantNameResponse.PageSize"));
		listTenantNameResponse.setTotal(_ctx.longValue("ListTenantNameResponse.Total"));

		List<Tenant> model = new ArrayList<Tenant>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantNameResponse.Model.Length"); i++) {
			Tenant tenant = new Tenant();
			tenant.setTenantId(_ctx.stringValue("ListTenantNameResponse.Model["+ i +"].TenantId"));
			tenant.setTenantName(_ctx.stringValue("ListTenantNameResponse.Model["+ i +"].TenantName"));
			tenant.setTenantDescription(_ctx.stringValue("ListTenantNameResponse.Model["+ i +"].TenantDescription"));

			model.add(tenant);
		}
		listTenantNameResponse.setModel(model);
	 
	 	return listTenantNameResponse;
	}
}