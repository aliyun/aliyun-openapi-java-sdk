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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.CreateApplicationResponse;
import com.aliyuncs.polardb.model.v20170801.CreateApplicationResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));
		createApplicationResponse.setResourceAvailable(_ctx.booleanValue("CreateApplicationResponse.ResourceAvailable"));
		createApplicationResponse.setApplicationId(_ctx.stringValue("CreateApplicationResponse.ApplicationId"));
		createApplicationResponse.setDescription(_ctx.stringValue("CreateApplicationResponse.Description"));
		createApplicationResponse.setOrderId(_ctx.stringValue("CreateApplicationResponse.OrderId"));
		createApplicationResponse.setResourceGroupId(_ctx.stringValue("CreateApplicationResponse.ResourceGroupId"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setComponentId(_ctx.stringValue("CreateApplicationResponse.Components["+ i +"].ComponentId"));

			components.add(component);
		}
		createApplicationResponse.setComponents(components);
	 
	 	return createApplicationResponse;
	}
}