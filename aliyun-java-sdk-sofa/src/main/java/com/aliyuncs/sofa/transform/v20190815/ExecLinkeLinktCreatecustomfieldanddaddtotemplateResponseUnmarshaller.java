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
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller {

	public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse unmarshall(ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse execLinkeLinktCreatecustomfieldanddaddtotemplateResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.RequestId"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ResultCode"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ResultMessage"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ErrorCode"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ErrorMessage"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.ResponseStatusCode"));
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.Creator"));
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

		List<String> possibleValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValues.Length"); i++) {
			possibleValues.add(_ctx.stringValue("ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse.Data.PossibleValues["+ i +"]"));
		}
		data.setPossibleValues(possibleValues);
		execLinkeLinktCreatecustomfieldanddaddtotemplateResponse.setData(data);
	 
	 	return execLinkeLinktCreatecustomfieldanddaddtotemplateResponse;
	}
}