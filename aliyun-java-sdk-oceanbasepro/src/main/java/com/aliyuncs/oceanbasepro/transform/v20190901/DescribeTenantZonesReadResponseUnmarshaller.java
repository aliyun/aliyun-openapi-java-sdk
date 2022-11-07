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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantZonesReadResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantZonesReadResponse.TenantZonesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantZonesReadResponseUnmarshaller {

	public static DescribeTenantZonesReadResponse unmarshall(DescribeTenantZonesReadResponse describeTenantZonesReadResponse, UnmarshallerContext _ctx) {
		
		describeTenantZonesReadResponse.setRequestId(_ctx.stringValue("DescribeTenantZonesReadResponse.RequestId"));

		List<TenantZonesItem> tenantZones = new ArrayList<TenantZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantZonesReadResponse.TenantZones.Length"); i++) {
			TenantZonesItem tenantZonesItem = new TenantZonesItem();
			tenantZonesItem.setIsElectable(_ctx.booleanValue("DescribeTenantZonesReadResponse.TenantZones["+ i +"].IsElectable"));
			tenantZonesItem.setIsPrimary(_ctx.booleanValue("DescribeTenantZonesReadResponse.TenantZones["+ i +"].IsPrimary"));
			tenantZonesItem.setZone(_ctx.stringValue("DescribeTenantZonesReadResponse.TenantZones["+ i +"].Zone"));
			tenantZonesItem.setIsReadOnlyAddressMaster(_ctx.booleanValue("DescribeTenantZonesReadResponse.TenantZones["+ i +"].IsReadOnlyAddressMaster"));
			tenantZonesItem.setIsReadable(_ctx.stringValue("DescribeTenantZonesReadResponse.TenantZones["+ i +"].IsReadable"));

			tenantZones.add(tenantZonesItem);
		}
		describeTenantZonesReadResponse.setTenantZones(tenantZones);
	 
	 	return describeTenantZonesReadResponse;
	}
}