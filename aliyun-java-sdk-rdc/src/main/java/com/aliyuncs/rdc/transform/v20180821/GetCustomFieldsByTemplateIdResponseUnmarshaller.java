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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.GetCustomFieldsByTemplateIdResponse;
import com.aliyuncs.rdc.model.v20180821.GetCustomFieldsByTemplateIdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomFieldsByTemplateIdResponseUnmarshaller {

	public static GetCustomFieldsByTemplateIdResponse unmarshall(GetCustomFieldsByTemplateIdResponse getCustomFieldsByTemplateIdResponse, UnmarshallerContext context) {
		
		getCustomFieldsByTemplateIdResponse.setRequestId(context.stringValue("GetCustomFieldsByTemplateIdResponse.RequestId"));
		getCustomFieldsByTemplateIdResponse.setCode(context.integerValue("GetCustomFieldsByTemplateIdResponse.Code"));
		getCustomFieldsByTemplateIdResponse.setSuccess(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("GetCustomFieldsByTemplateIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(context.longValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDefaultValue(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDescription(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Description"));
			dataItem.setDynamic(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Dynamic"));
			dataItem.setEditable(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Editable"));
			dataItem.setFieldFormat(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].FieldFormat"));
			dataItem.setId(context.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Id"));
			dataItem.setIsDelete(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsDelete"));
			dataItem.setIsRemember(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsRemember"));
			dataItem.setIsRequired(context.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsRequired"));
			dataItem.setMaxLength(context.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].MaxLength"));
			dataItem.setMinLength(context.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].MinLength"));
			dataItem.setName(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Name"));
			dataItem.setNameI18N(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].NameI18N"));
			dataItem.setOther(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Other"));
			dataItem.setPossibleValues(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].PossibleValues"));
			dataItem.setType(context.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(context.longValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		getCustomFieldsByTemplateIdResponse.setData(data);
	 
	 	return getCustomFieldsByTemplateIdResponse;
	}
}