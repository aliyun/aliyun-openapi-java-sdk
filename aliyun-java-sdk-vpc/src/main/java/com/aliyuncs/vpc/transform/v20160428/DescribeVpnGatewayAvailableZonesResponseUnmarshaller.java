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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayAvailableZonesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayAvailableZonesResponse.AvailableZoneId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnGatewayAvailableZonesResponseUnmarshaller {

	public static DescribeVpnGatewayAvailableZonesResponse unmarshall(DescribeVpnGatewayAvailableZonesResponse describeVpnGatewayAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		describeVpnGatewayAvailableZonesResponse.setRequestId(_ctx.stringValue("DescribeVpnGatewayAvailableZonesResponse.RequestId"));
		describeVpnGatewayAvailableZonesResponse.setRegionId(_ctx.stringValue("DescribeVpnGatewayAvailableZonesResponse.RegionId"));

		List<AvailableZoneId> availableZoneIdList = new ArrayList<AvailableZoneId>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnGatewayAvailableZonesResponse.AvailableZoneIdList.Length"); i++) {
			AvailableZoneId availableZoneId = new AvailableZoneId();
			availableZoneId.setZoneId(_ctx.stringValue("DescribeVpnGatewayAvailableZonesResponse.AvailableZoneIdList["+ i +"].ZoneId"));
			availableZoneId.setZoneName(_ctx.stringValue("DescribeVpnGatewayAvailableZonesResponse.AvailableZoneIdList["+ i +"].ZoneName"));

			availableZoneIdList.add(availableZoneId);
		}
		describeVpnGatewayAvailableZonesResponse.setAvailableZoneIdList(availableZoneIdList);
	 
	 	return describeVpnGatewayAvailableZonesResponse;
	}
}