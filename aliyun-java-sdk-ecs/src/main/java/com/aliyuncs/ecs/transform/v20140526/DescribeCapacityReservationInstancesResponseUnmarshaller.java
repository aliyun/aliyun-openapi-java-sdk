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

import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationInstancesResponse.InstanceIdSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityReservationInstancesResponseUnmarshaller {

	public static DescribeCapacityReservationInstancesResponse unmarshall(DescribeCapacityReservationInstancesResponse describeCapacityReservationInstancesResponse, UnmarshallerContext _ctx) {
		
		describeCapacityReservationInstancesResponse.setRequestId(_ctx.stringValue("DescribeCapacityReservationInstancesResponse.RequestId"));
		describeCapacityReservationInstancesResponse.setNextToken(_ctx.stringValue("DescribeCapacityReservationInstancesResponse.NextToken"));
		describeCapacityReservationInstancesResponse.setTotalCount(_ctx.integerValue("DescribeCapacityReservationInstancesResponse.TotalCount"));
		describeCapacityReservationInstancesResponse.setMaxResults(_ctx.integerValue("DescribeCapacityReservationInstancesResponse.MaxResults"));

		List<InstanceIdSet> capacityReservationItem = new ArrayList<InstanceIdSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCapacityReservationInstancesResponse.CapacityReservationItem.Length"); i++) {
			InstanceIdSet instanceIdSet = new InstanceIdSet();
			instanceIdSet.setInstanceId(_ctx.stringValue("DescribeCapacityReservationInstancesResponse.CapacityReservationItem["+ i +"].InstanceId"));

			capacityReservationItem.add(instanceIdSet);
		}
		describeCapacityReservationInstancesResponse.setCapacityReservationItem(capacityReservationItem);
	 
	 	return describeCapacityReservationInstancesResponse;
	}
}