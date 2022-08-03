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
import com.aliyuncs.resourcemanager.model.v20200331.ListResourceGroupsResponse.ResourceGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceGroupsResponseUnmarshaller {

	public static ListResourceGroupsResponse unmarshall(ListResourceGroupsResponse listResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		listResourceGroupsResponse.setRequestId(_ctx.stringValue("ListResourceGroupsResponse.RequestId"));
		listResourceGroupsResponse.setTotalCount(_ctx.integerValue("ListResourceGroupsResponse.TotalCount"));
		listResourceGroupsResponse.setPageSize(_ctx.integerValue("ListResourceGroupsResponse.PageSize"));
		listResourceGroupsResponse.setPageNumber(_ctx.integerValue("ListResourceGroupsResponse.PageNumber"));
		listResourceGroupsResponse.setResourceGroupListAclMode(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroupListAclMode"));

		List<ResourceGroup> resourceGroups = new ArrayList<ResourceGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceGroupsResponse.ResourceGroups.Length"); i++) {
			ResourceGroup resourceGroup = new ResourceGroup();
			resourceGroup.setDisplayName(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].DisplayName"));
			resourceGroup.setStatus(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Status"));
			resourceGroup.setAccountId(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].AccountId"));
			resourceGroup.setName(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Name"));
			resourceGroup.setCreateDate(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].CreateDate"));
			resourceGroup.setId(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Id"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListResourceGroupsResponse.ResourceGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			resourceGroup.setTags(tags);

			resourceGroups.add(resourceGroup);
		}
		listResourceGroupsResponse.setResourceGroups(resourceGroups);
	 
	 	return listResourceGroupsResponse;
	}
}