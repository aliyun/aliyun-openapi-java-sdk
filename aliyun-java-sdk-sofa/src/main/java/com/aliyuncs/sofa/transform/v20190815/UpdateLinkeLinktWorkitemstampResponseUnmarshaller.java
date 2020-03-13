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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CcsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsItem.Creator1;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsItem.PossibleValuesItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem.CustomField;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem.CustomField.Creator8;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem.CustomField.PossibleValuesItem10;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem.ListUserValueItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValuesItem.UserValue;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Iteration;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Modifier;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ModulesItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ModulesItem.Creator13;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ModulesItem.Modifier14;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ModulesItem.Owners;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds27;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.CcsItem35;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator28;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration29;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier30;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.PriorityEntity31;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project32;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project32.Creator40;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status33;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.PriorityEntity;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Project;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator42;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjectsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjectsItem.Creator18;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Status;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.TagsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.TagsItem.Creator20;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Template;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator44;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.TemplateListItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemstampResponse.Data.TemplateListItem.Creator22;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktWorkitemstampResponseUnmarshaller {

	public static UpdateLinkeLinktWorkitemstampResponse unmarshall(UpdateLinkeLinktWorkitemstampResponse updateLinkeLinktWorkitemstampResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktWorkitemstampResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.RequestId"));
		updateLinkeLinktWorkitemstampResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ResultCode"));
		updateLinkeLinktWorkitemstampResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ResultMessage"));
		updateLinkeLinktWorkitemstampResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.ErrorCode"));
		updateLinkeLinktWorkitemstampResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.ErrorMessage"));
		updateLinkeLinktWorkitemstampResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Success"));

		Data data = new Data();
		data.setAsRootLevel(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AsRootLevel"));
		data.setChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ChildrenCount"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Description"));
		data.setExpectedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ExpectedAt"));
		data.setFilteredChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.FilteredChildrenCount"));
		data.setFinishedChildrenCount(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.FinishedChildrenCount"));
		data.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.IterationSign"));
		data.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Link"));
		data.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentSign"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Priority"));
		data.setProjectName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ProjectName"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Region"));
		data.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.SignPath"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Stamp"));
		data.setStatusId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.StatusId"));
		data.setStatusStage(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.StatusStage"));
		data.setSubject(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Subject"));
		data.setTemplateId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateId"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.UpdatedAt"));

		AssignedToIds assignedToIds = new AssignedToIds();
		assignedToIds.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Account"));
		assignedToIds.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.AdDomain"));
		assignedToIds.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.AliFullName"));
		assignedToIds.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.AuthToken"));
		assignedToIds.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.BuName"));
		assignedToIds.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.BuNo"));
		assignedToIds.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Customer"));
		assignedToIds.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Deleted"));
		assignedToIds.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.DeptName"));
		assignedToIds.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.DeptNo"));
		assignedToIds.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Email"));
		assignedToIds.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.EmpId"));
		assignedToIds.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.EmpType"));
		assignedToIds.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.EmpTypeExt"));
		assignedToIds.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.FullPartTime"));
		assignedToIds.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GitModified"));
		assignedToIds.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GitPassword"));
		assignedToIds.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GmtCreate"));
		assignedToIds.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GmtEntry"));
		assignedToIds.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GmtLeave"));
		assignedToIds.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.GmtModified"));
		assignedToIds.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Level"));
		assignedToIds.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.LoginAccount"));
		assignedToIds.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.LoginName"));
		assignedToIds.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Manager"));
		assignedToIds.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Mobile"));
		assignedToIds.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Name"));
		assignedToIds.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.NickName"));
		assignedToIds.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.RealName"));
		assignedToIds.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.SuperName"));
		assignedToIds.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.SuperNickName"));
		assignedToIds.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.SuperWorkNo"));
		assignedToIds.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Tenant"));
		assignedToIds.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.TenantAdmin"));
		assignedToIds.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Uid"));
		assignedToIds.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.UniqueId"));
		assignedToIds.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.UserToken"));
		assignedToIds.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.VirtName"));
		assignedToIds.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.VirtWorkNo"));
		assignedToIds.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Workspace"));
		assignedToIds.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.WorkNo"));
		assignedToIds.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.WorkStatus"));

		List<String> tenants24 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Tenants.Length"); i++) {
			tenants24.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AssignedToIds.Tenants["+ i +"]"));
		}
		assignedToIds.setTenants24(tenants24);
		data.setAssignedToIds(assignedToIds);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.WorkStatus"));

		List<String> tenants25 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Tenants.Length"); i++) {
			tenants25.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants25(tenants25);
		data.setCreator(creator);

		Iteration iteration = new Iteration();
		iteration.setBeginDate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.BeginDate"));
		iteration.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.CreatedAt"));
		iteration.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.Deleted"));
		iteration.setEndDate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.EndDate"));
		iteration.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.Id"));
		iteration.setLocked(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.Locked"));
		iteration.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.Name"));
		iteration.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.ProjectSign"));
		iteration.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.Sign"));
		iteration.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Iteration.UpdatedAt"));
		data.setIteration(iteration);

		Modifier modifier = new Modifier();
		modifier.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Account"));
		modifier.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.AdDomain"));
		modifier.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.AliFullName"));
		modifier.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.AuthToken"));
		modifier.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.BuName"));
		modifier.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.BuNo"));
		modifier.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Customer"));
		modifier.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Deleted"));
		modifier.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.DeptName"));
		modifier.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.DeptNo"));
		modifier.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Email"));
		modifier.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.EmpId"));
		modifier.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.EmpType"));
		modifier.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.EmpTypeExt"));
		modifier.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.FullPartTime"));
		modifier.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GitModified"));
		modifier.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GitPassword"));
		modifier.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GmtCreate"));
		modifier.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GmtEntry"));
		modifier.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GmtLeave"));
		modifier.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.GmtModified"));
		modifier.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Level"));
		modifier.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.LoginAccount"));
		modifier.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.LoginName"));
		modifier.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Manager"));
		modifier.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Mobile"));
		modifier.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Name"));
		modifier.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.NickName"));
		modifier.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.RealName"));
		modifier.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.SuperName"));
		modifier.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.SuperNickName"));
		modifier.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.SuperWorkNo"));
		modifier.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Tenant"));
		modifier.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.TenantAdmin"));
		modifier.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Uid"));
		modifier.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.UniqueId"));
		modifier.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.UserToken"));
		modifier.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.VirtName"));
		modifier.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.VirtWorkNo"));
		modifier.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Workspace"));
		modifier.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.WorkNo"));
		modifier.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.WorkStatus"));

		List<String> tenants26 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Tenants.Length"); i++) {
			tenants26.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modifier.Tenants["+ i +"]"));
		}
		modifier.setTenants26(tenants26);
		data.setModifier(modifier);

		ParentWorkItem parentWorkItem = new ParentWorkItem();
		parentWorkItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.CreatedAt"));
		parentWorkItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Deleted"));
		parentWorkItem.setExpectedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.ExpectedAt"));
		parentWorkItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Id"));
		parentWorkItem.setIterationSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.IterationSign"));
		parentWorkItem.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.ParentSign"));
		parentWorkItem.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Priority"));
		parentWorkItem.setProjectName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.ProjectName"));
		parentWorkItem.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.ProjectSign"));
		parentWorkItem.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Sign"));
		parentWorkItem.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.SignPath"));
		parentWorkItem.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Stamp"));
		parentWorkItem.setStatusId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.StatusId"));
		parentWorkItem.setStatusStage(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.StatusStage"));
		parentWorkItem.setSubject(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Subject"));
		parentWorkItem.setTemplateId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.TemplateId"));
		parentWorkItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.UpdatedAt"));

		AssignedToIds27 assignedToIds27 = new AssignedToIds27();
		assignedToIds27.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Account"));
		assignedToIds27.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.AdDomain"));
		assignedToIds27.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.AliFullName"));
		assignedToIds27.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.AuthToken"));
		assignedToIds27.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.BuName"));
		assignedToIds27.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.BuNo"));
		assignedToIds27.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Customer"));
		assignedToIds27.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Deleted"));
		assignedToIds27.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.DeptName"));
		assignedToIds27.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.DeptNo"));
		assignedToIds27.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Email"));
		assignedToIds27.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.EmpId"));
		assignedToIds27.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.EmpType"));
		assignedToIds27.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.EmpTypeExt"));
		assignedToIds27.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.FullPartTime"));
		assignedToIds27.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GitModified"));
		assignedToIds27.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GitPassword"));
		assignedToIds27.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GmtCreate"));
		assignedToIds27.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GmtEntry"));
		assignedToIds27.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GmtLeave"));
		assignedToIds27.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.GmtModified"));
		assignedToIds27.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Level"));
		assignedToIds27.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.LoginAccount"));
		assignedToIds27.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.LoginName"));
		assignedToIds27.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Manager"));
		assignedToIds27.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Mobile"));
		assignedToIds27.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Name"));
		assignedToIds27.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.NickName"));
		assignedToIds27.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.RealName"));
		assignedToIds27.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.SuperName"));
		assignedToIds27.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.SuperNickName"));
		assignedToIds27.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.SuperWorkNo"));
		assignedToIds27.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Tenant"));
		assignedToIds27.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.TenantAdmin"));
		assignedToIds27.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Uid"));
		assignedToIds27.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.UniqueId"));
		assignedToIds27.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.UserToken"));
		assignedToIds27.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.VirtName"));
		assignedToIds27.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.VirtWorkNo"));
		assignedToIds27.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Workspace"));
		assignedToIds27.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.WorkNo"));
		assignedToIds27.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.WorkStatus"));

		List<String> tenants37 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Tenants.Length"); i++) {
			tenants37.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.AssignedToIds.Tenants["+ i +"]"));
		}
		assignedToIds27.setTenants37(tenants37);
		parentWorkItem.setAssignedToIds27(assignedToIds27);

		Creator28 creator28 = new Creator28();
		creator28.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Account"));
		creator28.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.AdDomain"));
		creator28.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.AliFullName"));
		creator28.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.AuthToken"));
		creator28.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.BuName"));
		creator28.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.BuNo"));
		creator28.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Customer"));
		creator28.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Deleted"));
		creator28.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.DeptName"));
		creator28.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.DeptNo"));
		creator28.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Email"));
		creator28.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.EmpId"));
		creator28.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.EmpType"));
		creator28.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.EmpTypeExt"));
		creator28.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.FullPartTime"));
		creator28.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GitModified"));
		creator28.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GitPassword"));
		creator28.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GmtCreate"));
		creator28.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GmtEntry"));
		creator28.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GmtLeave"));
		creator28.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.GmtModified"));
		creator28.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Level"));
		creator28.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.LoginAccount"));
		creator28.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.LoginName"));
		creator28.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Manager"));
		creator28.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Mobile"));
		creator28.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Name"));
		creator28.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.NickName"));
		creator28.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.RealName"));
		creator28.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.SuperName"));
		creator28.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.SuperNickName"));
		creator28.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.SuperWorkNo"));
		creator28.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Tenant"));
		creator28.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.TenantAdmin"));
		creator28.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Uid"));
		creator28.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.UniqueId"));
		creator28.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.UserToken"));
		creator28.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.VirtName"));
		creator28.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.VirtWorkNo"));
		creator28.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Workspace"));
		creator28.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.WorkNo"));
		creator28.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.WorkStatus"));

		List<String> tenants38 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Tenants.Length"); i++) {
			tenants38.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Creator.Tenants["+ i +"]"));
		}
		creator28.setTenants38(tenants38);
		parentWorkItem.setCreator28(creator28);

		Iteration29 iteration29 = new Iteration29();
		iteration29.setBeginDate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.BeginDate"));
		iteration29.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.CreatedAt"));
		iteration29.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.Deleted"));
		iteration29.setEndDate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.EndDate"));
		iteration29.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.Id"));
		iteration29.setLocked(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.Locked"));
		iteration29.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.Name"));
		iteration29.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.ProjectSign"));
		iteration29.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.Sign"));
		iteration29.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Iteration.UpdatedAt"));
		parentWorkItem.setIteration29(iteration29);

		Modifier30 modifier30 = new Modifier30();
		modifier30.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Account"));
		modifier30.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.AdDomain"));
		modifier30.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.AliFullName"));
		modifier30.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.AuthToken"));
		modifier30.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.BuName"));
		modifier30.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.BuNo"));
		modifier30.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Customer"));
		modifier30.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Deleted"));
		modifier30.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.DeptName"));
		modifier30.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.DeptNo"));
		modifier30.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Email"));
		modifier30.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.EmpId"));
		modifier30.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.EmpType"));
		modifier30.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.EmpTypeExt"));
		modifier30.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.FullPartTime"));
		modifier30.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GitModified"));
		modifier30.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GitPassword"));
		modifier30.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GmtCreate"));
		modifier30.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GmtEntry"));
		modifier30.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GmtLeave"));
		modifier30.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.GmtModified"));
		modifier30.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Level"));
		modifier30.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.LoginAccount"));
		modifier30.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.LoginName"));
		modifier30.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Manager"));
		modifier30.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Mobile"));
		modifier30.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Name"));
		modifier30.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.NickName"));
		modifier30.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.RealName"));
		modifier30.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.SuperName"));
		modifier30.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.SuperNickName"));
		modifier30.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.SuperWorkNo"));
		modifier30.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Tenant"));
		modifier30.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.TenantAdmin"));
		modifier30.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Uid"));
		modifier30.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.UniqueId"));
		modifier30.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.UserToken"));
		modifier30.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.VirtName"));
		modifier30.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.VirtWorkNo"));
		modifier30.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Workspace"));
		modifier30.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.WorkNo"));
		modifier30.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.WorkStatus"));

		List<String> tenants39 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Tenants.Length"); i++) {
			tenants39.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Modifier.Tenants["+ i +"]"));
		}
		modifier30.setTenants39(tenants39);
		parentWorkItem.setModifier30(modifier30);

		PriorityEntity31 priorityEntity31 = new PriorityEntity31();
		priorityEntity31.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.PriorityEntity.Id"));
		priorityEntity31.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.PriorityEntity.Name"));
		parentWorkItem.setPriorityEntity31(priorityEntity31);

		Project32 project32 = new Project32();
		project32.setArchive(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Archive"));
		project32.setAsPublic(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.AsPublic"));
		project32.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.CreatedAt"));
		project32.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Deleted"));
		project32.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Description"));
		project32.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Id"));
		project32.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Link"));
		project32.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Name"));
		project32.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.ParentSign"));
		project32.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Sign"));
		project32.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.SignPath"));
		project32.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.UpdatedAt"));

		Creator40 creator40 = new Creator40();
		creator40.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Account"));
		creator40.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.AdDomain"));
		creator40.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.AliFullName"));
		creator40.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.AuthToken"));
		creator40.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.BuName"));
		creator40.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.BuNo"));
		creator40.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Customer"));
		creator40.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Deleted"));
		creator40.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.DeptName"));
		creator40.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.DeptNo"));
		creator40.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Email"));
		creator40.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.EmpId"));
		creator40.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.EmpType"));
		creator40.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.EmpTypeExt"));
		creator40.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.FullPartTime"));
		creator40.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GitModified"));
		creator40.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GitPassword"));
		creator40.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GmtCreate"));
		creator40.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GmtEntry"));
		creator40.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GmtLeave"));
		creator40.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.GmtModified"));
		creator40.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Level"));
		creator40.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.LoginAccount"));
		creator40.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.LoginName"));
		creator40.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Manager"));
		creator40.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Mobile"));
		creator40.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Name"));
		creator40.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.NickName"));
		creator40.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.RealName"));
		creator40.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.SuperName"));
		creator40.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.SuperNickName"));
		creator40.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.SuperWorkNo"));
		creator40.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Tenant"));
		creator40.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.TenantAdmin"));
		creator40.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Uid"));
		creator40.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.UniqueId"));
		creator40.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.UserToken"));
		creator40.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.VirtName"));
		creator40.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.VirtWorkNo"));
		creator40.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Workspace"));
		creator40.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.WorkNo"));
		creator40.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.WorkStatus"));

		List<String> tenants41 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Tenants.Length"); i++) {
			tenants41.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Project.Creator.Tenants["+ i +"]"));
		}
		creator40.setTenants41(tenants41);
		project32.setCreator40(creator40);
		parentWorkItem.setProject32(project32);

		Status33 status33 = new Status33();
		status33.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.CreatedAt"));
		status33.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.Deleted"));
		status33.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.Id"));
		status33.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.Name"));
		status33.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.ProjectSign"));
		status33.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.Region"));
		status33.setStage(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.Stage"));
		status33.setStageName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.StageName"));
		status33.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Status.UpdatedAt"));
		parentWorkItem.setStatus33(status33);

		List<CcsItem35> ccs34 = new ArrayList<CcsItem35>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs.Length"); i++) {
			CcsItem35 ccsItem35 = new CcsItem35();
			ccsItem35.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Account"));
			ccsItem35.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].AdDomain"));
			ccsItem35.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].AliFullName"));
			ccsItem35.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].AuthToken"));
			ccsItem35.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].BuName"));
			ccsItem35.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].BuNo"));
			ccsItem35.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Customer"));
			ccsItem35.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Deleted"));
			ccsItem35.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].DeptName"));
			ccsItem35.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].DeptNo"));
			ccsItem35.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Email"));
			ccsItem35.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].EmpId"));
			ccsItem35.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].EmpType"));
			ccsItem35.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].EmpTypeExt"));
			ccsItem35.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].FullPartTime"));
			ccsItem35.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GitModified"));
			ccsItem35.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GitPassword"));
			ccsItem35.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GmtCreate"));
			ccsItem35.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GmtEntry"));
			ccsItem35.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GmtLeave"));
			ccsItem35.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].GmtModified"));
			ccsItem35.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Level"));
			ccsItem35.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].LoginAccount"));
			ccsItem35.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].LoginName"));
			ccsItem35.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Manager"));
			ccsItem35.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Mobile"));
			ccsItem35.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Name"));
			ccsItem35.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].NickName"));
			ccsItem35.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].RealName"));
			ccsItem35.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].SuperName"));
			ccsItem35.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].SuperNickName"));
			ccsItem35.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].SuperWorkNo"));
			ccsItem35.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Tenant"));
			ccsItem35.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].TenantAdmin"));
			ccsItem35.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Uid"));
			ccsItem35.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].UniqueId"));
			ccsItem35.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].UserToken"));
			ccsItem35.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].VirtName"));
			ccsItem35.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].VirtWorkNo"));
			ccsItem35.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Workspace"));
			ccsItem35.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].WorkNo"));
			ccsItem35.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].WorkStatus"));

			List<String> tenants36 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Tenants.Length"); j++) {
				tenants36.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.ParentWorkItem.Ccs["+ i +"].Tenants["+ j +"]"));
			}
			ccsItem35.setTenants36(tenants36);

			ccs34.add(ccsItem35);
		}
		parentWorkItem.setCcs34(ccs34);
		data.setParentWorkItem(parentWorkItem);

		PriorityEntity priorityEntity = new PriorityEntity();
		priorityEntity.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.PriorityEntity.Id"));
		priorityEntity.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.PriorityEntity.Name"));
		data.setPriorityEntity(priorityEntity);

		Project project = new Project();
		project.setArchive(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Archive"));
		project.setAsPublic(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.AsPublic"));
		project.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.CreatedAt"));
		project.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Deleted"));
		project.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Description"));
		project.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Id"));
		project.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Link"));
		project.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Name"));
		project.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.ParentSign"));
		project.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Sign"));
		project.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.SignPath"));
		project.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.UpdatedAt"));

		Creator42 creator42 = new Creator42();
		creator42.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Account"));
		creator42.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.AdDomain"));
		creator42.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.AliFullName"));
		creator42.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.AuthToken"));
		creator42.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.BuName"));
		creator42.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.BuNo"));
		creator42.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Customer"));
		creator42.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Deleted"));
		creator42.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.DeptName"));
		creator42.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.DeptNo"));
		creator42.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Email"));
		creator42.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.EmpId"));
		creator42.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.EmpType"));
		creator42.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.EmpTypeExt"));
		creator42.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.FullPartTime"));
		creator42.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GitModified"));
		creator42.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GitPassword"));
		creator42.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GmtCreate"));
		creator42.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GmtEntry"));
		creator42.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GmtLeave"));
		creator42.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.GmtModified"));
		creator42.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Level"));
		creator42.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.LoginAccount"));
		creator42.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.LoginName"));
		creator42.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Manager"));
		creator42.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Mobile"));
		creator42.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Name"));
		creator42.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.NickName"));
		creator42.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.RealName"));
		creator42.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.SuperName"));
		creator42.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.SuperNickName"));
		creator42.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.SuperWorkNo"));
		creator42.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Tenant"));
		creator42.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.TenantAdmin"));
		creator42.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Uid"));
		creator42.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.UniqueId"));
		creator42.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.UserToken"));
		creator42.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.VirtName"));
		creator42.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.VirtWorkNo"));
		creator42.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Workspace"));
		creator42.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.WorkNo"));
		creator42.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.WorkStatus"));

		List<String> tenants43 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Tenants.Length"); i++) {
			tenants43.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Project.Creator.Tenants["+ i +"]"));
		}
		creator42.setTenants43(tenants43);
		project.setCreator42(creator42);
		data.setProject(project);

		Status status = new Status();
		status.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.CreatedAt"));
		status.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.Deleted"));
		status.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.Id"));
		status.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.Name"));
		status.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.ProjectSign"));
		status.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.Region"));
		status.setStage(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.Stage"));
		status.setStageName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.StageName"));
		status.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Status.UpdatedAt"));
		data.setStatus(status);

		Template template = new Template();
		template.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.CreatedAt"));
		template.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.DefaultContent"));
		template.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Deleted"));
		template.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Description"));
		template.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Id"));
		template.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Name"));
		template.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Priority"));
		template.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.ProjectSign"));
		template.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Stamp"));
		template.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.TemplateLabel"));
		template.setType(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Type"));
		template.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.UpdatedAt"));
		template.setWorkflowId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.WorkflowId"));

		Creator44 creator44 = new Creator44();
		creator44.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Account"));
		creator44.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.AdDomain"));
		creator44.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.AliFullName"));
		creator44.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.AuthToken"));
		creator44.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.BuName"));
		creator44.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.BuNo"));
		creator44.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Customer"));
		creator44.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Deleted"));
		creator44.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.DeptName"));
		creator44.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.DeptNo"));
		creator44.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Email"));
		creator44.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.EmpId"));
		creator44.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.EmpType"));
		creator44.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.EmpTypeExt"));
		creator44.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.FullPartTime"));
		creator44.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GitModified"));
		creator44.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GitPassword"));
		creator44.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GmtCreate"));
		creator44.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GmtEntry"));
		creator44.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GmtLeave"));
		creator44.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.GmtModified"));
		creator44.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Level"));
		creator44.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.LoginAccount"));
		creator44.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.LoginName"));
		creator44.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Manager"));
		creator44.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Mobile"));
		creator44.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Name"));
		creator44.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.NickName"));
		creator44.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.RealName"));
		creator44.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.SuperName"));
		creator44.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.SuperNickName"));
		creator44.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.SuperWorkNo"));
		creator44.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Tenant"));
		creator44.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.TenantAdmin"));
		creator44.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Uid"));
		creator44.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.UniqueId"));
		creator44.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.UserToken"));
		creator44.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.VirtName"));
		creator44.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.VirtWorkNo"));
		creator44.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Workspace"));
		creator44.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.WorkNo"));
		creator44.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.WorkStatus"));

		List<String> tenants45 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Tenants.Length"); i++) {
			tenants45.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Template.Creator.Tenants["+ i +"]"));
		}
		creator44.setTenants45(tenants45);
		template.setCreator44(creator44);
		data.setTemplate(template);

		List<AttachmentVOsItem> attachmentVOs = new ArrayList<AttachmentVOsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs.Length"); i++) {
			AttachmentVOsItem attachmentVOsItem = new AttachmentVOsItem();
			attachmentVOsItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].CreatedAt"));
			attachmentVOsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].Deleted"));
			attachmentVOsItem.setFilename(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].Filename"));
			attachmentVOsItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].Id"));
			attachmentVOsItem.setStoredFilename(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].StoredFilename"));
			attachmentVOsItem.setTarget(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].Target"));
			attachmentVOsItem.setTargetType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].TargetType"));
			attachmentVOsItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].UpdatedAt"));
			attachmentVOsItem.setUrl(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.AttachmentVOs["+ i +"].Url"));

			attachmentVOs.add(attachmentVOsItem);
		}
		data.setAttachmentVOs(attachmentVOs);

		List<CcsItem> ccs = new ArrayList<CcsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs.Length"); i++) {
			CcsItem ccsItem = new CcsItem();
			ccsItem.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Account"));
			ccsItem.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].AdDomain"));
			ccsItem.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].AliFullName"));
			ccsItem.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].AuthToken"));
			ccsItem.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].BuName"));
			ccsItem.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].BuNo"));
			ccsItem.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Customer"));
			ccsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Deleted"));
			ccsItem.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].DeptName"));
			ccsItem.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].DeptNo"));
			ccsItem.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Email"));
			ccsItem.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].EmpId"));
			ccsItem.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].EmpType"));
			ccsItem.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].EmpTypeExt"));
			ccsItem.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].FullPartTime"));
			ccsItem.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GitModified"));
			ccsItem.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GitPassword"));
			ccsItem.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GmtCreate"));
			ccsItem.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GmtEntry"));
			ccsItem.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GmtLeave"));
			ccsItem.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].GmtModified"));
			ccsItem.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Level"));
			ccsItem.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].LoginAccount"));
			ccsItem.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].LoginName"));
			ccsItem.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Manager"));
			ccsItem.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Mobile"));
			ccsItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Name"));
			ccsItem.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].NickName"));
			ccsItem.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].RealName"));
			ccsItem.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].SuperName"));
			ccsItem.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].SuperNickName"));
			ccsItem.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].SuperWorkNo"));
			ccsItem.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Tenant"));
			ccsItem.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].TenantAdmin"));
			ccsItem.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Uid"));
			ccsItem.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].UniqueId"));
			ccsItem.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].UserToken"));
			ccsItem.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].VirtName"));
			ccsItem.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].VirtWorkNo"));
			ccsItem.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Workspace"));
			ccsItem.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].WorkNo"));
			ccsItem.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].WorkStatus"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Ccs["+ i +"].Tenants["+ j +"]"));
			}
			ccsItem.setTenants(tenants);

			ccs.add(ccsItem);
		}
		data.setCcs(ccs);

		List<CustomFieldsItem> customFields = new ArrayList<CustomFieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields.Length"); i++) {
			CustomFieldsItem customFieldsItem = new CustomFieldsItem();
			customFieldsItem.setCopyFrom(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].CopyFrom"));
			customFieldsItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].CreatedAt"));
			customFieldsItem.setDefaultValue(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DefaultValue"));
			customFieldsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Deleted"));
			customFieldsItem.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Description"));
			customFieldsItem.setDynamicOptionFetchUrl(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicOptionFetchUrl"));
			customFieldsItem.setEditable(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Editable"));
			customFieldsItem.setEnableSearch(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].EnableSearch"));
			customFieldsItem.setFieldFormat(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].FieldFormat"));
			customFieldsItem.setFieldLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].FieldLabel"));
			customFieldsItem.setFormInvisible(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].FormInvisible"));
			customFieldsItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Id"));
			customFieldsItem.setInvisible(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Invisible"));
			customFieldsItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Name"));
			customFieldsItem.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].ProjectSign"));
			customFieldsItem.setRequired(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Required"));
			customFieldsItem.setTemplateFieldId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].TemplateFieldId"));
			customFieldsItem.setTemplateId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].TemplateId"));
			customFieldsItem.setType(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Type"));
			customFieldsItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			customFieldsItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			customFieldsItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			customFieldsItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			customFieldsItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			Creator1 creator1 = new Creator1();
			creator1.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Account"));
			creator1.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.AdDomain"));
			creator1.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.AliFullName"));
			creator1.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.AuthToken"));
			creator1.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.BuName"));
			creator1.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.BuNo"));
			creator1.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Customer"));
			creator1.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Deleted"));
			creator1.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.DeptName"));
			creator1.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.DeptNo"));
			creator1.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Email"));
			creator1.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.EmpId"));
			creator1.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.EmpType"));
			creator1.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.EmpTypeExt"));
			creator1.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.FullPartTime"));
			creator1.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GitModified"));
			creator1.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GitPassword"));
			creator1.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GmtCreate"));
			creator1.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GmtEntry"));
			creator1.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GmtLeave"));
			creator1.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.GmtModified"));
			creator1.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Level"));
			creator1.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.LoginAccount"));
			creator1.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.LoginName"));
			creator1.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Manager"));
			creator1.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Mobile"));
			creator1.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Name"));
			creator1.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.NickName"));
			creator1.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.RealName"));
			creator1.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.SuperName"));
			creator1.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.SuperNickName"));
			creator1.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.SuperWorkNo"));
			creator1.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Tenant"));
			creator1.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.TenantAdmin"));
			creator1.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Uid"));
			creator1.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.UniqueId"));
			creator1.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.UserToken"));
			creator1.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.VirtName"));
			creator1.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.VirtWorkNo"));
			creator1.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Workspace"));
			creator1.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.WorkNo"));
			creator1.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.WorkStatus"));

			List<String> tenants2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Tenants.Length"); j++) {
				tenants2.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator1.setTenants2(tenants2);
			customFieldsItem.setCreator1(creator1);

			List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].PossibleValues.Length"); j++) {
				PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
				possibleValuesItem.setKey(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].PossibleValues["+ j +"].Key"));
				possibleValuesItem.setLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFields["+ i +"].PossibleValues["+ j +"].Label"));

				possibleValues.add(possibleValuesItem);
			}
			customFieldsItem.setPossibleValues(possibleValues);

			customFields.add(customFieldsItem);
		}
		data.setCustomFields(customFields);

		List<CustomFieldsValuesItem> customFieldsValues = new ArrayList<CustomFieldsValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues.Length"); i++) {
			CustomFieldsValuesItem customFieldsValuesItem = new CustomFieldsValuesItem();
			customFieldsValuesItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CreatedAt"));
			customFieldsValuesItem.setDateValue(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].DateValue"));
			customFieldsValuesItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].Deleted"));
			customFieldsValuesItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].Id"));
			customFieldsValuesItem.setTarget(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].Target"));
			customFieldsValuesItem.setTargetType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].TargetType"));
			customFieldsValuesItem.setTemplateFieldId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].TemplateFieldId"));
			customFieldsValuesItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UpdatedAt"));
			customFieldsValuesItem.setValue(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].Value"));

			List<String> listValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListValue.Length"); j++) {
				listValue.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListValue["+ j +"]"));
			}
			customFieldsValuesItem.setListValue(listValue);

			CustomField customField = new CustomField();
			customField.setCopyFrom(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.CopyFrom"));
			customField.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.CreatedAt"));
			customField.setDefaultValue(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DefaultValue"));
			customField.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Deleted"));
			customField.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Description"));
			customField.setDynamicOptionFetchUrl(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicOptionFetchUrl"));
			customField.setEditable(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Editable"));
			customField.setEnableSearch(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.EnableSearch"));
			customField.setFieldFormat(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.FieldFormat"));
			customField.setFieldLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.FieldLabel"));
			customField.setFormInvisible(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.FormInvisible"));
			customField.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Id"));
			customField.setInvisible(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Invisible"));
			customField.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Name"));
			customField.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.ProjectSign"));
			customField.setRequired(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Required"));
			customField.setType(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Type"));
			customField.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields4 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields4.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			customField.setDynamicFieldRequiredDependentFields4(dynamicFieldRequiredDependentFields4);

			List<Long> dynamicFieldRequiredInfluencedFields5 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields5.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			customField.setDynamicFieldRequiredInfluencedFields5(dynamicFieldRequiredInfluencedFields5);

			List<Long> dynamicOptionFetchDependentFields6 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields6.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicOptionFetchDependentFields["+ j +"]"));
			}
			customField.setDynamicOptionFetchDependentFields6(dynamicOptionFetchDependentFields6);

			List<Long> dynamicOptionFetchInfluencedFields7 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields7.add(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			customField.setDynamicOptionFetchInfluencedFields7(dynamicOptionFetchInfluencedFields7);

			Creator8 creator8 = new Creator8();
			creator8.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Account"));
			creator8.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.AdDomain"));
			creator8.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.AliFullName"));
			creator8.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.AuthToken"));
			creator8.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.BuName"));
			creator8.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.BuNo"));
			creator8.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Customer"));
			creator8.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Deleted"));
			creator8.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.DeptName"));
			creator8.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.DeptNo"));
			creator8.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Email"));
			creator8.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.EmpId"));
			creator8.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.EmpType"));
			creator8.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.EmpTypeExt"));
			creator8.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.FullPartTime"));
			creator8.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GitModified"));
			creator8.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GitPassword"));
			creator8.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GmtCreate"));
			creator8.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GmtEntry"));
			creator8.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GmtLeave"));
			creator8.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.GmtModified"));
			creator8.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Level"));
			creator8.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.LoginAccount"));
			creator8.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.LoginName"));
			creator8.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Manager"));
			creator8.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Mobile"));
			creator8.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Name"));
			creator8.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.NickName"));
			creator8.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.RealName"));
			creator8.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.SuperName"));
			creator8.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.SuperNickName"));
			creator8.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.SuperWorkNo"));
			creator8.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Tenant"));
			creator8.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.TenantAdmin"));
			creator8.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Uid"));
			creator8.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.UniqueId"));
			creator8.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.UserToken"));
			creator8.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.VirtName"));
			creator8.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.VirtWorkNo"));
			creator8.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Workspace"));
			creator8.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.WorkNo"));
			creator8.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.WorkStatus"));

			List<String> tenants11 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Tenants.Length"); j++) {
				tenants11.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.Creator.Tenants["+ j +"]"));
			}
			creator8.setTenants11(tenants11);
			customField.setCreator8(creator8);

			List<PossibleValuesItem10> possibleValues9 = new ArrayList<PossibleValuesItem10>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.PossibleValues.Length"); j++) {
				PossibleValuesItem10 possibleValuesItem10 = new PossibleValuesItem10();
				possibleValuesItem10.setKey(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.PossibleValues["+ j +"].Key"));
				possibleValuesItem10.setLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].CustomField.PossibleValues["+ j +"].Label"));

				possibleValues9.add(possibleValuesItem10);
			}
			customField.setPossibleValues9(possibleValues9);
			customFieldsValuesItem.setCustomField(customField);

			UserValue userValue = new UserValue();
			userValue.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Account"));
			userValue.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.AdDomain"));
			userValue.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.AliFullName"));
			userValue.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.AuthToken"));
			userValue.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.BuName"));
			userValue.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.BuNo"));
			userValue.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Customer"));
			userValue.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Deleted"));
			userValue.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.DeptName"));
			userValue.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.DeptNo"));
			userValue.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Email"));
			userValue.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.EmpId"));
			userValue.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.EmpType"));
			userValue.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.EmpTypeExt"));
			userValue.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.FullPartTime"));
			userValue.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GitModified"));
			userValue.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GitPassword"));
			userValue.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GmtCreate"));
			userValue.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GmtEntry"));
			userValue.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GmtLeave"));
			userValue.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.GmtModified"));
			userValue.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Level"));
			userValue.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.LoginAccount"));
			userValue.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.LoginName"));
			userValue.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Manager"));
			userValue.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Mobile"));
			userValue.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Name"));
			userValue.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.NickName"));
			userValue.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.RealName"));
			userValue.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.SuperName"));
			userValue.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.SuperNickName"));
			userValue.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.SuperWorkNo"));
			userValue.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Tenant"));
			userValue.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.TenantAdmin"));
			userValue.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Uid"));
			userValue.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.UniqueId"));
			userValue.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.UserToken"));
			userValue.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.VirtName"));
			userValue.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.VirtWorkNo"));
			userValue.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Workspace"));
			userValue.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.WorkNo"));
			userValue.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.WorkStatus"));

			List<String> tenants12 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Tenants.Length"); j++) {
				tenants12.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].UserValue.Tenants["+ j +"]"));
			}
			userValue.setTenants12(tenants12);
			customFieldsValuesItem.setUserValue(userValue);

			List<ListUserValueItem> listUserValue = new ArrayList<ListUserValueItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue.Length"); j++) {
				ListUserValueItem listUserValueItem = new ListUserValueItem();
				listUserValueItem.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Account"));
				listUserValueItem.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].AdDomain"));
				listUserValueItem.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].AliFullName"));
				listUserValueItem.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].AuthToken"));
				listUserValueItem.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].BuName"));
				listUserValueItem.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].BuNo"));
				listUserValueItem.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Customer"));
				listUserValueItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Deleted"));
				listUserValueItem.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].DeptName"));
				listUserValueItem.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].DeptNo"));
				listUserValueItem.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Email"));
				listUserValueItem.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].EmpId"));
				listUserValueItem.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].EmpType"));
				listUserValueItem.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].EmpTypeExt"));
				listUserValueItem.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].FullPartTime"));
				listUserValueItem.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GitModified"));
				listUserValueItem.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GitPassword"));
				listUserValueItem.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GmtCreate"));
				listUserValueItem.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GmtEntry"));
				listUserValueItem.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GmtLeave"));
				listUserValueItem.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].GmtModified"));
				listUserValueItem.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Level"));
				listUserValueItem.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].LoginAccount"));
				listUserValueItem.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].LoginName"));
				listUserValueItem.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Manager"));
				listUserValueItem.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Mobile"));
				listUserValueItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Name"));
				listUserValueItem.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].NickName"));
				listUserValueItem.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].RealName"));
				listUserValueItem.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].SuperName"));
				listUserValueItem.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].SuperNickName"));
				listUserValueItem.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].SuperWorkNo"));
				listUserValueItem.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Tenant"));
				listUserValueItem.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].TenantAdmin"));
				listUserValueItem.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Uid"));
				listUserValueItem.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].UniqueId"));
				listUserValueItem.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].UserToken"));
				listUserValueItem.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].VirtName"));
				listUserValueItem.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].VirtWorkNo"));
				listUserValueItem.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Workspace"));
				listUserValueItem.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].WorkNo"));
				listUserValueItem.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].WorkStatus"));

				List<String> tenants3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Tenants.Length"); k++) {
					tenants3.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.CustomFieldsValues["+ i +"].ListUserValue["+ j +"].Tenants["+ k +"]"));
				}
				listUserValueItem.setTenants3(tenants3);

				listUserValue.add(listUserValueItem);
			}
			customFieldsValuesItem.setListUserValue(listUserValue);

			customFieldsValues.add(customFieldsValuesItem);
		}
		data.setCustomFieldsValues(customFieldsValues);

		List<ModulesItem> modules = new ArrayList<ModulesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules.Length"); i++) {
			ModulesItem modulesItem = new ModulesItem();
			modulesItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].CreatedAt"));
			modulesItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Deleted"));
			modulesItem.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Description"));
			modulesItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Id"));
			modulesItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Name"));
			modulesItem.setParentId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].ParentId"));
			modulesItem.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].ProjectSign"));
			modulesItem.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Region"));
			modulesItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].UpdatedAt"));

			Creator13 creator13 = new Creator13();
			creator13.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Account"));
			creator13.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.AdDomain"));
			creator13.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.AliFullName"));
			creator13.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.AuthToken"));
			creator13.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.BuName"));
			creator13.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.BuNo"));
			creator13.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Customer"));
			creator13.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Deleted"));
			creator13.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.DeptName"));
			creator13.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.DeptNo"));
			creator13.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Email"));
			creator13.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.EmpId"));
			creator13.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.EmpType"));
			creator13.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.EmpTypeExt"));
			creator13.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.FullPartTime"));
			creator13.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GitModified"));
			creator13.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GitPassword"));
			creator13.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GmtCreate"));
			creator13.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GmtEntry"));
			creator13.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GmtLeave"));
			creator13.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.GmtModified"));
			creator13.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Level"));
			creator13.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.LoginAccount"));
			creator13.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.LoginName"));
			creator13.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Manager"));
			creator13.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Mobile"));
			creator13.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Name"));
			creator13.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.NickName"));
			creator13.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.RealName"));
			creator13.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.SuperName"));
			creator13.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.SuperNickName"));
			creator13.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.SuperWorkNo"));
			creator13.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Tenant"));
			creator13.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.TenantAdmin"));
			creator13.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Uid"));
			creator13.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.UniqueId"));
			creator13.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.UserToken"));
			creator13.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.VirtName"));
			creator13.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.VirtWorkNo"));
			creator13.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Workspace"));
			creator13.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.WorkNo"));
			creator13.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.WorkStatus"));

			List<String> tenants15 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Tenants.Length"); j++) {
				tenants15.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator13.setTenants15(tenants15);
			modulesItem.setCreator13(creator13);

			Modifier14 modifier14 = new Modifier14();
			modifier14.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Account"));
			modifier14.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.AdDomain"));
			modifier14.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.AliFullName"));
			modifier14.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.AuthToken"));
			modifier14.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.BuName"));
			modifier14.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.BuNo"));
			modifier14.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Customer"));
			modifier14.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Deleted"));
			modifier14.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.DeptName"));
			modifier14.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.DeptNo"));
			modifier14.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Email"));
			modifier14.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.EmpId"));
			modifier14.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.EmpType"));
			modifier14.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.EmpTypeExt"));
			modifier14.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.FullPartTime"));
			modifier14.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GitModified"));
			modifier14.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GitPassword"));
			modifier14.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GmtCreate"));
			modifier14.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GmtEntry"));
			modifier14.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GmtLeave"));
			modifier14.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.GmtModified"));
			modifier14.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Level"));
			modifier14.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.LoginAccount"));
			modifier14.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.LoginName"));
			modifier14.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Manager"));
			modifier14.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Mobile"));
			modifier14.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Name"));
			modifier14.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.NickName"));
			modifier14.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.RealName"));
			modifier14.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.SuperName"));
			modifier14.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.SuperNickName"));
			modifier14.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.SuperWorkNo"));
			modifier14.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Tenant"));
			modifier14.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.TenantAdmin"));
			modifier14.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Uid"));
			modifier14.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.UniqueId"));
			modifier14.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.UserToken"));
			modifier14.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.VirtName"));
			modifier14.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.VirtWorkNo"));
			modifier14.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Workspace"));
			modifier14.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.WorkNo"));
			modifier14.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.WorkStatus"));

			List<String> tenants16 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Tenants.Length"); j++) {
				tenants16.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Modifier.Tenants["+ j +"]"));
			}
			modifier14.setTenants16(tenants16);
			modulesItem.setModifier14(modifier14);

			Owners owners = new Owners();
			owners.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Account"));
			owners.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.AdDomain"));
			owners.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.AliFullName"));
			owners.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.AuthToken"));
			owners.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.BuName"));
			owners.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.BuNo"));
			owners.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Customer"));
			owners.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Deleted"));
			owners.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.DeptName"));
			owners.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.DeptNo"));
			owners.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Email"));
			owners.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.EmpId"));
			owners.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.EmpType"));
			owners.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.EmpTypeExt"));
			owners.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.FullPartTime"));
			owners.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GitModified"));
			owners.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GitPassword"));
			owners.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GmtCreate"));
			owners.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GmtEntry"));
			owners.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GmtLeave"));
			owners.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.GmtModified"));
			owners.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Level"));
			owners.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.LoginAccount"));
			owners.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.LoginName"));
			owners.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Manager"));
			owners.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Mobile"));
			owners.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Name"));
			owners.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.NickName"));
			owners.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.RealName"));
			owners.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.SuperName"));
			owners.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.SuperNickName"));
			owners.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.SuperWorkNo"));
			owners.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Tenant"));
			owners.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.TenantAdmin"));
			owners.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Uid"));
			owners.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.UniqueId"));
			owners.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.UserToken"));
			owners.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.VirtName"));
			owners.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.VirtWorkNo"));
			owners.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Workspace"));
			owners.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.WorkNo"));
			owners.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.WorkStatus"));

			List<String> tenants17 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Tenants.Length"); j++) {
				tenants17.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Modules["+ i +"].Owners.Tenants["+ j +"]"));
			}
			owners.setTenants17(tenants17);
			modulesItem.setOwners(owners);

			modules.add(modulesItem);
		}
		data.setModules(modules);

		List<RelatedProjectsItem> relatedProjects = new ArrayList<RelatedProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects.Length"); i++) {
			RelatedProjectsItem relatedProjectsItem = new RelatedProjectsItem();
			relatedProjectsItem.setArchive(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Archive"));
			relatedProjectsItem.setAsPublic(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].AsPublic"));
			relatedProjectsItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].CreatedAt"));
			relatedProjectsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Deleted"));
			relatedProjectsItem.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Description"));
			relatedProjectsItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Id"));
			relatedProjectsItem.setLink(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Link"));
			relatedProjectsItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Name"));
			relatedProjectsItem.setParentSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].ParentSign"));
			relatedProjectsItem.setSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Sign"));
			relatedProjectsItem.setSignPath(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].SignPath"));
			relatedProjectsItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].UpdatedAt"));

			Creator18 creator18 = new Creator18();
			creator18.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Account"));
			creator18.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.AdDomain"));
			creator18.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.AliFullName"));
			creator18.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.AuthToken"));
			creator18.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.BuName"));
			creator18.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.BuNo"));
			creator18.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Customer"));
			creator18.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Deleted"));
			creator18.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.DeptName"));
			creator18.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.DeptNo"));
			creator18.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Email"));
			creator18.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.EmpId"));
			creator18.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.EmpType"));
			creator18.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.EmpTypeExt"));
			creator18.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.FullPartTime"));
			creator18.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GitModified"));
			creator18.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GitPassword"));
			creator18.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GmtCreate"));
			creator18.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GmtEntry"));
			creator18.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GmtLeave"));
			creator18.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.GmtModified"));
			creator18.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Level"));
			creator18.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.LoginAccount"));
			creator18.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.LoginName"));
			creator18.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Manager"));
			creator18.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Mobile"));
			creator18.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Name"));
			creator18.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.NickName"));
			creator18.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.RealName"));
			creator18.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.SuperName"));
			creator18.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.SuperNickName"));
			creator18.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.SuperWorkNo"));
			creator18.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Tenant"));
			creator18.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.TenantAdmin"));
			creator18.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Uid"));
			creator18.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.UniqueId"));
			creator18.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.UserToken"));
			creator18.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.VirtName"));
			creator18.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.VirtWorkNo"));
			creator18.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Workspace"));
			creator18.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.WorkNo"));
			creator18.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.WorkStatus"));

			List<String> tenants19 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Tenants.Length"); j++) {
				tenants19.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.RelatedProjects["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator18.setTenants19(tenants19);
			relatedProjectsItem.setCreator18(creator18);

			relatedProjects.add(relatedProjectsItem);
		}
		data.setRelatedProjects(relatedProjects);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setColor(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Color"));
			tagsItem.setContent(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Content"));
			tagsItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].CreatedAt"));
			tagsItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Deleted"));
			tagsItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Id"));
			tagsItem.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].ProjectSign"));
			tagsItem.setRegion(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Region"));
			tagsItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].UpdatedAt"));

			Creator20 creator20 = new Creator20();
			creator20.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Account"));
			creator20.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.AdDomain"));
			creator20.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.AliFullName"));
			creator20.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.AuthToken"));
			creator20.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.BuName"));
			creator20.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.BuNo"));
			creator20.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Customer"));
			creator20.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Deleted"));
			creator20.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.DeptName"));
			creator20.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.DeptNo"));
			creator20.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Email"));
			creator20.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.EmpId"));
			creator20.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.EmpType"));
			creator20.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.EmpTypeExt"));
			creator20.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.FullPartTime"));
			creator20.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GitModified"));
			creator20.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GitPassword"));
			creator20.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GmtCreate"));
			creator20.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GmtEntry"));
			creator20.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GmtLeave"));
			creator20.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.GmtModified"));
			creator20.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Level"));
			creator20.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.LoginAccount"));
			creator20.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.LoginName"));
			creator20.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Manager"));
			creator20.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Mobile"));
			creator20.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Name"));
			creator20.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.NickName"));
			creator20.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.RealName"));
			creator20.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.SuperName"));
			creator20.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.SuperNickName"));
			creator20.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.SuperWorkNo"));
			creator20.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Tenant"));
			creator20.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.TenantAdmin"));
			creator20.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Uid"));
			creator20.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.UniqueId"));
			creator20.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.UserToken"));
			creator20.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.VirtName"));
			creator20.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.VirtWorkNo"));
			creator20.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Workspace"));
			creator20.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.WorkNo"));
			creator20.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.WorkStatus"));

			List<String> tenants21 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Tenants.Length"); j++) {
				tenants21.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.Tags["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator20.setTenants21(tenants21);
			tagsItem.setCreator20(creator20);

			tags.add(tagsItem);
		}
		data.setTags(tags);

		List<TemplateListItem> templateList = new ArrayList<TemplateListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList.Length"); i++) {
			TemplateListItem templateListItem = new TemplateListItem();
			templateListItem.setCreatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].CreatedAt"));
			templateListItem.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].DefaultContent"));
			templateListItem.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Deleted"));
			templateListItem.setDescription(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Description"));
			templateListItem.setId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Id"));
			templateListItem.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Name"));
			templateListItem.setPriority(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Priority"));
			templateListItem.setProjectSign(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].ProjectSign"));
			templateListItem.setStamp(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Stamp"));
			templateListItem.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].TemplateLabel"));
			templateListItem.setType(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Type"));
			templateListItem.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].UpdatedAt"));
			templateListItem.setWorkflowId(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].WorkflowId"));

			Creator22 creator22 = new Creator22();
			creator22.setAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Account"));
			creator22.setAdDomain(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.AdDomain"));
			creator22.setAliFullName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.AliFullName"));
			creator22.setAuthToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.AuthToken"));
			creator22.setBuName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.BuName"));
			creator22.setBuNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.BuNo"));
			creator22.setCustomer(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Customer"));
			creator22.setDeleted(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Deleted"));
			creator22.setDeptName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.DeptName"));
			creator22.setDeptNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.DeptNo"));
			creator22.setEmail(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Email"));
			creator22.setEmpId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.EmpId"));
			creator22.setEmpType(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.EmpType"));
			creator22.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.EmpTypeExt"));
			creator22.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.FullPartTime"));
			creator22.setGitModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GitModified"));
			creator22.setGitPassword(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GitPassword"));
			creator22.setGmtCreate(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GmtCreate"));
			creator22.setGmtEntry(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GmtEntry"));
			creator22.setGmtLeave(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GmtLeave"));
			creator22.setGmtModified(_ctx.longValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.GmtModified"));
			creator22.setLevel(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Level"));
			creator22.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.LoginAccount"));
			creator22.setLoginName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.LoginName"));
			creator22.setManager(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Manager"));
			creator22.setMobile(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Mobile"));
			creator22.setName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Name"));
			creator22.setNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.NickName"));
			creator22.setRealName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.RealName"));
			creator22.setSuperName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.SuperName"));
			creator22.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.SuperNickName"));
			creator22.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.SuperWorkNo"));
			creator22.setTenant(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Tenant"));
			creator22.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.TenantAdmin"));
			creator22.setUid(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Uid"));
			creator22.setUniqueId(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.UniqueId"));
			creator22.setUserToken(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.UserToken"));
			creator22.setVirtName(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.VirtName"));
			creator22.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.VirtWorkNo"));
			creator22.setWorkspace(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Workspace"));
			creator22.setWorkNo(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.WorkNo"));
			creator22.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.WorkStatus"));

			List<String> tenants23 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Tenants.Length"); j++) {
				tenants23.add(_ctx.stringValue("UpdateLinkeLinktWorkitemstampResponse.Data.TemplateList["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator22.setTenants23(tenants23);
			templateListItem.setCreator22(creator22);

			templateList.add(templateListItem);
		}
		data.setTemplateList(templateList);
		updateLinkeLinktWorkitemstampResponse.setData(data);
	 
	 	return updateLinkeLinktWorkitemstampResponse;
	}
}