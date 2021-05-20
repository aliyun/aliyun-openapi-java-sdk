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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointZonesResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointZonesResponse.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointZonesResponseUnmarshaller {

	public static ListVpcEndpointZonesResponse unmarshall(ListVpcEndpointZonesResponse listVpcEndpointZonesResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointZonesResponse.setRequestId(_ctx.stringValue("ListVpcEndpointZonesResponse.RequestId"));
		listVpcEndpointZonesResponse.setNextToken(_ctx.stringValue("ListVpcEndpointZonesResponse.NextToken"));
		listVpcEndpointZonesResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointZonesResponse.MaxResults"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setEniId(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].EniId"));
			zone.setZoneId(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setServiceStatus(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].ServiceStatus"));
			zone.setVSwitchId(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].VSwitchId"));
			zone.setEniIp(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].EniIp"));
			zone.setZoneStatus(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].ZoneStatus"));
			zone.setRegionId(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].RegionId"));
			zone.setZoneDomain(_ctx.stringValue("ListVpcEndpointZonesResponse.Zones["+ i +"].ZoneDomain"));

			zones.add(zone);
		}
		listVpcEndpointZonesResponse.setZones(zones);
	 
	 	return listVpcEndpointZonesResponse;
	}
}