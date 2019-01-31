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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListComponentsResponse;
import com.aliyuncs.edas.model.v20170801.ListComponentsResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComponentsResponseUnmarshaller {

	public static ListComponentsResponse unmarshall(ListComponentsResponse listComponentsResponse, UnmarshallerContext context) {
		
		listComponentsResponse.setCode(context.integerValue("ListComponentsResponse.Code"));
		listComponentsResponse.setMessage(context.stringValue("ListComponentsResponse.Message"));

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < context.lengthValue("ListComponentsResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setComponentId(context.stringValue("ListComponentsResponse.ComponentList["+ i +"].ComponentId"));
			component.setType(context.stringValue("ListComponentsResponse.ComponentList["+ i +"].Type"));
			component.setVersion(context.stringValue("ListComponentsResponse.ComponentList["+ i +"].Version"));
			component.setExpired(context.booleanValue("ListComponentsResponse.ComponentList["+ i +"].Expired"));

			componentList.add(component);
		}
		listComponentsResponse.setComponentList(componentList);
	 
	 	return listComponentsResponse;
	}
}