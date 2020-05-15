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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTemplateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTemplateResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktTemplateResponseUnmarshaller {

	public static CreateLinkeLinktTemplateResponse unmarshall(CreateLinkeLinktTemplateResponse createLinkeLinktTemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktTemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktTemplateResponse.RequestId"));
		createLinkeLinktTemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ResultCode"));
		createLinkeLinktTemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ResultMessage"));
		createLinkeLinktTemplateResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktTemplateResponse.ErrorCode"));
		createLinkeLinktTemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ErrorMessage"));
		createLinkeLinktTemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.CreatedAt"));
		data.setDefaultContent(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.WorkflowId"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktTemplateResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		createLinkeLinktTemplateResponse.setData(data);
	 
	 	return createLinkeLinktTemplateResponse;
	}
}