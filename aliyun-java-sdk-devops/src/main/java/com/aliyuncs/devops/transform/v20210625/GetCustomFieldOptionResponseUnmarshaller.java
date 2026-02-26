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

import com.aliyuncs.devops.model.v20210625.GetCustomFieldOptionResponse;
import com.aliyuncs.devops.model.v20210625.GetCustomFieldOptionResponse.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomFieldOptionResponseUnmarshaller {

	public static GetCustomFieldOptionResponse unmarshall(GetCustomFieldOptionResponse getCustomFieldOptionResponse, UnmarshallerContext _ctx) {
		
		getCustomFieldOptionResponse.setRequestId(_ctx.stringValue("GetCustomFieldOptionResponse.requestId"));
		getCustomFieldOptionResponse.setErrorMsg(_ctx.stringValue("GetCustomFieldOptionResponse.errorMsg"));
		getCustomFieldOptionResponse.setErrorCode(_ctx.stringValue("GetCustomFieldOptionResponse.errorCode"));
		getCustomFieldOptionResponse.setSuccess(_ctx.booleanValue("GetCustomFieldOptionResponse.success"));

		List<Field> fileds = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomFieldOptionResponse.fileds.Length"); i++) {
			Field field = new Field();
			field.setDisplayValue(_ctx.stringValue("GetCustomFieldOptionResponse.fileds["+ i +"].displayValue"));
			field.setFieldIdentifier(_ctx.stringValue("GetCustomFieldOptionResponse.fileds["+ i +"].fieldIdentifier"));
			field.setIdentifier(_ctx.stringValue("GetCustomFieldOptionResponse.fileds["+ i +"].identifier"));
			field.setLevel(_ctx.longValue("GetCustomFieldOptionResponse.fileds["+ i +"].level"));
			field.setPosition(_ctx.longValue("GetCustomFieldOptionResponse.fileds["+ i +"].position"));
			field.setValue(_ctx.stringValue("GetCustomFieldOptionResponse.fileds["+ i +"].value"));
			field.setValueEn(_ctx.stringValue("GetCustomFieldOptionResponse.fileds["+ i +"].valueEn"));

			fileds.add(field);
		}
		getCustomFieldOptionResponse.setFileds(fileds);
	 
	 	return getCustomFieldOptionResponse;
	}
}