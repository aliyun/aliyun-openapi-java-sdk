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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.DescribeRegionsResponse;
import com.aliyuncs.imm.model.v20170906.DescribeRegionsResponse.Regions;
import com.aliyuncs.imm.model.v20170906.DescribeRegionsResponse.Regions.RegionItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

		Regions regions = new Regions();

		List<RegionItem> region = new ArrayList<RegionItem>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.Regions.Region.Length"); i++) {
			RegionItem regionItem = new RegionItem();
			regionItem.setRegionId(context.stringValue("DescribeRegionsResponse.Regions.Region["+ i +"].RegionId"));

			List<String> projectTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeRegionsResponse.Regions.Region["+ i +"].ProjectTypes.Length"); j++) {
				projectTypes.add(context.stringValue("DescribeRegionsResponse.Regions.Region["+ i +"].ProjectTypes["+ j +"]"));
			}
			regionItem.setProjectTypes(projectTypes);

			region.add(regionItem);
		}
		regions.setRegion(region);
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}