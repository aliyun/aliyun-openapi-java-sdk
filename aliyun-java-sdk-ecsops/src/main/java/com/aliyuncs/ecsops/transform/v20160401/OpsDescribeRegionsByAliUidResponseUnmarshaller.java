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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRegionsByAliUidResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRegionsByAliUidResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeRegionsByAliUidResponseUnmarshaller {

	public static OpsDescribeRegionsByAliUidResponse unmarshall(OpsDescribeRegionsByAliUidResponse opsDescribeRegionsByAliUidResponse, UnmarshallerContext _ctx) {
		
		opsDescribeRegionsByAliUidResponse.setRequestId(_ctx.stringValue("OpsDescribeRegionsByAliUidResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeRegionsByAliUidResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setStatus(_ctx.stringValue("OpsDescribeRegionsByAliUidResponse.Regions["+ i +"].Status"));
			region.setLocalName(_ctx.stringValue("OpsDescribeRegionsByAliUidResponse.Regions["+ i +"].LocalName"));
			region.setRegionEndpoint(_ctx.stringValue("OpsDescribeRegionsByAliUidResponse.Regions["+ i +"].RegionEndpoint"));
			region.setRegionId(_ctx.stringValue("OpsDescribeRegionsByAliUidResponse.Regions["+ i +"].RegionId"));

			regions.add(region);
		}
		opsDescribeRegionsByAliUidResponse.setRegions(regions);
	 
	 	return opsDescribeRegionsByAliUidResponse;
	}
}