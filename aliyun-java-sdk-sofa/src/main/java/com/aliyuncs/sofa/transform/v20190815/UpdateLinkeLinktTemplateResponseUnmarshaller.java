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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplateResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktTemplateResponseUnmarshaller {

	public static UpdateLinkeLinktTemplateResponse unmarshall(UpdateLinkeLinktTemplateResponse updateLinkeLinktTemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktTemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.RequestId"));
		updateLinkeLinktTemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ResultCode"));
		updateLinkeLinktTemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ResultMessage"));
		updateLinkeLinktTemplateResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktTemplateResponse.ErrorCode"));
		updateLinkeLinktTemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ErrorMessage"));
		updateLinkeLinktTemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.CreatedAt"));
		data.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.WorkflowId"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		updateLinkeLinktTemplateResponse.setData(data);
	 
	 	return updateLinkeLinktTemplateResponse;
	}
}