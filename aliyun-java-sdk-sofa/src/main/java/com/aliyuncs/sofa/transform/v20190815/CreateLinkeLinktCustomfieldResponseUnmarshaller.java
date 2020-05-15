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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktCustomfieldResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktCustomfieldResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktCustomfieldResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktCustomfieldResponse.Data.PossibleValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktCustomfieldResponseUnmarshaller {

	public static CreateLinkeLinktCustomfieldResponse unmarshall(CreateLinkeLinktCustomfieldResponse createLinkeLinktCustomfieldResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktCustomfieldResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.RequestId"));
		createLinkeLinktCustomfieldResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ResultCode"));
		createLinkeLinktCustomfieldResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ResultMessage"));
		createLinkeLinktCustomfieldResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.ErrorCode"));
		createLinkeLinktCustomfieldResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ErrorMessage"));
		createLinkeLinktCustomfieldResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.CreatedAt"));
		data.setDefaultValue(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.DefaultValue"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Description"));
		data.setDynamicOptionFetchUrl(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchUrl"));
		data.setEditable(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Editable"));
		data.setEnableSearch(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.EnableSearch"));
		data.setFieldFormat(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.FieldFormat"));
		data.setFieldLabel(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.FieldLabel"));
		data.setFormInvisible(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.FormInvisible"));
		data.setId(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Id"));
		data.setInvisible(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Invisible"));
		data.setName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.ProjectSign"));
		data.setRequired(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Required"));
		data.setType(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.UpdatedAt"));

		List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredDependentFields.Length"); i++) {
			dynamicFieldRequiredDependentFields.add(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredDependentFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

		List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields.Length"); i++) {
			dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

		List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchDependentFields.Length"); i++) {
			dynamicOptionFetchDependentFields.add(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchDependentFields["+ i +"]"));
		}
		data.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

		List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchInfluencedFields.Length"); i++) {
			dynamicOptionFetchInfluencedFields.add(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchInfluencedFields["+ i +"]"));
		}
		data.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.PossibleValues.Length"); i++) {
			PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
			possibleValuesItem.setKey(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"].Key"));
			possibleValuesItem.setLabel(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"].Label"));

			possibleValues.add(possibleValuesItem);
		}
		data.setPossibleValues(possibleValues);
		createLinkeLinktCustomfieldResponse.setData(data);
	 
	 	return createLinkeLinktCustomfieldResponse;
	}
}