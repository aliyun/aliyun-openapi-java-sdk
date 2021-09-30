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

	public static DescribePhysicalConnectionsResponse unmarshall(DescribePhysicalConnectionsResponse describePhysicalConnectionsResponse, UnmarshallerContext _ctx) {
		
		describePhysicalConnectionsResponse.setRequestId(_ctx.stringValue("DescribePhysicalConnectionsResponse.RequestId"));
		describePhysicalConnectionsResponse.setPageNumber(_ctx.integerValue("DescribePhysicalConnectionsResponse.PageNumber"));
		describePhysicalConnectionsResponse.setPageSize(_ctx.integerValue("DescribePhysicalConnectionsResponse.PageSize"));
		describePhysicalConnectionsResponse.setTotalCount(_ctx.integerValue("DescribePhysicalConnectionsResponse.TotalCount"));

		List<PhysicalConnectionType> physicalConnectionSet = new ArrayList<PhysicalConnectionType>();
		for (int i = 0; i < _ctx.lengthValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet.Length"); i++) {
			PhysicalConnectionType physicalConnectionType = new PhysicalConnectionType();
			physicalConnectionType.setType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Type"));
			physicalConnectionType.setStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Status"));
			physicalConnectionType.setCreationTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CreationTime"));
			physicalConnectionType.setAdLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AdLocation"));
			physicalConnectionType.setReservationActiveTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationActiveTime"));
			physicalConnectionType.setReservationOrderType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationOrderType"));
			physicalConnectionType.setPortNumber(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortNumber"));
			physicalConnectionType.setSpec(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Spec"));
			physicalConnectionType.setChargeType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ChargeType"));
			physicalConnectionType.setReservationInternetChargeType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ReservationInternetChargeType"));
			physicalConnectionType.setDescription(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Description"));
			physicalConnectionType.setBandwidth(_ctx.longValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Bandwidth"));
			physicalConnectionType.setEnabledTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EnabledTime"));
			physicalConnectionType.setLineOperator(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LineOperator"));
			physicalConnectionType.setPeerLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PeerLocation"));
			physicalConnectionType.setRedundantPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].RedundantPhysicalConnectionId"));
			physicalConnectionType.setName(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Name"));
			physicalConnectionType.setCircuitCode(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CircuitCode"));
			physicalConnectionType.setEndTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EndTime"));
			physicalConnectionType.setPortType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortType"));
			physicalConnectionType.setBusinessStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].BusinessStatus"));
			physicalConnectionType.setLoaStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LoaStatus"));
			physicalConnectionType.setAccessPointId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AccessPointId"));
			physicalConnectionType.setHasReservationData(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].HasReservationData"));
			physicalConnectionType.setPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PhysicalConnectionId"));
			physicalConnectionType.setProductType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ProductType"));
			physicalConnectionType.setVirtualPhysicalConnectionCount(_ctx.integerValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].VirtualPhysicalConnectionCount"));
			physicalConnectionType.setParentPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ParentPhysicalConnectionId"));
			physicalConnectionType.setParentPhysicalConnectionAliUid(_ctx.longValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].ParentPhysicalConnectionAliUid"));
			physicalConnectionType.setVlanId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].VlanId"));
			physicalConnectionType.setOrderMode(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].OrderMode"));
			physicalConnectionType.setVpconnStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].VpconnStatus"));

			physicalConnectionSet.add(physicalConnectionType);
		}
		describePhysicalConnectionsResponse.setPhysicalConnectionSet(physicalConnectionSet);
	 
	 	return describePhysicalConnectionsResponse;
	}
}