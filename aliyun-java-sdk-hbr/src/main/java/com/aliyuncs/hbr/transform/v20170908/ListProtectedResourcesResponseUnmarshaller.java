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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.ListProtectedResourcesResponse;
import com.aliyuncs.hbr.model.v20170908.ListProtectedResourcesResponse.ProtectedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProtectedResourcesResponseUnmarshaller {

	public static ListProtectedResourcesResponse unmarshall(ListProtectedResourcesResponse listProtectedResourcesResponse, UnmarshallerContext _ctx) {
		
		listProtectedResourcesResponse.setRequestId(_ctx.stringValue("ListProtectedResourcesResponse.RequestId"));
		listProtectedResourcesResponse.setCode(_ctx.stringValue("ListProtectedResourcesResponse.Code"));
		listProtectedResourcesResponse.setMessage(_ctx.stringValue("ListProtectedResourcesResponse.Message"));
		listProtectedResourcesResponse.setSuccess(_ctx.booleanValue("ListProtectedResourcesResponse.Success"));
		listProtectedResourcesResponse.setTotalCount(_ctx.integerValue("ListProtectedResourcesResponse.TotalCount"));
		listProtectedResourcesResponse.setMaxResults(_ctx.integerValue("ListProtectedResourcesResponse.MaxResults"));
		listProtectedResourcesResponse.setNextToken(_ctx.stringValue("ListProtectedResourcesResponse.NextToken"));

		List<ProtectedResource> protectedResources = new ArrayList<ProtectedResource>();
		for (int i = 0; i < _ctx.lengthValue("ListProtectedResourcesResponse.ProtectedResources.Length"); i++) {
			ProtectedResource protectedResource = new ProtectedResource();
			protectedResource.setSnapshotCount(_ctx.longValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].SnapshotCount"));
			protectedResource.setResourceId(_ctx.stringValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].ResourceId"));
			protectedResource.setProtectedResourceId(_ctx.stringValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].ProtectedResourceId"));
			protectedResource.setSourceType(_ctx.stringValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].SourceType"));
			protectedResource.setProtectedDataSize(_ctx.longValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].ProtectedDataSize"));
			protectedResource.setCreatedByProduct(_ctx.stringValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].CreatedByProduct"));
			protectedResource.setResourceOwnerId(_ctx.longValue("ListProtectedResourcesResponse.ProtectedResources["+ i +"].ResourceOwnerId"));

			protectedResources.add(protectedResource);
		}
		listProtectedResourcesResponse.setProtectedResources(protectedResources);
	 
	 	return listProtectedResourcesResponse;
	}
}