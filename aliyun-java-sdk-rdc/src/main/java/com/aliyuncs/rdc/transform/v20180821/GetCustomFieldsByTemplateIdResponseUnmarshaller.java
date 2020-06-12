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

	public static GetCustomFieldsByTemplateIdResponse unmarshall(GetCustomFieldsByTemplateIdResponse getCustomFieldsByTemplateIdResponse, UnmarshallerContext _ctx) {
		
		getCustomFieldsByTemplateIdResponse.setRequestId(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.RequestId"));
		getCustomFieldsByTemplateIdResponse.setCode(_ctx.integerValue("GetCustomFieldsByTemplateIdResponse.Code"));
		getCustomFieldsByTemplateIdResponse.setSuccess(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomFieldsByTemplateIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDefaultValue(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDescription(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Description"));
			dataItem.setDynamic(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Dynamic"));
			dataItem.setEditable(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Editable"));
			dataItem.setFieldFormat(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].FieldFormat"));
			dataItem.setId(_ctx.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Id"));
			dataItem.setIsDelete(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsDelete"));
			dataItem.setIsRemember(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsRemember"));
			dataItem.setIsRequired(_ctx.booleanValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].IsRequired"));
			dataItem.setMaxLength(_ctx.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].MaxLength"));
			dataItem.setMinLength(_ctx.integerValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].MinLength"));
			dataItem.setName(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Name"));
			dataItem.setNameI18N(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].NameI18N"));
			dataItem.setOther(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Other"));
			dataItem.setPossibleValues(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].PossibleValues"));
			dataItem.setType(_ctx.stringValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].Type"));
			dataItem.setUpdatedAt(_ctx.longValue("GetCustomFieldsByTemplateIdResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		getCustomFieldsByTemplateIdResponse.setData(data);
	 
	 	return getCustomFieldsByTemplateIdResponse;
	}
}