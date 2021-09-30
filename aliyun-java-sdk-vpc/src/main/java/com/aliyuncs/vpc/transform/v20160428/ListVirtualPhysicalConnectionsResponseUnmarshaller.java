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

import com.aliyuncs.vpc.model.v20160428.ListVirtualPhysicalConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnection;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVirtualPhysicalConnectionsResponseUnmarshaller {

	public static ListVirtualPhysicalConnectionsResponse unmarshall(ListVirtualPhysicalConnectionsResponse listVirtualPhysicalConnectionsResponse, UnmarshallerContext _ctx) {
		
		listVirtualPhysicalConnectionsResponse.setRequestId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.RequestId"));
		listVirtualPhysicalConnectionsResponse.setNextToken(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.NextToken"));
		listVirtualPhysicalConnectionsResponse.setTotalCount(_ctx.integerValue("ListVirtualPhysicalConnectionsResponse.TotalCount"));
		listVirtualPhysicalConnectionsResponse.setCount(_ctx.integerValue("ListVirtualPhysicalConnectionsResponse.Count"));

		List<VirtualPhysicalConnection> virtualPhysicalConnections = new ArrayList<VirtualPhysicalConnection>();
		for (int i = 0; i < _ctx.lengthValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections.Length"); i++) {
			VirtualPhysicalConnection virtualPhysicalConnection = new VirtualPhysicalConnection();
			virtualPhysicalConnection.setType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Type"));
			virtualPhysicalConnection.setStatus(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Status"));
			virtualPhysicalConnection.setCreationTime(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].CreationTime"));
			virtualPhysicalConnection.setAdLocation(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].AdLocation"));
			virtualPhysicalConnection.setReservationActiveTime(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ReservationActiveTime"));
			virtualPhysicalConnection.setReservationOrderType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ReservationOrderType"));
			virtualPhysicalConnection.setPortNumber(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].PortNumber"));
			virtualPhysicalConnection.setSpec(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Spec"));
			virtualPhysicalConnection.setChargeType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ChargeType"));
			virtualPhysicalConnection.setReservationInternetChargeType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ReservationInternetChargeType"));
			virtualPhysicalConnection.setDescription(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Description"));
			virtualPhysicalConnection.setBandwidth(_ctx.longValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Bandwidth"));
			virtualPhysicalConnection.setEnabledTime(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].EnabledTime"));
			virtualPhysicalConnection.setLineOperator(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].LineOperator"));
			virtualPhysicalConnection.setPeerLocation(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].PeerLocation"));
			virtualPhysicalConnection.setRedundantPhysicalConnectionId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].RedundantPhysicalConnectionId"));
			virtualPhysicalConnection.setName(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].Name"));
			virtualPhysicalConnection.setCircuitCode(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].CircuitCode"));
			virtualPhysicalConnection.setEndTime(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].EndTime"));
			virtualPhysicalConnection.setPortType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].PortType"));
			virtualPhysicalConnection.setBusinessStatus(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].BusinessStatus"));
			virtualPhysicalConnection.setLoaStatus(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].LoaStatus"));
			virtualPhysicalConnection.setAccessPointId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].AccessPointId"));
			virtualPhysicalConnection.setHasReservationData(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].HasReservationData"));
			virtualPhysicalConnection.setPhysicalConnectionId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].PhysicalConnectionId"));
			virtualPhysicalConnection.setProductType(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ProductType"));
			virtualPhysicalConnection.setParentPhysicalConnectionId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ParentPhysicalConnectionId"));
			virtualPhysicalConnection.setVirtualPhysicalConnectionStatus(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].VirtualPhysicalConnectionStatus"));
			virtualPhysicalConnection.setParentPhysicalConnectionAliUid(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].ParentPhysicalConnectionAliUid"));
			virtualPhysicalConnection.setOrderMode(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].OrderMode"));
			virtualPhysicalConnection.setAliUid(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].AliUid"));
			virtualPhysicalConnection.setVlanId(_ctx.stringValue("ListVirtualPhysicalConnectionsResponse.VirtualPhysicalConnections["+ i +"].VlanId"));

			virtualPhysicalConnections.add(virtualPhysicalConnection);
		}
		listVirtualPhysicalConnectionsResponse.setVirtualPhysicalConnections(virtualPhysicalConnections);
	 
	 	return listVirtualPhysicalConnectionsResponse;
	}
}