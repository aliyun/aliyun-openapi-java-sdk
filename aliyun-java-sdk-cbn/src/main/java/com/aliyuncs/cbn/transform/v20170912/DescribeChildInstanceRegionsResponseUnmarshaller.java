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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeChildInstanceRegionsResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeChildInstanceRegionsResponse.Region;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChildInstanceRegionsResponseUnmarshaller {

	public static DescribeChildInstanceRegionsResponse unmarshall(DescribeChildInstanceRegionsResponse describeChildInstanceRegionsResponse, UnmarshallerContext context) {
		
		describeChildInstanceRegionsResponse.setRequestId(context.stringValue("DescribeChildInstanceRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("DescribeChildInstanceRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(context.stringValue("DescribeChildInstanceRegionsResponse.Regions["+ i +"].RegionId"));
			region.setLocalName(context.stringValue("DescribeChildInstanceRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		describeChildInstanceRegionsResponse.setRegions(regions);
	 
	 	return describeChildInstanceRegionsResponse;
	}
}