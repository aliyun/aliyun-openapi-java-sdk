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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniResponse.NetworkInterfaceSet;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniResponse.NetworkInterfaceSet.AssociatedPublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniResponse.NetworkInterfaceSet.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeEniResponseUnmarshaller {

	public static InnerDescribeEniResponse unmarshall(InnerDescribeEniResponse innerDescribeEniResponse, UnmarshallerContext context) {
		
		innerDescribeEniResponse.setRequestId(context.stringValue("InnerDescribeEniResponse.RequestId"));
		innerDescribeEniResponse.setTotalCount(context.integerValue("InnerDescribeEniResponse.TotalCount"));
		innerDescribeEniResponse.setPageNumber(context.integerValue("InnerDescribeEniResponse.PageNumber"));
		innerDescribeEniResponse.setPageSize(context.integerValue("InnerDescribeEniResponse.PageSize"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < context.lengthValue("InnerDescribeEniResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setNetworkInterfaceId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setStatus(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setType(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setVpcId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setVSwitchId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setZoneId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));
			networkInterfaceSet.setMacAddress(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setNetworkInterfaceName(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setDescription(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setInstanceId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setCreationTime(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].CreationTime"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setPublicIpAddress(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp.setAllocationId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < context.lengthValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(context.booleanValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setPublicIpAddress(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				associatedPublicIp1.setAllocationId(context.stringValue("InnerDescribeEniResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		innerDescribeEniResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return innerDescribeEniResponse;
	}
}