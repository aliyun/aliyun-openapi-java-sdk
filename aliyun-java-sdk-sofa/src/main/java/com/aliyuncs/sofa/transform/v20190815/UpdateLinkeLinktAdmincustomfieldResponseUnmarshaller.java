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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmincustomfieldResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmincustomfieldResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmincustomfieldResponse.Data.PossibleValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktAdmincustomfieldResponseUnmarshaller {

	public static UpdateLinkeLinktAdmincustomfieldResponse unmarshall(UpdateLinkeLinktAdmincustomfieldResponse updateLinkeLinktAdmincustomfieldResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktAdmincustomfieldResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.RequestId"));
		updateLinkeLinktAdmincustomfieldResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.ResultCode"));
		updateLinkeLinktAdmincustomfieldResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.ResultMessage"));
		updateLinkeLinktAdmincustomfieldResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.ErrorCode"));
		updateLinkeLinktAdmincustomfieldResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.ErrorMessage"));
		updateLinkeLinktAdmincustomfieldResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.CreatedAt"));
		data.setDefaultValue(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DefaultValue"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Description"));
		data.setDynamicOptionFetchUrl(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchUrl"));
		data.setEditable(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Editable"));
		data.setEnableSearch(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.EnableSearch"));
		data.setFieldFormat(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.FieldFormat"));
		data.setFieldLabel(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.FieldLabel"));
		data.setFormInvisible(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.FormInvisible"));
		data.setId(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Id"));
		data.setInvisible(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Invisible"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.ProjectSign"));
		data.setRequired(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Required"));
		data.setType(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.UpdatedAt"));

		List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredDependentFields.Length"); i++) {
			dynamicFieldRequiredDependentFields.add(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredDependentFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

		List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields.Length"); i++) {
			dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

		List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchDependentFields.Length"); i++) {
			dynamicOptionFetchDependentFields.add(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchDependentFields["+ i +"]"));
		}
		data.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

		List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchInfluencedFields.Length"); i++) {
			dynamicOptionFetchInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.DynamicOptionFetchInfluencedFields["+ i +"]"));
		}
		data.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues.Length"); i++) {
			PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
			possibleValuesItem.setKey(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues["+ i +"].Key"));
			possibleValuesItem.setLabel(_ctx.stringValue("UpdateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues["+ i +"].Label"));

			possibleValues.add(possibleValuesItem);
		}
		data.setPossibleValues(possibleValues);
		updateLinkeLinktAdmincustomfieldResponse.setData(data);
	 
	 	return updateLinkeLinktAdmincustomfieldResponse;
	}
}