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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeZonesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeZonesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<Data> zones = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Data data = new Data();
			data.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			data.setZoneName(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneName"));
			data.setSeries(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Series"));
			data.setDeployType(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].DeployType"));

			zones.add(data);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}