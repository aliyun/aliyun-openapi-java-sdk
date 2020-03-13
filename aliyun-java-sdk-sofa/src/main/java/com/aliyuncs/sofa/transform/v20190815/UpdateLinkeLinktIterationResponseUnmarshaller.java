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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse.Data.Modifier;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse.Data.Owner;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktIterationResponseUnmarshaller {

	public static UpdateLinkeLinktIterationResponse unmarshall(UpdateLinkeLinktIterationResponse updateLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.RequestId"));
		updateLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ResultCode"));
		updateLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ResultMessage"));
		updateLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktIterationResponse.ErrorCode"));
		updateLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ErrorMessage"));
		updateLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Locked"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		Owner owner = new Owner();
		owner.setAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Account"));
		owner.setAdDomain(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.AdDomain"));
		owner.setAliFullName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.AliFullName"));
		owner.setAuthToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.AuthToken"));
		owner.setBuName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.BuName"));
		owner.setBuNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.BuNo"));
		owner.setCustomer(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Customer"));
		owner.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Owner.Deleted"));
		owner.setDeptName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.DeptName"));
		owner.setDeptNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.DeptNo"));
		owner.setEmail(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Email"));
		owner.setEmpId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.EmpId"));
		owner.setEmpType(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.EmpType"));
		owner.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.EmpTypeExt"));
		owner.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.FullPartTime"));
		owner.setGitModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Owner.GitModified"));
		owner.setGitPassword(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.GitPassword"));
		owner.setGmtCreate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Owner.GmtCreate"));
		owner.setGmtEntry(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Owner.GmtEntry"));
		owner.setGmtLeave(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Owner.GmtLeave"));
		owner.setGmtModified(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Owner.GmtModified"));
		owner.setLevel(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Level"));
		owner.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.LoginAccount"));
		owner.setLoginName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.LoginName"));
		owner.setManager(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Owner.Manager"));
		owner.setMobile(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Mobile"));
		owner.setName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Name"));
		owner.setNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.NickName"));
		owner.setRealName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.RealName"));
		owner.setSuperName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.SuperName"));
		owner.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.SuperNickName"));
		owner.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.SuperWorkNo"));
		owner.setTenant(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Tenant"));
		owner.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Owner.TenantAdmin"));
		owner.setUid(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Uid"));
		owner.setUniqueId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.UniqueId"));
		owner.setUserToken(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.UserToken"));
		owner.setVirtName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.VirtName"));
		owner.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.VirtWorkNo"));
		owner.setWorkspace(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Workspace"));
		owner.setWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.WorkNo"));
		owner.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationResponse.Data.Owner.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner.Tenants["+ i +"]"));
		}
		owner.setTenants2(tenants2);
		data.setOwner(owner);
		updateLinkeLinktIterationResponse.setData(data);
	 
	 	return updateLinkeLinktIterationResponse;
	}
}