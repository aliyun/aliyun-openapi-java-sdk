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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterCidrAllocationResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterCidrAllocationResponseUnmarshaller {

	public static ListTransitRouterCidrAllocationResponse unmarshall(ListTransitRouterCidrAllocationResponse listTransitRouterCidrAllocationResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterCidrAllocationResponse.setRequestId(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.RequestId"));
		listTransitRouterCidrAllocationResponse.setNextToken(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.NextToken"));
		listTransitRouterCidrAllocationResponse.setTotalCount(_ctx.integerValue("ListTransitRouterCidrAllocationResponse.TotalCount"));
		listTransitRouterCidrAllocationResponse.setMaxResults(_ctx.integerValue("ListTransitRouterCidrAllocationResponse.MaxResults"));

		List<TransitRouterCidrAllocation> transitRouterCidrAllocations = new ArrayList<TransitRouterCidrAllocation>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations.Length"); i++) {
			TransitRouterCidrAllocation transitRouterCidrAllocation = new TransitRouterCidrAllocation();
			transitRouterCidrAllocation.setTransitRouterCidrId(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations["+ i +"].TransitRouterCidrId"));
			transitRouterCidrAllocation.setAllocatedCidrBlock(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations["+ i +"].AllocatedCidrBlock"));
			transitRouterCidrAllocation.setAttachmentId(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations["+ i +"].AttachmentId"));
			transitRouterCidrAllocation.setCidr(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations["+ i +"].Cidr"));
			transitRouterCidrAllocation.setAttachmentName(_ctx.stringValue("ListTransitRouterCidrAllocationResponse.TransitRouterCidrAllocations["+ i +"].AttachmentName"));

			transitRouterCidrAllocations.add(transitRouterCidrAllocation);
		}
		listTransitRouterCidrAllocationResponse.setTransitRouterCidrAllocations(transitRouterCidrAllocations);
	 
	 	return listTransitRouterCidrAllocationResponse;
	}
}