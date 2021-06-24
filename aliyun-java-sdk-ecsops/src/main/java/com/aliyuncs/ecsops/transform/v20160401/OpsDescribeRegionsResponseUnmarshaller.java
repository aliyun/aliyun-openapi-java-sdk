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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRegionsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeRegionsResponseUnmarshaller {

	public static OpsDescribeRegionsResponse unmarshall(OpsDescribeRegionsResponse opsDescribeRegionsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeRegionsResponse.setRequestId(_ctx.stringValue("OpsDescribeRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setStatus(_ctx.stringValue("OpsDescribeRegionsResponse.Regions["+ i +"].Status"));
			region.setLocalName(_ctx.stringValue("OpsDescribeRegionsResponse.Regions["+ i +"].LocalName"));
			region.setRegionEndpoint(_ctx.stringValue("OpsDescribeRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			region.setRegionId(_ctx.stringValue("OpsDescribeRegionsResponse.Regions["+ i +"].RegionId"));

			regions.add(region);
		}
		opsDescribeRegionsResponse.setRegions(regions);
	 
	 	return opsDescribeRegionsResponse;
	}
}