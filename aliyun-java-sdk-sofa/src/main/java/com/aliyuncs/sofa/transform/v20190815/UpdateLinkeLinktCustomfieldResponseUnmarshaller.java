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
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktCustomfieldResponseUnmarshaller {

	public static UpdateLinkeLinktCustomfieldResponse unmarshall(UpdateLinkeLinktCustomfieldResponse updateLinkeLinktCustomfieldResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktCustomfieldResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.RequestId"));
		updateLinkeLinktCustomfieldResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ResultCode"));
		updateLinkeLinktCustomfieldResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ResultMessage"));
		updateLinkeLinktCustomfieldResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.ErrorCode"));
		updateLinkeLinktCustomfieldResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.ErrorMessage"));
		updateLinkeLinktCustomfieldResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.ResponseStatusCode"));
		updateLinkeLinktCustomfieldResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktCustomfieldResponse.Success"));

		Data data = new Data();
		data.setCopyFrom(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.CopyFrom"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktCustomfieldResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.Creator"));
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

		List<String> possibleValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktCustomfieldResponse.Data.PossibleValues.Length"); i++) {
			possibleValues.add(_ctx.stringValue("UpdateLinkeLinktCustomfieldResponse.Data.PossibleValues["+ i +"]"));
		}
		data.setPossibleValues(possibleValues);
		updateLinkeLinktCustomfieldResponse.setData(data);
	 
	 	return updateLinkeLinktCustomfieldResponse;
	}
}