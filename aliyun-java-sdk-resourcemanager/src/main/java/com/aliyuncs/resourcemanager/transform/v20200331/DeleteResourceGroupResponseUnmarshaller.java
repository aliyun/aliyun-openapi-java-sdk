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

import com.aliyuncs.resourcemanager.model.v20200331.DeleteResourceGroupResponse;
import com.aliyuncs.resourcemanager.model.v20200331.DeleteResourceGroupResponse.ResourceGroup;
import com.aliyuncs.resourcemanager.model.v20200331.DeleteResourceGroupResponse.ResourceGroup.RegionStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResourceGroupResponseUnmarshaller {

	public static DeleteResourceGroupResponse unmarshall(DeleteResourceGroupResponse deleteResourceGroupResponse, UnmarshallerContext _ctx) {
		
		deleteResourceGroupResponse.setRequestId(_ctx.stringValue("DeleteResourceGroupResponse.RequestId"));

		ResourceGroup resourceGroup = new ResourceGroup();
		resourceGroup.setId(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.Id"));
		resourceGroup.setName(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.Name"));
		resourceGroup.setDisplayName(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.DisplayName"));
		resourceGroup.setStatus(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.Status"));
		resourceGroup.setCreateDate(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.CreateDate"));
		resourceGroup.setAccountId(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.AccountId"));

		List<RegionStatus> regionStatuses = new ArrayList<RegionStatus>();
		for (int i = 0; i < _ctx.lengthValue("DeleteResourceGroupResponse.ResourceGroup.RegionStatuses.Length"); i++) {
			RegionStatus regionStatus = new RegionStatus();
			regionStatus.setRegionId(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].RegionId"));
			regionStatus.setStatus(_ctx.stringValue("DeleteResourceGroupResponse.ResourceGroup.RegionStatuses["+ i +"].Status"));

			regionStatuses.add(regionStatus);
		}
		resourceGroup.setRegionStatuses(regionStatuses);
		deleteResourceGroupResponse.setResourceGroup(resourceGroup);
	 
	 	return deleteResourceGroupResponse;
	}
}