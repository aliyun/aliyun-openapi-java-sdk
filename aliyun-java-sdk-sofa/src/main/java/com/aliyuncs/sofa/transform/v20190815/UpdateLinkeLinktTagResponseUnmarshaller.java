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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTagResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTagResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTagResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktTagResponseUnmarshaller {

	public static UpdateLinkeLinktTagResponse unmarshall(UpdateLinkeLinktTagResponse updateLinkeLinktTagResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktTagResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktTagResponse.RequestId"));
		updateLinkeLinktTagResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktTagResponse.ResultCode"));
		updateLinkeLinktTagResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktTagResponse.ResultMessage"));
		updateLinkeLinktTagResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktTagResponse.ErrorCode"));
		updateLinkeLinktTagResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktTagResponse.ErrorMessage"));
		updateLinkeLinktTagResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Success"));

		Data data = new Data();
		data.setColor(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Color"));
		data.setContent(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Data.Deleted"));
		data.setId(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Id"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktTagResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		updateLinkeLinktTagResponse.setData(data);
	 
	 	return updateLinkeLinktTagResponse;
	}
}