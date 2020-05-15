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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse.Data.AssignedTo;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse.Data.CcItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktRiskResponseUnmarshaller {

	public static UpdateLinkeLinktRiskResponse unmarshall(UpdateLinkeLinktRiskResponse updateLinkeLinktRiskResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktRiskResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.RequestId"));
		updateLinkeLinktRiskResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ResultCode"));
		updateLinkeLinktRiskResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ResultMessage"));
		updateLinkeLinktRiskResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktRiskResponse.ErrorCode"));
		updateLinkeLinktRiskResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ErrorMessage"));
		updateLinkeLinktRiskResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Deleted"));
		data.setExpectedCompletionDate(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.ExpectedCompletionDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Id"));
		data.setLevel(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Level"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Region"));
		data.setRemark(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Remark"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Status"));
		data.setTitle(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Title"));
		data.setUpdatedAt(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.UpdatedAt"));

		AssignedTo assignedTo = new AssignedTo();
		assignedTo.setAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Account"));
		assignedTo.setAdDomain(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.AdDomain"));
		assignedTo.setAliFullName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.AliFullName"));
		assignedTo.setAuthToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.AuthToken"));
		assignedTo.setBuName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.BuName"));
		assignedTo.setBuNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.BuNo"));
		assignedTo.setCustomer(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Customer"));
		assignedTo.setDeleted(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Deleted"));
		assignedTo.setDeptName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.DeptName"));
		assignedTo.setDeptNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.DeptNo"));
		assignedTo.setEmail(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Email"));
		assignedTo.setEmpId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.EmpId"));
		assignedTo.setEmpType(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.EmpType"));
		assignedTo.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.EmpTypeExt"));
		assignedTo.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.FullPartTime"));
		assignedTo.setGitModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GitModified"));
		assignedTo.setGitPassword(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GitPassword"));
		assignedTo.setGmtCreate(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GmtCreate"));
		assignedTo.setGmtEntry(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GmtEntry"));
		assignedTo.setGmtLeave(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GmtLeave"));
		assignedTo.setGmtModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.GmtModified"));
		assignedTo.setLevel(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Level"));
		assignedTo.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.LoginAccount"));
		assignedTo.setLoginName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.LoginName"));
		assignedTo.setManager(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Manager"));
		assignedTo.setMobile(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Mobile"));
		assignedTo.setName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Name"));
		assignedTo.setNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.NickName"));
		assignedTo.setRealName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.RealName"));
		assignedTo.setSuperName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.SuperName"));
		assignedTo.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.SuperNickName"));
		assignedTo.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.SuperWorkNo"));
		assignedTo.setTenant(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Tenant"));
		assignedTo.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.TenantAdmin"));
		assignedTo.setUid(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Uid"));
		assignedTo.setUniqueId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.UniqueId"));
		assignedTo.setUserToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.UserToken"));
		assignedTo.setVirtName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.VirtName"));
		assignedTo.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.VirtWorkNo"));
		assignedTo.setWorkspace(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Workspace"));
		assignedTo.setWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.WorkNo"));
		assignedTo.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo.Tenants["+ i +"]"));
		}
		assignedTo.setTenants1(tenants1);
		data.setAssignedTo(assignedTo);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.WorkStatus"));

		List<String> tenants2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktRiskResponse.Data.Creator.Tenants.Length"); i++) {
			tenants2.add(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants2(tenants2);
		data.setCreator(creator);

		List<CcItem> cc = new ArrayList<CcItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktRiskResponse.Data.Cc.Length"); i++) {
			CcItem ccItem = new CcItem();
			ccItem.setAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Account"));
			ccItem.setAdDomain(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].AdDomain"));
			ccItem.setAliFullName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].AliFullName"));
			ccItem.setAuthToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].AuthToken"));
			ccItem.setBuName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].BuName"));
			ccItem.setBuNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].BuNo"));
			ccItem.setCustomer(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Customer"));
			ccItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Deleted"));
			ccItem.setDeptName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].DeptName"));
			ccItem.setDeptNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].DeptNo"));
			ccItem.setEmail(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Email"));
			ccItem.setEmpId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].EmpId"));
			ccItem.setEmpType(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].EmpType"));
			ccItem.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].EmpTypeExt"));
			ccItem.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].FullPartTime"));
			ccItem.setGitModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GitModified"));
			ccItem.setGitPassword(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GitPassword"));
			ccItem.setGmtCreate(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GmtCreate"));
			ccItem.setGmtEntry(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GmtEntry"));
			ccItem.setGmtLeave(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GmtLeave"));
			ccItem.setGmtModified(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].GmtModified"));
			ccItem.setLevel(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Level"));
			ccItem.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].LoginAccount"));
			ccItem.setLoginName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].LoginName"));
			ccItem.setManager(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Manager"));
			ccItem.setMobile(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Mobile"));
			ccItem.setName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Name"));
			ccItem.setNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].NickName"));
			ccItem.setRealName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].RealName"));
			ccItem.setSuperName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].SuperName"));
			ccItem.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].SuperNickName"));
			ccItem.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].SuperWorkNo"));
			ccItem.setTenant(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Tenant"));
			ccItem.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].TenantAdmin"));
			ccItem.setUid(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Uid"));
			ccItem.setUniqueId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].UniqueId"));
			ccItem.setUserToken(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].UserToken"));
			ccItem.setVirtName(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].VirtName"));
			ccItem.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].VirtWorkNo"));
			ccItem.setWorkspace(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Workspace"));
			ccItem.setWorkNo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].WorkNo"));
			ccItem.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].WorkStatus"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"].Tenants["+ j +"]"));
			}
			ccItem.setTenants(tenants);

			cc.add(ccItem);
		}
		data.setCc(cc);
		updateLinkeLinktRiskResponse.setData(data);
	 
	 	return updateLinkeLinktRiskResponse;
	}
}