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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeZonesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeZonesResponse.KVStoreZone;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext context) {
		
		describeZonesResponse.setRequestId(context.stringValue("DescribeZonesResponse.RequestId"));

		List<KVStoreZone> zones = new ArrayList<KVStoreZone>();
		for (int i = 0; i < context.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			KVStoreZone kVStoreZone = new KVStoreZone();
			kVStoreZone.setRegionId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].RegionId"));
			kVStoreZone.setZoneId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			kVStoreZone.setZoneName(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneName"));
			kVStoreZone.setSwitchNetwork(context.booleanValue("DescribeZonesResponse.Zones["+ i +"].SwitchNetwork"));
			kVStoreZone.setIsRds(context.booleanValue("DescribeZonesResponse.Zones["+ i +"].IsRds"));

			zones.add(kVStoreZone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}