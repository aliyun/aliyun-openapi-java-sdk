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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.DescribeRegionsResponse;
import com.aliyuncs.linkwan.model.v20190301.DescribeRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));

		List<Region> data = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Data.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Data["+ i +"].RegionId"));
			region.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Data["+ i +"].LocalName"));

			data.add(region);
		}
		describeRegionsResponse.setData(data);
	 
	 	return describeRegionsResponse;
	}
}