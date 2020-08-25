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
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktAdmincustomfieldResponseUnmarshaller {

	public static CreateLinkeLinktAdmincustomfieldResponse unmarshall(CreateLinkeLinktAdmincustomfieldResponse createLinkeLinktAdmincustomfieldResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktAdmincustomfieldResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.RequestId"));
		createLinkeLinktAdmincustomfieldResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ResultCode"));
		createLinkeLinktAdmincustomfieldResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ResultMessage"));
		createLinkeLinktAdmincustomfieldResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.ErrorCode"));
		createLinkeLinktAdmincustomfieldResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.ErrorMessage"));
		createLinkeLinktAdmincustomfieldResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.ResponseStatusCode"));
		createLinkeLinktAdmincustomfieldResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktAdmincustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktAdmincustomfieldResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.Creator"));
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

		List<String> possibleValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues.Length"); i++) {
			possibleValues.add(_ctx.stringValue("CreateLinkeLinktAdmincustomfieldResponse.Data.PossibleValues["+ i +"]"));
		}
		data.setPossibleValues(possibleValues);
		createLinkeLinktAdmincustomfieldResponse.setData(data);
	 
	 	return createLinkeLinktAdmincustomfieldResponse;
	}
}