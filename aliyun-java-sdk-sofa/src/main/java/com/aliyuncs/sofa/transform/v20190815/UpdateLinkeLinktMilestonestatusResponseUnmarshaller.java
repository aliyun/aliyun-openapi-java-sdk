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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse.Data.Manager;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse.Data.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktMilestonestatusResponseUnmarshaller {

	public static UpdateLinkeLinktMilestonestatusResponse unmarshall(UpdateLinkeLinktMilestonestatusResponse updateLinkeLinktMilestonestatusResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktMilestonestatusResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.RequestId"));
		updateLinkeLinktMilestonestatusResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ResultCode"));
		updateLinkeLinktMilestonestatusResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ResultMessage"));
		updateLinkeLinktMilestonestatusResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.ErrorCode"));
		updateLinkeLinktMilestonestatusResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ErrorMessage"));
		updateLinkeLinktMilestonestatusResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Manager manager = new Manager();
		manager.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Account"));
		manager.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.AdDomain"));
		manager.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.AliFullName"));
		manager.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.AuthToken"));
		manager.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.BuName"));
		manager.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.BuNo"));
		manager.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Customer"));
		manager.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Deleted"));
		manager.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.DeptName"));
		manager.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.DeptNo"));
		manager.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Email"));
		manager.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.EmpId"));
		manager.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.EmpType"));
		manager.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.EmpTypeExt"));
		manager.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.FullPartTime"));
		manager.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GitModified"));
		manager.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GitPassword"));
		manager.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GmtCreate"));
		manager.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GmtEntry"));
		manager.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GmtLeave"));
		manager.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.GmtModified"));
		manager.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Level"));
		manager.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.LoginAccount"));
		manager.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.LoginName"));
		manager.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Manager"));
		manager.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Mobile"));
		manager.setName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Name"));
		manager.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.NickName"));
		manager.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.RealName"));
		manager.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.SuperName"));
		manager.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.SuperNickName"));
		manager.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.SuperWorkNo"));
		manager.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Tenant"));
		manager.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.TenantAdmin"));
		manager.setUid(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Uid"));
		manager.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.UniqueId"));
		manager.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.UserToken"));
		manager.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.VirtName"));
		manager.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.VirtWorkNo"));
		manager.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Workspace"));
		manager.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.WorkNo"));
		manager.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager.Tenants["+ i +"]"));
		}
		manager.setTenants1(tenants1);
		data.setManager(manager);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants2(tenants2);
		data.setModifier(modifier);
		updateLinkeLinktMilestonestatusResponse.setData(data);
	 
	 	return updateLinkeLinktMilestonestatusResponse;
	}
}