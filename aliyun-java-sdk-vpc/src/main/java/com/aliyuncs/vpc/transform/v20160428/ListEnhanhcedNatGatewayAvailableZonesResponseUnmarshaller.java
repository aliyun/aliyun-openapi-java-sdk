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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListEnhanhcedNatGatewayAvailableZonesResponse;
import com.aliyuncs.vpc.model.v20160428.ListEnhanhcedNatGatewayAvailableZonesResponse.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnhanhcedNatGatewayAvailableZonesResponseUnmarshaller {

	public static ListEnhanhcedNatGatewayAvailableZonesResponse unmarshall(ListEnhanhcedNatGatewayAvailableZonesResponse listEnhanhcedNatGatewayAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		listEnhanhcedNatGatewayAvailableZonesResponse.setRequestId(_ctx.stringValue("ListEnhanhcedNatGatewayAvailableZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("ListEnhanhcedNatGatewayAvailableZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("ListEnhanhcedNatGatewayAvailableZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(_ctx.stringValue("ListEnhanhcedNatGatewayAvailableZonesResponse.Zones["+ i +"].LocalName"));

			zones.add(zone);
		}
		listEnhanhcedNatGatewayAvailableZonesResponse.setZones(zones);
	 
	 	return listEnhanhcedNatGatewayAvailableZonesResponse;
	}
}