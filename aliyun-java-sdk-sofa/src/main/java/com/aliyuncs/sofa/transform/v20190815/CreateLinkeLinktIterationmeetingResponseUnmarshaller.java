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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse.Data.AttachmentsItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse.Data.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktIterationmeetingResponseUnmarshaller {

	public static CreateLinkeLinktIterationmeetingResponse unmarshall(CreateLinkeLinktIterationmeetingResponse createLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.RequestId"));
		createLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ResultCode"));
		createLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ResultMessage"));
		createLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.ErrorCode"));
		createLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ErrorMessage"));
		createLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Deleted"));
		data.setId(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.IterationSign"));
		data.setTitle(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.UpdatedAt"));

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.WorkStatus"));

		List<String> tenants1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants1.add(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants1(tenants1);
		data.setModifier(modifier);

		List<AttachmentsItem> attachments = new ArrayList<AttachmentsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments.Length"); i++) {
			AttachmentsItem attachmentsItem = new AttachmentsItem();
			attachmentsItem.setCreatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].CreatedAt"));
			attachmentsItem.setDeleted(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Deleted"));
			attachmentsItem.setFilename(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Filename"));
			attachmentsItem.setId(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Id"));
			attachmentsItem.setStoredFilename(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].StoredFilename"));
			attachmentsItem.setTarget(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Target"));
			attachmentsItem.setTargetType(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].TargetType"));
			attachmentsItem.setUpdatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].UpdatedAt"));
			attachmentsItem.setUrl(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"].Url"));

			attachments.add(attachmentsItem);
		}
		data.setAttachments(attachments);
		createLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return createLinkeLinktIterationmeetingResponse;
	}
}