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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListProjectCustomFieldsResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListProjectCustomFieldsResponse.CustomField;
import com.aliyuncs.devops_rdc.model.v20200303.ListProjectCustomFieldsResponse.CustomField.Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectCustomFieldsResponseUnmarshaller {

	public static ListProjectCustomFieldsResponse unmarshall(ListProjectCustomFieldsResponse listProjectCustomFieldsResponse, UnmarshallerContext _ctx) {
		
		listProjectCustomFieldsResponse.setRequestId(_ctx.stringValue("ListProjectCustomFieldsResponse.RequestId"));
		listProjectCustomFieldsResponse.setSuccessful(_ctx.booleanValue("ListProjectCustomFieldsResponse.Successful"));
		listProjectCustomFieldsResponse.setErrorCode(_ctx.stringValue("ListProjectCustomFieldsResponse.ErrorCode"));
		listProjectCustomFieldsResponse.setErrorMsg(_ctx.stringValue("ListProjectCustomFieldsResponse.ErrorMsg"));

		List<CustomField> object = new ArrayList<CustomField>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectCustomFieldsResponse.Object.Length"); i++) {
			CustomField customField = new CustomField();
			customField.setCustomFieldId(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].CustomFieldId"));
			customField.setType(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].Type"));
			customField.setSubtype(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].Subtype"));
			customField.setName(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].Name"));

			List<Value> values = new ArrayList<Value>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectCustomFieldsResponse.Object["+ i +"].Values.Length"); j++) {
				Value value = new Value();
				value.setId(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].Values["+ j +"].Id"));
				value.setValue(_ctx.stringValue("ListProjectCustomFieldsResponse.Object["+ i +"].Values["+ j +"].Value"));

				values.add(value);
			}
			customField.setValues(values);

			object.add(customField);
		}
		listProjectCustomFieldsResponse.setObject(object);
	 
	 	return listProjectCustomFieldsResponse;
	}
}