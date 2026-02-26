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
import com.aliyuncs.vpc.model.v20160428.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType.TagsItem;
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
			virtualBorderRouterType.setCreationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CreationTime"));
			virtualBorderRouterType.setStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Status"));
			virtualBorderRouterType.setType(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Type"));
			virtualBorderRouterType.setMinTxInterval(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].MinTxInterval"));
			virtualBorderRouterType.setPeerIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeerIpv6GatewayIp"));
			virtualBorderRouterType.setPConnVbrExpireTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PConnVbrExpireTime"));
			virtualBorderRouterType.setPhysicalConnectionOwnerUid(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionOwnerUid"));
			virtualBorderRouterType.setActivationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].ActivationTime"));
			virtualBorderRouterType.setPhysicalConnectionBusinessStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionBusinessStatus"));
			virtualBorderRouterType.setDescription(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Description"));
			virtualBorderRouterType.setTerminationTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].TerminationTime"));
			virtualBorderRouterType.setMinRxInterval(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].MinRxInterval"));
			virtualBorderRouterType.setPeerGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeerGatewayIp"));
			virtualBorderRouterType.setName(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Name"));
			virtualBorderRouterType.setVbrId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VbrId"));
			virtualBorderRouterType.setVlanId(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanId"));
			virtualBorderRouterType.setVlanInterfaceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanInterfaceId"));
			virtualBorderRouterType.setCircuitCode(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CircuitCode"));
			virtualBorderRouterType.setLocalIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].LocalIpv6GatewayIp"));
			virtualBorderRouterType.setLocalGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].LocalGatewayIp"));
			virtualBorderRouterType.setPeeringSubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeeringSubnetMask"));
			virtualBorderRouterType.setEnableIpv6(_ctx.booleanValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EnableIpv6"));
			virtualBorderRouterType.setRouteTableId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RouteTableId"));
			virtualBorderRouterType.setDetectMultiplier(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].DetectMultiplier"));
			virtualBorderRouterType.setEccId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EccId"));
			virtualBorderRouterType.setCloudBoxInstanceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CloudBoxInstanceId"));
			virtualBorderRouterType.setRecoveryTime(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RecoveryTime"));
			virtualBorderRouterType.setPhysicalConnectionStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionStatus"));
			virtualBorderRouterType.setPeeringIpv6SubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeeringIpv6SubnetMask"));
			virtualBorderRouterType.setAccessPointId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AccessPointId"));
			virtualBorderRouterType.setPConnVbrChargeType(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PConnVbrChargeType"));
			virtualBorderRouterType.setPhysicalConnectionId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionId"));
			virtualBorderRouterType.setBandwidth(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Bandwidth"));
			virtualBorderRouterType.setResourceGroupId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].ResourceGroupId"));
			virtualBorderRouterType.setEcrId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EcrId"));
			virtualBorderRouterType.setSitelinkEnable(_ctx.booleanValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].SitelinkEnable"));
			virtualBorderRouterType.setEcrAttatchStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EcrAttatchStatus"));
			virtualBorderRouterType.setEcrOwnerId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].EcrOwnerId"));
			virtualBorderRouterType.setMtu(_ctx.integerValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Mtu"));

			List<AssociatedPhysicalConnection> associatedPhysicalConnections = new ArrayList<AssociatedPhysicalConnection>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections.Length"); j++) {
				AssociatedPhysicalConnection associatedPhysicalConnection = new AssociatedPhysicalConnection();
				associatedPhysicalConnection.setStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].Status"));
				associatedPhysicalConnection.setVlanInterfaceId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].VlanInterfaceId"));
				associatedPhysicalConnection.setCircuitCode(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].CircuitCode"));
				associatedPhysicalConnection.setPeerIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeerIpv6GatewayIp"));
				associatedPhysicalConnection.setLocalIpv6GatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].LocalIpv6GatewayIp"));
				associatedPhysicalConnection.setPhysicalConnectionOwnerUid(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionOwnerUid"));
				associatedPhysicalConnection.setLocalGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].LocalGatewayIp"));
				associatedPhysicalConnection.setPhysicalConnectionBusinessStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionBusinessStatus"));
				associatedPhysicalConnection.setPeeringSubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeeringSubnetMask"));
				associatedPhysicalConnection.setEnableIpv6(_ctx.booleanValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].EnableIpv6"));
				associatedPhysicalConnection.setPhysicalConnectionStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionStatus"));
				associatedPhysicalConnection.setPeerGatewayIp(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeerGatewayIp"));
				associatedPhysicalConnection.setPeeringIpv6SubnetMask(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PeeringIpv6SubnetMask"));
				associatedPhysicalConnection.setPhysicalConnectionId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].PhysicalConnectionId"));
				associatedPhysicalConnection.setVlanId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedPhysicalConnections["+ j +"].VlanId"));

				associatedPhysicalConnections.add(associatedPhysicalConnection);
			}
			virtualBorderRouterType.setAssociatedPhysicalConnections(associatedPhysicalConnections);

			List<AssociatedCen> associatedCens = new ArrayList<AssociatedCen>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens.Length"); j++) {
				AssociatedCen associatedCen = new AssociatedCen();
				associatedCen.setCenOwnerId(_ctx.longValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenOwnerId"));
				associatedCen.setCenId(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenId"));
				associatedCen.setCenStatus(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AssociatedCens["+ j +"].CenStatus"));

				associatedCens.add(associatedCen);
			}
			virtualBorderRouterType.setAssociatedCens(associatedCens);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			virtualBorderRouterType.setTags(tags);

			virtualBorderRouterSet.add(virtualBorderRouterType);
		}
		describeVirtualBorderRoutersResponse.setVirtualBorderRouterSet(virtualBorderRouterSet);
	 
	 	return describeVirtualBorderRoutersResponse;
	}
}