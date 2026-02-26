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

import com.aliyuncs.eiam.model.v20211201.ListNetworkZonesResponse;
import com.aliyuncs.eiam.model.v20211201.ListNetworkZonesResponse.NetworkZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkZonesResponseUnmarshaller {

	public static ListNetworkZonesResponse unmarshall(ListNetworkZonesResponse listNetworkZonesResponse, UnmarshallerContext _ctx) {
		
		listNetworkZonesResponse.setRequestId(_ctx.stringValue("ListNetworkZonesResponse.RequestId"));
		listNetworkZonesResponse.setTotalCount(_ctx.longValue("ListNetworkZonesResponse.TotalCount"));
		listNetworkZonesResponse.setNextToken(_ctx.stringValue("ListNetworkZonesResponse.NextToken"));
		listNetworkZonesResponse.setPreviousToken(_ctx.stringValue("ListNetworkZonesResponse.PreviousToken"));

		List<NetworkZone> networkZones = new ArrayList<NetworkZone>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkZonesResponse.NetworkZones.Length"); i++) {
			NetworkZone networkZone = new NetworkZone();
			networkZone.setInstanceId(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].InstanceId"));
			networkZone.setNetworkZoneId(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].NetworkZoneId"));
			networkZone.setNetworkZoneName(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].NetworkZoneName"));
			networkZone.setDescription(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].Description"));
			networkZone.setNetworkZoneType(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].NetworkZoneType"));
			networkZone.setVpcId(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].VpcId"));

			List<String> ipv4Cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNetworkZonesResponse.NetworkZones["+ i +"].Ipv4Cidrs.Length"); j++) {
				ipv4Cidrs.add(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].Ipv4Cidrs["+ j +"]"));
			}
			networkZone.setIpv4Cidrs(ipv4Cidrs);

			List<String> ipv6Cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNetworkZonesResponse.NetworkZones["+ i +"].Ipv6Cidrs.Length"); j++) {
				ipv6Cidrs.add(_ctx.stringValue("ListNetworkZonesResponse.NetworkZones["+ i +"].Ipv6Cidrs["+ j +"]"));
			}
			networkZone.setIpv6Cidrs(ipv6Cidrs);

			networkZones.add(networkZone);
		}
		listNetworkZonesResponse.setNetworkZones(networkZones);
	 
	 	return listNetworkZonesResponse;
	}
}