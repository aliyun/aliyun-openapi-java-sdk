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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktTemplateselectablecustomfieldsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktTemplateselectablecustomfieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktTemplateselectablecustomfieldsResponseUnmarshaller {

	public static ListLinkeLinktTemplateselectablecustomfieldsResponse unmarshall(ListLinkeLinktTemplateselectablecustomfieldsResponse listLinkeLinktTemplateselectablecustomfieldsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktTemplateselectablecustomfieldsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.RequestId"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.ResultCode"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.ResultMessage"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.ErrorCode"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.ErrorMessage"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.ResponseStatusCode"));
		listLinkeLinktTemplateselectablecustomfieldsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCopyFrom(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].CopyFrom"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultValue(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Description"));
			dataItem.setDynamicOptionFetchUrl(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchUrl"));
			dataItem.setEditable(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Editable"));
			dataItem.setEnableSearch(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].EnableSearch"));
			dataItem.setFieldFormat(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].FieldFormat"));
			dataItem.setFieldLabel(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].FieldLabel"));
			dataItem.setFormInvisible(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].FormInvisible"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Id"));
			dataItem.setInvisible(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Invisible"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRequired(_ctx.booleanValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Required"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			List<String> possibleValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].PossibleValues.Length"); j++) {
				possibleValues.add(_ctx.stringValue("ListLinkeLinktTemplateselectablecustomfieldsResponse.Data["+ i +"].PossibleValues["+ j +"]"));
			}
			dataItem.setPossibleValues(possibleValues);

			data.add(dataItem);
		}
		listLinkeLinktTemplateselectablecustomfieldsResponse.setData(data);
	 
	 	return listLinkeLinktTemplateselectablecustomfieldsResponse;
	}
}