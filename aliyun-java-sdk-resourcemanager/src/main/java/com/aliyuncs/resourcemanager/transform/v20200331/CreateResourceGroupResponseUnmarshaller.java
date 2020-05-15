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

import com.aliyuncs.resourcemanager.model.v20200331.CreateResourceGroupResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CreateResourceGroupResponse.ResourceGroup;
import com.aliyuncs.resourcemanager.model.v20200331.CreateResourceGroupResponse.ResourceGroup.RegionStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResourceGroupResponseUnmarshaller {

	public static CreateResourceGroupResponse unmarshall(CreateResourceGroupResponse createResourceGroupResponse, UnmarshallerContext _ctx) {
		
		createResourceGroupResponse.setRequestId(_ctx.stringValue("CreateResourceGroupResponse.RequestId"));

		ResourceGroup resourceGroup = new ResourceGroup();
		resourceGroup.setId(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.Id"));
		resourceGroup.setName(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.Name"));
		resourceGroup.setDisplayName(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.DisplayName"));
		resourceGroup.setStatus(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.Status"));
		resourceGroup.setCreateDate(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.CreateDate"));
		resourceGroup.setAccountId(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.AccountId"));

		List<RegionStatus> regionStatuses = new ArrayList<RegionStatus>();
		for (int i = 0; i < _ctx.lengthValue("CreateResourceGroupResponse.ResourceGroup.RegionStatuses.Length"); i++) {
			RegionStatus regionStatus = new RegionStatus();
			regionStatus.setRegionId(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].RegionId"));
			regionStatus.setStatus(_ctx.stringValue("CreateResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].Status"));

			regionStatuses.add(regionStatus);
		}
		resourceGroup.setRegionStatuses(regionStatuses);
		createResourceGroupResponse.setResourceGroup(resourceGroup);
	 
	 	return createResourceGroupResponse;
	}
}