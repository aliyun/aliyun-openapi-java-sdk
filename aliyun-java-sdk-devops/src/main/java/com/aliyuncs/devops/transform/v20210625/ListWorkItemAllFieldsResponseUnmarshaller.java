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

import com.aliyuncs.devops.model.v20210625.ListWorkItemAllFieldsResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkItemAllFieldsResponse.Field;
import com.aliyuncs.devops.model.v20210625.ListWorkItemAllFieldsResponse.Field.Option;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkItemAllFieldsResponseUnmarshaller {

	public static ListWorkItemAllFieldsResponse unmarshall(ListWorkItemAllFieldsResponse listWorkItemAllFieldsResponse, UnmarshallerContext _ctx) {
		
		listWorkItemAllFieldsResponse.setRequestId(_ctx.stringValue("ListWorkItemAllFieldsResponse.requestId"));
		listWorkItemAllFieldsResponse.setErrorMsg(_ctx.stringValue("ListWorkItemAllFieldsResponse.errorMsg"));
		listWorkItemAllFieldsResponse.setErrorCode(_ctx.stringValue("ListWorkItemAllFieldsResponse.errorCode"));
		listWorkItemAllFieldsResponse.setSuccess(_ctx.booleanValue("ListWorkItemAllFieldsResponse.success"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkItemAllFieldsResponse.fields.Length"); i++) {
			Field field = new Field();
			field.setCreator(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].creator"));
			field.setDescription(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].description"));
			field.setGmtCreate(_ctx.longValue("ListWorkItemAllFieldsResponse.fields["+ i +"].gmtCreate"));
			field.setGmtModified(_ctx.longValue("ListWorkItemAllFieldsResponse.fields["+ i +"].gmtModified"));
			field.setType(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].type"));
			field.setIdentifier(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].identifier"));
			field.setModifier(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].modifier"));
			field.setName(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].name"));
			field.setFormat(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].format"));
			field.setClassName(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].className"));
			field.setResourceType(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].resourceType"));
			field.setDefaultValue(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].defaultValue"));
			field.setIsRequired(_ctx.booleanValue("ListWorkItemAllFieldsResponse.fields["+ i +"].isRequired"));
			field.setIsSystemRequired(_ctx.booleanValue("ListWorkItemAllFieldsResponse.fields["+ i +"].isSystemRequired"));
			field.setLinkWithService(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].linkWithService"));
			field.setIsShowWhenCreate(_ctx.booleanValue("ListWorkItemAllFieldsResponse.fields["+ i +"].isShowWhenCreate"));

			List<Option> options = new ArrayList<Option>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options.Length"); j++) {
				Option option = new Option();
				option.setIdentifier(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].identifier"));
				option.setFieldIdentifier(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].fieldIdentifier"));
				option.setValue(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].value"));
				option.setValueEn(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].valueEn"));
				option.setDisplayValue(_ctx.stringValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].displayValue"));
				option.setPosition(_ctx.longValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].position"));
				option.setLevel(_ctx.longValue("ListWorkItemAllFieldsResponse.fields["+ i +"].options["+ j +"].level"));

				options.add(option);
			}
			field.setOptions(options);

			fields.add(field);
		}
		listWorkItemAllFieldsResponse.setFields(fields);
	 
	 	return listWorkItemAllFieldsResponse;
	}
}