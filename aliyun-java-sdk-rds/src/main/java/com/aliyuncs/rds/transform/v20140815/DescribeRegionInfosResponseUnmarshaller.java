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

import com.aliyuncs.rds.model.v20140815.DescribeRegionInfosResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionInfosResponse.RDSRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionInfosResponseUnmarshaller {

	public static DescribeRegionInfosResponse unmarshall(DescribeRegionInfosResponse describeRegionInfosResponse, UnmarshallerContext _ctx) {
		
		describeRegionInfosResponse.setRequestId(_ctx.stringValue("DescribeRegionInfosResponse.RequestId"));

		List<RDSRegion> regions = new ArrayList<RDSRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionInfosResponse.Regions.Length"); i++) {
			RDSRegion rDSRegion = new RDSRegion();
			rDSRegion.setRegionId(_ctx.stringValue("DescribeRegionInfosResponse.Regions["+ i +"].RegionId"));

			regions.add(rDSRegion);
		}
		describeRegionInfosResponse.setRegions(regions);
	 
	 	return describeRegionInfosResponse;
	}
}