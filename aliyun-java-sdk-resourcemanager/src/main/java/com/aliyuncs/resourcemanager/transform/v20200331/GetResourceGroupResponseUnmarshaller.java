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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.GetResourceGroupResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetResourceGroupResponse.ResourceGroup;
import com.aliyuncs.resourcemanager.model.v20200331.GetResourceGroupResponse.ResourceGroup.RegionStatus;
import com.aliyuncs.resourcemanager.model.v20200331.GetResourceGroupResponse.ResourceGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceGroupResponseUnmarshaller {

	public static GetResourceGroupResponse unmarshall(GetResourceGroupResponse getResourceGroupResponse, UnmarshallerContext _ctx) {
		
		getResourceGroupResponse.setRequestId(_ctx.stringValue("GetResourceGroupResponse.RequestId"));

		ResourceGroup resourceGroup = new ResourceGroup();
		resourceGroup.setDisplayName(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.DisplayName"));
		resourceGroup.setStatus(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Status"));
		resourceGroup.setAccountId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.AccountId"));
		resourceGroup.setName(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Name"));
		resourceGroup.setCreateDate(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.CreateDate"));
		resourceGroup.setId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Id"));

		List<RegionStatus> regionStatuses = new ArrayList<RegionStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses.Length"); i++) {
			RegionStatus regionStatus = new RegionStatus();
			regionStatus.setStatus(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].Status"));
			regionStatus.setRegionId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].RegionId"));

			regionStatuses.add(regionStatus);
		}
		resourceGroup.setRegionStatuses(regionStatuses);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceGroupResponse.ResourceGroup.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		resourceGroup.setTags(tags);
		getResourceGroupResponse.setResourceGroup(resourceGroup);
	 
	 	return getResourceGroupResponse;
	}
}