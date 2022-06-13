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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListZonesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListZonesResponse.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListZonesResponseUnmarshaller {

	public static ListZonesResponse unmarshall(ListZonesResponse listZonesResponse, UnmarshallerContext _ctx) {
		
		listZonesResponse.setRequestId(_ctx.stringValue("ListZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("ListZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("ListZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(_ctx.stringValue("ListZonesResponse.Zones["+ i +"].LocalName"));

			zones.add(zone);
		}
		listZonesResponse.setZones(zones);
	 
	 	return listZonesResponse;
	}
}