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

	public static DescribeReservedInstancesResponse unmarshall(DescribeReservedInstancesResponse describeReservedInstancesResponse, UnmarshallerContext context) {
		
		describeReservedInstancesResponse.setRequestId(context.stringValue("DescribeReservedInstancesResponse.RequestId"));
		describeReservedInstancesResponse.setTotalCount(context.integerValue("DescribeReservedInstancesResponse.TotalCount"));
		describeReservedInstancesResponse.setPageNumber(context.integerValue("DescribeReservedInstancesResponse.PageNumber"));
		describeReservedInstancesResponse.setPageSize(context.integerValue("DescribeReservedInstancesResponse.PageSize"));

		List<ReservedInstance> reservedInstances = new ArrayList<ReservedInstance>();
		for (int i = 0; i < context.lengthValue("DescribeReservedInstancesResponse.ReservedInstances.Length"); i++) {
			ReservedInstance reservedInstance = new ReservedInstance();
			reservedInstance.setReservedInstanceId(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceId"));
			reservedInstance.setRegionId(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].RegionId"));
			reservedInstance.setZoneId(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ZoneId"));
			reservedInstance.setReservedInstanceName(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceName"));
			reservedInstance.setDescription(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Description"));
			reservedInstance.setInstanceType(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceType"));
			reservedInstance.setScope(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Scope"));
			reservedInstance.setOfferingType(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OfferingType"));
			reservedInstance.setInstanceAmount(context.integerValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceAmount"));
			reservedInstance.setStatus(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].Status"));
			reservedInstance.setCreationTime(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].CreationTime"));
			reservedInstance.setExpiredTime(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ExpiredTime"));
			reservedInstance.setStartTime(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].StartTime"));
			reservedInstance.setResourceGroupId(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].ResourceGroupId"));

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < context.lengthValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(context.stringValue("DescribeReservedInstancesResponse.ReservedInstances["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			reservedInstance.setOperationLocks(operationLocks);

			reservedInstances.add(reservedInstance);
		}
		describeReservedInstancesResponse.setReservedInstances(reservedInstances);
	 
	 	return describeReservedInstancesResponse;
	}
}