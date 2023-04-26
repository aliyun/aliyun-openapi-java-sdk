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

import com.aliyuncs.ecs.model.v20160314.DescribeAutoProvisioningGroupCapacitiesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeAutoProvisioningGroupCapacitiesResponse.Capacity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoProvisioningGroupCapacitiesResponseUnmarshaller {

	public static DescribeAutoProvisioningGroupCapacitiesResponse unmarshall(DescribeAutoProvisioningGroupCapacitiesResponse describeAutoProvisioningGroupCapacitiesResponse, UnmarshallerContext _ctx) {
		
		describeAutoProvisioningGroupCapacitiesResponse.setRequestId(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.RequestId"));
		describeAutoProvisioningGroupCapacitiesResponse.setCode(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Code"));
		describeAutoProvisioningGroupCapacitiesResponse.setMessage(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Message"));
		describeAutoProvisioningGroupCapacitiesResponse.setSuccess(_ctx.booleanValue("DescribeAutoProvisioningGroupCapacitiesResponse.Success"));

		List<Capacity> capacities = new ArrayList<Capacity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupCapacitiesResponse.Capacities.Length"); i++) {
			Capacity capacity = new Capacity();
			capacity.setSpotCapacity(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Capacities["+ i +"].SpotCapacity"));
			capacity.setTotalCapacity(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Capacities["+ i +"].TotalCapacity"));
			capacity.setAutoProvisioningGroupId(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Capacities["+ i +"].AutoProvisioningGroupId"));
			capacity.setPayAsYouGoCapacity(_ctx.stringValue("DescribeAutoProvisioningGroupCapacitiesResponse.Capacities["+ i +"].PayAsYouGoCapacity"));

			capacities.add(capacity);
		}
		describeAutoProvisioningGroupCapacitiesResponse.setCapacities(capacities);
	 
	 	return describeAutoProvisioningGroupCapacitiesResponse;
	}
}