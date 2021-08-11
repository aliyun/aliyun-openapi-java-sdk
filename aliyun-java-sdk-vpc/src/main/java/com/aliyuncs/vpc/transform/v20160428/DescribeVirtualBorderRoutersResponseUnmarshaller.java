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

import com.aliyuncs.vpc.model.v20160428.DescribeVirtualBorderRoutersResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType;
import com.aliyuncs.vpc.model.v20160428.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType.AssociatedCen;
import com.aliyuncs.vpc.model.v20160428.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType.AssociatedPhysicalConnection;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualBorderRoutersResponseUnmarshaller {

	public static DescribeVirtualBorderRoutersResponse unmarshall(DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersResponse, UnmarshallerContext _ctx) {
		
		describeVirtualBorderRoutersResponse.setRequestId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.RequestId"));
		describeVirtualBorderRoutersResponse.setPageNumber(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.PageNumber"));
		describeVirtualBorderRoutersResponse.setPageSize(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.PageSize"));
		describeVirtualBorderRoutersResponse.setTotalCount(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.TotalCount"));

		List<VirtualBorderRouterType> virtualBorderRouterSet = new ArrayList<VirtualBorderRouterType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet.Length"); i++) {
			VirtualBorderRouterType virtualBorderRouterType = new VirtualBorderRouterType();
			virtualBorderRouterType.setVbrId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VbrId"));
			virtualBorderRouterType.setCreationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CreationTime"));
			virtualBorderRouterType.setActivationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].ActivationTime"));
			virtualBorderRouterType.setTerminationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].TerminationTime"));
			virtualBorderRouterType.setRecoveryTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RecoveryTime"));
			virtualBorderRouterType.setStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Status"));
			virtualBorderRouterType.setVlanId(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanId"));
			virtualBorderRouterType.setCircuitCode(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CircuitCode"));
			virtualBorderRouterType.setRouteTableId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RouteTableId"));
			virtualBorderRouterType.setVlanInterfaceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanInterfaceId"));
			virtualBorderRouterType.setLocalGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].LocalGatewayIp"));
			virtualBorderRouterType.setPeerGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeerGatewayIp"));
			virtualBorderRouterType.setPeeringSubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeeringSubnetMask"));
			virtualBorderRouterType.setPhysicalConnectionId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionId"));
			virtualBorderRouterType.setPhysicalConnectionStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionStatus"));
			virtualBorderRouterType.setPhysicalConnectionBusinessStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionBusinessStatus"));
			virtualBorderRouterType.setPhysicalConnectionOwnerUid(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionOwnerUid"));
			virtualBorderRouterType.setAccessPointId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AccessPointId"));
			virtualBorderRouterType.setName(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Name"));
			virtualBorderRouterType.setDescription(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Description"));
			virtualBorderRouterType.setPConnVbrExpireTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PConnVbrExpireTime"));
			virtualBorderRouterType.setEccId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EccId"));
			virtualBorderRouterType.setType(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Type"));
			virtualBorderRouterType.setMinTxInterval(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].MinTxInterval"));
			virtualBorderRouterType.setMinRxInterval(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].MinRxInterval"));
			virtualBorderRouterType.setDetectMultiplier(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].DetectMultiplier"));
			virtualBorderRouterType.setLocalIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].LocalIpv6GatewayIp"));
			virtualBorderRouterType.setPeerIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeerIpv6GatewayIp"));
			virtualBorderRouterType.setPeeringIpv6SubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeeringIpv6SubnetMask"));
			virtualBorderRouterType.setEnableIpv6(_ctx.booleanValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EnableIpv6"));
			virtualBorderRouterType.setCloudBoxInstanceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CloudBoxInstanceId"));

			List<AssociatedPhysicalConnection> associatedPhysicalConnections = new ArrayList<AssociatedPhysicalConnection>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections.Length"); j++) {
				AssociatedPhysicalConnection associatedPhysicalConnection = new AssociatedPhysicalConnection();
				associatedPhysicalConnection.setCircuitCode(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].CircuitCode"));
				associatedPhysicalConnection.setVlanInterfaceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].VlanInterfaceId"));
				associatedPhysicalConnection.setLocalGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].LocalGatewayIp"));
				associatedPhysicalConnection.setPeerGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeerGatewayIp"));
				associatedPhysicalConnection.setPeeringSubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeeringSubnetMask"));
				associatedPhysicalConnection.setPhysicalConnectionId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionId"));
				associatedPhysicalConnection.setPhysicalConnectionStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionStatus"));
				associatedPhysicalConnection.setPhysicalConnectionBusinessStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionBusinessStatus"));
				associatedPhysicalConnection.setPhysicalConnectionOwnerUid(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionOwnerUid"));
				associatedPhysicalConnection.setVlanId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].VlanId"));
				associatedPhysicalConnection.setLocalIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].LocalIpv6GatewayIp"));
				associatedPhysicalConnection.setPeerIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeerIpv6GatewayIp"));
				associatedPhysicalConnection.setPeeringIpv6SubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeeringIpv6SubnetMask"));
				associatedPhysicalConnection.setStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].Status"));
				associatedPhysicalConnection.setEnableIpv6(_ctx.booleanValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].EnableIpv6"));

				associatedPhysicalConnections.add(associatedPhysicalConnection);
			}
			virtualBorderRouterType.setAssociatedPhysicalConnections(associatedPhysicalConnections);

			List<AssociatedCen> associatedCens = new ArrayList<AssociatedCen>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens.Length"); j++) {
				AssociatedCen associatedCen = new AssociatedCen();
				associatedCen.setCenId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenId"));
				associatedCen.setCenOwnerId(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenOwnerId"));
				associatedCen.setCenStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenStatus"));

				associatedCens.add(associatedCen);
			}
			virtualBorderRouterType.setAssociatedCens(associatedCens);

			virtualBorderRouterSet.add(virtualBorderRouterType);
		}
		describeVirtualBorderRoutersResponse.setVirtualBorderRouterSet(virtualBorderRouterSet);
	 
	 	return describeVirtualBorderRoutersResponse;
	}
}