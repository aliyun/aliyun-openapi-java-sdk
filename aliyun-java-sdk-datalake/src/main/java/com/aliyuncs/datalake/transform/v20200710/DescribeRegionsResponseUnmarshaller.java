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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.DescribeRegionsResponse;
import com.aliyuncs.datalake.model.v20200710.DescribeRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Name"));
			region.setDescription(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Description"));
			region.setShowName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].ShowName"));
			region.setType(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Type"));

			regions.add(region);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}