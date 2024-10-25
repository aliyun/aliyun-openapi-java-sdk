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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeNetworkInterfacesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkInterfacesResponse.NetworkInterfaceSet;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.Ipv6Set;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfacesResponseUnmarshaller {

	public static DescribeNetworkInterfacesResponse unmarshall(DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInterfacesResponse.setRequestId(_ctx.stringValue("DescribeNetworkInterfacesResponse.RequestId"));
		describeNetworkInterfacesResponse.setPageNumber(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageNumber"));
		describeNetworkInterfacesResponse.setPageSize(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageSize"));
		describeNetworkInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeNetworkInterfacesResponse.TotalCount"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setCreationTime(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setEnsRegionId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].EnsRegionId"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setInstanceName(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceName"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setPrimaryIp(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrimaryIp"));
			networkInterfaceSet.setPrimaryIpType(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrimaryIpType"));
			networkInterfaceSet.setStatus(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setNetworkId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkId"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setNetworkInterfaceName(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setDescription(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setType(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Type"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(_ctx.booleanValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets.Length"); j++) {
				Ipv6Set ipv6Set = new Ipv6Set();
				ipv6Set.setIpv6Address(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets["+ j +"].Ipv6Address"));

				ipv6Sets.add(ipv6Set);
			}
			networkInterfaceSet.setIpv6Sets(ipv6Sets);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		describeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return describeNetworkInterfacesResponse;
	}
}