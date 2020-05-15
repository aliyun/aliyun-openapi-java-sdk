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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceGroupResponseUnmarshaller {

	public static GetResourceGroupResponse unmarshall(GetResourceGroupResponse getResourceGroupResponse, UnmarshallerContext _ctx) {
		
		getResourceGroupResponse.setRequestId(_ctx.stringValue("GetResourceGroupResponse.RequestId"));

		ResourceGroup resourceGroup = new ResourceGroup();
		resourceGroup.setId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Id"));
		resourceGroup.setName(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Name"));
		resourceGroup.setDisplayName(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.DisplayName"));
		resourceGroup.setStatus(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.Status"));
		resourceGroup.setCreateDate(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.CreateDate"));
		resourceGroup.setAccountId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.AccountId"));

		List<RegionStatus> regionStatuses = new ArrayList<RegionStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses.Length"); i++) {
			RegionStatus regionStatus = new RegionStatus();
			regionStatus.setRegionId(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].RegionId"));
			regionStatus.setStatus(_ctx.stringValue("GetResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].Status"));

			regionStatuses.add(regionStatus);
		}
		resourceGroup.setRegionStatuses(regionStatuses);
		getResourceGroupResponse.setResourceGroup(resourceGroup);
	 
	 	return getResourceGroupResponse;
	}
}