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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCAvailableResourceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCAvailableResourceResponse.AvailableZonesItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCAvailableResourceResponse.AvailableZonesItem.AvailableResourcesItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCAvailableResourceResponse.AvailableZonesItem.AvailableResourcesItem.SupportedResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCAvailableResourceResponseUnmarshaller {

	public static DescribeRCAvailableResourceResponse unmarshall(DescribeRCAvailableResourceResponse describeRCAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeRCAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeRCAvailableResourceResponse.RequestId"));

		List<AvailableZonesItem> availableZones = new ArrayList<AvailableZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZonesItem availableZonesItem = new AvailableZonesItem();
			availableZonesItem.setStatus(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZonesItem.setStatusCategory(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].StatusCategory"));
			availableZonesItem.setZoneId(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZonesItem.setRegionId(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));

			List<AvailableResourcesItem> availableResources = new ArrayList<AvailableResourcesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources.Length"); j++) {
				AvailableResourcesItem availableResourcesItem = new AvailableResourcesItem();
				availableResourcesItem.setType(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].Type"));

				List<SupportedResourcesItem> supportedResources = new ArrayList<SupportedResourcesItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources.Length"); k++) {
					SupportedResourcesItem supportedResourcesItem = new SupportedResourcesItem();
					supportedResourcesItem.setStatus(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Status"));
					supportedResourcesItem.setStatusCategory(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].StatusCategory"));
					supportedResourcesItem.setMin(_ctx.integerValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Min"));
					supportedResourcesItem.setMax(_ctx.integerValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Max"));
					supportedResourcesItem.setValue(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Value"));
					supportedResourcesItem.setQuotaStatus(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].QuotaStatus"));
					supportedResourcesItem.setUnit(_ctx.stringValue("DescribeRCAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Unit"));

					supportedResources.add(supportedResourcesItem);
				}
				availableResourcesItem.setSupportedResources(supportedResources);

				availableResources.add(availableResourcesItem);
			}
			availableZonesItem.setAvailableResources(availableResources);

			availableZones.add(availableZonesItem);
		}
		describeRCAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeRCAvailableResourceResponse;
	}
}