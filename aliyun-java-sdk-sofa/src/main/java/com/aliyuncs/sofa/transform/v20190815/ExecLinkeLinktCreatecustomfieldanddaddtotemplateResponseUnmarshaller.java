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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller {

	public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse unmarshall(ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse execLinkeLinktCreatecustomfieldanddaddtotemplateResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.RequestId"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ResultCode"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ResultMessage"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ErrorCode"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ErrorMessage"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.CreatedAt"));
		data.setDefaultValue(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DefaultValue"));
		data.setDeleted(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Description"));
		data.setDynamicOptionFetchUrl(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicOptionFetchUrl"));
		data.setEditable(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Editable"));
		data.setEnableSearch(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.EnableSearch"));
		data.setFieldFormat(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.FieldFormat"));
		data.setFieldLabel(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.FieldLabel"));
		data.setFormInvisible(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.FormInvisible"));
		data.setId(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Id"));
		data.setInvisible(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Invisible"));
		data.setName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.ProjectSign"));
		data.setRequired(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Required"));
		data.setType(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.UpdatedAt"));

		List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicFieldRequiredDependentFields.Length"); i++) {
			dynamicFieldRequiredDependentFields.add(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicFieldRequiredDependentFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

		List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicFieldRequiredInfluencedFields.Length"); i++) {
			dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicFieldRequiredInfluencedFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

		List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicOptionFetchDependentFields.Length"); i++) {
			dynamicOptionFetchDependentFields.add(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicOptionFetchDependentFields["+ i +"]"));
		}
		data.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

		List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicOptionFetchInfluencedFields.Length"); i++) {
			dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.DynamicOptionFetchInfluencedFields["+ i +"]"));
		}
		data.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValues.Length"); i++) {
			PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
			possibleValuesItem.setKey(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValues["+ i +"].Key"));
			possibleValuesItem.setLabel(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValues["+ i +"].Label"));

			possibleValues.add(possibleValuesItem);
		}
		data.setPossibleValues(possibleValues);
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setData(data);
	 
	 	return execLinkeLinktCreatecustomfieldanddaddtotemplateResponse;
	}
}