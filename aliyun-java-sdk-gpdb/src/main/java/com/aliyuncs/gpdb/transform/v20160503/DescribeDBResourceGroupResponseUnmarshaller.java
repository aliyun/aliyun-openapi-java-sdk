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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBResourceGroupResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBResourceGroupResponse.ResourceGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBResourceGroupResponseUnmarshaller {

	public static DescribeDBResourceGroupResponse unmarshall(DescribeDBResourceGroupResponse describeDBResourceGroupResponse, UnmarshallerContext _ctx) {
		
		describeDBResourceGroupResponse.setRequestId(_ctx.stringValue("DescribeDBResourceGroupResponse.RequestId"));

		List<ResourceGroupItem> resourceGroupItems = new ArrayList<ResourceGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBResourceGroupResponse.ResourceGroupItems.Length"); i++) {
			ResourceGroupItem resourceGroupItem = new ResourceGroupItem();
			resourceGroupItem.setResourceGroupName(_ctx.stringValue("DescribeDBResourceGroupResponse.ResourceGroupItems["+ i +"].ResourceGroupName"));
			resourceGroupItem.setResourceGroupConfig(_ctx.stringValue("DescribeDBResourceGroupResponse.ResourceGroupItems["+ i +"].ResourceGroupConfig"));

			List<String> roleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBResourceGroupResponse.ResourceGroupItems["+ i +"].RoleList.Length"); j++) {
				roleList.add(_ctx.stringValue("DescribeDBResourceGroupResponse.ResourceGroupItems["+ i +"].RoleList["+ j +"]"));
			}
			resourceGroupItem.setRoleList(roleList);

			resourceGroupItems.add(resourceGroupItem);
		}
		describeDBResourceGroupResponse.setResourceGroupItems(resourceGroupItems);
	 
	 	return describeDBResourceGroupResponse;
	}
}