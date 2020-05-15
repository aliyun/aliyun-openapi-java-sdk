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

import com.aliyuncs.resourcemanager.model.v20200331.ListResourceGroupsResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListResourceGroupsResponse.ResourceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceGroupsResponseUnmarshaller {

	public static ListResourceGroupsResponse unmarshall(ListResourceGroupsResponse listResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		listResourceGroupsResponse.setRequestId(_ctx.stringValue("ListResourceGroupsResponse.RequestId"));
		listResourceGroupsResponse.setPageNumber(_ctx.integerValue("ListResourceGroupsResponse.PageNumber"));
		listResourceGroupsResponse.setPageSize(_ctx.integerValue("ListResourceGroupsResponse.PageSize"));
		listResourceGroupsResponse.setTotalCount(_ctx.integerValue("ListResourceGroupsResponse.TotalCount"));

		List<ResourceGroup> resourceGroups = new ArrayList<ResourceGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceGroupsResponse.ResourceGroups.Length"); i++) {
			ResourceGroup resourceGroup = new ResourceGroup();
			resourceGroup.setId(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Id"));
			resourceGroup.setName(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Name"));
			resourceGroup.setDisplayName(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].DisplayName"));
			resourceGroup.setStatus(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Status"));
			resourceGroup.setCreateDate(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].CreateDate"));
			resourceGroup.setAccountId(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].AccountId"));

			resourceGroups.add(resourceGroup);
		}
		listResourceGroupsResponse.setResourceGroups(resourceGroups);
	 
	 	return listResourceGroupsResponse;
	}
}