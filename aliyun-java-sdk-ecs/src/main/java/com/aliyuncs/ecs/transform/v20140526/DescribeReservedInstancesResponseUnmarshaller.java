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

import com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse.ReservedInstance;
import com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse.ReservedInstance.OperationLock;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservedInstancesResponseUnmarshaller {

	public static DescribeReservedInstancesResponse unmarshall(DescribeReservedInstancesResponse describeReservedInstancesResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstancesResponse.setRequestId(_ctx.stringValue("DescribeReservedInstancesResponse.RequestId"));
		describeReservedInstancesResponse.setTotalCount(_ctx.integerValue("DescribeReservedInstancesResponse.TotalCount"));
		describeReservedInstancesResponse.setPageNumber(_ctx.integerValue("DescribeReservedInstancesResponse.PageNumber"));
		describeReservedInstancesResponse.setPageSize(_ctx.integerValue("DescribeReservedInstancesResponse.PageSize"));

		List<ReservedInstance> reservedInstances = new ArrayList<ReservedInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedInstancesResponse.ReservedInstances.Length"); i++) {
			ReservedInstance reservedInstance = new ReservedInstance();
			reservedInstance.setReservedInstanceId(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceId"));
			reservedInstance.setRegionId(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].RegionId"));
			reservedInstance.setZoneId(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ZoneId"));
			reservedInstance.setReservedInstanceName(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceName"));
			reservedInstance.setDescription(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Description"));
			reservedInstance.setInstanceType(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceType"));
			reservedInstance.setScope(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Scope"));
			reservedInstance.setOfferingType(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OfferingType"));
			reservedInstance.setPlatform(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Platform"));
			reservedInstance.setInstanceAmount(_ctx.integerValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceAmount"));
			reservedInstance.setStatus(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Status"));
			reservedInstance.setCreationTime(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].CreationTime"));
			reservedInstance.setExpiredTime(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ExpiredTime"));
			reservedInstance.setStartTime(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].StartTime"));
			reservedInstance.setResourceGroupId(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ResourceGroupId"));

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(_ctx.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			reservedInstance.setOperationLocks(operationLocks);

			reservedInstances.add(reservedInstance);
		}
		describeReservedInstancesResponse.setReservedInstances(reservedInstances);
	 
	 	return describeReservedInstancesResponse;
	}
}