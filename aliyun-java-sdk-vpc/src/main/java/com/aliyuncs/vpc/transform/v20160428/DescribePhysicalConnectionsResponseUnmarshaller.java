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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribePhysicalConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribePhysicalConnectionsResponse.PhysicalConnectionType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhysicalConnectionsResponseUnmarshaller {

	public static DescribePhysicalConnectionsResponse unmarshall(DescribePhysicalConnectionsResponse describePhysicalConnectionsResponse, UnmarshallerContext context) {
		
		describePhysicalConnectionsResponse.setRequestId(context.stringValue("DescribePhysicalConnectionsResponse.RequestId"));
		describePhysicalConnectionsResponse.setPageNumber(context.integerValue("DescribePhysicalConnectionsResponse.PageNumber"));
		describePhysicalConnectionsResponse.setPageSize(context.integerValue("DescribePhysicalConnectionsResponse.PageSize"));
		describePhysicalConnectionsResponse.setTotalCount(context.integerValue("DescribePhysicalConnectionsResponse.TotalCount"));

		List<PhysicalConnectionType> physicalConnectionSet = new ArrayList<PhysicalConnectionType>();
		for (int i = 0; i < context.lengthValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet.Length"); i++) {
			PhysicalConnectionType physicalConnectionType = new PhysicalConnectionType();
			physicalConnectionType.setPhysicalConnectionId(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PhysicalConnectionId"));
			physicalConnectionType.setAccessPointId(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AccessPointId"));
			physicalConnectionType.setType(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Type"));
			physicalConnectionType.setStatus(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Status"));
			physicalConnectionType.setBusinessStatus(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].BusinessStatus"));
			physicalConnectionType.setCreationTime(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CreationTime"));
			physicalConnectionType.setEnabledTime(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EnabledTime"));
			physicalConnectionType.setLineOperator(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LineOperator"));
			physicalConnectionType.setSpec(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Spec"));
			physicalConnectionType.setPeerLocation(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PeerLocation"));
			physicalConnectionType.setPortType(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortType"));
			physicalConnectionType.setRedundantPhysicalConnectionId(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].RedundantPhysicalConnectionId"));
			physicalConnectionType.setName(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Name"));
			physicalConnectionType.setDescription(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Description"));
			physicalConnectionType.setAdLocation(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AdLocation"));
			physicalConnectionType.setPortNumber(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortNumber"));
			physicalConnectionType.setCircuitCode(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CircuitCode"));
			physicalConnectionType.setBandwidth(context.longValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Bandwidth"));
			physicalConnectionType.setLoaStatus(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LoaStatus"));
			physicalConnectionType.setSpec1(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Spec"));
			physicalConnectionType.setHasReservationData(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].HasReservationData"));
			physicalConnectionType.setReservationInternetChargeType(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationInternetChargeType"));
			physicalConnectionType.setReservationActiveTime(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationActiveTime"));
			physicalConnectionType.setReservationOrderType(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationOrderType"));
			physicalConnectionType.setEndTime(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EndTime"));
			physicalConnectionType.setChargeType(context.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ChargeType"));

			physicalConnectionSet.add(physicalConnectionType);
		}
		describePhysicalConnectionsResponse.setPhysicalConnectionSet(physicalConnectionSet);
	 
	 	return describePhysicalConnectionsResponse;
	}
}