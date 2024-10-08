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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountResourceGroupsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountResourceGroupsResponse.ResourceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiAccountResourceGroupsResponseUnmarshaller {

	public static ListMultiAccountResourceGroupsResponse unmarshall(ListMultiAccountResourceGroupsResponse listMultiAccountResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		listMultiAccountResourceGroupsResponse.setRequestId(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.RequestId"));
		listMultiAccountResourceGroupsResponse.setDynamicCode(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.DynamicCode"));
		listMultiAccountResourceGroupsResponse.setDynamicMessage(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.DynamicMessage"));
		listMultiAccountResourceGroupsResponse.setErrorCode(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ErrorCode"));
		listMultiAccountResourceGroupsResponse.setErrorMessage(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ErrorMessage"));
		listMultiAccountResourceGroupsResponse.setNextToken(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.NextToken"));
		listMultiAccountResourceGroupsResponse.setSuccess(_ctx.booleanValue("ListMultiAccountResourceGroupsResponse.Success"));

		List<ResourceGroup> resourceGroups = new ArrayList<ResourceGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiAccountResourceGroupsResponse.ResourceGroups.Length"); i++) {
			ResourceGroup resourceGroup = new ResourceGroup();
			resourceGroup.setAccountId(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].AccountId"));
			resourceGroup.setCreateDate(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].CreateDate"));
			resourceGroup.setDisplayName(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].DisplayName"));
			resourceGroup.setId(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].Id"));
			resourceGroup.setName(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].Name"));
			resourceGroup.setStatus(_ctx.stringValue("ListMultiAccountResourceGroupsResponse.ResourceGroups["+ i +"].Status"));

			resourceGroups.add(resourceGroup);
		}
		listMultiAccountResourceGroupsResponse.setResourceGroups(resourceGroups);
	 
	 	return listMultiAccountResourceGroupsResponse;
	}
}