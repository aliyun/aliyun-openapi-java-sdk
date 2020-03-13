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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse.Data.Modifier;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse.Data.Owners;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktModuleResponseUnmarshaller {

	public static CreateLinkeLinktModuleResponse unmarshall(CreateLinkeLinktModuleResponse createLinkeLinktModuleResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktModuleResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktModuleResponse.RequestId"));
		createLinkeLinktModuleResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktModuleResponse.ResultCode"));
		createLinkeLinktModuleResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktModuleResponse.ResultMessage"));
		createLinkeLinktModuleResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktModuleResponse.ErrorCode"));
		createLinkeLinktModuleResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktModuleResponse.ErrorMessage"));
		createLinkeLinktModuleResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Name"));
		data.setParentId(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.ParentId"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktModuleResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktModuleResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		Owners owners = new Owners();
		owners.setAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Account"));
		owners.setAdDomain(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.AdDomain"));
		owners.setAliFullName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.AliFullName"));
		owners.setAuthToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.AuthToken"));
		owners.setBuName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.BuName"));
		owners.setBuNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.BuNo"));
		owners.setCustomer(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Customer"));
		owners.setDeleted(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Owners.Deleted"));
		owners.setDeptName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.DeptName"));
		owners.setDeptNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.DeptNo"));
		owners.setEmail(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Email"));
		owners.setEmpId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.EmpId"));
		owners.setEmpType(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.EmpType"));
		owners.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.EmpTypeExt"));
		owners.setFullPartTime(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.FullPartTime"));
		owners.setGitModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Owners.GitModified"));
		owners.setGitPassword(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.GitPassword"));
		owners.setGmtCreate(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Owners.GmtCreate"));
		owners.setGmtEntry(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Owners.GmtEntry"));
		owners.setGmtLeave(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Owners.GmtLeave"));
		owners.setGmtModified(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Owners.GmtModified"));
		owners.setLevel(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Level"));
		owners.setLoginAccount(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.LoginAccount"));
		owners.setLoginName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.LoginName"));
		owners.setManager(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Owners.Manager"));
		owners.setMobile(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Mobile"));
		owners.setName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Name"));
		owners.setNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.NickName"));
		owners.setRealName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.RealName"));
		owners.setSuperName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.SuperName"));
		owners.setSuperNickName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.SuperNickName"));
		owners.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.SuperWorkNo"));
		owners.setTenant(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Tenant"));
		owners.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Owners.TenantAdmin"));
		owners.setUid(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Uid"));
		owners.setUniqueId(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.UniqueId"));
		owners.setUserToken(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.UserToken"));
		owners.setVirtName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.VirtName"));
		owners.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.VirtWorkNo"));
		owners.setWorkspace(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Workspace"));
		owners.setWorkNo(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.WorkNo"));
		owners.setWorkStatus(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktModuleResponse.Data.Owners.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners.Tenants["+ i +"]"));
		}
		owners.setTenants2(tenants2);
		data.setOwners(owners);
		createLinkeLinktModuleResponse.setData(data);
	 
	 	return createLinkeLinktModuleResponse;
	}
}