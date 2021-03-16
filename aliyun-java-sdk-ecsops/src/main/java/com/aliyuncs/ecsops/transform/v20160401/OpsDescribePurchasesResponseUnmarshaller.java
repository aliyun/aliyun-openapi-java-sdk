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
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet.Component.Property2;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePurchasesResponse.PurchaseSet.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribePurchasesResponseUnmarshaller {

	public static OpsDescribePurchasesResponse unmarshall(OpsDescribePurchasesResponse opsDescribePurchasesResponse, UnmarshallerContext _ctx) {
		
		opsDescribePurchasesResponse.setRequestId(_ctx.stringValue("OpsDescribePurchasesResponse.RequestId"));
		opsDescribePurchasesResponse.setTotalCount(_ctx.integerValue("OpsDescribePurchasesResponse.TotalCount"));
		opsDescribePurchasesResponse.setPageNumber(_ctx.integerValue("OpsDescribePurchasesResponse.PageNumber"));
		opsDescribePurchasesResponse.setPageSize(_ctx.integerValue("OpsDescribePurchasesResponse.PageSize"));

		List<PurchaseSet> purchaseSets = new ArrayList<PurchaseSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets.Length"); i++) {
			PurchaseSet purchaseSet = new PurchaseSet();
			purchaseSet.setId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Id"));
			purchaseSet.setUserId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].UserId"));
			purchaseSet.setStartDate(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].StartDate"));
			purchaseSet.setEndDate(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].EndDate"));
			purchaseSet.setStatus(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Status"));
			purchaseSet.setOrderType(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].OrderType"));
			purchaseSet.setOrderId(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].OrderId"));
			purchaseSet.setInstanceId(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].InstanceId"));

			List<Property> properties = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties.Length"); j++) {
				Property property = new Property();
				property.setCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Code"));
				property.setValue(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Value"));
				property.setName(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Properties["+ j +"].Name"));

				properties.add(property);
			}
			purchaseSet.setProperties(properties);

			List<Component> components = new ArrayList<Component>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components.Length"); j++) {
				Component component = new Component();
				component.setComponentCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].ComponentCode"));
				component.setModuleAttrStatus(_ctx.longValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].ModuleAttrStatus"));
				component.setTag(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Tag"));

				List<Property2> properties1 = new ArrayList<Property2>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties.Length"); k++) {
					Property2 property2 = new Property2();
					property2.setCode(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Code"));
					property2.setValue(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Value"));
					property2.setName(_ctx.stringValue("OpsDescribePurchasesResponse.PurchaseSets["+ i +"].Components["+ j +"].Properties["+ k +"].Name"));

					properties1.add(property2);
				}
				component.setProperties1(properties1);

				components.add(component);
			}
			purchaseSet.setComponents(components);

			purchaseSets.add(purchaseSet);
		}
		opsDescribePurchasesResponse.setPurchaseSets(purchaseSets);
	 
	 	return opsDescribePurchasesResponse;
	}
}