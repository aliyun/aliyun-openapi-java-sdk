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

import com.aliyuncs.config.model.v20200907.GetAggregateResourceCountsGroupByResourceTypeResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceCountsGroupByResourceTypeResponse.GroupedResourceCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateResourceCountsGroupByResourceTypeResponseUnmarshaller {

	public static GetAggregateResourceCountsGroupByResourceTypeResponse unmarshall(GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceTypeResponse, UnmarshallerContext _ctx) {
		
		getAggregateResourceCountsGroupByResourceTypeResponse.setRequestId(_ctx.stringValue("GetAggregateResourceCountsGroupByResourceTypeResponse.RequestId"));

		List<GroupedResourceCount> discoveredResourceCountsSummary = new ArrayList<GroupedResourceCount>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary.Length"); i++) {
			GroupedResourceCount groupedResourceCount = new GroupedResourceCount();
			groupedResourceCount.setResourceCount(_ctx.longValue("GetAggregateResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].ResourceCount"));
			groupedResourceCount.setGroupName(_ctx.stringValue("GetAggregateResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].GroupName"));
			groupedResourceCount.setResourceType(_ctx.stringValue("GetAggregateResourceCountsGroupByResourceTypeResponse.DiscoveredResourceCountsSummary["+ i +"].ResourceType"));

			discoveredResourceCountsSummary.add(groupedResourceCount);
		}
		getAggregateResourceCountsGroupByResourceTypeResponse.setDiscoveredResourceCountsSummary(discoveredResourceCountsSummary);
	 
	 	return getAggregateResourceCountsGroupByResourceTypeResponse;
	}
}