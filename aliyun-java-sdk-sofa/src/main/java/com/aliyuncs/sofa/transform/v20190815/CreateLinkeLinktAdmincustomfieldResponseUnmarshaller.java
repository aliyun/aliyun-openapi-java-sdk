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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmincustomfieldResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmincustomfieldResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmincustomfieldResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktAdmincustomfieldResponseUnmarshaller {

	public static CreateLinkeLinktAdmincustomfieldResponse unmarshall(CreateLinkeLinktAdmincustomfieldResponse createLinkeLinktAdmincustomfieldResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktAdmincustomfieldResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.RequestId"));
		createLinkeLinktAdmincustomfieldResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ResultCode"));
		createLinkeLinktAdmincustomfieldResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ResultMessage"));
		createLinkeLinktAdmincustomfieldResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.ErrorCode"));
		createLinkeLinktAdmincustomfieldResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ErrorMessage"));
		createLinkeLinktAdmincustomfieldResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.CreatedAt"));
		data.setDefaultValue(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DefaultValue"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Description"));
		data.setDynamicOptionFetchUrl(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchUrl"));
		data.setEditable(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Editable"));
		data.setEnableSearch(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.EnableSearch"));
		data.setFieldFormat(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.FieldFormat"));
		data.setFieldLabel(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.FieldLabel"));
		data.setFormInvisible(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.FormInvisible"));
		data.setId(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Id"));
		data.setInvisible(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Invisible"));
		data.setName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.ProjectSign"));
		data.setRequired(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Required"));
		data.setType(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.UpdatedAt"));

		List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredDependentFields.Length"); i++) {
			dynamicFieldRequiredDependentFields.add(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredDependentFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

		List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields.Length"); i++) {
			dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

		List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchDependentFields.Length"); i++) {
			dynamicOptionFetchDependentFields.add(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchDependentFields["+ i +"]"));
		}
		data.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

		List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchInfluencedFields.Length"); i++) {
			dynamicOptionFetchInfluencedFields.add(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchInfluencedFields["+ i +"]"));
		}
		data.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues.Length"); i++) {
			PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
			possibleValuesItem.setKey(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues["+ i +"].Key"));
			possibleValuesItem.setLabel(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues["+ i +"].Label"));

			possibleValues.add(possibleValuesItem);
		}
		data.setPossibleValues(possibleValues);
		createLinkeLinktAdmincustomfieldResponse.setData(data);
	 
	 	return createLinkeLinktAdmincustomfieldResponse;
	}
}