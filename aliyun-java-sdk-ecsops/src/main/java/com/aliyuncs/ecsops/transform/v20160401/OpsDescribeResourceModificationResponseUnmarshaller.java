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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceModificationResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceModificationResponse.AvailableZone;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceModificationResponse.AvailableZone.AvailableResource;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceModificationResponse.AvailableZone.AvailableResource.SupportedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceModificationResponseUnmarshaller {

	public static OpsDescribeResourceModificationResponse unmarshall(OpsDescribeResourceModificationResponse opsDescribeResourceModificationResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceModificationResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceModificationResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceModificationResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].Status"));

			List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources.Length"); j++) {
				AvailableResource availableResource = new AvailableResource();
				availableResource.setType(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].Type"));

				List<SupportedResource> supportedResources = new ArrayList<SupportedResource>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources.Length"); k++) {
					SupportedResource supportedResource = new SupportedResource();
					supportedResource.setValue(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Value"));
					supportedResource.setStatus(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Status"));
					supportedResource.setMin(_ctx.integerValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Min"));
					supportedResource.setMax(_ctx.integerValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Max"));
					supportedResource.setUnit(_ctx.stringValue("OpsDescribeResourceModificationResponse.AvailableZones["+ i +"].AvailableResources["+ j +"].SupportedResources["+ k +"].Unit"));

					supportedResources.add(supportedResource);
				}
				availableResource.setSupportedResources(supportedResources);

				availableResources.add(availableResource);
			}
			availableZone.setAvailableResources(availableResources);

			availableZones.add(availableZone);
		}
		opsDescribeResourceModificationResponse.setAvailableZones(availableZones);
	 
	 	return opsDescribeResourceModificationResponse;
	}
}