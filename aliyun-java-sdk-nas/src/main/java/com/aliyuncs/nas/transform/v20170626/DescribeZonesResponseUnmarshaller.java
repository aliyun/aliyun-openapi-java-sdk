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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeZonesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeZonesResponse.Zone;
import com.aliyuncs.nas.model.v20170626.DescribeZonesResponse.Zone.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));

			List<String> performance = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].Performance.Length"); j++) {
				performance.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Performance["+ j +"]"));
			}
			zone.setPerformance(performance);

			List<String> capacity = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].Capacity.Length"); j++) {
				capacity.add(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Capacity["+ j +"]"));
			}
			zone.setCapacity(capacity);

			List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].InstanceTypes.Length"); j++) {
				InstanceType instanceType = new InstanceType();
				instanceType.setStorageType(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].InstanceTypes["+ j +"].StorageType"));
				instanceType.setProtocolType(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].InstanceTypes["+ j +"].ProtocolType"));

				instanceTypes.add(instanceType);
			}
			zone.setInstanceTypes(instanceTypes);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}