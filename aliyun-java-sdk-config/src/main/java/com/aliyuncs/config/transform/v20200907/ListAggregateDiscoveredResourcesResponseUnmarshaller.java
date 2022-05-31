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

import com.aliyuncs.config.model.v20200907.ListAggregateDiscoveredResourcesResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles;
import com.aliyuncs.config.model.v20200907.ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateDiscoveredResourcesResponseUnmarshaller {

	public static ListAggregateDiscoveredResourcesResponse unmarshall(ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResourcesResponse, UnmarshallerContext _ctx) {
		
		listAggregateDiscoveredResourcesResponse.setRequestId(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.RequestId"));

		DiscoveredResourceProfiles discoveredResourceProfiles = new DiscoveredResourceProfiles();
		discoveredResourceProfiles.setNextToken(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.NextToken"));
		discoveredResourceProfiles.setMaxResults(_ctx.integerValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.MaxResults"));
		discoveredResourceProfiles.setTotalCount(_ctx.integerValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.TotalCount"));

		List<DiscoveredResourceProfile> discoveredResourceProfileList = new ArrayList<DiscoveredResourceProfile>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList.Length"); i++) {
			DiscoveredResourceProfile discoveredResourceProfile = new DiscoveredResourceProfile();
			discoveredResourceProfile.setResourceType(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceType"));
			discoveredResourceProfile.setRegion(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].Region"));
			discoveredResourceProfile.setResourceCreationTime(_ctx.longValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceCreationTime"));
			discoveredResourceProfile.setTags(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].Tags"));
			discoveredResourceProfile.setAccountId(_ctx.longValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].AccountId"));
			discoveredResourceProfile.setResourceId(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceId"));
			discoveredResourceProfile.setResourceName(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceName"));
			discoveredResourceProfile.setResourceDeleted(_ctx.integerValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceDeleted"));
			discoveredResourceProfile.setResourceStatus(_ctx.stringValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceStatus"));
			discoveredResourceProfile.setResourceOwnerId(_ctx.longValue("ListAggregateDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceOwnerId"));

			discoveredResourceProfileList.add(discoveredResourceProfile);
		}
		discoveredResourceProfiles.setDiscoveredResourceProfileList(discoveredResourceProfileList);
		listAggregateDiscoveredResourcesResponse.setDiscoveredResourceProfiles(discoveredResourceProfiles);
	 
	 	return listAggregateDiscoveredResourcesResponse;
	}
}