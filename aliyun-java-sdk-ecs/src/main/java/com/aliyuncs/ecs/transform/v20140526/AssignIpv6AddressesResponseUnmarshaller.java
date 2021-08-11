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

import com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignIpv6AddressesResponseUnmarshaller {

	public static AssignIpv6AddressesResponse unmarshall(AssignIpv6AddressesResponse assignIpv6AddressesResponse, UnmarshallerContext _ctx) {
		
		assignIpv6AddressesResponse.setRequestId(_ctx.stringValue("AssignIpv6AddressesResponse.RequestId"));
		assignIpv6AddressesResponse.setNetworkInterfaceId(_ctx.stringValue("AssignIpv6AddressesResponse.NetworkInterfaceId"));

		List<String> ipv6Sets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AssignIpv6AddressesResponse.Ipv6Sets.Length"); i++) {
			ipv6Sets.add(_ctx.stringValue("AssignIpv6AddressesResponse.Ipv6Sets["+ i +"]"));
		}
		assignIpv6AddressesResponse.setIpv6Sets(ipv6Sets);
	 
	 	return assignIpv6AddressesResponse;
	}
}