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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse.Data.AttachmentsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse.Data.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktIterationmeetingResponseUnmarshaller {

	public static UpdateLinkeLinktIterationmeetingResponse unmarshall(UpdateLinkeLinktIterationmeetingResponse updateLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.RequestId"));
		updateLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ResultCode"));
		updateLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ResultMessage"));
		updateLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.ErrorCode"));
		updateLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ErrorMessage"));
		updateLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Deleted"));
		data.setId(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.IterationSign"));
		data.setTitle(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		List<AttachmentsItem> attachments = new ArrayList<AttachmentsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments.Length"); i++) {
			AttachmentsItem attachmentsItem = new AttachmentsItem();
			attachmentsItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].CreatedAt"));
			attachmentsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Deleted"));
			attachmentsItem.setFilename(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Filename"));
			attachmentsItem.setId(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Id"));
			attachmentsItem.setStoredFilename(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].StoredFilename"));
			attachmentsItem.setTarget(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Target"));
			attachmentsItem.setTargetType(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].TargetType"));
			attachmentsItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].UpdatedAt"));
			attachmentsItem.setUrl(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Url"));

			attachments.add(attachmentsItem);
		}
		data.setAttachments(attachments);
		updateLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return updateLinkeLinktIterationmeetingResponse;
	}
}