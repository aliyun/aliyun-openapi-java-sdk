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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeRegionsResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeRegionsResponse.Region;
import com.aliyuncs.polardbx.model.v20200202.DescribeRegionsResponse.Region.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setCode(_ctx.integerValue("DescribeRegionsResponse.Code"));
		describeRegionsResponse.setErrorCode(_ctx.integerValue("DescribeRegionsResponse.ErrorCode"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));
		describeRegionsResponse.setMessage(_ctx.stringValue("DescribeRegionsResponse.Message"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));
			region.setSupportPolarx20(_ctx.booleanValue("DescribeRegionsResponse.Regions["+ i +"].SupportPolarx20"));
			region.setSupportPolarx10(_ctx.booleanValue("DescribeRegionsResponse.Regions["+ i +"].SupportPolarx10"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionsResponse.Regions["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].ZoneId"));
				zone.setVpcEnabled(_ctx.booleanValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].VpcEnabled"));

				zones.add(zone);
			}
			region.setZones(zones);

			regions.add(region);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}