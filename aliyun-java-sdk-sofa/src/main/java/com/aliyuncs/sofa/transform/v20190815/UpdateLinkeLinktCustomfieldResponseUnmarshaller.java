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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktCustomfieldResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktCustomfieldResponse.Data;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktCustomfieldResponse.Data.Creator;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktCustomfieldResponse.Data.PossibleValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktCustomfieldResponseUnmarshaller {

	public static UpdateLinkeLinktCustomfieldResponse unmarshall(UpdateLinkeLinktCustomfieldResponse updateLinkeLinktCustomfieldResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktCustomfieldResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.RequestId"));
		updateLinkeLinktCustomfieldResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ResultCode"));
		updateLinkeLinktCustomfieldResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ResultMessage"));
		updateLinkeLinktCustomfieldResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.ErrorCode"));
		updateLinkeLinktCustomfieldResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ErrorMessage"));
		updateLinkeLinktCustomfieldResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.CreatedAt"));
		data.setDefaultValue(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.DefaultValue"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Description"));
		data.setDynamicOptionFetchUrl(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchUrl"));
		data.setEditable(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Editable"));
		data.setEnableSearch(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.EnableSearch"));
		data.setFieldFormat(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.FieldFormat"));
		data.setFieldLabel(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.FieldLabel"));
		data.setFormInvisible(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.FormInvisible"));
		data.setId(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Id"));
		data.setInvisible(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Invisible"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.ProjectSign"));
		data.setRequired(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Required"));
		data.setType(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.UpdatedAt"));

		List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredDependentFields.Length"); i++) {
			dynamicFieldRequiredDependentFields.add(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredDependentFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

		List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields.Length"); i++) {
			dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicFieldRequiredInfluencedFields["+ i +"]"));
		}
		data.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

		List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchDependentFields.Length"); i++) {
			dynamicOptionFetchDependentFields.add(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchDependentFields["+ i +"]"));
		}
		data.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

		List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchInfluencedFields.Length"); i++) {
			dynamicOptionFetchInfluencedFields.add(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.DynamicOptionFetchInfluencedFields["+ i +"]"));
		}
		data.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

		Creator creator = new Creator();
		creator.setAccount(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Account"));
		creator.setAdDomain(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.AdDomain"));
		creator.setAliFullName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.AliFullName"));
		creator.setAuthToken(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.AuthToken"));
		creator.setBuName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.BuName"));
		creator.setBuNo(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.BuNo"));
		creator.setCustomer(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Customer"));
		creator.setDeleted(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Deleted"));
		creator.setDeptName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.DeptName"));
		creator.setDeptNo(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.DeptNo"));
		creator.setEmail(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Email"));
		creator.setEmpId(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.EmpId"));
		creator.setEmpType(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.EmpType"));
		creator.setEmpTypeExt(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.EmpTypeExt"));
		creator.setFullPartTime(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.FullPartTime"));
		creator.setGitModified(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GitModified"));
		creator.setGitPassword(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GitPassword"));
		creator.setGmtCreate(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GmtCreate"));
		creator.setGmtEntry(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GmtEntry"));
		creator.setGmtLeave(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GmtLeave"));
		creator.setGmtModified(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.GmtModified"));
		creator.setLevel(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Level"));
		creator.setLoginAccount(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.LoginAccount"));
		creator.setLoginName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.LoginName"));
		creator.setManager(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Manager"));
		creator.setMobile(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Mobile"));
		creator.setName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Name"));
		creator.setNickName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.NickName"));
		creator.setRealName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.RealName"));
		creator.setSuperName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.SuperName"));
		creator.setSuperNickName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.SuperNickName"));
		creator.setSuperWorkNo(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.SuperWorkNo"));
		creator.setTenant(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Tenant"));
		creator.setTenantAdmin(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.TenantAdmin"));
		creator.setUid(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Uid"));
		creator.setUniqueId(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.UniqueId"));
		creator.setUserToken(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.UserToken"));
		creator.setVirtName(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.VirtName"));
		creator.setVirtWorkNo(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.VirtWorkNo"));
		creator.setWorkspace(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Workspace"));
		creator.setWorkNo(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.WorkNo"));
		creator.setWorkStatus(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.WorkStatus"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator.Tenants["+ i +"]"));
		}
		creator.setTenants(tenants);
		data.setCreator(creator);

		List<PossibleValuesItem> possibleValues = new ArrayList<PossibleValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.PossibleValues.Length"); i++) {
			PossibleValuesItem possibleValuesItem = new PossibleValuesItem();
			possibleValuesItem.setKey(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"].Key"));
			possibleValuesItem.setLabel(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"].Label"));

			possibleValues.add(possibleValuesItem);
		}
		data.setPossibleValues(possibleValues);
		updateLinkeLinktCustomfieldResponse.setData(data);
	 
	 	return updateLinkeLinktCustomfieldResponse;
	}
}