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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktTemplatecustomfieldsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktTemplatecustomfieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktTemplatecustomfieldsResponseUnmarshaller {

	public static ListLinkeLinktTemplatecustomfieldsResponse unmarshall(ListLinkeLinktTemplatecustomfieldsResponse listLinkeLinktTemplatecustomfieldsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktTemplatecustomfieldsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.RequestId"));
		listLinkeLinktTemplatecustomfieldsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.ResultCode"));
		listLinkeLinktTemplatecustomfieldsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.ResultMessage"));
		listLinkeLinktTemplatecustomfieldsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.ErrorCode"));
		listLinkeLinktTemplatecustomfieldsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.ErrorMessage"));
		listLinkeLinktTemplatecustomfieldsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.ResponseStatusCode"));
		listLinkeLinktTemplatecustomfieldsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCopyFrom(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].CopyFrom"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultValue(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Description"));
			dataItem.setDynamicOptionFetchUrl(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchUrl"));
			dataItem.setEditable(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Editable"));
			dataItem.setEnableSearch(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].EnableSearch"));
			dataItem.setFieldFormat(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].FieldFormat"));
			dataItem.setFieldLabel(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].FieldLabel"));
			dataItem.setFormInvisible(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].FormInvisible"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Id"));
			dataItem.setInvisible(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Invisible"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRequired(_ctx.booleanValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Required"));
			dataItem.setTemplateFieldId(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].TemplateFieldId"));
			dataItem.setTemplateId(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].TemplateId"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			List<String> possibleValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].PossibleValues.Length"); j++) {
				possibleValues.add(_ctx.stringValue("ListLinkeLinktTemplatecustomfieldsResponse.Data["+ i +"].PossibleValues["+ j +"]"));
			}
			dataItem.setPossibleValues(possibleValues);

			data.add(dataItem);
		}
		listLinkeLinktTemplatecustomfieldsResponse.setData(data);
	 
	 	return listLinkeLinktTemplatecustomfieldsResponse;
	}
}