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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse.Data.Modifier;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse.Data.Owners;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktModuleResponseUnmarshaller {

	public static UpdateLinkeLinktModuleResponse unmarshall(UpdateLinkeLinktModuleResponse updateLinkeLinktModuleResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktModuleResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.RequestId"));
		updateLinkeLinktModuleResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ResultCode"));
		updateLinkeLinktModuleResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ResultMessage"));
		updateLinkeLinktModuleResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktModuleResponse.ErrorCode"));
		updateLinkeLinktModuleResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ErrorMessage"));
		updateLinkeLinktModuleResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Name"));
		data.setParentId(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.ParentId"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktModuleResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		Owners owners = new Owners();
		owners.setAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Account"));
		owners.setAdDomain(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.AdDomain"));
		owners.setAliFullName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.AliFullName"));
		owners.setAuthToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.AuthToken"));
		owners.setBuName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.BuName"));
		owners.setBuNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.BuNo"));
		owners.setCustomer(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Customer"));
		owners.setDeleted(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Owners.Deleted"));
		owners.setDeptName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.DeptName"));
		owners.setDeptNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.DeptNo"));
		owners.setEmail(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Email"));
		owners.setEmpId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.EmpId"));
		owners.setEmpType(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.EmpType"));
		owners.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.EmpTypeExt"));
		owners.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.FullPartTime"));
		owners.setGitModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Owners.GitModified"));
		owners.setGitPassword(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.GitPassword"));
		owners.setGmtCreate(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Owners.GmtCreate"));
		owners.setGmtEntry(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Owners.GmtEntry"));
		owners.setGmtLeave(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Owners.GmtLeave"));
		owners.setGmtModified(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Owners.GmtModified"));
		owners.setLevel(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Level"));
		owners.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.LoginAccount"));
		owners.setLoginName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.LoginName"));
		owners.setManager(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Owners.Manager"));
		owners.setMobile(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Mobile"));
		owners.setName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Name"));
		owners.setNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.NickName"));
		owners.setRealName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.RealName"));
		owners.setSuperName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.SuperName"));
		owners.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.SuperNickName"));
		owners.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.SuperWorkNo"));
		owners.setTenant(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Tenant"));
		owners.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Owners.TenantAdmin"));
		owners.setUid(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Uid"));
		owners.setUniqueId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.UniqueId"));
		owners.setUserToken(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.UserToken"));
		owners.setVirtName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.VirtName"));
		owners.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.VirtWorkNo"));
		owners.setWorkspace(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Workspace"));
		owners.setWorkNo(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.WorkNo"));
		owners.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktModuleResponse.Data.Owners.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners.Tenants["+ i +"]"));
		}
		owners.setTenants2(tenants2);
		data.setOwners(owners);
		updateLinkeLinktModuleResponse.setData(data);
	 
	 	return updateLinkeLinktModuleResponse;
	}
}