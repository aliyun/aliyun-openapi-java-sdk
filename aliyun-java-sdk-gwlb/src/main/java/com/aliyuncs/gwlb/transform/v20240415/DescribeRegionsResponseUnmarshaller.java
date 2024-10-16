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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.DescribeRegionsResponse;
import com.aliyuncs.gwlb.model.v20240415.DescribeRegionsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<Data> regions = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Data data = new Data();
			data.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].LocalName"));
			data.setRegionEndpoint(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			data.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));

			regions.add(data);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}