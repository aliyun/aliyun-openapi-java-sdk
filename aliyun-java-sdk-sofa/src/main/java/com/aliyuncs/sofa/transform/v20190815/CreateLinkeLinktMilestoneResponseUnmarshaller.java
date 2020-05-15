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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse.Data.Manager;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse.Data.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktMilestoneResponseUnmarshaller {

	public static CreateLinkeLinktMilestoneResponse unmarshall(CreateLinkeLinktMilestoneResponse createLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.RequestId"));
		createLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ResultCode"));
		createLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ResultMessage"));
		createLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktMilestoneResponse.ErrorCode"));
		createLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ErrorMessage"));
		createLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Manager manager = new Manager();
		manager.setAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Account"));
		manager.setAdDomain(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.AdDomain"));
		manager.setAliFullName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.AliFullName"));
		manager.setAuthToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.AuthToken"));
		manager.setBuName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.BuName"));
		manager.setBuNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.BuNo"));
		manager.setCustomer(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Customer"));
		manager.setDeleted(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Deleted"));
		manager.setDeptName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.DeptName"));
		manager.setDeptNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.DeptNo"));
		manager.setEmail(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Email"));
		manager.setEmpId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.EmpId"));
		manager.setEmpType(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.EmpType"));
		manager.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.EmpTypeExt"));
		manager.setFullPartTime(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.FullPartTime"));
		manager.setGitModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GitModified"));
		manager.setGitPassword(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GitPassword"));
		manager.setGmtCreate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GmtCreate"));
		manager.setGmtEntry(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GmtEntry"));
		manager.setGmtLeave(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GmtLeave"));
		manager.setGmtModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Manager.GmtModified"));
		manager.setLevel(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Level"));
		manager.setLoginAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.LoginAccount"));
		manager.setLoginName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.LoginName"));
		manager.setManager(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Manager"));
		manager.setMobile(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Mobile"));
		manager.setName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Name"));
		manager.setNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.NickName"));
		manager.setRealName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.RealName"));
		manager.setSuperName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.SuperName"));
		manager.setSuperNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.SuperNickName"));
		manager.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.SuperWorkNo"));
		manager.setTenant(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Tenant"));
		manager.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Manager.TenantAdmin"));
		manager.setUid(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Uid"));
		manager.setUniqueId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.UniqueId"));
		manager.setUserToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.UserToken"));
		manager.setVirtName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.VirtName"));
		manager.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.VirtWorkNo"));
		manager.setWorkspace(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Workspace"));
		manager.setWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.WorkNo"));
		manager.setWorkStatus(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager.Tenants["+ i +"]"));
		}
		manager.setTenants1(tenants1);
		data.setManager(manager);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants2(tenants2);
		data.setModifier(modifier);
		createLinkeLinktMilestoneResponse.setData(data);
	 
	 	return createLinkeLinktMilestoneResponse;
	}
}