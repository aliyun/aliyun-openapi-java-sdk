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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmintemplateResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmintemplateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmintemplateResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktAdmintemplateResponseUnmarshaller {

	public static CreateLinkeLinktAdmintemplateResponse unmarshall(CreateLinkeLinktAdmintemplateResponse createLinkeLinktAdmintemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktAdmintemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.RequestId"));
		createLinkeLinktAdmintemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ResultCode"));
		createLinkeLinktAdmintemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ResultMessage"));
		createLinkeLinktAdmintemplateResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.ErrorCode"));
		createLinkeLinktAdmintemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ErrorMessage"));
		createLinkeLinktAdmintemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.CreatedAt"));
		data.setDefaultContent(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.WorkflowId"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		createLinkeLinktAdmintemplateResponse.setData(data);
	 
	 	return createLinkeLinktAdmintemplateResponse;
	}
}