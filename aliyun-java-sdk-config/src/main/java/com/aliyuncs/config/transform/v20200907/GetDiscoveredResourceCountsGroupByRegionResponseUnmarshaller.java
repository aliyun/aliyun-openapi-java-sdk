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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceCountsGroupByRegionResponse;
import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceCountsGroupByRegionResponse.GroupedResourceCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiscoveredResourceCountsGroupByRegionResponseUnmarshaller {

	public static GetDiscoveredResourceCountsGroupByRegionResponse unmarshall(GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegionResponse, UnmarshallerContext _ctx) {
		
		getDiscoveredResourceCountsGroupByRegionResponse.setRequestId(_ctx.stringValue("GetDiscoveredResourceCountsGroupByRegionResponse.RequestId"));

		List<GroupedResourceCount> discoveredResourceCountsSummary = new ArrayList<GroupedResourceCount>();
		for (int i = 0; i < _ctx.lengthValue("GetDiscoveredResourceCountsGroupByRegionResponse.DiscoveredResourceCountsSummary.Length"); i++) {
			GroupedResourceCount groupedResourceCount = new GroupedResourceCount();
			groupedResourceCount.setResourceCount(_ctx.longValue("GetDiscoveredResourceCountsGroupByRegionResponse.DiscoveredResourceCountsSummary["+ i +"].ResourceCount"));
			groupedResourceCount.setGroupName(_ctx.stringValue("GetDiscoveredResourceCountsGroupByRegionResponse.DiscoveredResourceCountsSummary["+ i +"].GroupName"));
			groupedResourceCount.setRegion(_ctx.stringValue("GetDiscoveredResourceCountsGroupByRegionResponse.DiscoveredResourceCountsSummary["+ i +"].Region"));

			discoveredResourceCountsSummary.add(groupedResourceCount);
		}
		getDiscoveredResourceCountsGroupByRegionResponse.setDiscoveredResourceCountsSummary(discoveredResourceCountsSummary);
	 
	 	return getDiscoveredResourceCountsGroupByRegionResponse;
	}
}