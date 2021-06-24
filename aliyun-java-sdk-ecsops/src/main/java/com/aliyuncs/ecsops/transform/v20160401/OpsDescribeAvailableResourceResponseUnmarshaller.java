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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAvailableResourceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAvailableResourceResponse.AvailableZone.AvailableResource;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAvailableResourceResponse.AvailableZone.AvailableResource.SupportedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAvailableResourceResponseUnmarshaller {

	public static OpsDescribeAvailableResourceResponse unmarshall(OpsDescribeAvailableResourceResponse opsDescribeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAvailableResourceResponse.setRequestId(_ctx.stringValue("OpsDescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setStatus(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZone.setZoneId(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatusCategory(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].StatusCategory"));
			availableZone.setRegionId(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));

			List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources.Length"); j++) {
				AvailableResource availableResource = new AvailableResource();
				availableResource.setType(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].Type"));

				List<SupportedResource> supportedResources = new ArrayList<SupportedResource>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources.Length"); k++) {
					SupportedResource supportedResource = new SupportedResource();
					supportedResource.setStatus(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Status"));
					supportedResource.setValue(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Value"));
					supportedResource.setMax(_ctx.integerValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Max"));
					supportedResource.setUnit(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Unit"));
					supportedResource.setStatusCategory(_ctx.stringValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].StatusCategory"));
					supportedResource.setMin(_ctx.integerValue("OpsDescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Min"));

					supportedResources.add(supportedResource);
				}
				availableResource.setSupportedResources(supportedResources);

				availableResources.add(availableResource);
			}
			availableZone.setAvailableResources(availableResources);

			availableZones.add(availableZone);
		}
		opsDescribeAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return opsDescribeAvailableResourceResponse;
	}
}