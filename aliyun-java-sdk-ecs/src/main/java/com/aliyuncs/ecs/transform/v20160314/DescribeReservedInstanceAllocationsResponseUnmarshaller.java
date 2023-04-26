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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeReservedInstanceAllocationsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeReservedInstanceAllocationsResponse.Allocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservedInstanceAllocationsResponseUnmarshaller {

	public static DescribeReservedInstanceAllocationsResponse unmarshall(DescribeReservedInstanceAllocationsResponse describeReservedInstanceAllocationsResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstanceAllocationsResponse.setRequestId(_ctx.stringValue("DescribeReservedInstanceAllocationsResponse.RequestId"));
		describeReservedInstanceAllocationsResponse.setPageSize(_ctx.integerValue("DescribeReservedInstanceAllocationsResponse.PageSize"));
		describeReservedInstanceAllocationsResponse.setPageNumber(_ctx.integerValue("DescribeReservedInstanceAllocationsResponse.PageNumber"));
		describeReservedInstanceAllocationsResponse.setTotalCount(_ctx.integerValue("DescribeReservedInstanceAllocationsResponse.TotalCount"));

		List<Allocation> allocations = new ArrayList<Allocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedInstanceAllocationsResponse.Allocations.Length"); i++) {
			Allocation allocation = new Allocation();
			allocation.setReservedInstanceId(_ctx.stringValue("DescribeReservedInstanceAllocationsResponse.Allocations["+ i +"].ReservedInstanceId"));
			allocation.setBeAllocatedAccountId(_ctx.stringValue("DescribeReservedInstanceAllocationsResponse.Allocations["+ i +"].BeAllocatedAccountId"));
			allocation.setResourceOwnerId(_ctx.stringValue("DescribeReservedInstanceAllocationsResponse.Allocations["+ i +"].ResourceOwnerId"));

			allocations.add(allocation);
		}
		describeReservedInstanceAllocationsResponse.setAllocations(allocations);
	 
	 	return describeReservedInstanceAllocationsResponse;
	}
}