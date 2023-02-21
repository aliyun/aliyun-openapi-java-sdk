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

package com.aliyuncs.eflo_controller.transform.v20221215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo_controller.model.v20221215.DescribeRegionsResponse;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeRegionsResponse.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<RegionsItem> regions = new ArrayList<RegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			RegionsItem regionsItem = new RegionsItem();
			regionsItem.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].LocalName"));
			regionsItem.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));

			regions.add(regionsItem);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}