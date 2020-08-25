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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeLinktUsersResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeLinktUsersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryLinkeLinktUsersResponseUnmarshaller {

	public static BatchqueryLinkeLinktUsersResponse unmarshall(BatchqueryLinkeLinktUsersResponse batchqueryLinkeLinktUsersResponse, UnmarshallerContext _ctx) {
		
		batchqueryLinkeLinktUsersResponse.setRequestId(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.RequestId"));
		batchqueryLinkeLinktUsersResponse.setResultCode(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.ResultCode"));
		batchqueryLinkeLinktUsersResponse.setResultMessage(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.ResultMessage"));
		batchqueryLinkeLinktUsersResponse.setErrorCode(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.ErrorCode"));
		batchqueryLinkeLinktUsersResponse.setErrorMessage(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.ErrorMessage"));
		batchqueryLinkeLinktUsersResponse.setResponseStatusCode(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.ResponseStatusCode"));
		batchqueryLinkeLinktUsersResponse.setSuccess(_ctx.booleanValue("BatchqueryLinkeLinktUsersResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryLinkeLinktUsersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccount(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Account"));
			dataItem.setAdDomain(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].AdDomain"));
			dataItem.setAliFullName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].AliFullName"));
			dataItem.setAuthToken(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].AuthToken"));
			dataItem.setBuName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].BuName"));
			dataItem.setBuNo(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].BuNo"));
			dataItem.setCustomer(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Customer"));
			dataItem.setDeleted(_ctx.booleanValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Deleted"));
			dataItem.setDeptName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].DeptName"));
			dataItem.setDeptNo(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].DeptNo"));
			dataItem.setEmail(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Email"));
			dataItem.setEmpId(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].EmpId"));
			dataItem.setEmpType(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].EmpType"));
			dataItem.setEmpTypeExt(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].EmpTypeExt"));
			dataItem.setFullPartTime(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].FullPartTime"));
			dataItem.setGitModified(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GitModified"));
			dataItem.setGitPassword(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GitPassword"));
			dataItem.setGmtCreate(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtEntry(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GmtEntry"));
			dataItem.setGmtLeave(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GmtLeave"));
			dataItem.setGmtModified(_ctx.longValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].GmtModified"));
			dataItem.setLevel(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Level"));
			dataItem.setLoginAccount(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].LoginAccount"));
			dataItem.setLoginName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].LoginName"));
			dataItem.setManager(_ctx.booleanValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Manager"));
			dataItem.setMobile(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Mobile"));
			dataItem.setName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Name"));
			dataItem.setNickName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].NickName"));
			dataItem.setRealName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].RealName"));
			dataItem.setSite(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Site"));
			dataItem.setSuperName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].SuperName"));
			dataItem.setSuperNickName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].SuperNickName"));
			dataItem.setSuperWorkNo(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].SuperWorkNo"));
			dataItem.setTenant(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Tenant"));
			dataItem.setTenantAdmin(_ctx.booleanValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].TenantAdmin"));
			dataItem.setUid(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Uid"));
			dataItem.setUniqueId(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].UniqueId"));
			dataItem.setUserToken(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].UserToken"));
			dataItem.setVirtName(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].VirtName"));
			dataItem.setVirtWorkNo(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].VirtWorkNo"));
			dataItem.setWorkspace(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkNo(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].WorkNo"));
			dataItem.setWorkStatus(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].WorkStatus"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("BatchqueryLinkeLinktUsersResponse.Data["+ i +"].Tenants["+ j +"]"));
			}
			dataItem.setTenants(tenants);

			data.add(dataItem);
		}
		batchqueryLinkeLinktUsersResponse.setData(data);
	 
	 	return batchqueryLinkeLinktUsersResponse;
	}
}