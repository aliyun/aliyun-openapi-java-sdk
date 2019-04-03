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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeUisNetworkInterfacesResponse;
import com.aliyuncs.uis.model.v20180821.DescribeUisNetworkInterfacesResponse.NetworkInterface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUisNetworkInterfacesResponseUnmarshaller {

	public static DescribeUisNetworkInterfacesResponse unmarshall(DescribeUisNetworkInterfacesResponse describeUisNetworkInterfacesResponse, UnmarshallerContext context) {
		
		describeUisNetworkInterfacesResponse.setRequestId(context.stringValue("DescribeUisNetworkInterfacesResponse.RequestId"));
		describeUisNetworkInterfacesResponse.setTotalCount(context.integerValue("DescribeUisNetworkInterfacesResponse.TotalCount"));
		describeUisNetworkInterfacesResponse.setPageNumber(context.integerValue("DescribeUisNetworkInterfacesResponse.PageNumber"));
		describeUisNetworkInterfacesResponse.setPageSize(context.integerValue("DescribeUisNetworkInterfacesResponse.PageSize"));

		List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
		for (int i = 0; i < context.lengthValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces.Length"); i++) {
			NetworkInterface networkInterface = new NetworkInterface();
			networkInterface.setUisNodeId(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].UisNodeId"));
			networkInterface.setUisEniId(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].UisEniId"));
			networkInterface.setNetworkInterfaceId(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].NetworkInterfaceId"));
			networkInterface.setVswitchId(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].VswitchId"));
			networkInterface.setSecurityGroupID(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].SecurityGroupID"));
			networkInterface.setIpAddress(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].IpAddress"));
			networkInterface.setState(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].State"));
			networkInterface.setLog(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].Log"));
			networkInterface.setName(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].Name"));
			networkInterface.setDescription(context.stringValue("DescribeUisNetworkInterfacesResponse.NetworkInterfaces["+ i +"].Description"));

			networkInterfaces.add(networkInterface);
		}
		describeUisNetworkInterfacesResponse.setNetworkInterfaces(networkInterfaces);
	 
	 	return describeUisNetworkInterfacesResponse;
	}
}