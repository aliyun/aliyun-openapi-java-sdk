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

package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocs.model.v20150301.DescribeZonesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeZonesResponse.OcsZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext context) {
		
		describeZonesResponse.setRequestId(context.stringValue("DescribeZonesResponse.RequestId"));

		List<OcsZone> zones = new ArrayList<OcsZone>();
		for (int i = 0; i < context.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			OcsZone ocsZone = new OcsZone();
			ocsZone.setZoneId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			ocsZone.setName(context.stringValue("DescribeZonesResponse.Zones["+ i +"].Name"));
			ocsZone.setDescription(context.stringValue("DescribeZonesResponse.Zones["+ i +"].Description"));

			zones.add(ocsZone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}