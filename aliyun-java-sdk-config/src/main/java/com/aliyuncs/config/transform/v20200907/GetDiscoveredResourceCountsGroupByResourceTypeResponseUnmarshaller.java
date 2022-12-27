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

import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceCountsGroupByResourceTypeResponse;
import com.aliyuncs.config.model.v20200907.GetDiscoveredResourceCountsGroupByResourceTypeResponse.GroupedResourceCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiscoveredResourceCountsGroupByResourceTypeResponseUnmarshaller {

	public static GetDiscoveredResourceCountsGroupByResourceTypeResponse unmarshall(GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceTypeResponse, UnmarshallerContext _ctx) {
		
		getDiscoveredResourceCountsGroupByResourceTypeResponse.setRequestId(_ctx.stringValue("GetDiscoveredResourceCountsGroupByResourceTypeResponse.RequestId"));

		List<GroupedResourceCount> discoveredResourceCountsSummary = new ArrayList<GroupedResourceCount>();
		for (int i = 0; i < _ctx.lengthValue("GetDiscoveredResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary.Length"); i++) {
			GroupedResourceCount groupedResourceCount = new GroupedResourceCount();
			groupedResourceCount.setResourceCount(_ctx.longValue("GetDiscoveredResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].ResourceCount"));
			groupedResourceCount.setGroupName(_ctx.stringValue("GetDiscoveredResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].GroupName"));
			groupedResourceCount.setResourceType(_ctx.stringValue("GetDiscoveredResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].ResourceType"));

			discoveredResourceCountsSummary.add(groupedResourceCount);
		}
		getDiscoveredResourceCountsGroupByResourceTypeResponse.setDiscoveredResourceCountsSummary(discoveredResourceCountsSummary);
	 
	 	return getDiscoveredResourceCountsGroupByResourceTypeResponse;
	}
}