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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryHouyiZoneInventoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryHouyiZoneInventoryResponse.ProductResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryHouyiZoneInventoryResponseUnmarshaller {

	public static OpsQueryHouyiZoneInventoryResponse unmarshall(OpsQueryHouyiZoneInventoryResponse opsQueryHouyiZoneInventoryResponse, UnmarshallerContext _ctx) {
		
		opsQueryHouyiZoneInventoryResponse.setHouyiZoneNo(_ctx.stringValue("OpsQueryHouyiZoneInventoryResponse.HouyiZoneNo"));

		List<ProductResource> productResources = new ArrayList<ProductResource>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryHouyiZoneInventoryResponse.ProductResources.Length"); i++) {
			ProductResource productResource = new ProductResource();
			productResource.setIoOptimized(_ctx.longValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].IoOptimized"));
			productResource.setResourceType(_ctx.integerValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].ResourceType"));
			productResource.setVendibleAmount(_ctx.longValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].VendibleAmount"));
			productResource.setPayType(_ctx.stringValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].PayType"));
			productResource.setTotalAmount(_ctx.longValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].TotalAmount"));
			productResource.setNetworkType(_ctx.stringValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].NetworkType"));
			productResource.setInstanceType(_ctx.stringValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].InstanceType"));
			productResource.setBizType(_ctx.stringValue("OpsQueryHouyiZoneInventoryResponse.ProductResources["+ i +"].BizType"));

			productResources.add(productResource);
		}
		opsQueryHouyiZoneInventoryResponse.setProductResources(productResources);
	 
	 	return opsQueryHouyiZoneInventoryResponse;
	}
}