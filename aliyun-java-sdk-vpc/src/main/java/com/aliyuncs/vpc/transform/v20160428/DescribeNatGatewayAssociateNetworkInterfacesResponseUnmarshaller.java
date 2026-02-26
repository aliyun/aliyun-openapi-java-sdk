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

import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewayAssociateNetworkInterfacesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterface;
import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterface.IPv4Set;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNatGatewayAssociateNetworkInterfacesResponseUnmarshaller {

	public static DescribeNatGatewayAssociateNetworkInterfacesResponse unmarshall(DescribeNatGatewayAssociateNetworkInterfacesResponse describeNatGatewayAssociateNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeNatGatewayAssociateNetworkInterfacesResponse.setRequestId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.RequestId"));
		describeNatGatewayAssociateNetworkInterfacesResponse.setNextToken(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.NextToken"));
		describeNatGatewayAssociateNetworkInterfacesResponse.setMaxResults(_ctx.integerValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.MaxResults"));
		describeNatGatewayAssociateNetworkInterfacesResponse.setNatGatewayId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.NatGatewayId"));
		describeNatGatewayAssociateNetworkInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.TotalCount"));
		describeNatGatewayAssociateNetworkInterfacesResponse.setCount(_ctx.integerValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.Count"));

		List<AssociateNetworkInterface> associateNetworkInterfaces = new ArrayList<AssociateNetworkInterface>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces.Length"); i++) {
			AssociateNetworkInterface associateNetworkInterface = new AssociateNetworkInterface();
			associateNetworkInterface.setNetworkInterfaceId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].NetworkInterfaceId"));
			associateNetworkInterface.setResourceId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].ResourceId"));
			associateNetworkInterface.setResourceType(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].ResourceType"));
			associateNetworkInterface.setResourceOwnerId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].ResourceOwnerId"));
			associateNetworkInterface.setTunnelIndex(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].TunnelIndex"));
			associateNetworkInterface.setResourceVpcId(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].ResourceVpcId"));

			List<IPv4Set> iPv4Sets = new ArrayList<IPv4Set>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].IPv4Sets.Length"); j++) {
				IPv4Set iPv4Set = new IPv4Set();
				iPv4Set.setIPv4Address(_ctx.stringValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].IPv4Sets["+ j +"].IPv4Address"));
				iPv4Set.setPrimary(_ctx.booleanValue("DescribeNatGatewayAssociateNetworkInterfacesResponse.AssociateNetworkInterfaces["+ i +"].IPv4Sets["+ j +"].Primary"));

				iPv4Sets.add(iPv4Set);
			}
			associateNetworkInterface.setIPv4Sets(iPv4Sets);

			associateNetworkInterfaces.add(associateNetworkInterface);
		}
		describeNatGatewayAssociateNetworkInterfacesResponse.setAssociateNetworkInterfaces(associateNetworkInterfaces);
	 
	 	return describeNatGatewayAssociateNetworkInterfacesResponse;
	}
}