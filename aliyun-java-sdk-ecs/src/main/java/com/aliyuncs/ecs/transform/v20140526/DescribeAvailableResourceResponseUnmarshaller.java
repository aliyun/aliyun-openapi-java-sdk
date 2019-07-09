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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse.AvailableZone.AvailableResource;
import com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse.AvailableZone.AvailableResource.SupportedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZone.setStatusCategory(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].StatusCategory"));

			List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources.Length"); j++) {
				AvailableResource availableResource = new AvailableResource();
				availableResource.setType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].Type"));

				List<SupportedResource> supportedResources = new ArrayList<SupportedResource>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources.Length"); k++) {
					SupportedResource supportedResource = new SupportedResource();
					supportedResource.setValue(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Value"));
					supportedResource.setStatus(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Status"));
					supportedResource.setStatusCategory(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].StatusCategory"));
					supportedResource.setMin(_ctx.integerValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Min"));
					supportedResource.setMax(_ctx.integerValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Max"));
					supportedResource.setUnit(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Unit"));

					supportedResources.add(supportedResource);
				}
				availableResource.setSupportedResources(supportedResources);

				availableResources.add(availableResource);
			}
			availableZone.setAvailableResources(availableResources);

			availableZones.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailableResourceResponse;
	}
}