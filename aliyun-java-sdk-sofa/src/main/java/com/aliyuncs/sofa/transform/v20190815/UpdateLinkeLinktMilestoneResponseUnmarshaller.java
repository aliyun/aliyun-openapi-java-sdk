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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse.Data.Manager;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse.Data.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktMilestoneResponseUnmarshaller {

	public static UpdateLinkeLinktMilestoneResponse unmarshall(UpdateLinkeLinktMilestoneResponse updateLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.RequestId"));
		updateLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ResultCode"));
		updateLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ResultMessage"));
		updateLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.ErrorCode"));
		updateLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ErrorMessage"));
		updateLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Manager manager = new Manager();
		manager.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Account"));
		manager.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.AdDomain"));
		manager.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.AliFullName"));
		manager.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.AuthToken"));
		manager.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.BuName"));
		manager.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.BuNo"));
		manager.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Customer"));
		manager.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Deleted"));
		manager.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.DeptName"));
		manager.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.DeptNo"));
		manager.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Email"));
		manager.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.EmpId"));
		manager.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.EmpType"));
		manager.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.EmpTypeExt"));
		manager.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.FullPartTime"));
		manager.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GitModified"));
		manager.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GitPassword"));
		manager.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GmtCreate"));
		manager.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GmtEntry"));
		manager.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GmtLeave"));
		manager.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.GmtModified"));
		manager.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Level"));
		manager.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.LoginAccount"));
		manager.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.LoginName"));
		manager.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Manager"));
		manager.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Mobile"));
		manager.setName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Name"));
		manager.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.NickName"));
		manager.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.RealName"));
		manager.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.SuperName"));
		manager.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.SuperNickName"));
		manager.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.SuperWorkNo"));
		manager.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Tenant"));
		manager.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.TenantAdmin"));
		manager.setUid(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Uid"));
		manager.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.UniqueId"));
		manager.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.UserToken"));
		manager.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.VirtName"));
		manager.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.VirtWorkNo"));
		manager.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Workspace"));
		manager.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.WorkNo"));
		manager.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager.Tenants["+ i +"]"));
		}
		manager.setTenants1(tenants1);
		data.setManager(manager);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants2(tenants2);
		data.setModifier(modifier);
		updateLinkeLinktMilestoneResponse.setData(data);
	 
	 	return updateLinkeLinktMilestoneResponse;
	}
}