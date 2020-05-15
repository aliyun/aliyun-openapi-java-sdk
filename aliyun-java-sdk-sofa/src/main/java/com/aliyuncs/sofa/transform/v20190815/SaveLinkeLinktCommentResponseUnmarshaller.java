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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCommentResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCommentResponse.Data;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCommentResponse.Data.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeLinktCommentResponseUnmarshaller {

	public static SaveLinkeLinktCommentResponse unmarshall(SaveLinkeLinktCommentResponse saveLinkeLinktCommentResponse, UnmarshallerContext _ctx) {
		
		saveLinkeLinktCommentResponse.setRequestId(_ctx.stringValue("SaveLinkeLinktCommentResponse.RequestId"));
		saveLinkeLinktCommentResponse.setResultCode(_ctx.stringValue("SaveLinkeLinktCommentResponse.ResultCode"));
		saveLinkeLinktCommentResponse.setResultMessage(_ctx.stringValue("SaveLinkeLinktCommentResponse.ResultMessage"));
		saveLinkeLinktCommentResponse.setErrorCode(_ctx.longValue("SaveLinkeLinktCommentResponse.ErrorCode"));
		saveLinkeLinktCommentResponse.setErrorMessage(_ctx.stringValue("SaveLinkeLinktCommentResponse.ErrorMessage"));
		saveLinkeLinktCommentResponse.setSuccess(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Data.Deleted"));
		data.setId(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Id"));
		data.setParentId(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.ParentId"));
		data.setTarget(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("SaveLinkeLinktCommentResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("SaveLinkeLinktCommentResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeLinktCommentResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("SaveLinkeLinktCommentResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);
		saveLinkeLinktCommentResponse.setData(data);
	 
	 	return saveLinkeLinktCommentResponse;
	}
}