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

import com.aliyuncs.config.model.v20200907.ListDiscoveredResourcesResponse;
import com.aliyuncs.config.model.v20200907.ListDiscoveredResourcesResponse.DiscoveredResourceProfiles;
import com.aliyuncs.config.model.v20200907.ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiscoveredResourcesResponseUnmarshaller {

	public static ListDiscoveredResourcesResponse unmarshall(ListDiscoveredResourcesResponse listDiscoveredResourcesResponse, UnmarshallerContext _ctx) {
		
		listDiscoveredResourcesResponse.setRequestId(_ctx.stringValue("ListDiscoveredResourcesResponse.RequestId"));

		DiscoveredResourceProfiles discoveredResourceProfiles = new DiscoveredResourceProfiles();
		discoveredResourceProfiles.setNextToken(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.NextToken"));
		discoveredResourceProfiles.setMaxResults(_ctx.integerValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.MaxResults"));
		discoveredResourceProfiles.setTotalCount(_ctx.integerValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.TotalCount"));

		List<DiscoveredResourceProfile> discoveredResourceProfileList = new ArrayList<DiscoveredResourceProfile>();
		for (int i = 0; i < _ctx.lengthValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList.Length"); i++) {
			DiscoveredResourceProfile discoveredResourceProfile = new DiscoveredResourceProfile();
			discoveredResourceProfile.setResourceType(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceType"));
			discoveredResourceProfile.setRegion(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].Region"));
			discoveredResourceProfile.setResourceCreationTime(_ctx.longValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceCreationTime"));
			discoveredResourceProfile.setTags(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].Tags"));
			discoveredResourceProfile.setAccountId(_ctx.longValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].AccountId"));
			discoveredResourceProfile.setResourceId(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceId"));
			discoveredResourceProfile.setResourceName(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceName"));
			discoveredResourceProfile.setResourceDeleted(_ctx.integerValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceDeleted"));
			discoveredResourceProfile.setResourceStatus(_ctx.stringValue("ListDiscoveredResourcesResponse.DiscoveredResourceProfiles.DiscoveredResourceProfileList["+ i +"].ResourceStatus"));

			discoveredResourceProfileList.add(discoveredResourceProfile);
		}
		discoveredResourceProfiles.setDiscoveredResourceProfileList(discoveredResourceProfileList);
		listDiscoveredResourcesResponse.setDiscoveredResourceProfiles(discoveredResourceProfiles);
	 
	 	return listDiscoveredResourcesResponse;
	}
}