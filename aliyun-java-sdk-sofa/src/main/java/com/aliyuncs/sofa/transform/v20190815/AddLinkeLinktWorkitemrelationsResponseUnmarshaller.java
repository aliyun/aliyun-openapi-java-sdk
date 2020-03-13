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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.AssignedToIds;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.AttachmentVOsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CcsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Creator;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsItem.Creator1;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsItem.PossibleValuesItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem.CustomField;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem.CustomField.Creator8;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem.CustomField.PossibleValuesItem10;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem.ListUserValueItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.CustomFieldsValuesItem.UserValue;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Iteration;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Modifier;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ModulesItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ModulesItem.Creator13;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ModulesItem.Modifier14;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ModulesItem.Owners;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.AssignedToIds27;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.CcsItem35;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Creator28;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Iteration29;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Modifier30;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.PriorityEntity31;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Project32;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Project32.Creator40;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.ParentWorkItem.Status33;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.PriorityEntity;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Project;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Project.Creator42;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.RelatedProjectsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.RelatedProjectsItem.Creator18;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Status;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.TagsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.TagsItem.Creator20;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Template;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.Template.Creator44;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.TemplateListItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktWorkitemrelationsResponse.DataItem.TemplateListItem.Creator22;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktWorkitemrelationsResponseUnmarshaller {

	public static AddLinkeLinktWorkitemrelationsResponse unmarshall(AddLinkeLinktWorkitemrelationsResponse addLinkeLinktWorkitemrelationsResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktWorkitemrelationsResponse.setRequestId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.RequestId"));
		addLinkeLinktWorkitemrelationsResponse.setResultCode(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ResultCode"));
		addLinkeLinktWorkitemrelationsResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ResultMessage"));
		addLinkeLinktWorkitemrelationsResponse.setErrorCode(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.ErrorCode"));
		addLinkeLinktWorkitemrelationsResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.ErrorMessage"));
		addLinkeLinktWorkitemrelationsResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAsRootLevel(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AsRootLevel"));
			dataItem.setChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ChildrenCount"));
			dataItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Description"));
			dataItem.setExpectedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ExpectedAt"));
			dataItem.setFilteredChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].FilteredChildrenCount"));
			dataItem.setFinishedChildrenCount(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].FinishedChildrenCount"));
			dataItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Id"));
			dataItem.setIterationSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].IterationSign"));
			dataItem.setLink(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Link"));
			dataItem.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentSign"));
			dataItem.setPriority(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Priority"));
			dataItem.setProjectName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Region"));
			dataItem.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].SignPath"));
			dataItem.setStamp(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Stamp"));
			dataItem.setStatusId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].StatusId"));
			dataItem.setStatusStage(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].StatusStage"));
			dataItem.setSubject(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Subject"));
			dataItem.setTemplateId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateId"));
			dataItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].UpdatedAt"));

			AssignedToIds assignedToIds = new AssignedToIds();
			assignedToIds.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Account"));
			assignedToIds.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.AdDomain"));
			assignedToIds.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.AliFullName"));
			assignedToIds.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.AuthToken"));
			assignedToIds.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.BuName"));
			assignedToIds.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.BuNo"));
			assignedToIds.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Customer"));
			assignedToIds.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Deleted"));
			assignedToIds.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.DeptName"));
			assignedToIds.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.DeptNo"));
			assignedToIds.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Email"));
			assignedToIds.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.EmpId"));
			assignedToIds.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.EmpType"));
			assignedToIds.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.EmpTypeExt"));
			assignedToIds.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.FullPartTime"));
			assignedToIds.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GitModified"));
			assignedToIds.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GitPassword"));
			assignedToIds.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GmtCreate"));
			assignedToIds.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GmtEntry"));
			assignedToIds.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GmtLeave"));
			assignedToIds.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.GmtModified"));
			assignedToIds.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Level"));
			assignedToIds.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.LoginAccount"));
			assignedToIds.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.LoginName"));
			assignedToIds.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Manager"));
			assignedToIds.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Mobile"));
			assignedToIds.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Name"));
			assignedToIds.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.NickName"));
			assignedToIds.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.RealName"));
			assignedToIds.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.SuperName"));
			assignedToIds.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.SuperNickName"));
			assignedToIds.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.SuperWorkNo"));
			assignedToIds.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Tenant"));
			assignedToIds.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.TenantAdmin"));
			assignedToIds.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Uid"));
			assignedToIds.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.UniqueId"));
			assignedToIds.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.UserToken"));
			assignedToIds.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.VirtName"));
			assignedToIds.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.VirtWorkNo"));
			assignedToIds.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Workspace"));
			assignedToIds.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.WorkNo"));
			assignedToIds.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.WorkStatus"));

			List<String> tenants24 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Tenants.Length"); j++) {
				tenants24.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AssignedToIds.Tenants["+ j +"]"));
			}
			assignedToIds.setTenants24(tenants24);
			dataItem.setAssignedToIds(assignedToIds);

			Creator creator = new Creator();
			creator.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Account"));
			creator.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.AdDomain"));
			creator.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.AliFullName"));
			creator.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.AuthToken"));
			creator.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.BuName"));
			creator.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.BuNo"));
			creator.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Customer"));
			creator.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Deleted"));
			creator.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.DeptName"));
			creator.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.DeptNo"));
			creator.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Email"));
			creator.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.EmpId"));
			creator.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.EmpType"));
			creator.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.EmpTypeExt"));
			creator.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.FullPartTime"));
			creator.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GitModified"));
			creator.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GitPassword"));
			creator.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GmtCreate"));
			creator.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GmtEntry"));
			creator.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GmtLeave"));
			creator.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.GmtModified"));
			creator.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Level"));
			creator.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.LoginAccount"));
			creator.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.LoginName"));
			creator.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Manager"));
			creator.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Mobile"));
			creator.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Name"));
			creator.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.NickName"));
			creator.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.RealName"));
			creator.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.SuperName"));
			creator.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.SuperNickName"));
			creator.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.SuperWorkNo"));
			creator.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Tenant"));
			creator.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.TenantAdmin"));
			creator.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Uid"));
			creator.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.UniqueId"));
			creator.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.UserToken"));
			creator.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.VirtName"));
			creator.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.VirtWorkNo"));
			creator.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Workspace"));
			creator.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.WorkNo"));
			creator.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.WorkStatus"));

			List<String> tenants25 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Tenants.Length"); j++) {
				tenants25.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator.setTenants25(tenants25);
			dataItem.setCreator(creator);

			Iteration iteration = new Iteration();
			iteration.setBeginDate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.BeginDate"));
			iteration.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.CreatedAt"));
			iteration.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.Deleted"));
			iteration.setEndDate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.EndDate"));
			iteration.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.Id"));
			iteration.setLocked(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.Locked"));
			iteration.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.Name"));
			iteration.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.ProjectSign"));
			iteration.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.Sign"));
			iteration.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Iteration.UpdatedAt"));
			dataItem.setIteration(iteration);

			Modifier modifier = new Modifier();
			modifier.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Account"));
			modifier.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.AdDomain"));
			modifier.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.AliFullName"));
			modifier.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.AuthToken"));
			modifier.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.BuName"));
			modifier.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.BuNo"));
			modifier.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Customer"));
			modifier.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Deleted"));
			modifier.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.DeptName"));
			modifier.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.DeptNo"));
			modifier.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Email"));
			modifier.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.EmpId"));
			modifier.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.EmpType"));
			modifier.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.EmpTypeExt"));
			modifier.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.FullPartTime"));
			modifier.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GitModified"));
			modifier.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GitPassword"));
			modifier.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GmtCreate"));
			modifier.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GmtEntry"));
			modifier.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GmtLeave"));
			modifier.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.GmtModified"));
			modifier.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Level"));
			modifier.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.LoginAccount"));
			modifier.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.LoginName"));
			modifier.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Manager"));
			modifier.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Mobile"));
			modifier.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Name"));
			modifier.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.NickName"));
			modifier.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.RealName"));
			modifier.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.SuperName"));
			modifier.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.SuperNickName"));
			modifier.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.SuperWorkNo"));
			modifier.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Tenant"));
			modifier.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.TenantAdmin"));
			modifier.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Uid"));
			modifier.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.UniqueId"));
			modifier.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.UserToken"));
			modifier.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.VirtName"));
			modifier.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.VirtWorkNo"));
			modifier.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Workspace"));
			modifier.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.WorkNo"));
			modifier.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.WorkStatus"));

			List<String> tenants26 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Tenants.Length"); j++) {
				tenants26.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modifier.Tenants["+ j +"]"));
			}
			modifier.setTenants26(tenants26);
			dataItem.setModifier(modifier);

			ParentWorkItem parentWorkItem = new ParentWorkItem();
			parentWorkItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.CreatedAt"));
			parentWorkItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Deleted"));
			parentWorkItem.setExpectedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.ExpectedAt"));
			parentWorkItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Id"));
			parentWorkItem.setIterationSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.IterationSign"));
			parentWorkItem.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.ParentSign"));
			parentWorkItem.setPriority(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Priority"));
			parentWorkItem.setProjectName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.ProjectName"));
			parentWorkItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.ProjectSign"));
			parentWorkItem.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Sign"));
			parentWorkItem.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.SignPath"));
			parentWorkItem.setStamp(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Stamp"));
			parentWorkItem.setStatusId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.StatusId"));
			parentWorkItem.setStatusStage(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.StatusStage"));
			parentWorkItem.setSubject(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Subject"));
			parentWorkItem.setTemplateId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.TemplateId"));
			parentWorkItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.UpdatedAt"));

			AssignedToIds27 assignedToIds27 = new AssignedToIds27();
			assignedToIds27.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Account"));
			assignedToIds27.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.AdDomain"));
			assignedToIds27.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.AliFullName"));
			assignedToIds27.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.AuthToken"));
			assignedToIds27.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.BuName"));
			assignedToIds27.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.BuNo"));
			assignedToIds27.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Customer"));
			assignedToIds27.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Deleted"));
			assignedToIds27.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.DeptName"));
			assignedToIds27.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.DeptNo"));
			assignedToIds27.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Email"));
			assignedToIds27.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.EmpId"));
			assignedToIds27.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.EmpType"));
			assignedToIds27.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.EmpTypeExt"));
			assignedToIds27.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.FullPartTime"));
			assignedToIds27.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GitModified"));
			assignedToIds27.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GitPassword"));
			assignedToIds27.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GmtCreate"));
			assignedToIds27.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GmtEntry"));
			assignedToIds27.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GmtLeave"));
			assignedToIds27.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.GmtModified"));
			assignedToIds27.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Level"));
			assignedToIds27.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.LoginAccount"));
			assignedToIds27.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.LoginName"));
			assignedToIds27.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Manager"));
			assignedToIds27.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Mobile"));
			assignedToIds27.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Name"));
			assignedToIds27.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.NickName"));
			assignedToIds27.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.RealName"));
			assignedToIds27.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.SuperName"));
			assignedToIds27.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.SuperNickName"));
			assignedToIds27.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.SuperWorkNo"));
			assignedToIds27.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Tenant"));
			assignedToIds27.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.TenantAdmin"));
			assignedToIds27.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Uid"));
			assignedToIds27.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.UniqueId"));
			assignedToIds27.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.UserToken"));
			assignedToIds27.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.VirtName"));
			assignedToIds27.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.VirtWorkNo"));
			assignedToIds27.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Workspace"));
			assignedToIds27.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.WorkNo"));
			assignedToIds27.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.WorkStatus"));

			List<String> tenants37 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Tenants.Length"); j++) {
				tenants37.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.AssignedToIds.Tenants["+ j +"]"));
			}
			assignedToIds27.setTenants37(tenants37);
			parentWorkItem.setAssignedToIds27(assignedToIds27);

			Creator28 creator28 = new Creator28();
			creator28.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Account"));
			creator28.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.AdDomain"));
			creator28.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.AliFullName"));
			creator28.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.AuthToken"));
			creator28.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.BuName"));
			creator28.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.BuNo"));
			creator28.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Customer"));
			creator28.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Deleted"));
			creator28.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.DeptName"));
			creator28.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.DeptNo"));
			creator28.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Email"));
			creator28.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.EmpId"));
			creator28.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.EmpType"));
			creator28.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.EmpTypeExt"));
			creator28.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.FullPartTime"));
			creator28.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GitModified"));
			creator28.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GitPassword"));
			creator28.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GmtCreate"));
			creator28.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GmtEntry"));
			creator28.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GmtLeave"));
			creator28.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.GmtModified"));
			creator28.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Level"));
			creator28.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.LoginAccount"));
			creator28.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.LoginName"));
			creator28.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Manager"));
			creator28.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Mobile"));
			creator28.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Name"));
			creator28.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.NickName"));
			creator28.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.RealName"));
			creator28.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.SuperName"));
			creator28.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.SuperNickName"));
			creator28.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.SuperWorkNo"));
			creator28.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Tenant"));
			creator28.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.TenantAdmin"));
			creator28.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Uid"));
			creator28.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.UniqueId"));
			creator28.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.UserToken"));
			creator28.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.VirtName"));
			creator28.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.VirtWorkNo"));
			creator28.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Workspace"));
			creator28.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.WorkNo"));
			creator28.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.WorkStatus"));

			List<String> tenants38 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Tenants.Length"); j++) {
				tenants38.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Creator.Tenants["+ j +"]"));
			}
			creator28.setTenants38(tenants38);
			parentWorkItem.setCreator28(creator28);

			Iteration29 iteration29 = new Iteration29();
			iteration29.setBeginDate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.BeginDate"));
			iteration29.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.CreatedAt"));
			iteration29.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.Deleted"));
			iteration29.setEndDate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.EndDate"));
			iteration29.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.Id"));
			iteration29.setLocked(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.Locked"));
			iteration29.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.Name"));
			iteration29.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.ProjectSign"));
			iteration29.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.Sign"));
			iteration29.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Iteration.UpdatedAt"));
			parentWorkItem.setIteration29(iteration29);

			Modifier30 modifier30 = new Modifier30();
			modifier30.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Account"));
			modifier30.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.AdDomain"));
			modifier30.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.AliFullName"));
			modifier30.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.AuthToken"));
			modifier30.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.BuName"));
			modifier30.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.BuNo"));
			modifier30.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Customer"));
			modifier30.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Deleted"));
			modifier30.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.DeptName"));
			modifier30.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.DeptNo"));
			modifier30.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Email"));
			modifier30.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.EmpId"));
			modifier30.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.EmpType"));
			modifier30.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.EmpTypeExt"));
			modifier30.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.FullPartTime"));
			modifier30.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GitModified"));
			modifier30.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GitPassword"));
			modifier30.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GmtCreate"));
			modifier30.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GmtEntry"));
			modifier30.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GmtLeave"));
			modifier30.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.GmtModified"));
			modifier30.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Level"));
			modifier30.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.LoginAccount"));
			modifier30.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.LoginName"));
			modifier30.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Manager"));
			modifier30.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Mobile"));
			modifier30.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Name"));
			modifier30.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.NickName"));
			modifier30.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.RealName"));
			modifier30.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.SuperName"));
			modifier30.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.SuperNickName"));
			modifier30.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.SuperWorkNo"));
			modifier30.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Tenant"));
			modifier30.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.TenantAdmin"));
			modifier30.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Uid"));
			modifier30.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.UniqueId"));
			modifier30.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.UserToken"));
			modifier30.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.VirtName"));
			modifier30.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.VirtWorkNo"));
			modifier30.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Workspace"));
			modifier30.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.WorkNo"));
			modifier30.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.WorkStatus"));

			List<String> tenants39 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Tenants.Length"); j++) {
				tenants39.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Modifier.Tenants["+ j +"]"));
			}
			modifier30.setTenants39(tenants39);
			parentWorkItem.setModifier30(modifier30);

			PriorityEntity31 priorityEntity31 = new PriorityEntity31();
			priorityEntity31.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.PriorityEntity.Id"));
			priorityEntity31.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.PriorityEntity.Name"));
			parentWorkItem.setPriorityEntity31(priorityEntity31);

			Project32 project32 = new Project32();
			project32.setArchive(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Archive"));
			project32.setAsPublic(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.AsPublic"));
			project32.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.CreatedAt"));
			project32.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Deleted"));
			project32.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Description"));
			project32.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Id"));
			project32.setLink(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Link"));
			project32.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Name"));
			project32.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.ParentSign"));
			project32.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Sign"));
			project32.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.SignPath"));
			project32.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.UpdatedAt"));

			Creator40 creator40 = new Creator40();
			creator40.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Account"));
			creator40.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.AdDomain"));
			creator40.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.AliFullName"));
			creator40.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.AuthToken"));
			creator40.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.BuName"));
			creator40.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.BuNo"));
			creator40.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Customer"));
			creator40.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Deleted"));
			creator40.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.DeptName"));
			creator40.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.DeptNo"));
			creator40.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Email"));
			creator40.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.EmpId"));
			creator40.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.EmpType"));
			creator40.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.EmpTypeExt"));
			creator40.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.FullPartTime"));
			creator40.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GitModified"));
			creator40.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GitPassword"));
			creator40.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GmtCreate"));
			creator40.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GmtEntry"));
			creator40.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GmtLeave"));
			creator40.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.GmtModified"));
			creator40.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Level"));
			creator40.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.LoginAccount"));
			creator40.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.LoginName"));
			creator40.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Manager"));
			creator40.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Mobile"));
			creator40.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Name"));
			creator40.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.NickName"));
			creator40.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.RealName"));
			creator40.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.SuperName"));
			creator40.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.SuperNickName"));
			creator40.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.SuperWorkNo"));
			creator40.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Tenant"));
			creator40.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.TenantAdmin"));
			creator40.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Uid"));
			creator40.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.UniqueId"));
			creator40.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.UserToken"));
			creator40.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.VirtName"));
			creator40.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.VirtWorkNo"));
			creator40.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Workspace"));
			creator40.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.WorkNo"));
			creator40.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.WorkStatus"));

			List<String> tenants41 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Tenants.Length"); j++) {
				tenants41.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Project.Creator.Tenants["+ j +"]"));
			}
			creator40.setTenants41(tenants41);
			project32.setCreator40(creator40);
			parentWorkItem.setProject32(project32);

			Status33 status33 = new Status33();
			status33.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.CreatedAt"));
			status33.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.Deleted"));
			status33.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.Id"));
			status33.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.Name"));
			status33.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.ProjectSign"));
			status33.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.Region"));
			status33.setStage(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.Stage"));
			status33.setStageName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.StageName"));
			status33.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Status.UpdatedAt"));
			parentWorkItem.setStatus33(status33);

			List<CcsItem35> ccs34 = new ArrayList<CcsItem35>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs.Length"); j++) {
				CcsItem35 ccsItem35 = new CcsItem35();
				ccsItem35.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Account"));
				ccsItem35.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].AdDomain"));
				ccsItem35.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].AliFullName"));
				ccsItem35.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].AuthToken"));
				ccsItem35.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].BuName"));
				ccsItem35.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].BuNo"));
				ccsItem35.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Customer"));
				ccsItem35.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Deleted"));
				ccsItem35.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].DeptName"));
				ccsItem35.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].DeptNo"));
				ccsItem35.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Email"));
				ccsItem35.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].EmpId"));
				ccsItem35.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].EmpType"));
				ccsItem35.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].EmpTypeExt"));
				ccsItem35.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].FullPartTime"));
				ccsItem35.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GitModified"));
				ccsItem35.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GitPassword"));
				ccsItem35.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GmtCreate"));
				ccsItem35.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GmtEntry"));
				ccsItem35.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GmtLeave"));
				ccsItem35.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].GmtModified"));
				ccsItem35.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Level"));
				ccsItem35.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].LoginAccount"));
				ccsItem35.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].LoginName"));
				ccsItem35.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Manager"));
				ccsItem35.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Mobile"));
				ccsItem35.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Name"));
				ccsItem35.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].NickName"));
				ccsItem35.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].RealName"));
				ccsItem35.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].SuperName"));
				ccsItem35.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].SuperNickName"));
				ccsItem35.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].SuperWorkNo"));
				ccsItem35.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Tenant"));
				ccsItem35.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].TenantAdmin"));
				ccsItem35.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Uid"));
				ccsItem35.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].UniqueId"));
				ccsItem35.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].UserToken"));
				ccsItem35.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].VirtName"));
				ccsItem35.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].VirtWorkNo"));
				ccsItem35.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Workspace"));
				ccsItem35.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].WorkNo"));
				ccsItem35.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].WorkStatus"));

				List<String> tenants36 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Tenants.Length"); k++) {
					tenants36.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].ParentWorkItem.Ccs["+ j +"].Tenants["+ k +"]"));
				}
				ccsItem35.setTenants36(tenants36);

				ccs34.add(ccsItem35);
			}
			parentWorkItem.setCcs34(ccs34);
			dataItem.setParentWorkItem(parentWorkItem);

			PriorityEntity priorityEntity = new PriorityEntity();
			priorityEntity.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].PriorityEntity.Id"));
			priorityEntity.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].PriorityEntity.Name"));
			dataItem.setPriorityEntity(priorityEntity);

			Project project = new Project();
			project.setArchive(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Archive"));
			project.setAsPublic(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.AsPublic"));
			project.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.CreatedAt"));
			project.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Deleted"));
			project.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Description"));
			project.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Id"));
			project.setLink(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Link"));
			project.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Name"));
			project.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.ParentSign"));
			project.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Sign"));
			project.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.SignPath"));
			project.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.UpdatedAt"));

			Creator42 creator42 = new Creator42();
			creator42.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Account"));
			creator42.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.AdDomain"));
			creator42.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.AliFullName"));
			creator42.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.AuthToken"));
			creator42.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.BuName"));
			creator42.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.BuNo"));
			creator42.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Customer"));
			creator42.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Deleted"));
			creator42.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.DeptName"));
			creator42.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.DeptNo"));
			creator42.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Email"));
			creator42.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.EmpId"));
			creator42.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.EmpType"));
			creator42.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.EmpTypeExt"));
			creator42.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.FullPartTime"));
			creator42.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GitModified"));
			creator42.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GitPassword"));
			creator42.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GmtCreate"));
			creator42.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GmtEntry"));
			creator42.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GmtLeave"));
			creator42.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.GmtModified"));
			creator42.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Level"));
			creator42.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.LoginAccount"));
			creator42.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.LoginName"));
			creator42.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Manager"));
			creator42.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Mobile"));
			creator42.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Name"));
			creator42.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.NickName"));
			creator42.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.RealName"));
			creator42.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.SuperName"));
			creator42.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.SuperNickName"));
			creator42.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.SuperWorkNo"));
			creator42.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Tenant"));
			creator42.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.TenantAdmin"));
			creator42.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Uid"));
			creator42.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.UniqueId"));
			creator42.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.UserToken"));
			creator42.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.VirtName"));
			creator42.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.VirtWorkNo"));
			creator42.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Workspace"));
			creator42.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.WorkNo"));
			creator42.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.WorkStatus"));

			List<String> tenants43 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Tenants.Length"); j++) {
				tenants43.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Project.Creator.Tenants["+ j +"]"));
			}
			creator42.setTenants43(tenants43);
			project.setCreator42(creator42);
			dataItem.setProject(project);

			Status status = new Status();
			status.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.CreatedAt"));
			status.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.Deleted"));
			status.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.Id"));
			status.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.Name"));
			status.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.ProjectSign"));
			status.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.Region"));
			status.setStage(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.Stage"));
			status.setStageName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.StageName"));
			status.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Status.UpdatedAt"));
			dataItem.setStatus(status);

			Template template = new Template();
			template.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.CreatedAt"));
			template.setDefaultContent(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.DefaultContent"));
			template.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Deleted"));
			template.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Description"));
			template.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Id"));
			template.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Name"));
			template.setPriority(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Priority"));
			template.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.ProjectSign"));
			template.setStamp(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Stamp"));
			template.setTemplateLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.TemplateLabel"));
			template.setType(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Type"));
			template.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.UpdatedAt"));
			template.setWorkflowId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.WorkflowId"));

			Creator44 creator44 = new Creator44();
			creator44.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Account"));
			creator44.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.AdDomain"));
			creator44.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.AliFullName"));
			creator44.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.AuthToken"));
			creator44.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.BuName"));
			creator44.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.BuNo"));
			creator44.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Customer"));
			creator44.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Deleted"));
			creator44.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.DeptName"));
			creator44.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.DeptNo"));
			creator44.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Email"));
			creator44.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.EmpId"));
			creator44.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.EmpType"));
			creator44.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.EmpTypeExt"));
			creator44.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.FullPartTime"));
			creator44.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GitModified"));
			creator44.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GitPassword"));
			creator44.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GmtCreate"));
			creator44.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GmtEntry"));
			creator44.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GmtLeave"));
			creator44.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.GmtModified"));
			creator44.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Level"));
			creator44.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.LoginAccount"));
			creator44.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.LoginName"));
			creator44.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Manager"));
			creator44.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Mobile"));
			creator44.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Name"));
			creator44.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.NickName"));
			creator44.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.RealName"));
			creator44.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.SuperName"));
			creator44.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.SuperNickName"));
			creator44.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.SuperWorkNo"));
			creator44.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Tenant"));
			creator44.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.TenantAdmin"));
			creator44.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Uid"));
			creator44.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.UniqueId"));
			creator44.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.UserToken"));
			creator44.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.VirtName"));
			creator44.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.VirtWorkNo"));
			creator44.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Workspace"));
			creator44.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.WorkNo"));
			creator44.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.WorkStatus"));

			List<String> tenants45 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Tenants.Length"); j++) {
				tenants45.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Template.Creator.Tenants["+ j +"]"));
			}
			creator44.setTenants45(tenants45);
			template.setCreator44(creator44);
			dataItem.setTemplate(template);

			List<AttachmentVOsItem> attachmentVOs = new ArrayList<AttachmentVOsItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs.Length"); j++) {
				AttachmentVOsItem attachmentVOsItem = new AttachmentVOsItem();
				attachmentVOsItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].CreatedAt"));
				attachmentVOsItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].Deleted"));
				attachmentVOsItem.setFilename(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].Filename"));
				attachmentVOsItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].Id"));
				attachmentVOsItem.setStoredFilename(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].StoredFilename"));
				attachmentVOsItem.setTarget(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].Target"));
				attachmentVOsItem.setTargetType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].TargetType"));
				attachmentVOsItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].UpdatedAt"));
				attachmentVOsItem.setUrl(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].AttachmentVOs["+ j +"].Url"));

				attachmentVOs.add(attachmentVOsItem);
			}
			dataItem.setAttachmentVOs(attachmentVOs);

			List<CcsItem> ccs = new ArrayList<CcsItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs.Length"); j++) {
				CcsItem ccsItem = new CcsItem();
				ccsItem.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Account"));
				ccsItem.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].AdDomain"));
				ccsItem.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].AliFullName"));
				ccsItem.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].AuthToken"));
				ccsItem.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].BuName"));
				ccsItem.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].BuNo"));
				ccsItem.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Customer"));
				ccsItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Deleted"));
				ccsItem.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].DeptName"));
				ccsItem.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].DeptNo"));
				ccsItem.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Email"));
				ccsItem.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].EmpId"));
				ccsItem.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].EmpType"));
				ccsItem.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].EmpTypeExt"));
				ccsItem.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].FullPartTime"));
				ccsItem.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GitModified"));
				ccsItem.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GitPassword"));
				ccsItem.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GmtCreate"));
				ccsItem.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GmtEntry"));
				ccsItem.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GmtLeave"));
				ccsItem.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].GmtModified"));
				ccsItem.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Level"));
				ccsItem.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].LoginAccount"));
				ccsItem.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].LoginName"));
				ccsItem.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Manager"));
				ccsItem.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Mobile"));
				ccsItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Name"));
				ccsItem.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].NickName"));
				ccsItem.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].RealName"));
				ccsItem.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].SuperName"));
				ccsItem.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].SuperNickName"));
				ccsItem.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].SuperWorkNo"));
				ccsItem.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Tenant"));
				ccsItem.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].TenantAdmin"));
				ccsItem.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Uid"));
				ccsItem.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].UniqueId"));
				ccsItem.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].UserToken"));
				ccsItem.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].VirtName"));
				ccsItem.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].VirtWorkNo"));
				ccsItem.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Workspace"));
				ccsItem.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].WorkNo"));
				ccsItem.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].WorkStatus"));

				List<String> tenants = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Tenants.Length"); k++) {
					tenants.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Ccs["+ j +"].Tenants["+ k +"]"));
				}
				ccsItem.setTenants(tenants);

				ccs.add(ccsItem);
			}
			dataItem.setCcs(ccs);

			List<CustomFieldsItem> customFields = new ArrayList<CustomFieldsItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields.Length"); j++) {
				CustomFieldsItem customFieldsItem = new CustomFieldsItem();
				customFieldsItem.setCopyFrom(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].CopyFrom"));
				customFieldsItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].CreatedAt"));
				customFieldsItem.setDefaultValue(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DefaultValue"));
				customFieldsItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Deleted"));
				customFieldsItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Description"));
				customFieldsItem.setDynamicOptionFetchUrl(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicOptionFetchUrl"));
				customFieldsItem.setEditable(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Editable"));
				customFieldsItem.setEnableSearch(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].EnableSearch"));
				customFieldsItem.setFieldFormat(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].FieldFormat"));
				customFieldsItem.setFieldLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].FieldLabel"));
				customFieldsItem.setFormInvisible(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].FormInvisible"));
				customFieldsItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Id"));
				customFieldsItem.setInvisible(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Invisible"));
				customFieldsItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Name"));
				customFieldsItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].ProjectSign"));
				customFieldsItem.setRequired(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Required"));
				customFieldsItem.setTemplateFieldId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].TemplateFieldId"));
				customFieldsItem.setTemplateId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].TemplateId"));
				customFieldsItem.setType(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Type"));
				customFieldsItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].UpdatedAt"));

				List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicFieldRequiredDependentFields.Length"); k++) {
					dynamicFieldRequiredDependentFields.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicFieldRequiredDependentFields["+ k +"]"));
				}
				customFieldsItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

				List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicFieldRequiredInfluencedFields.Length"); k++) {
					dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicFieldRequiredInfluencedFields["+ k +"]"));
				}
				customFieldsItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

				List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicOptionFetchDependentFields.Length"); k++) {
					dynamicOptionFetchDependentFields.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicOptionFetchDependentFields["+ k +"]"));
				}
				customFieldsItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

				List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicOptionFetchInfluencedFields.Length"); k++) {
					dynamicOptionFetchInfluencedFields.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].DynamicOptionFetchInfluencedFields["+ k +"]"));
				}
				customFieldsItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

				Creator1 creator1 = new Creator1();
				creator1.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Account"));
				creator1.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.AdDomain"));
				creator1.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.AliFullName"));
				creator1.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.AuthToken"));
				creator1.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.BuName"));
				creator1.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.BuNo"));
				creator1.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Customer"));
				creator1.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Deleted"));
				creator1.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.DeptName"));
				creator1.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.DeptNo"));
				creator1.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Email"));
				creator1.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.EmpId"));
				creator1.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.EmpType"));
				creator1.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.EmpTypeExt"));
				creator1.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.FullPartTime"));
				creator1.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GitModified"));
				creator1.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GitPassword"));
				creator1.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GmtCreate"));
				creator1.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GmtEntry"));
				creator1.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GmtLeave"));
				creator1.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.GmtModified"));
				creator1.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Level"));
				creator1.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.LoginAccount"));
				creator1.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.LoginName"));
				creator1.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Manager"));
				creator1.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Mobile"));
				creator1.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Name"));
				creator1.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.NickName"));
				creator1.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.RealName"));
				creator1.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.SuperName"));
				creator1.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.SuperNickName"));
				creator1.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.SuperWorkNo"));
				creator1.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Tenant"));
				creator1.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.TenantAdmin"));
				creator1.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Uid"));
				creator1.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.UniqueId"));
				creator1.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.UserToken"));
				creator1.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.VirtName"));
				creator1.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.VirtWorkNo"));
				creator1.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Workspace"));
				creator1.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.WorkNo"));
				creator1.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.WorkStatus"));

				List<String> tenants2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Tenants.Length"); k++) {
					tenants2.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].Creator.Tenants["+ k +"]"));
				}
				creator1.setTenants2(tenants2);
				customFieldsItem.setCreator1(creator1);

				List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].PossibleValues.Length"); k++) {
					PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
					possibleValuesItem.setKey(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].PossibleValues["+ k +"].Key"));
					possibleValuesItem.setLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFields["+ j +"].PossibleValues["+ k +"].Label"));

					possibleValues.add(possibleValuesItem);
				}
				customFieldsItem.setPossibleValues(possibleValues);

				customFields.add(customFieldsItem);
			}
			dataItem.setCustomFields(customFields);

			List<CustomFieldsValuesItem> customFieldsValues = new ArrayList<CustomFieldsValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues.Length"); j++) {
				CustomFieldsValuesItem customFieldsValuesItem = new CustomFieldsValuesItem();
				customFieldsValuesItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CreatedAt"));
				customFieldsValuesItem.setDateValue(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].DateValue"));
				customFieldsValuesItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].Deleted"));
				customFieldsValuesItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].Id"));
				customFieldsValuesItem.setTarget(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].Target"));
				customFieldsValuesItem.setTargetType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].TargetType"));
				customFieldsValuesItem.setTemplateFieldId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].TemplateFieldId"));
				customFieldsValuesItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UpdatedAt"));
				customFieldsValuesItem.setValue(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].Value"));

				List<String> listValue = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListValue.Length"); k++) {
					listValue.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListValue["+ k +"]"));
				}
				customFieldsValuesItem.setListValue(listValue);

				CustomField customField = new CustomField();
				customField.setCopyFrom(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.CopyFrom"));
				customField.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.CreatedAt"));
				customField.setDefaultValue(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DefaultValue"));
				customField.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Deleted"));
				customField.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Description"));
				customField.setDynamicOptionFetchUrl(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicOptionFetchUrl"));
				customField.setEditable(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Editable"));
				customField.setEnableSearch(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.EnableSearch"));
				customField.setFieldFormat(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.FieldFormat"));
				customField.setFieldLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.FieldLabel"));
				customField.setFormInvisible(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.FormInvisible"));
				customField.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Id"));
				customField.setInvisible(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Invisible"));
				customField.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Name"));
				customField.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.ProjectSign"));
				customField.setRequired(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Required"));
				customField.setType(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Type"));
				customField.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.UpdatedAt"));

				List<Long> dynamicFieldRequiredDependentFields4 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicFieldRequiredDependentFields.Length"); k++) {
					dynamicFieldRequiredDependentFields4.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicFieldRequiredDependentFields["+ k +"]"));
				}
				customField.setDynamicFieldRequiredDependentFields4(dynamicFieldRequiredDependentFields4);

				List<Long> dynamicFieldRequiredInfluencedFields5 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicFieldRequiredInfluencedFields.Length"); k++) {
					dynamicFieldRequiredInfluencedFields5.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicFieldRequiredInfluencedFields["+ k +"]"));
				}
				customField.setDynamicFieldRequiredInfluencedFields5(dynamicFieldRequiredInfluencedFields5);

				List<Long> dynamicOptionFetchDependentFields6 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicOptionFetchDependentFields.Length"); k++) {
					dynamicOptionFetchDependentFields6.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicOptionFetchDependentFields["+ k +"]"));
				}
				customField.setDynamicOptionFetchDependentFields6(dynamicOptionFetchDependentFields6);

				List<Long> dynamicOptionFetchInfluencedFields7 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicOptionFetchInfluencedFields.Length"); k++) {
					dynamicOptionFetchInfluencedFields7.add(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.DynamicOptionFetchInfluencedFields["+ k +"]"));
				}
				customField.setDynamicOptionFetchInfluencedFields7(dynamicOptionFetchInfluencedFields7);

				Creator8 creator8 = new Creator8();
				creator8.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Account"));
				creator8.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.AdDomain"));
				creator8.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.AliFullName"));
				creator8.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.AuthToken"));
				creator8.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.BuName"));
				creator8.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.BuNo"));
				creator8.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Customer"));
				creator8.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Deleted"));
				creator8.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.DeptName"));
				creator8.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.DeptNo"));
				creator8.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Email"));
				creator8.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.EmpId"));
				creator8.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.EmpType"));
				creator8.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.EmpTypeExt"));
				creator8.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.FullPartTime"));
				creator8.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GitModified"));
				creator8.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GitPassword"));
				creator8.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GmtCreate"));
				creator8.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GmtEntry"));
				creator8.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GmtLeave"));
				creator8.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.GmtModified"));
				creator8.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Level"));
				creator8.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.LoginAccount"));
				creator8.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.LoginName"));
				creator8.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Manager"));
				creator8.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Mobile"));
				creator8.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Name"));
				creator8.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.NickName"));
				creator8.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.RealName"));
				creator8.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.SuperName"));
				creator8.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.SuperNickName"));
				creator8.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.SuperWorkNo"));
				creator8.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Tenant"));
				creator8.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.TenantAdmin"));
				creator8.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Uid"));
				creator8.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.UniqueId"));
				creator8.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.UserToken"));
				creator8.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.VirtName"));
				creator8.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.VirtWorkNo"));
				creator8.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Workspace"));
				creator8.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.WorkNo"));
				creator8.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.WorkStatus"));

				List<String> tenants11 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Tenants.Length"); k++) {
					tenants11.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.Creator.Tenants["+ k +"]"));
				}
				creator8.setTenants11(tenants11);
				customField.setCreator8(creator8);

				List<PossibleValuesItem10> possibleValues9 = new ArrayList<PossibleValuesItem10>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.PossibleValues.Length"); k++) {
					PossibleValuesItem10 possibleValuesItem10 = new PossibleValuesItem10();
					possibleValuesItem10.setKey(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.PossibleValues["+ k +"].Key"));
					possibleValuesItem10.setLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].CustomField.PossibleValues["+ k +"].Label"));

					possibleValues9.add(possibleValuesItem10);
				}
				customField.setPossibleValues9(possibleValues9);
				customFieldsValuesItem.setCustomField(customField);

				UserValue userValue = new UserValue();
				userValue.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Account"));
				userValue.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.AdDomain"));
				userValue.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.AliFullName"));
				userValue.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.AuthToken"));
				userValue.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.BuName"));
				userValue.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.BuNo"));
				userValue.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Customer"));
				userValue.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Deleted"));
				userValue.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.DeptName"));
				userValue.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.DeptNo"));
				userValue.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Email"));
				userValue.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.EmpId"));
				userValue.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.EmpType"));
				userValue.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.EmpTypeExt"));
				userValue.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.FullPartTime"));
				userValue.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GitModified"));
				userValue.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GitPassword"));
				userValue.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GmtCreate"));
				userValue.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GmtEntry"));
				userValue.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GmtLeave"));
				userValue.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.GmtModified"));
				userValue.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Level"));
				userValue.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.LoginAccount"));
				userValue.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.LoginName"));
				userValue.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Manager"));
				userValue.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Mobile"));
				userValue.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Name"));
				userValue.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.NickName"));
				userValue.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.RealName"));
				userValue.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.SuperName"));
				userValue.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.SuperNickName"));
				userValue.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.SuperWorkNo"));
				userValue.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Tenant"));
				userValue.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.TenantAdmin"));
				userValue.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Uid"));
				userValue.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.UniqueId"));
				userValue.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.UserToken"));
				userValue.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.VirtName"));
				userValue.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.VirtWorkNo"));
				userValue.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Workspace"));
				userValue.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.WorkNo"));
				userValue.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.WorkStatus"));

				List<String> tenants12 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Tenants.Length"); k++) {
					tenants12.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].UserValue.Tenants["+ k +"]"));
				}
				userValue.setTenants12(tenants12);
				customFieldsValuesItem.setUserValue(userValue);

				List<ListUserValueItem> listUserValue = new ArrayList<ListUserValueItem>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue.Length"); k++) {
					ListUserValueItem listUserValueItem = new ListUserValueItem();
					listUserValueItem.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Account"));
					listUserValueItem.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].AdDomain"));
					listUserValueItem.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].AliFullName"));
					listUserValueItem.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].AuthToken"));
					listUserValueItem.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].BuName"));
					listUserValueItem.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].BuNo"));
					listUserValueItem.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Customer"));
					listUserValueItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Deleted"));
					listUserValueItem.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].DeptName"));
					listUserValueItem.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].DeptNo"));
					listUserValueItem.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Email"));
					listUserValueItem.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].EmpId"));
					listUserValueItem.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].EmpType"));
					listUserValueItem.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].EmpTypeExt"));
					listUserValueItem.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].FullPartTime"));
					listUserValueItem.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GitModified"));
					listUserValueItem.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GitPassword"));
					listUserValueItem.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GmtCreate"));
					listUserValueItem.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GmtEntry"));
					listUserValueItem.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GmtLeave"));
					listUserValueItem.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].GmtModified"));
					listUserValueItem.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Level"));
					listUserValueItem.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].LoginAccount"));
					listUserValueItem.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].LoginName"));
					listUserValueItem.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Manager"));
					listUserValueItem.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Mobile"));
					listUserValueItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Name"));
					listUserValueItem.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].NickName"));
					listUserValueItem.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].RealName"));
					listUserValueItem.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].SuperName"));
					listUserValueItem.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].SuperNickName"));
					listUserValueItem.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].SuperWorkNo"));
					listUserValueItem.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Tenant"));
					listUserValueItem.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].TenantAdmin"));
					listUserValueItem.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Uid"));
					listUserValueItem.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].UniqueId"));
					listUserValueItem.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].UserToken"));
					listUserValueItem.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].VirtName"));
					listUserValueItem.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].VirtWorkNo"));
					listUserValueItem.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Workspace"));
					listUserValueItem.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].WorkNo"));
					listUserValueItem.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].WorkStatus"));

					List<String> tenants3 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Tenants.Length"); l++) {
						tenants3.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].CustomFieldsValues["+ j +"].ListUserValue["+ k +"].Tenants["+ l +"]"));
					}
					listUserValueItem.setTenants3(tenants3);

					listUserValue.add(listUserValueItem);
				}
				customFieldsValuesItem.setListUserValue(listUserValue);

				customFieldsValues.add(customFieldsValuesItem);
			}
			dataItem.setCustomFieldsValues(customFieldsValues);

			List<ModulesItem> modules = new ArrayList<ModulesItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules.Length"); j++) {
				ModulesItem modulesItem = new ModulesItem();
				modulesItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].CreatedAt"));
				modulesItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Deleted"));
				modulesItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Description"));
				modulesItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Id"));
				modulesItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Name"));
				modulesItem.setParentId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].ParentId"));
				modulesItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].ProjectSign"));
				modulesItem.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Region"));
				modulesItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].UpdatedAt"));

				Creator13 creator13 = new Creator13();
				creator13.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Account"));
				creator13.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.AdDomain"));
				creator13.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.AliFullName"));
				creator13.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.AuthToken"));
				creator13.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.BuName"));
				creator13.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.BuNo"));
				creator13.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Customer"));
				creator13.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Deleted"));
				creator13.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.DeptName"));
				creator13.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.DeptNo"));
				creator13.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Email"));
				creator13.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.EmpId"));
				creator13.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.EmpType"));
				creator13.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.EmpTypeExt"));
				creator13.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.FullPartTime"));
				creator13.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GitModified"));
				creator13.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GitPassword"));
				creator13.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GmtCreate"));
				creator13.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GmtEntry"));
				creator13.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GmtLeave"));
				creator13.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.GmtModified"));
				creator13.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Level"));
				creator13.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.LoginAccount"));
				creator13.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.LoginName"));
				creator13.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Manager"));
				creator13.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Mobile"));
				creator13.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Name"));
				creator13.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.NickName"));
				creator13.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.RealName"));
				creator13.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.SuperName"));
				creator13.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.SuperNickName"));
				creator13.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.SuperWorkNo"));
				creator13.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Tenant"));
				creator13.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.TenantAdmin"));
				creator13.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Uid"));
				creator13.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.UniqueId"));
				creator13.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.UserToken"));
				creator13.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.VirtName"));
				creator13.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.VirtWorkNo"));
				creator13.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Workspace"));
				creator13.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.WorkNo"));
				creator13.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.WorkStatus"));

				List<String> tenants15 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Tenants.Length"); k++) {
					tenants15.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Creator.Tenants["+ k +"]"));
				}
				creator13.setTenants15(tenants15);
				modulesItem.setCreator13(creator13);

				Modifier14 modifier14 = new Modifier14();
				modifier14.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Account"));
				modifier14.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.AdDomain"));
				modifier14.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.AliFullName"));
				modifier14.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.AuthToken"));
				modifier14.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.BuName"));
				modifier14.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.BuNo"));
				modifier14.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Customer"));
				modifier14.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Deleted"));
				modifier14.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.DeptName"));
				modifier14.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.DeptNo"));
				modifier14.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Email"));
				modifier14.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.EmpId"));
				modifier14.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.EmpType"));
				modifier14.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.EmpTypeExt"));
				modifier14.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.FullPartTime"));
				modifier14.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GitModified"));
				modifier14.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GitPassword"));
				modifier14.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GmtCreate"));
				modifier14.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GmtEntry"));
				modifier14.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GmtLeave"));
				modifier14.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.GmtModified"));
				modifier14.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Level"));
				modifier14.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.LoginAccount"));
				modifier14.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.LoginName"));
				modifier14.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Manager"));
				modifier14.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Mobile"));
				modifier14.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Name"));
				modifier14.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.NickName"));
				modifier14.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.RealName"));
				modifier14.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.SuperName"));
				modifier14.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.SuperNickName"));
				modifier14.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.SuperWorkNo"));
				modifier14.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Tenant"));
				modifier14.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.TenantAdmin"));
				modifier14.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Uid"));
				modifier14.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.UniqueId"));
				modifier14.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.UserToken"));
				modifier14.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.VirtName"));
				modifier14.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.VirtWorkNo"));
				modifier14.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Workspace"));
				modifier14.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.WorkNo"));
				modifier14.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.WorkStatus"));

				List<String> tenants16 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Tenants.Length"); k++) {
					tenants16.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Modifier.Tenants["+ k +"]"));
				}
				modifier14.setTenants16(tenants16);
				modulesItem.setModifier14(modifier14);

				Owners owners = new Owners();
				owners.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Account"));
				owners.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.AdDomain"));
				owners.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.AliFullName"));
				owners.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.AuthToken"));
				owners.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.BuName"));
				owners.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.BuNo"));
				owners.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Customer"));
				owners.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Deleted"));
				owners.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.DeptName"));
				owners.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.DeptNo"));
				owners.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Email"));
				owners.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.EmpId"));
				owners.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.EmpType"));
				owners.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.EmpTypeExt"));
				owners.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.FullPartTime"));
				owners.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GitModified"));
				owners.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GitPassword"));
				owners.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GmtCreate"));
				owners.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GmtEntry"));
				owners.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GmtLeave"));
				owners.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.GmtModified"));
				owners.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Level"));
				owners.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.LoginAccount"));
				owners.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.LoginName"));
				owners.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Manager"));
				owners.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Mobile"));
				owners.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Name"));
				owners.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.NickName"));
				owners.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.RealName"));
				owners.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.SuperName"));
				owners.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.SuperNickName"));
				owners.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.SuperWorkNo"));
				owners.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Tenant"));
				owners.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.TenantAdmin"));
				owners.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Uid"));
				owners.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.UniqueId"));
				owners.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.UserToken"));
				owners.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.VirtName"));
				owners.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.VirtWorkNo"));
				owners.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Workspace"));
				owners.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.WorkNo"));
				owners.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.WorkStatus"));

				List<String> tenants17 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Tenants.Length"); k++) {
					tenants17.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Modules["+ j +"].Owners.Tenants["+ k +"]"));
				}
				owners.setTenants17(tenants17);
				modulesItem.setOwners(owners);

				modules.add(modulesItem);
			}
			dataItem.setModules(modules);

			List<RelatedProjectsItem> relatedProjects = new ArrayList<RelatedProjectsItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects.Length"); j++) {
				RelatedProjectsItem relatedProjectsItem = new RelatedProjectsItem();
				relatedProjectsItem.setArchive(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Archive"));
				relatedProjectsItem.setAsPublic(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].AsPublic"));
				relatedProjectsItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].CreatedAt"));
				relatedProjectsItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Deleted"));
				relatedProjectsItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Description"));
				relatedProjectsItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Id"));
				relatedProjectsItem.setLink(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Link"));
				relatedProjectsItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Name"));
				relatedProjectsItem.setParentSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].ParentSign"));
				relatedProjectsItem.setSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Sign"));
				relatedProjectsItem.setSignPath(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].SignPath"));
				relatedProjectsItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].UpdatedAt"));

				Creator18 creator18 = new Creator18();
				creator18.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Account"));
				creator18.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.AdDomain"));
				creator18.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.AliFullName"));
				creator18.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.AuthToken"));
				creator18.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.BuName"));
				creator18.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.BuNo"));
				creator18.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Customer"));
				creator18.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Deleted"));
				creator18.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.DeptName"));
				creator18.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.DeptNo"));
				creator18.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Email"));
				creator18.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.EmpId"));
				creator18.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.EmpType"));
				creator18.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.EmpTypeExt"));
				creator18.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.FullPartTime"));
				creator18.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GitModified"));
				creator18.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GitPassword"));
				creator18.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GmtCreate"));
				creator18.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GmtEntry"));
				creator18.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GmtLeave"));
				creator18.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.GmtModified"));
				creator18.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Level"));
				creator18.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.LoginAccount"));
				creator18.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.LoginName"));
				creator18.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Manager"));
				creator18.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Mobile"));
				creator18.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Name"));
				creator18.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.NickName"));
				creator18.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.RealName"));
				creator18.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.SuperName"));
				creator18.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.SuperNickName"));
				creator18.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.SuperWorkNo"));
				creator18.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Tenant"));
				creator18.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.TenantAdmin"));
				creator18.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Uid"));
				creator18.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.UniqueId"));
				creator18.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.UserToken"));
				creator18.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.VirtName"));
				creator18.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.VirtWorkNo"));
				creator18.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Workspace"));
				creator18.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.WorkNo"));
				creator18.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.WorkStatus"));

				List<String> tenants19 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Tenants.Length"); k++) {
					tenants19.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].RelatedProjects["+ j +"].Creator.Tenants["+ k +"]"));
				}
				creator18.setTenants19(tenants19);
				relatedProjectsItem.setCreator18(creator18);

				relatedProjects.add(relatedProjectsItem);
			}
			dataItem.setRelatedProjects(relatedProjects);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setColor(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Color"));
				tagsItem.setContent(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Content"));
				tagsItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].CreatedAt"));
				tagsItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Deleted"));
				tagsItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Id"));
				tagsItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].ProjectSign"));
				tagsItem.setRegion(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Region"));
				tagsItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].UpdatedAt"));

				Creator20 creator20 = new Creator20();
				creator20.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Account"));
				creator20.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.AdDomain"));
				creator20.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.AliFullName"));
				creator20.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.AuthToken"));
				creator20.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.BuName"));
				creator20.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.BuNo"));
				creator20.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Customer"));
				creator20.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Deleted"));
				creator20.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.DeptName"));
				creator20.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.DeptNo"));
				creator20.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Email"));
				creator20.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.EmpId"));
				creator20.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.EmpType"));
				creator20.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.EmpTypeExt"));
				creator20.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.FullPartTime"));
				creator20.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GitModified"));
				creator20.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GitPassword"));
				creator20.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GmtCreate"));
				creator20.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GmtEntry"));
				creator20.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GmtLeave"));
				creator20.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.GmtModified"));
				creator20.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Level"));
				creator20.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.LoginAccount"));
				creator20.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.LoginName"));
				creator20.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Manager"));
				creator20.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Mobile"));
				creator20.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Name"));
				creator20.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.NickName"));
				creator20.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.RealName"));
				creator20.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.SuperName"));
				creator20.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.SuperNickName"));
				creator20.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.SuperWorkNo"));
				creator20.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Tenant"));
				creator20.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.TenantAdmin"));
				creator20.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Uid"));
				creator20.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.UniqueId"));
				creator20.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.UserToken"));
				creator20.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.VirtName"));
				creator20.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.VirtWorkNo"));
				creator20.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Workspace"));
				creator20.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.WorkNo"));
				creator20.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.WorkStatus"));

				List<String> tenants21 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Tenants.Length"); k++) {
					tenants21.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].Tags["+ j +"].Creator.Tenants["+ k +"]"));
				}
				creator20.setTenants21(tenants21);
				tagsItem.setCreator20(creator20);

				tags.add(tagsItem);
			}
			dataItem.setTags(tags);

			List<TemplateListItem> templateList = new ArrayList<TemplateListItem>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList.Length"); j++) {
				TemplateListItem templateListItem = new TemplateListItem();
				templateListItem.setCreatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].CreatedAt"));
				templateListItem.setDefaultContent(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].DefaultContent"));
				templateListItem.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Deleted"));
				templateListItem.setDescription(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Description"));
				templateListItem.setId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Id"));
				templateListItem.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Name"));
				templateListItem.setPriority(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Priority"));
				templateListItem.setProjectSign(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].ProjectSign"));
				templateListItem.setStamp(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Stamp"));
				templateListItem.setTemplateLabel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].TemplateLabel"));
				templateListItem.setType(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Type"));
				templateListItem.setUpdatedAt(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].UpdatedAt"));
				templateListItem.setWorkflowId(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].WorkflowId"));

				Creator22 creator22 = new Creator22();
				creator22.setAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Account"));
				creator22.setAdDomain(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.AdDomain"));
				creator22.setAliFullName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.AliFullName"));
				creator22.setAuthToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.AuthToken"));
				creator22.setBuName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.BuName"));
				creator22.setBuNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.BuNo"));
				creator22.setCustomer(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Customer"));
				creator22.setDeleted(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Deleted"));
				creator22.setDeptName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.DeptName"));
				creator22.setDeptNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.DeptNo"));
				creator22.setEmail(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Email"));
				creator22.setEmpId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.EmpId"));
				creator22.setEmpType(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.EmpType"));
				creator22.setEmpTypeExt(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.EmpTypeExt"));
				creator22.setFullPartTime(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.FullPartTime"));
				creator22.setGitModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GitModified"));
				creator22.setGitPassword(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GitPassword"));
				creator22.setGmtCreate(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GmtCreate"));
				creator22.setGmtEntry(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GmtEntry"));
				creator22.setGmtLeave(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GmtLeave"));
				creator22.setGmtModified(_ctx.longValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.GmtModified"));
				creator22.setLevel(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Level"));
				creator22.setLoginAccount(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.LoginAccount"));
				creator22.setLoginName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.LoginName"));
				creator22.setManager(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Manager"));
				creator22.setMobile(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Mobile"));
				creator22.setName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Name"));
				creator22.setNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.NickName"));
				creator22.setRealName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.RealName"));
				creator22.setSuperName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.SuperName"));
				creator22.setSuperNickName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.SuperNickName"));
				creator22.setSuperWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.SuperWorkNo"));
				creator22.setTenant(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Tenant"));
				creator22.setTenantAdmin(_ctx.booleanValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.TenantAdmin"));
				creator22.setUid(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Uid"));
				creator22.setUniqueId(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.UniqueId"));
				creator22.setUserToken(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.UserToken"));
				creator22.setVirtName(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.VirtName"));
				creator22.setVirtWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.VirtWorkNo"));
				creator22.setWorkspace(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Workspace"));
				creator22.setWorkNo(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.WorkNo"));
				creator22.setWorkStatus(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.WorkStatus"));

				List<String> tenants23 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Tenants.Length"); k++) {
					tenants23.add(_ctx.stringValue("AddLinkeLinktWorkitemrelationsResponse.Data["+ i +"].TemplateList["+ j +"].Creator.Tenants["+ k +"]"));
				}
				creator22.setTenants23(tenants23);
				templateListItem.setCreator22(creator22);

				templateList.add(templateListItem);
			}
			dataItem.setTemplateList(templateList);

			data.add(dataItem);
		}
		addLinkeLinktWorkitemrelationsResponse.setData(data);
	 
	 	return addLinkeLinktWorkitemrelationsResponse;
	}
}