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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktCustomfieldsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktCustomfieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktCustomfieldsResponseUnmarshaller {

	public static ListLinkeLinktCustomfieldsResponse unmarshall(ListLinkeLinktCustomfieldsResponse listLinkeLinktCustomfieldsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktCustomfieldsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.RequestId"));
		listLinkeLinktCustomfieldsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.ResultCode"));
		listLinkeLinktCustomfieldsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.ResultMessage"));
		listLinkeLinktCustomfieldsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.ErrorCode"));
		listLinkeLinktCustomfieldsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.ErrorMessage"));
		listLinkeLinktCustomfieldsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.ResponseStatusCode"));
		listLinkeLinktCustomfieldsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCopyFrom(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].CopyFrom"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultValue(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Description"));
			dataItem.setDynamicOptionFetchUrl(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicOptionFetchUrl"));
			dataItem.setEditable(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Editable"));
			dataItem.setEnableSearch(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].EnableSearch"));
			dataItem.setFieldFormat(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].FieldFormat"));
			dataItem.setFieldLabel(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].FieldLabel"));
			dataItem.setFormInvisible(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].FormInvisible"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Id"));
			dataItem.setInvisible(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Invisible"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRequired(_ctx.booleanValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Required"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			List<String> possibleValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].PossibleValues.Length"); j++) {
				possibleValues.add(_ctx.stringValue("ListLinkeLinktCustomfieldsResponse.Data["+ i +"].PossibleValues["+ j +"]"));
			}
			dataItem.setPossibleValues(possibleValues);

			data.add(dataItem);
		}
		listLinkeLinktCustomfieldsResponse.setData(data);
	 
	 	return listLinkeLinktCustomfieldsResponse;
	}
}