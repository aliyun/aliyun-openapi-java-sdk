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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListComponentsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListComponentsResponse.ComponentsItem;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListComponentsResponse.ComponentsItem.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComponentsResponseUnmarshaller {

	public static ListComponentsResponse unmarshall(ListComponentsResponse listComponentsResponse, UnmarshallerContext _ctx) {
		
		listComponentsResponse.setRequestId(_ctx.stringValue("ListComponentsResponse.RequestId"));
		listComponentsResponse.setTotalCount(_ctx.integerValue("ListComponentsResponse.TotalCount"));

		List<ComponentsItem> components = new ArrayList<ComponentsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListComponentsResponse.Components.Length"); i++) {
			ComponentsItem componentsItem = new ComponentsItem();
			componentsItem.setUserId(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].UserId"));
			componentsItem.setOwnerId(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].OwnerId"));
			componentsItem.setGmtCreateTime(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].GmtCreateTime"));
			componentsItem.setGmtModifiedTime(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].GmtModifiedTime"));
			componentsItem.setUuid(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].Uuid"));
			componentsItem.setName(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].Name"));
			componentsItem.setVersion(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].Version"));

			Template template = new Template();
			template.setType(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].Template.Type"));
			template.setUri(_ctx.stringValue("ListComponentsResponse.Components["+ i +"].Template.Uri"));
			componentsItem.setTemplate(template);

			components.add(componentsItem);
		}
		listComponentsResponse.setComponents(components);
	 
	 	return listComponentsResponse;
	}
}