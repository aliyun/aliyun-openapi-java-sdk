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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListTestCaseFieldsResponse;
import com.aliyuncs.devops.model.v20210625.ListTestCaseFieldsResponse.Field;
import com.aliyuncs.devops.model.v20210625.ListTestCaseFieldsResponse.Field.Option;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTestCaseFieldsResponseUnmarshaller {

	public static ListTestCaseFieldsResponse unmarshall(ListTestCaseFieldsResponse listTestCaseFieldsResponse, UnmarshallerContext _ctx) {
		
		listTestCaseFieldsResponse.setRequestId(_ctx.stringValue("ListTestCaseFieldsResponse.requestId"));
		listTestCaseFieldsResponse.setErrorMsg(_ctx.stringValue("ListTestCaseFieldsResponse.errorMsg"));
		listTestCaseFieldsResponse.setErrorCode(_ctx.stringValue("ListTestCaseFieldsResponse.errorCode"));
		listTestCaseFieldsResponse.setSuccess(_ctx.booleanValue("ListTestCaseFieldsResponse.success"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("ListTestCaseFieldsResponse.fields.Length"); i++) {
			Field field = new Field();
			field.setCreator(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].creator"));
			field.setDescription(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].description"));
			field.setGmtCreate(_ctx.longValue("ListTestCaseFieldsResponse.fields["+ i +"].gmtCreate"));
			field.setGmtModified(_ctx.longValue("ListTestCaseFieldsResponse.fields["+ i +"].gmtModified"));
			field.setType(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].type"));
			field.setIdentifier(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].identifier"));
			field.setModifier(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].modifier"));
			field.setName(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].name"));
			field.setFormat(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].format"));
			field.setClassName(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].className"));
			field.setResourceType(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].resourceType"));
			field.setDefaultValue(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].defaultValue"));
			field.setIsRequired(_ctx.booleanValue("ListTestCaseFieldsResponse.fields["+ i +"].isRequired"));
			field.setIsSystemRequired(_ctx.booleanValue("ListTestCaseFieldsResponse.fields["+ i +"].isSystemRequired"));
			field.setLinkWithService(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].linkWithService"));
			field.setIsShowWhenCreate(_ctx.booleanValue("ListTestCaseFieldsResponse.fields["+ i +"].isShowWhenCreate"));

			List<Option> options = new ArrayList<Option>();
			for (int j = 0; j < _ctx.lengthValue("ListTestCaseFieldsResponse.fields["+ i +"].options.Length"); j++) {
				Option option = new Option();
				option.setIdentifier(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].identifier"));
				option.setFieldIdentifier(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].fieldIdentifier"));
				option.setValue(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].value"));
				option.setValueEn(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].valueEn"));
				option.setDisplayValue(_ctx.stringValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].displayValue"));
				option.setPosition(_ctx.longValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].position"));
				option.setLevel(_ctx.longValue("ListTestCaseFieldsResponse.fields["+ i +"].options["+ j +"].level"));

				options.add(option);
			}
			field.setOptions(options);

			fields.add(field);
		}
		listTestCaseFieldsResponse.setFields(fields);
	 
	 	return listTestCaseFieldsResponse;
	}
}