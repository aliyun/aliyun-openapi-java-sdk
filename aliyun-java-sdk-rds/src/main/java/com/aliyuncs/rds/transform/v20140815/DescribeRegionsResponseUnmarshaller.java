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

import com.aliyuncs.rds.model.v20140815.DescribeRegionsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsResponse.RDSRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<RDSRegion> regions = new ArrayList<RDSRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			RDSRegion rDSRegion = new RDSRegion();
			rDSRegion.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].LocalName"));
			rDSRegion.setRegionEndpoint(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			rDSRegion.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));
			rDSRegion.setZoneId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].ZoneId"));
			rDSRegion.setZoneName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].ZoneName"));

			regions.add(rDSRegion);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}