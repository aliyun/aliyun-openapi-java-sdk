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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeInstanceTypeResourceResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceTypeResourceResponse.InstanceTypeResource;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceTypeResourceResponse.InstanceTypeResource.StockHealth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypeResourceResponseUnmarshaller {

	public static DescribeInstanceTypeResourceResponse unmarshall(DescribeInstanceTypeResourceResponse describeInstanceTypeResourceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypeResourceResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypeResourceResponse.RequestId"));
		describeInstanceTypeResourceResponse.setTotalCount(_ctx.integerValue("DescribeInstanceTypeResourceResponse.TotalCount"));
		describeInstanceTypeResourceResponse.setPageSize(_ctx.integerValue("DescribeInstanceTypeResourceResponse.PageSize"));
		describeInstanceTypeResourceResponse.setPageNumber(_ctx.integerValue("DescribeInstanceTypeResourceResponse.PageNumber"));

		List<InstanceTypeResource> instanceTypeResources = new ArrayList<InstanceTypeResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources.Length"); i++) {
			InstanceTypeResource instanceTypeResource = new InstanceTypeResource();
			instanceTypeResource.setRegionId(_ctx.stringValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].RegionId"));
			instanceTypeResource.setZoneId(_ctx.stringValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].ZoneId"));
			instanceTypeResource.setInstanceType(_ctx.stringValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].InstanceType"));
			instanceTypeResource.setInstanceTypeFamily(_ctx.stringValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].InstanceTypeFamily"));
			instanceTypeResource.setSearchType(_ctx.stringValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].SearchType"));
			instanceTypeResource.setTotalQuota(_ctx.longValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].TotalQuota"));

			StockHealth stockHealth = new StockHealth();
			stockHealth.setHealthScore(_ctx.integerValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].StockHealth.HealthScore"));
			stockHealth.setAdequacyScore(_ctx.integerValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].StockHealth.AdequacyScore"));
			stockHealth.setSupplyScore(_ctx.integerValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].StockHealth.SupplyScore"));
			stockHealth.setHotScore(_ctx.integerValue("DescribeInstanceTypeResourceResponse.InstanceTypeResources["+ i +"].StockHealth.HotScore"));
			instanceTypeResource.setStockHealth(stockHealth);

			instanceTypeResources.add(instanceTypeResource);
		}
		describeInstanceTypeResourceResponse.setInstanceTypeResources(instanceTypeResources);
	 
	 	return describeInstanceTypeResourceResponse;
	}
}