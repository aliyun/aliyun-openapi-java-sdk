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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceConfigPurchaseResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceConfigPurchaseResponse.Component;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceConfigPurchaseResponse.Component.Property2;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceConfigPurchaseResponse.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceConfigPurchaseResponseUnmarshaller {

	public static OpsDescribeResourceConfigPurchaseResponse unmarshall(OpsDescribeResourceConfigPurchaseResponse opsDescribeResourceConfigPurchaseResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceConfigPurchaseResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.RequestId"));
		opsDescribeResourceConfigPurchaseResponse.setStatus(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Status"));
		opsDescribeResourceConfigPurchaseResponse.setPageSize(_ctx.integerValue("OpsDescribeResourceConfigPurchaseResponse.PageSize"));
		opsDescribeResourceConfigPurchaseResponse.setInstanceId(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.InstanceId"));
		opsDescribeResourceConfigPurchaseResponse.setOrderId(_ctx.longValue("OpsDescribeResourceConfigPurchaseResponse.OrderId"));
		opsDescribeResourceConfigPurchaseResponse.setEndDate(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.EndDate"));
		opsDescribeResourceConfigPurchaseResponse.setStartDate(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.StartDate"));
		opsDescribeResourceConfigPurchaseResponse.setTotalCount(_ctx.integerValue("OpsDescribeResourceConfigPurchaseResponse.TotalCount"));
		opsDescribeResourceConfigPurchaseResponse.setOrderType(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.OrderType"));
		opsDescribeResourceConfigPurchaseResponse.setPageNumber(_ctx.integerValue("OpsDescribeResourceConfigPurchaseResponse.PageNumber"));
		opsDescribeResourceConfigPurchaseResponse.setUserId(_ctx.longValue("OpsDescribeResourceConfigPurchaseResponse.UserId"));

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceConfigPurchaseResponse.Properties.Length"); i++) {
			Property property = new Property();
			property.setValue(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Properties["+ i +"].Value"));
			property.setCode(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Properties["+ i +"].Code"));
			property.setName(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Properties["+ i +"].Name"));

			properties.add(property);
		}
		opsDescribeResourceConfigPurchaseResponse.setProperties(properties);

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceConfigPurchaseResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setModuleAttrStatus(_ctx.longValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].ModuleAttrStatus"));
			component.setTag(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].Tag"));
			component.setComponentCode(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].ComponentCode"));

			List<Property2> properties1 = new ArrayList<Property2>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].Properties.Length"); j++) {
				Property2 property2 = new Property2();
				property2.setValue(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].Properties["+ j +"].Value"));
				property2.setCode(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].Properties["+ j +"].Code"));
				property2.setName(_ctx.stringValue("OpsDescribeResourceConfigPurchaseResponse.Components["+ i +"].Properties["+ j +"].Name"));

				properties1.add(property2);
			}
			component.setProperties1(properties1);

			components.add(component);
		}
		opsDescribeResourceConfigPurchaseResponse.setComponents(components);
	 
	 	return opsDescribeResourceConfigPurchaseResponse;
	}
}