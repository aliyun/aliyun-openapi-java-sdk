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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse.Data;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse.Data.Modifier;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse.Data.Owner;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktIterationResponseUnmarshaller {

	public static AddLinkeLinktIterationResponse unmarshall(AddLinkeLinktIterationResponse addLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("AddLinkeLinktIterationResponse.RequestId"));
		addLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("AddLinkeLinktIterationResponse.ResultCode"));
		addLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktIterationResponse.ResultMessage"));
		addLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("AddLinkeLinktIterationResponse.ErrorCode"));
		addLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktIterationResponse.ErrorMessage"));
		addLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktIterationResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("AddLinkeLinktIterationResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("AddLinkeLinktIterationResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Locked"));
		data.setName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("AddLinkeLinktIterationResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("AddLinkeLinktIterationResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinktIterationResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinktIterationResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		Owner owner = new Owner();
		owner.setAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Account"));
		owner.setAdDomain(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.AdDomain"));
		owner.setAliFullName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.AliFullName"));
		owner.setAuthToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.AuthToken"));
		owner.setBuName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.BuName"));
		owner.setBuNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.BuNo"));
		owner.setCustomer(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Customer"));
		owner.setDeleted(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Owner.Deleted"));
		owner.setDeptName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.DeptName"));
		owner.setDeptNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.DeptNo"));
		owner.setEmail(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Email"));
		owner.setEmpId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.EmpId"));
		owner.setEmpType(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.EmpType"));
		owner.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.EmpTypeExt"));
		owner.setFullPartTime(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.FullPartTime"));
		owner.setGitModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Owner.GitModified"));
		owner.setGitPassword(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.GitPassword"));
		owner.setGmtCreate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Owner.GmtCreate"));
		owner.setGmtEntry(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Owner.GmtEntry"));
		owner.setGmtLeave(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Owner.GmtLeave"));
		owner.setGmtModified(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Owner.GmtModified"));
		owner.setLevel(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Level"));
		owner.setLoginAccount(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.LoginAccount"));
		owner.setLoginName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.LoginName"));
		owner.setManager(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Owner.Manager"));
		owner.setMobile(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Mobile"));
		owner.setName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Name"));
		owner.setNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.NickName"));
		owner.setRealName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.RealName"));
		owner.setSuperName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.SuperName"));
		owner.setSuperNickName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.SuperNickName"));
		owner.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.SuperWorkNo"));
		owner.setTenant(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Tenant"));
		owner.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Owner.TenantAdmin"));
		owner.setUid(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Uid"));
		owner.setUniqueId(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.UniqueId"));
		owner.setUserToken(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.UserToken"));
		owner.setVirtName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.VirtName"));
		owner.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.VirtWorkNo"));
		owner.setWorkspace(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Workspace"));
		owner.setWorkNo(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.WorkNo"));
		owner.setWorkStatus(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinktIterationResponse.Data.Owner.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner.Tenants["+ i +"]"));
		}
		owner.setTenants2(tenants2);
		data.setOwner(owner);
		addLinkeLinktIterationResponse.setData(data);
	 
	 	return addLinkeLinktIterationResponse;
	}
}