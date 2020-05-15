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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAvailableResourcesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAvailableResourcesResponse.AvailableZone;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAvailableResourcesResponse.AvailableZone.SupportedEngine;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAvailableResourcesResponse.AvailableZone.SupportedEngine.AvailableResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAvailableResourcesResponseUnmarshaller {

	public static DescribeDBClusterAvailableResourcesResponse unmarshall(DescribeDBClusterAvailableResourcesResponse describeDBClusterAvailableResourcesResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAvailableResourcesResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].ZoneId"));

			List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].AvailableResources.Length"); k++) {
					AvailableResource availableResource = new AvailableResource();
					availableResource.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].AvailableResources["+ k +"].DBNodeClass"));
					availableResource.setCategory(_ctx.stringValue("DescribeDBClusterAvailableResourcesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].AvailableResources["+ k +"].Category"));

					availableResources.add(availableResource);
				}
				supportedEngine.setAvailableResources(availableResources);

				supportedEngines.add(supportedEngine);
			}
			availableZone.setSupportedEngines(supportedEngines);

			availableZones.add(availableZone);
		}
		describeDBClusterAvailableResourcesResponse.setAvailableZones(availableZones);
	 
	 	return describeDBClusterAvailableResourcesResponse;
	}
}