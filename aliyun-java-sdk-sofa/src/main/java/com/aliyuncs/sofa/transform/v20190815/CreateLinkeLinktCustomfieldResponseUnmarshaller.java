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
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktCustomfieldResponseUnmarshaller {

	public static CreateLinkeLinktCustomfieldResponse unmarshall(CreateLinkeLinktCustomfieldResponse createLinkeLinktCustomfieldResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktCustomfieldResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.RequestId"));
		createLinkeLinktCustomfieldResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ResultCode"));
		createLinkeLinktCustomfieldResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ResultMessage"));
		createLinkeLinktCustomfieldResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.ErrorCode"));
		createLinkeLinktCustomfieldResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.ErrorMessage"));
		createLinkeLinktCustomfieldResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.ResponseStatusCode"));
		createLinkeLinktCustomfieldResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktCustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktCustomfieldResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.Creator"));
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

		List<String> possibleValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktCustomfieldResponse.Data.PossibleValues.Length"); i++) {
			possibleValues.add(_ctx.stringValue("CreateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"]"));
		}
		data.setPossibleValues(possibleValues);
		createLinkeLinktCustomfieldResponse.setData(data);
	 
	 	return createLinkeLinktCustomfieldResponse;
	}
}