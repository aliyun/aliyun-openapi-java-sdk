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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet.Component;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet.Component.Property;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet.Property2;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribePurchasesResponseUnmarshaller {

	public static OpsDescribePurchasesResponse unmarshall(OpsDescribePurchasesResponse opsDescribePurchasesResponse, UnmarshallerContext _ctx) {
		
		opsDescribePurchasesResponse.setRequestId(_ctx.stringValue("OpsDescribePurchasesResponse.RequestId"));
		opsDescribePurchasesResponse.setTotalCount(_ctx.integerValue("OpsDescribePurchasesResponse.TotalCount"));
		opsDescribePurchasesResponse.setPageSize(_ctx.integerValue("OpsDescribePurchasesResponse.PageSize"));
		opsDescribePurchasesResponse.setPageNumber(_ctx.integerValue("OpsDescribePurchasesResponse.PageNumber"));

		List<PurchaseSet> purchaseSets = new ArrayList<PurchaseSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets.Length"); i++) {
			PurchaseSet purchaseSet = new PurchaseSet();
			purchaseSet.setStatus(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Status"));
			purchaseSet.setEndDate(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].EndDate"));
			purchaseSet.setUserId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].UserId"));
			purchaseSet.setStartDate(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].StartDate"));
			purchaseSet.setInstanceId(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].InstanceId"));
			purchaseSet.setOrderType(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].OrderType"));
			purchaseSet.setOrderId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].OrderId"));
			purchaseSet.setId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Id"));

			List<Component> components = new ArrayList<Component>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components.Length"); j++) {
				Component component = new Component();
				component.setModuleAttrStatus(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].ModuleAttrStatus"));
				component.setTag(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Tag"));
				component.setComponentCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].ComponentCode"));

				List<Property> properties1 = new ArrayList<Property>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties.Length"); k++) {
					Property property = new Property();
					property.setValue(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Value"));
					property.setCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Code"));
					property.setName(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Name"));

					properties1.add(property);
				}
				component.setProperties1(properties1);

				components.add(component);
			}
			purchaseSet.setComponents(components);

			List<Property2> properties = new ArrayList<Property2>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties.Length"); j++) {
				Property2 property2 = new Property2();
				property2.setValue(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Value"));
				property2.setCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Code"));
				property2.setName(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Name"));

				properties.add(property2);
			}
			purchaseSet.setProperties(properties);

			purchaseSets.add(purchaseSet);
		}
		opsDescribePurchasesResponse.setPurchaseSets(purchaseSets);
	 
	 	return opsDescribePurchasesResponse;
	}
}