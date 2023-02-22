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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListInstanceCatalogResponse;
import com.aliyuncs.sas.model.v20181203.ListInstanceCatalogResponse.VendorsItem;
import com.aliyuncs.sas.model.v20181203.ListInstanceCatalogResponse.VendorsItem.InstanceTypesItem;
import com.aliyuncs.sas.model.v20181203.ListInstanceCatalogResponse.VendorsItem.InstanceTypesItem.InstanceSubTypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceCatalogResponseUnmarshaller {

	public static ListInstanceCatalogResponse unmarshall(ListInstanceCatalogResponse listInstanceCatalogResponse, UnmarshallerContext _ctx) {
		
		listInstanceCatalogResponse.setRequestId(_ctx.stringValue("ListInstanceCatalogResponse.RequestId"));

		List<VendorsItem> vendors = new ArrayList<VendorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceCatalogResponse.Vendors.Length"); i++) {
			VendorsItem vendorsItem = new VendorsItem();
			vendorsItem.setName(_ctx.stringValue("ListInstanceCatalogResponse.Vendors["+ i +"].Name"));

			List<InstanceTypesItem> instanceTypes = new ArrayList<InstanceTypesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceCatalogResponse.Vendors["+ i +"].InstanceTypes.Length"); j++) {
				InstanceTypesItem instanceTypesItem = new InstanceTypesItem();
				instanceTypesItem.setName(_ctx.stringValue("ListInstanceCatalogResponse.Vendors["+ i +"].InstanceTypes["+ j +"].Name"));

				List<InstanceSubTypesItem> instanceSubTypes = new ArrayList<InstanceSubTypesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListInstanceCatalogResponse.Vendors["+ i +"].InstanceTypes["+ j +"].InstanceSubTypes.Length"); k++) {
					InstanceSubTypesItem instanceSubTypesItem = new InstanceSubTypesItem();
					instanceSubTypesItem.setName(_ctx.stringValue("ListInstanceCatalogResponse.Vendors["+ i +"].InstanceTypes["+ j +"].InstanceSubTypes["+ k +"].Name"));

					instanceSubTypes.add(instanceSubTypesItem);
				}
				instanceTypesItem.setInstanceSubTypes(instanceSubTypes);

				instanceTypes.add(instanceTypesItem);
			}
			vendorsItem.setInstanceTypes(instanceTypes);

			vendors.add(vendorsItem);
		}
		listInstanceCatalogResponse.setVendors(vendors);
	 
	 	return listInstanceCatalogResponse;
	}
}