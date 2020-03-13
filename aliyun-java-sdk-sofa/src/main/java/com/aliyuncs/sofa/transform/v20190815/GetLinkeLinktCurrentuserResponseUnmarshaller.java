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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktCurrentuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktCurrentuserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktCurrentuserResponseUnmarshaller {

	public static GetLinkeLinktCurrentuserResponse unmarshall(GetLinkeLinktCurrentuserResponse getLinkeLinktCurrentuserResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktCurrentuserResponse.setRequestId(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.RequestId"));
		getLinkeLinktCurrentuserResponse.setResultCode(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.ResultCode"));
		getLinkeLinktCurrentuserResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.ResultMessage"));
		getLinkeLinktCurrentuserResponse.setErrorCode(_ctx.longValue("GetLinkeLinktCurrentuserResponse.ErrorCode"));
		getLinkeLinktCurrentuserResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.ErrorMessage"));
		getLinkeLinktCurrentuserResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktCurrentuserResponse.Success"));

		Data data = new Data();
		data.setAccount(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Account"));
		data.setAdDomain(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.AdDomain"));
		data.setAliFullName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.AliFullName"));
		data.setAuthToken(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.AuthToken"));
		data.setBuName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.BuName"));
		data.setBuNo(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.BuNo"));
		data.setCustomer(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Customer"));
		data.setDeleted(_ctx.booleanValue("GetLinkeLinktCurrentuserResponse.Data.Deleted"));
		data.setDeptName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.DeptName"));
		data.setDeptNo(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.DeptNo"));
		data.setEmail(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Email"));
		data.setEmpId(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.EmpId"));
		data.setEmpType(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.EmpType"));
		data.setEmpTypeExt(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.EmpTypeExt"));
		data.setFullPartTime(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.FullPartTime"));
		data.setGitModified(_ctx.longValue("GetLinkeLinktCurrentuserResponse.Data.GitModified"));
		data.setGitPassword(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.GitPassword"));
		data.setGmtCreate(_ctx.longValue("GetLinkeLinktCurrentuserResponse.Data.GmtCreate"));
		data.setGmtEntry(_ctx.longValue("GetLinkeLinktCurrentuserResponse.Data.GmtEntry"));
		data.setGmtLeave(_ctx.longValue("GetLinkeLinktCurrentuserResponse.Data.GmtLeave"));
		data.setGmtModified(_ctx.longValue("GetLinkeLinktCurrentuserResponse.Data.GmtModified"));
		data.setLevel(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Level"));
		data.setLoginAccount(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.LoginAccount"));
		data.setLoginName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.LoginName"));
		data.setManager(_ctx.booleanValue("GetLinkeLinktCurrentuserResponse.Data.Manager"));
		data.setMobile(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Mobile"));
		data.setName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Name"));
		data.setNickName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.NickName"));
		data.setRealName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.RealName"));
		data.setSuperName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.SuperName"));
		data.setSuperNickName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.SuperNickName"));
		data.setSuperWorkNo(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.SuperWorkNo"));
		data.setTenant(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Tenant"));
		data.setTenantAdmin(_ctx.booleanValue("GetLinkeLinktCurrentuserResponse.Data.TenantAdmin"));
		data.setUid(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Uid"));
		data.setUniqueId(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.UniqueId"));
		data.setUserToken(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.UserToken"));
		data.setVirtName(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.VirtName"));
		data.setVirtWorkNo(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.VirtWorkNo"));
		data.setWorkspace(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Workspace"));
		data.setWorkNo(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.WorkNo"));
		data.setWorkStatus(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktCurrentuserResponse.Data.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeLinktCurrentuserResponse.Data.Tenants["+ i +"]"));
		}
		data.setTenants(tenants);
		getLinkeLinktCurrentuserResponse.setData(data);
	 
	 	return getLinkeLinktCurrentuserResponse;
	}
}