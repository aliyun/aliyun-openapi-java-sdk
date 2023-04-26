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

import com.aliyuncs.ecs.model.v20160314.DescribeStorageCapacityUnitAllocationsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeStorageCapacityUnitAllocationsResponse.Allocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageCapacityUnitAllocationsResponseUnmarshaller {

	public static DescribeStorageCapacityUnitAllocationsResponse unmarshall(DescribeStorageCapacityUnitAllocationsResponse describeStorageCapacityUnitAllocationsResponse, UnmarshallerContext _ctx) {
		
		describeStorageCapacityUnitAllocationsResponse.setRequestId(_ctx.stringValue("DescribeStorageCapacityUnitAllocationsResponse.RequestId"));
		describeStorageCapacityUnitAllocationsResponse.setPageSize(_ctx.integerValue("DescribeStorageCapacityUnitAllocationsResponse.PageSize"));
		describeStorageCapacityUnitAllocationsResponse.setPageNumber(_ctx.integerValue("DescribeStorageCapacityUnitAllocationsResponse.PageNumber"));
		describeStorageCapacityUnitAllocationsResponse.setTotalCount(_ctx.integerValue("DescribeStorageCapacityUnitAllocationsResponse.TotalCount"));

		List<Allocation> allocations = new ArrayList<Allocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageCapacityUnitAllocationsResponse.Allocations.Length"); i++) {
			Allocation allocation = new Allocation();
			allocation.setBeAllocatedAccountId(_ctx.stringValue("DescribeStorageCapacityUnitAllocationsResponse.Allocations["+ i +"].BeAllocatedAccountId"));
			allocation.setResourceOwnerId(_ctx.stringValue("DescribeStorageCapacityUnitAllocationsResponse.Allocations["+ i +"].ResourceOwnerId"));
			allocation.setStorageCapacityUnitId(_ctx.stringValue("DescribeStorageCapacityUnitAllocationsResponse.Allocations["+ i +"].StorageCapacityUnitId"));

			allocations.add(allocation);
		}
		describeStorageCapacityUnitAllocationsResponse.setAllocations(allocations);
	 
	 	return describeStorageCapacityUnitAllocationsResponse;
	}
}