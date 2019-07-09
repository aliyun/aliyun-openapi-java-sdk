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

import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType;
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

			virtualBorderRouterSet.add(virtualBorderRouterType);
		}
		describeVirtualBorderRoutersResponse.setVirtualBorderRouterSet(virtualBorderRouterSet);
	 
	 	return describeVirtualBorderRoutersResponse;
	}
}