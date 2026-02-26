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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeZonesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeZonesResponse.ZonesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<ZonesItem> zones = new ArrayList<ZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			ZonesItem zonesItem = new ZonesItem();
			zonesItem.setModeCode(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ModeCode"));
			zonesItem.setPriority(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Priority"));
			zonesItem.setStatus(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Status"));
			zonesItem.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));

			zones.add(zonesItem);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}