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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeResourceGroupsResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeResourceGroupsResponse.ResourceGroupItem;
import com.aliyuncs.eds_user.model.v20210308.DescribeResourceGroupsResponse.ResourceGroupItem.Policy;
import com.aliyuncs.eds_user.model.v20210308.DescribeResourceGroupsResponse.ResourceGroupItem.Timer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceGroupsResponseUnmarshaller {

	public static DescribeResourceGroupsResponse unmarshall(DescribeResourceGroupsResponse describeResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		describeResourceGroupsResponse.setRequestId(_ctx.stringValue("DescribeResourceGroupsResponse.RequestId"));
		describeResourceGroupsResponse.setTotalCount(_ctx.stringValue("DescribeResourceGroupsResponse.TotalCount"));

		List<ResourceGroupItem> resourceGroup = new ArrayList<ResourceGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceGroupsResponse.ResourceGroup.Length"); i++) {
			ResourceGroupItem resourceGroupItem = new ResourceGroupItem();
			resourceGroupItem.setResourceGroupId(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].ResourceGroupId"));
			resourceGroupItem.setResourceGroupName(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].ResourceGroupName"));
			resourceGroupItem.setResourceCount(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].ResourceCount"));
			resourceGroupItem.setAuthCount(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].AuthCount"));
			resourceGroupItem.setCreateTime(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].CreateTime"));

			List<Policy> policies = new ArrayList<Policy>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Policies.Length"); j++) {
				Policy policy = new Policy();
				policy.setId(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Policies["+ j +"].Id"));
				policy.setName(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Policies["+ j +"].Name"));
				policy.setIsDefault(_ctx.booleanValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Policies["+ j +"].IsDefault"));

				policies.add(policy);
			}
			resourceGroupItem.setPolicies(policies);

			List<Timer> timers = new ArrayList<Timer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Timers.Length"); j++) {
				Timer timer = new Timer();
				timer.setId(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Timers["+ j +"].Id"));
				timer.setName(_ctx.stringValue("DescribeResourceGroupsResponse.ResourceGroup["+ i +"].Timers["+ j +"].Name"));

				timers.add(timer);
			}
			resourceGroupItem.setTimers(timers);

			resourceGroup.add(resourceGroupItem);
		}
		describeResourceGroupsResponse.setResourceGroup(resourceGroup);
	 
	 	return describeResourceGroupsResponse;
	}
}