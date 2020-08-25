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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectusedcustomfieldsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectusedcustomfieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktProjectusedcustomfieldsResponseUnmarshaller {

	public static ListLinkeLinktProjectusedcustomfieldsResponse unmarshall(ListLinkeLinktProjectusedcustomfieldsResponse listLinkeLinktProjectusedcustomfieldsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktProjectusedcustomfieldsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.RequestId"));
		listLinkeLinktProjectusedcustomfieldsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.ResultCode"));
		listLinkeLinktProjectusedcustomfieldsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.ResultMessage"));
		listLinkeLinktProjectusedcustomfieldsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.ErrorCode"));
		listLinkeLinktProjectusedcustomfieldsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.ErrorMessage"));
		listLinkeLinktProjectusedcustomfieldsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.ResponseStatusCode"));
		listLinkeLinktProjectusedcustomfieldsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCopyFrom(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].CopyFrom"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Creator"));
			dataItem.setDefaultValue(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Description"));
			dataItem.setDynamicOptionFetchUrl(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchUrl"));
			dataItem.setEditable(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Editable"));
			dataItem.setEnableSearch(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].EnableSearch"));
			dataItem.setFieldFormat(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].FieldFormat"));
			dataItem.setFieldLabel(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].FieldLabel"));
			dataItem.setFormInvisible(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].FormInvisible"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Id"));
			dataItem.setInvisible(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Invisible"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRequired(_ctx.booleanValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Required"));
			dataItem.setType(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].UpdatedAt"));

			List<Long> dynamicFieldRequiredDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields.Length"); j++) {
				dynamicFieldRequiredDependentFields.add(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredDependentFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredDependentFields(dynamicFieldRequiredDependentFields);

			List<Long> dynamicFieldRequiredInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields.Length"); j++) {
				dynamicFieldRequiredInfluencedFields.add(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicFieldRequiredInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicFieldRequiredInfluencedFields(dynamicFieldRequiredInfluencedFields);

			List<Long> dynamicOptionFetchDependentFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields.Length"); j++) {
				dynamicOptionFetchDependentFields.add(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchDependentFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchDependentFields(dynamicOptionFetchDependentFields);

			List<Long> dynamicOptionFetchInfluencedFields = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields.Length"); j++) {
				dynamicOptionFetchInfluencedFields.add(_ctx.longValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].DynamicOptionFetchInfluencedFields["+ j +"]"));
			}
			dataItem.setDynamicOptionFetchInfluencedFields(dynamicOptionFetchInfluencedFields);

			List<String> possibleValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].PossibleValues.Length"); j++) {
				possibleValues.add(_ctx.stringValue("ListLinkeLinktProjectusedcustomfieldsResponse.Data["+ i +"].PossibleValues["+ j +"]"));
			}
			dataItem.setPossibleValues(possibleValues);

			data.add(dataItem);
		}
		listLinkeLinktProjectusedcustomfieldsResponse.setData(data);
	 
	 	return listLinkeLinktProjectusedcustomfieldsResponse;
	}
}