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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfacesResponseUnmarshaller {

	public static DescribeNetworkInterfacesResponse unmarshall(DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInterfacesResponse.setRequestId(_ctx.stringValue("DescribeNetworkInterfacesResponse.RequestId"));
		describeNetworkInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeNetworkInterfacesResponse.TotalCount"));
		describeNetworkInterfacesResponse.setPageNumber(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageNumber"));
		describeNetworkInterfacesResponse.setPageSize(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageSize"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setStatus(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setPrimaryIp(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrimaryIp"));
			networkInterfaceSet.setEnsRegionId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].EnsRegionId"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setCreationTime(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setPrimaryIpType(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrimaryIpType"));

			networkInterfaceSets.add(networkInterfaceSet);
		}
		describeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return describeNetworkInterfacesResponse;
	}
}