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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse.DdsRegion;
import com.aliyuncs.dds.model.v20151201.DescribeRegionsResponse.DdsRegion.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<DdsRegion> regions = new ArrayList<DdsRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			DdsRegion ddsRegion = new DdsRegion();
			ddsRegion.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));
			ddsRegion.setZoneIds(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].ZoneIds"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionsResponse.Regions["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].ZoneId"));
				zone.setVpcEnabled(_ctx.booleanValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].VpcEnabled"));
				zone.setZoneName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].ZoneName"));

				zones.add(zone);
			}
			ddsRegion.setZones(zones);

			regions.add(ddsRegion);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}