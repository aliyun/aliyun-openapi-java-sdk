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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAvailabilityZonesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAvailabilityZonesResponse.AvailableZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailabilityZonesResponseUnmarshaller {

	public static DescribeAvailabilityZonesResponse unmarshall(DescribeAvailabilityZonesResponse describeAvailabilityZonesResponse, UnmarshallerContext _ctx) {
		
		describeAvailabilityZonesResponse.setRequestId(_ctx.stringValue("DescribeAvailabilityZonesResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailabilityZonesResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailabilityZonesResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setZoneName(_ctx.stringValue("DescribeAvailabilityZonesResponse.AvailableZones["+ i +"].ZoneName"));
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailabilityZonesResponse.AvailableZones["+ i +"].RegionId"));

			availableZones.add(availableZone);
		}
		describeAvailabilityZonesResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailabilityZonesResponse;
	}
}