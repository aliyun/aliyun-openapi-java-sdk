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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetNetworkZoneResponse;
import com.aliyuncs.eiam.model.v20211201.GetNetworkZoneResponse.NetworkZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetworkZoneResponseUnmarshaller {

	public static GetNetworkZoneResponse unmarshall(GetNetworkZoneResponse getNetworkZoneResponse, UnmarshallerContext _ctx) {
		
		getNetworkZoneResponse.setRequestId(_ctx.stringValue("GetNetworkZoneResponse.RequestId"));

		NetworkZone networkZone = new NetworkZone();
		networkZone.setInstanceId(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.InstanceId"));
		networkZone.setNetworkZoneId(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.NetworkZoneId"));
		networkZone.setNetworkZoneName(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.NetworkZoneName"));
		networkZone.setDescription(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.Description"));
		networkZone.setNetworkZoneType(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.NetworkZoneType"));
		networkZone.setVpcId(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.VpcId"));

		List<String> ipv4Cidrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkZoneResponse.NetworkZone.Ipv4Cidrs.Length"); i++) {
			ipv4Cidrs.add(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.Ipv4Cidrs["+ i +"]"));
		}
		networkZone.setIpv4Cidrs(ipv4Cidrs);

		List<String> ipv6Cidrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkZoneResponse.NetworkZone.Ipv6Cidrs.Length"); i++) {
			ipv6Cidrs.add(_ctx.stringValue("GetNetworkZoneResponse.NetworkZone.Ipv6Cidrs["+ i +"]"));
		}
		networkZone.setIpv6Cidrs(ipv6Cidrs);
		getNetworkZoneResponse.setNetworkZone(networkZone);
	 
	 	return getNetworkZoneResponse;
	}
}