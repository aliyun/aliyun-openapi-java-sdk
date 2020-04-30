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

import com.aliyuncs.vpc.model.v20160428.DescribeRouteEntryListResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteEntryListResponse.RouteEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteEntryListResponse.RouteEntry.NextHop;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteEntryListResponse.RouteEntry.NextHop.NextHopRelatedInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteEntryListResponseUnmarshaller {

	public static DescribeRouteEntryListResponse unmarshall(DescribeRouteEntryListResponse describeRouteEntryListResponse, UnmarshallerContext _ctx) {
		
		describeRouteEntryListResponse.setRequestId(_ctx.stringValue("DescribeRouteEntryListResponse.RequestId"));
		describeRouteEntryListResponse.setNextToken(_ctx.stringValue("DescribeRouteEntryListResponse.NextToken"));

		List<RouteEntry> routeEntrys = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteEntryListResponse.RouteEntrys.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setRouteTableId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].RouteTableId"));
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].DestinationCidrBlock"));
			routeEntry.setType(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].Type"));
			routeEntry.setRouteEntryId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].RouteEntryId"));
			routeEntry.setRouteEntryName(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].RouteEntryName"));
			routeEntry.setDescription(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].Description"));
			routeEntry.setStatus(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].Status"));
			routeEntry.setIpVersion(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].IpVersion"));

			List<NextHop> nextHops = new ArrayList<NextHop>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops.Length"); j++) {
				NextHop nextHop = new NextHop();
				nextHop.setNextHopType(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopType"));
				nextHop.setNextHopId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopId"));
				nextHop.setEnabled(_ctx.integerValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].Enabled"));
				nextHop.setWeight(_ctx.integerValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].Weight"));
				nextHop.setNextHopRegionId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopRegionId"));

				NextHopRelatedInfo nextHopRelatedInfo = new NextHopRelatedInfo();
				nextHopRelatedInfo.setInstanceType(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopRelatedInfo.InstanceType"));
				nextHopRelatedInfo.setRegionId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopRelatedInfo.RegionId"));
				nextHopRelatedInfo.setInstanceId(_ctx.stringValue("DescribeRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopRelatedInfo.InstanceId"));
				nextHop.setNextHopRelatedInfo(nextHopRelatedInfo);

				nextHops.add(nextHop);
			}
			routeEntry.setNextHops(nextHops);

			routeEntrys.add(routeEntry);
		}
		describeRouteEntryListResponse.setRouteEntrys(routeEntrys);
	 
	 	return describeRouteEntryListResponse;
	}
}