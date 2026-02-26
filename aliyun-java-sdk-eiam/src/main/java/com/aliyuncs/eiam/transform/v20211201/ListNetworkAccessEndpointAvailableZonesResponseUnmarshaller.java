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

import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointAvailableZonesResponse;
import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointAvailableZonesResponse.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkAccessEndpointAvailableZonesResponseUnmarshaller {

	public static ListNetworkAccessEndpointAvailableZonesResponse unmarshall(ListNetworkAccessEndpointAvailableZonesResponse listNetworkAccessEndpointAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		listNetworkAccessEndpointAvailableZonesResponse.setRequestId(_ctx.stringValue("ListNetworkAccessEndpointAvailableZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkAccessEndpointAvailableZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("ListNetworkAccessEndpointAvailableZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(_ctx.stringValue("ListNetworkAccessEndpointAvailableZonesResponse.Zones["+ i +"].LocalName"));

			zones.add(zone);
		}
		listNetworkAccessEndpointAvailableZonesResponse.setZones(zones);
	 
	 	return listNetworkAccessEndpointAvailableZonesResponse;
	}
}