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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.ListPropertyResponse;
import com.aliyuncs.eds_user.model.v20210308.ListPropertyResponse.Data;
import com.aliyuncs.eds_user.model.v20210308.ListPropertyResponse.Data.PropertyValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPropertyResponseUnmarshaller {

	public static ListPropertyResponse unmarshall(ListPropertyResponse listPropertyResponse, UnmarshallerContext _ctx) {
		
		listPropertyResponse.setRequestId(_ctx.stringValue("ListPropertyResponse.RequestId"));
		listPropertyResponse.setNextToken(_ctx.stringValue("ListPropertyResponse.NextToken"));

		List<Data> properties = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListPropertyResponse.Properties.Length"); i++) {
			Data data = new Data();
			data.setPropertyId(_ctx.longValue("ListPropertyResponse.Properties["+ i +"].PropertyId"));
			data.setPropertyKey(_ctx.stringValue("ListPropertyResponse.Properties["+ i +"].PropertyKey"));

			List<PropertyValuesItem> propertyValues = new ArrayList<PropertyValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPropertyResponse.Properties["+ i +"].PropertyValues.Length"); j++) {
				PropertyValuesItem propertyValuesItem = new PropertyValuesItem();
				propertyValuesItem.setPropertyValueId(_ctx.longValue("ListPropertyResponse.Properties["+ i +"].PropertyValues["+ j +"].PropertyValueId"));
				propertyValuesItem.setPropertyValue(_ctx.stringValue("ListPropertyResponse.Properties["+ i +"].PropertyValues["+ j +"].PropertyValue"));

				propertyValues.add(propertyValuesItem);
			}
			data.setPropertyValues(propertyValues);

			properties.add(data);
		}
		listPropertyResponse.setProperties(properties);
	 
	 	return listPropertyResponse;
	}
}