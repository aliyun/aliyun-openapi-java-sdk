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

import com.aliyuncs.vpc.model.v20160428.DescribeRouteTablesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteTablesResponse.RouteTable;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteTablesResponse.RouteTable.RouteEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteTablesResponse.RouteTable.RouteEntry.NextHop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteTablesResponseUnmarshaller {

	public static DescribeRouteTablesResponse unmarshall(DescribeRouteTablesResponse describeRouteTablesResponse, UnmarshallerContext _ctx) {
		
		describeRouteTablesResponse.setRequestId(_ctx.stringValue("DescribeRouteTablesResponse.RequestId"));
		describeRouteTablesResponse.setPageSize(_ctx.integerValue("DescribeRouteTablesResponse.PageSize"));
		describeRouteTablesResponse.setPageNumber(_ctx.integerValue("DescribeRouteTablesResponse.PageNumber"));
		describeRouteTablesResponse.setTotalCount(_ctx.integerValue("DescribeRouteTablesResponse.TotalCount"));

		List<RouteTable> routeTables = new ArrayList<RouteTable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables.Length"); i++) {
			RouteTable routeTable = new RouteTable();
			routeTable.setCreationTime(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].CreationTime"));
			routeTable.setStatus(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].Status"));
			routeTable.setVRouterId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].VRouterId"));
			routeTable.setRouteTableType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableType"));
			routeTable.setResourceGroupId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].ResourceGroupId"));
			routeTable.setRouteTableId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].VSwitchIds["+ j +"]"));
			}
			routeTable.setVSwitchIds(vSwitchIds);

			List<RouteEntry> routeEntrys = new ArrayList<RouteEntry>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys.Length"); j++) {
				RouteEntry routeEntry = new RouteEntry();
				routeEntry.setType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Type"));
				routeEntry.setStatus(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Status"));
				routeEntry.setNextHopOppsiteType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopOppsiteType"));
				routeEntry.setNextHopType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopType"));
				routeEntry.setRouteEntryName(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].RouteEntryName"));
				routeEntry.setNextHopRegionId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopRegionId"));
				routeEntry.setRouteEntryId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].RouteEntryId"));
				routeEntry.setNextHopOppsiteRegionId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopOppsiteRegionId"));
				routeEntry.setInstanceId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].InstanceId"));
				routeEntry.setNextHopOppsiteInstanceId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopOppsiteInstanceId"));
				routeEntry.setRouteTableId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].RouteTableId"));
				routeEntry.setDescription(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Description"));
				routeEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].DestinationCidrBlock"));
				routeEntry.setPrivateIpAddress(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].PrivateIpAddress"));

				List<NextHop> nextHops = new ArrayList<NextHop>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops.Length"); k++) {
					NextHop nextHop = new NextHop();
					nextHop.setNextHopId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopId"));
					nextHop.setWeight(_ctx.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Weight"));
					nextHop.setNextHopOppsiteType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopOppsiteType"));
					nextHop.setNextHopType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopType"));
					nextHop.setEnabled(_ctx.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Enabled"));
					nextHop.setNextHopRegionId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopRegionId"));
					nextHop.setNextHopOppsiteRegionId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopOppsiteRegionId"));
					nextHop.setNextHopOppsiteInstanceId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopOppsiteInstanceId"));

					nextHops.add(nextHop);
				}
				routeEntry.setNextHops(nextHops);

				routeEntrys.add(routeEntry);
			}
			routeTable.setRouteEntrys(routeEntrys);

			routeTables.add(routeTable);
		}
		describeRouteTablesResponse.setRouteTables(routeTables);
	 
	 	return describeRouteTablesResponse;
	}
}