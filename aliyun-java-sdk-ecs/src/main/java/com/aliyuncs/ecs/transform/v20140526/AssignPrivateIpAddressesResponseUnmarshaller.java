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

import com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesResponse;
import com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignPrivateIpAddressesResponseUnmarshaller {

	public static AssignPrivateIpAddressesResponse unmarshall(AssignPrivateIpAddressesResponse assignPrivateIpAddressesResponse, UnmarshallerContext _ctx) {
		
		assignPrivateIpAddressesResponse.setRequestId(_ctx.stringValue("AssignPrivateIpAddressesResponse.RequestId"));

		AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet = new AssignedPrivateIpAddressesSet();
		assignedPrivateIpAddressesSet.setNetworkInterfaceId(_ctx.stringValue("AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet.NetworkInterfaceId"));

		List<String> privateIpSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet.PrivateIpSet.Length"); i++) {
			privateIpSet.add(_ctx.stringValue("AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet.PrivateIpSet["+ i +"]"));
		}
		assignedPrivateIpAddressesSet.setPrivateIpSet(privateIpSet);

		List<String> ipv4PrefixSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet.Ipv4PrefixSet.Length"); i++) {
			ipv4PrefixSet.add(_ctx.stringValue("AssignPrivateIpAddressesResponse.AssignedPrivateIpAddressesSet.Ipv4PrefixSet["+ i +"]"));
		}
		assignedPrivateIpAddressesSet.setIpv4PrefixSet(ipv4PrefixSet);
		assignPrivateIpAddressesResponse.setAssignedPrivateIpAddressesSet(assignedPrivateIpAddressesSet);
	 
	 	return assignPrivateIpAddressesResponse;
	}
}