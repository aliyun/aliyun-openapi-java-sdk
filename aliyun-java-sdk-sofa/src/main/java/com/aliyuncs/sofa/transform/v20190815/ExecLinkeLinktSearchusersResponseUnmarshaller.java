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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchusersResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktSearchusersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktSearchusersResponseUnmarshaller {

	public static ExecLinkeLinktSearchusersResponse unmarshall(ExecLinkeLinktSearchusersResponse execLinkeLinktSearchusersResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktSearchusersResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.RequestId"));
		execLinkeLinktSearchusersResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.ResultCode"));
		execLinkeLinktSearchusersResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.ResultMessage"));
		execLinkeLinktSearchusersResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktSearchusersResponse.ErrorCode"));
		execLinkeLinktSearchusersResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.ErrorMessage"));
		execLinkeLinktSearchusersResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktSearchusersResponse.ResponseStatusCode"));
		execLinkeLinktSearchusersResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktSearchusersResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktSearchusersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccount(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Account"));
			dataItem.setAdDomain(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].AdDomain"));
			dataItem.setAliFullName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].AliFullName"));
			dataItem.setAuthToken(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].AuthToken"));
			dataItem.setBuName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].BuName"));
			dataItem.setBuNo(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].BuNo"));
			dataItem.setCustomer(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Customer"));
			dataItem.setDeleted(_ctx.booleanValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Deleted"));
			dataItem.setDeptName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].DeptName"));
			dataItem.setDeptNo(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].DeptNo"));
			dataItem.setEmail(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Email"));
			dataItem.setEmpId(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].EmpId"));
			dataItem.setEmpType(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].EmpType"));
			dataItem.setEmpTypeExt(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].EmpTypeExt"));
			dataItem.setFullPartTime(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].FullPartTime"));
			dataItem.setGitModified(_ctx.longValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GitModified"));
			dataItem.setGitPassword(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GitPassword"));
			dataItem.setGmtCreate(_ctx.longValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtEntry(_ctx.longValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GmtEntry"));
			dataItem.setGmtLeave(_ctx.longValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GmtLeave"));
			dataItem.setGmtModified(_ctx.longValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].GmtModified"));
			dataItem.setLevel(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Level"));
			dataItem.setLoginAccount(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].LoginAccount"));
			dataItem.setLoginName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].LoginName"));
			dataItem.setManager(_ctx.booleanValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Manager"));
			dataItem.setMobile(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Mobile"));
			dataItem.setName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Name"));
			dataItem.setNickName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].NickName"));
			dataItem.setRealName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].RealName"));
			dataItem.setSite(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Site"));
			dataItem.setSuperName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].SuperName"));
			dataItem.setSuperNickName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].SuperNickName"));
			dataItem.setSuperWorkNo(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].SuperWorkNo"));
			dataItem.setTenant(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Tenant"));
			dataItem.setTenantAdmin(_ctx.booleanValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].TenantAdmin"));
			dataItem.setUid(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Uid"));
			dataItem.setUniqueId(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].UniqueId"));
			dataItem.setUserToken(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].UserToken"));
			dataItem.setVirtName(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].VirtName"));
			dataItem.setVirtWorkNo(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].VirtWorkNo"));
			dataItem.setWorkspace(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkNo(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].WorkNo"));
			dataItem.setWorkStatus(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].WorkStatus"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("ExecLinkeLinktSearchusersResponse.Data["+ i +"].Tenants["+ j +"]"));
			}
			dataItem.setTenants(tenants);

			data.add(dataItem);
		}
		execLinkeLinktSearchusersResponse.setData(data);
	 
	 	return execLinkeLinktSearchusersResponse;
	}
}