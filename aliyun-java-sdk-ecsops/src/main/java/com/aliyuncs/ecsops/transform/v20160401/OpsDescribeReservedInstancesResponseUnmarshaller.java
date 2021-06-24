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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeReservedInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeReservedInstancesResponse.ReservedInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeReservedInstancesResponseUnmarshaller {

	public static OpsDescribeReservedInstancesResponse unmarshall(OpsDescribeReservedInstancesResponse opsDescribeReservedInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeReservedInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeReservedInstancesResponse.RequestId"));
		opsDescribeReservedInstancesResponse.setTotalCount(_ctx.integerValue("OpsDescribeReservedInstancesResponse.TotalCount"));
		opsDescribeReservedInstancesResponse.setPageSize(_ctx.integerValue("OpsDescribeReservedInstancesResponse.PageSize"));
		opsDescribeReservedInstancesResponse.setPageNumber(_ctx.integerValue("OpsDescribeReservedInstancesResponse.PageNumber"));

		List<ReservedInstance> reservedInstances = new ArrayList<ReservedInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeReservedInstancesResponse.ReservedInstances.Length"); i++) {
			ReservedInstance reservedInstance = new ReservedInstance();
			reservedInstance.setStatus(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].Status"));
			reservedInstance.setReservedInstanceName(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceName"));
			reservedInstance.setDescription(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].Description"));
			reservedInstance.setResourceGroupId(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].ResourceGroupId"));
			reservedInstance.setZoneId(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].ZoneId"));
			reservedInstance.setReservedInstanceId(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].ReservedInstanceId"));
			reservedInstance.setScope(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].Scope"));
			reservedInstance.setInstanceType(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceType"));
			reservedInstance.setInstanceAmount(_ctx.integerValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].InstanceAmount"));
			reservedInstance.setOfferingType(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].OfferingType"));
			reservedInstance.setRegionId(_ctx.stringValue("OpsDescribeReservedInstancesResponse.ReservedInstances["+ i +"].RegionId"));

			reservedInstances.add(reservedInstance);
		}
		opsDescribeReservedInstancesResponse.setReservedInstances(reservedInstances);
	 
	 	return opsDescribeReservedInstancesResponse;
	}
}