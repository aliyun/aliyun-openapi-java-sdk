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

import com.aliyuncs.resourcemanager.model.v20200331.UpdateResourceGroupResponse;
import com.aliyuncs.resourcemanager.model.v20200331.UpdateResourceGroupResponse.ResourceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResourceGroupResponseUnmarshaller {

	public static UpdateResourceGroupResponse unmarshall(UpdateResourceGroupResponse updateResourceGroupResponse, UnmarshallerContext _ctx) {
		
		updateResourceGroupResponse.setRequestId(_ctx.stringValue("UpdateResourceGroupResponse.RequestId"));

		ResourceGroup resourceGroup = new ResourceGroup();
		resourceGroup.setId(_ctx.stringValue("UpdateResourceGroupResponse.ResourceGroup.Id"));
		resourceGroup.setName(_ctx.stringValue("UpdateResourceGroupResponse.ResourceGroup.Name"));
		resourceGroup.setDisplayName(_ctx.stringValue("UpdateResourceGroupResponse.ResourceGroup.DisplayName"));
		resourceGroup.setCreateDate(_ctx.stringValue("UpdateResourceGroupResponse.ResourceGroup.CreateDate"));
		resourceGroup.setAccountId(_ctx.stringValue("UpdateResourceGroupResponse.ResourceGroup.AccountId"));
		updateResourceGroupResponse.setResourceGroup(resourceGroup);
	 
	 	return updateResourceGroupResponse;
	}
}