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

import com.aliyuncs.unimkt.model.v20181212.ListTenantResponse;
import com.aliyuncs.unimkt.model.v20181212.ListTenantResponse.Tenant;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantResponseUnmarshaller {

	public static ListTenantResponse unmarshall(ListTenantResponse listTenantResponse, UnmarshallerContext _ctx) {
		
		listTenantResponse.setRequestId(_ctx.stringValue("ListTenantResponse.RequestId"));
		listTenantResponse.setCode(_ctx.stringValue("ListTenantResponse.Code"));
		listTenantResponse.setSuccess(_ctx.booleanValue("ListTenantResponse.Success"));
		listTenantResponse.setMessage(_ctx.stringValue("ListTenantResponse.Message"));
		listTenantResponse.setPageNumber(_ctx.integerValue("ListTenantResponse.PageNumber"));
		listTenantResponse.setPageSize(_ctx.integerValue("ListTenantResponse.PageSize"));
		listTenantResponse.setTotal(_ctx.longValue("ListTenantResponse.Total"));

		List<Tenant> model = new ArrayList<Tenant>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantResponse.Model.Length"); i++) {
			Tenant tenant = new Tenant();
			tenant.setCreateTime(_ctx.longValue("ListTenantResponse.Model["+ i +"].CreateTime"));
			tenant.setModifyTime(_ctx.longValue("ListTenantResponse.Model["+ i +"].ModifyTime"));
			tenant.setTenantId(_ctx.stringValue("ListTenantResponse.Model["+ i +"].TenantId"));
			tenant.setBusiness(_ctx.stringValue("ListTenantResponse.Model["+ i +"].Business"));
			tenant.setTenantName(_ctx.stringValue("ListTenantResponse.Model["+ i +"].TenantName"));
			tenant.setStatus(_ctx.stringValue("ListTenantResponse.Model["+ i +"].Status"));
			tenant.setSettleInfo(_ctx.stringValue("ListTenantResponse.Model["+ i +"].SettleInfo"));
			tenant.setExtInfo(_ctx.stringValue("ListTenantResponse.Model["+ i +"].ExtInfo"));
			tenant.setBizId(_ctx.stringValue("ListTenantResponse.Model["+ i +"].BizId"));
			tenant.setVersion(_ctx.longValue("ListTenantResponse.Model["+ i +"].Version"));
			tenant.setTenantDescription(_ctx.stringValue("ListTenantResponse.Model["+ i +"].TenantDescription"));

			model.add(tenant);
		}
		listTenantResponse.setModel(model);
	 
	 	return listTenantResponse;
	}
}