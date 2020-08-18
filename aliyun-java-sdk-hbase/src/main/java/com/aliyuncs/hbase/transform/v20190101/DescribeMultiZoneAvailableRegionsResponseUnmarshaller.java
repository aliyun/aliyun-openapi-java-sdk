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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableRegionsResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableRegionsResponse.Region;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableRegionsResponse.Region.AvailableCombine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMultiZoneAvailableRegionsResponseUnmarshaller {

	public static DescribeMultiZoneAvailableRegionsResponse unmarshall(DescribeMultiZoneAvailableRegionsResponse describeMultiZoneAvailableRegionsResponse, UnmarshallerContext _ctx) {
		
		describeMultiZoneAvailableRegionsResponse.setRequestId(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMultiZoneAvailableRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setLocalName(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].LocalName"));
			region.setRegionEndpoint(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			region.setRegionId(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].RegionId"));

			List<AvailableCombine> availableCombines = new ArrayList<AvailableCombine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].AvailableCombines.Length"); j++) {
				AvailableCombine availableCombine = new AvailableCombine();
				availableCombine.setId(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].AvailableCombines["+ j +"].Id"));

				List<String> zones = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].AvailableCombines["+ j +"].Zones.Length"); k++) {
					zones.add(_ctx.stringValue("DescribeMultiZoneAvailableRegionsResponse.Regions["+ i +"].AvailableCombines["+ j +"].Zones["+ k +"]"));
				}
				availableCombine.setZones(zones);

				availableCombines.add(availableCombine);
			}
			region.setAvailableCombines(availableCombines);

			regions.add(region);
		}
		describeMultiZoneAvailableRegionsResponse.setRegions(regions);
	 
	 	return describeMultiZoneAvailableRegionsResponse;
	}
}