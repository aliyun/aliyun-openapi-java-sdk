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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktTemplatecopyResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktTemplatecopyResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktTemplatecopyResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktTemplatecopyResponseUnmarshaller {

	public static ExecLinkeLinktTemplatecopyResponse unmarshall(ExecLinkeLinktTemplatecopyResponse execLinkeLinktTemplatecopyResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktTemplatecopyResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.RequestId"));
		execLinkeLinktTemplatecopyResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ResultCode"));
		execLinkeLinktTemplatecopyResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ResultMessage"));
		execLinkeLinktTemplatecopyResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.ErrorCode"));
		execLinkeLinktTemplatecopyResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ErrorMessage"));
		execLinkeLinktTemplatecopyResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.CreatedAt"));
		data.setDefaultContent(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Description"));
		data.setId(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Id"));
		data.setName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Name"));
		data.setPriority(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.WorkflowId"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		execLinkeLinktTemplatecopyResponse.setData(data);
	 
	 	return execLinkeLinktTemplatecopyResponse;
	}
}