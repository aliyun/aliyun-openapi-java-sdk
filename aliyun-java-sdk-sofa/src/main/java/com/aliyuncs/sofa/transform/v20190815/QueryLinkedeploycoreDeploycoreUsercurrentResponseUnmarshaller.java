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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreUsercurrentResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreUsercurrentResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreUsercurrentResponse unmarshall(QueryLinkedeploycoreDeploycoreUsercurrentResponse queryLinkedeploycoreDeploycoreUsercurrentResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.RequestId"));
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Message"));
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Success"));

		Data data = new Data();
		data.setAccount(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Account"));
		data.setAdDomain(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.AdDomain"));
		data.setAliFullName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.AliFullName"));
		data.setAuthToken(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.AuthToken"));
		data.setBuName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.BuName"));
		data.setBuNo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.BuNo"));
		data.setCustomer(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Customer"));
		data.setDeleted(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Deleted"));
		data.setDeptName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.DeptName"));
		data.setDeptNo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.DeptNo"));
		data.setEmail(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Email"));
		data.setEmpId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.EmpId"));
		data.setEmpType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.EmpType"));
		data.setEmpTypeExt(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.EmpTypeExt"));
		data.setFullPartTime(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.FullPartTime"));
		data.setGitModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GitModified"));
		data.setGitPassword(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GitPassword"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GmtCreate"));
		data.setGmtEntry(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GmtEntry"));
		data.setGmtLeave(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GmtLeave"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.GmtModified"));
		data.setLevel(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Level"));
		data.setLoginAccount(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.LoginAccount"));
		data.setLoginName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.LoginName"));
		data.setManager(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Manager"));
		data.setMobile(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Mobile"));
		data.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Name"));
		data.setNickName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.NickName"));
		data.setRealName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.RealName"));
		data.setSite(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Site"));
		data.setSuperName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.SuperName"));
		data.setSuperNickName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.SuperNickName"));
		data.setSuperWorkNo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.SuperWorkNo"));
		data.setTenant(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Tenant"));
		data.setTenantAdmin(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.TenantAdmin"));
		data.setUid(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Uid"));
		data.setUniqueId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.UniqueId"));
		data.setUserToken(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.UserToken"));
		data.setVirtName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.VirtName"));
		data.setVirtWorkNo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.VirtWorkNo"));
		data.setWorkspace(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Workspace"));
		data.setWorkNo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.WorkNo"));
		data.setWorkStatus(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreUsercurrentResponse.Data.Tenants["+ i +"]"));
		}
		data.setTenants(tenants);
		queryLinkedeploycoreDeploycoreUsercurrentResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreUsercurrentResponse;
	}
}