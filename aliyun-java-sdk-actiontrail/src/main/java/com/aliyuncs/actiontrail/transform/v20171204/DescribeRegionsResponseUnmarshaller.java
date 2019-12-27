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

package com.aliyuncs.actiontrail.transform.v20171204;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20171204.DescribeRegionsResponse;
import com.aliyuncs.actiontrail.model.v20171204.DescribeRegionsResponse.Regions;
import com.aliyuncs.actiontrail.model.v20171204.DescribeRegionsResponse.Regions.RegionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		Regions regions = new Regions();

		List<RegionItem> region = new ArrayList<RegionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Region.Length"); i++) {
			RegionItem regionItem = new RegionItem();
			regionItem.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions.Region["+ i +"].RegionId"));

			region.add(regionItem);
		}
		regions.setRegion(region);
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}