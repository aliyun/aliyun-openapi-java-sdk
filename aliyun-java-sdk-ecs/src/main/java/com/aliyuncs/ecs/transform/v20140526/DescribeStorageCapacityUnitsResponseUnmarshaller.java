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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeStorageCapacityUnitsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeStorageCapacityUnitsResponse.StorageCapacityUnit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageCapacityUnitsResponseUnmarshaller {

	public static DescribeStorageCapacityUnitsResponse unmarshall(DescribeStorageCapacityUnitsResponse describeStorageCapacityUnitsResponse, UnmarshallerContext _ctx) {
		
		describeStorageCapacityUnitsResponse.setRequestId(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.RequestId"));
		describeStorageCapacityUnitsResponse.setTotalCount(_ctx.integerValue("DescribeStorageCapacityUnitsResponse.TotalCount"));
		describeStorageCapacityUnitsResponse.setPageNumber(_ctx.integerValue("DescribeStorageCapacityUnitsResponse.PageNumber"));
		describeStorageCapacityUnitsResponse.setPageSize(_ctx.integerValue("DescribeStorageCapacityUnitsResponse.PageSize"));

		List<StorageCapacityUnit> storageCapacityUnits = new ArrayList<StorageCapacityUnit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits.Length"); i++) {
			StorageCapacityUnit storageCapacityUnit = new StorageCapacityUnit();
			storageCapacityUnit.setRegionId(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].RegionId"));
			storageCapacityUnit.setStorageCapacityUnitId(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].StorageCapacityUnitId"));
			storageCapacityUnit.setName(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].Name"));
			storageCapacityUnit.setCapacity(_ctx.integerValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].Capacity"));
			storageCapacityUnit.setStatus(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].Status"));
			storageCapacityUnit.setCreationTime(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].CreationTime"));
			storageCapacityUnit.setExpiredTime(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].ExpiredTime"));
			storageCapacityUnit.setStartTime(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].StartTime"));
			storageCapacityUnit.setDescription(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].Description"));
			storageCapacityUnit.setAllocationStatus(_ctx.stringValue("DescribeStorageCapacityUnitsResponse.StorageCapacityUnits["+ i +"].AllocationStatus"));

			storageCapacityUnits.add(storageCapacityUnit);
		}
		describeStorageCapacityUnitsResponse.setStorageCapacityUnits(storageCapacityUnits);
	 
	 	return describeStorageCapacityUnitsResponse;
	}
}