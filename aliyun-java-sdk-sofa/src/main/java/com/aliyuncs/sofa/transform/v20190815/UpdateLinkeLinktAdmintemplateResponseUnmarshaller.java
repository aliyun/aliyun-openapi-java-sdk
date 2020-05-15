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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmintemplateResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmintemplateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmintemplateResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktAdmintemplateResponseUnmarshaller {

	public static UpdateLinkeLinktAdmintemplateResponse unmarshall(UpdateLinkeLinktAdmintemplateResponse updateLinkeLinktAdmintemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktAdmintemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.RequestId"));
		updateLinkeLinktAdmintemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ResultCode"));
		updateLinkeLinktAdmintemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ResultMessage"));
		updateLinkeLinktAdmintemplateResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.ErrorCode"));
		updateLinkeLinktAdmintemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ErrorMessage"));
		updateLinkeLinktAdmintemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.CreatedAt"));
		data.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.WorkflowId"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		updateLinkeLinktAdmintemplateResponse.setData(data);
	 
	 	return updateLinkeLinktAdmintemplateResponse;
	}
}