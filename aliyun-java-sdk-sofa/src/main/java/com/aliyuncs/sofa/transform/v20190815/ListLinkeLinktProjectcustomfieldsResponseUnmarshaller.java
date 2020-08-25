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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectcustomfieldsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectcustomfieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktProjectcustomfieldsResponseUnmarshaller {

	public static ListLinkeLinktProjectcustomfieldsResponse unmarshall(ListLinkeLinktProjectcustomfieldsResponse listLinkeLinktProjectcustomfieldsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktProjectcustomfieldsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.RequestId"));
		listLinkeLinktProjectcustomfieldsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.ResultCode"));
		listLinkeLinktProjectcustomfieldsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.ResultMessage"));
		listLinkeLinktProjectcustomfieldsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.ErrorCode"));
		listLinkeLinktProjectcustomfieldsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.ErrorMessage"));
		listLinkeLinktProjectcustomfieldsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.ResponseStatusCode"));
		listLinkeLinktProjectcustomfieldsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCopyFrom(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].CopyFrom"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultValue(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Description"));
			dataItem.setDynamicOptionFetchUrl(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchUrl"));
			dataItem.setEditable(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Editable"));
			dataItem.setEnableSearch(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].EnableSearch"));
			dataItem.setFieldFormat(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].FieldFormat"));
			dataItem.setFieldLabel(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].FieldLabel"));
			dataItem.setFormInvisible(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].FormInvisible"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Id"));
			dataItem.setInvisible(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Invisible"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRequired(_ctx.booleanValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Required"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			List<String> possibleValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].PossibleValues.Length"); j++) {
				possibleValues.add(_ctx.stringValue("ListLinkeLinktProjectcustomfieldsResponse.Data["+ i +"].PossibleValues["+ j +"]"));
			}
			dataItem.setPossibleValues(possibleValues);

			data.add(dataItem);
		}
		listLinkeLinktProjectcustomfieldsResponse.setData(data);
	 
	 	return listLinkeLinktProjectcustomfieldsResponse;
	}
}