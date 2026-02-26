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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListResourceSharesResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceSharesResponse.ResourceShare;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceSharesResponseUnmarshaller {

	public static ListResourceSharesResponse unmarshall(ListResourceSharesResponse listResourceSharesResponse, UnmarshallerContext _ctx) {
		
		listResourceSharesResponse.setRequestId(_ctx.stringValue("ListResourceSharesResponse.RequestId"));
		listResourceSharesResponse.setNextToken(_ctx.stringValue("ListResourceSharesResponse.NextToken"));

		List<ResourceShare> resourceShares = new ArrayList<ResourceShare>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceSharesResponse.ResourceShares.Length"); i++) {
			ResourceShare resourceShare = new ResourceShare();
			resourceShare.setUpdateTime(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].UpdateTime"));
			resourceShare.setResourceShareName(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].ResourceShareName"));
			resourceShare.setResourceShareOwner(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].ResourceShareOwner"));
			resourceShare.setCreateTime(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].CreateTime"));
			resourceShare.setResourceShareId(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].ResourceShareId"));
			resourceShare.setResourceShareStatus(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].ResourceShareStatus"));
			resourceShare.setAllowExternalTargets(_ctx.booleanValue("ListResourceSharesResponse.ResourceShares["+ i +"].AllowExternalTargets"));
			resourceShare.setResourceGroupId(_ctx.stringValue("ListResourceSharesResponse.ResourceShares["+ i +"].ResourceGroupId"));

			resourceShares.add(resourceShare);
		}
		listResourceSharesResponse.setResourceShares(resourceShares);
	 
	 	return listResourceSharesResponse;
	}
}