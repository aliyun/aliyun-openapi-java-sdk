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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse.RouteTable;
import com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse.RouteTable.RouteEntry;
import com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse.RouteTable.RouteEntry.NextHop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteTablesResponseUnmarshaller {

	public static DescribeRouteTablesResponse unmarshall(DescribeRouteTablesResponse describeRouteTablesResponse, UnmarshallerContext _ctx) {
		
		describeRouteTablesResponse.setRequestId(_ctx.stringValue("DescribeRouteTablesResponse.RequestId"));
		describeRouteTablesResponse.setTotalCount(_ctx.integerValue("DescribeRouteTablesResponse.TotalCount"));
		describeRouteTablesResponse.setPageNumber(_ctx.integerValue("DescribeRouteTablesResponse.PageNumber"));
		describeRouteTablesResponse.setPageSize(_ctx.integerValue("DescribeRouteTablesResponse.PageSize"));

		List<RouteTable> routeTables = new ArrayList<RouteTable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables.Length"); i++) {
			RouteTable routeTable = new RouteTable();
			routeTable.setVRouterId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].VRouterId"));
			routeTable.setRouteTableId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableId"));
			routeTable.setRouteTableType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableType"));
			routeTable.setCreationTime(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].CreationTime"));
			routeTable.setResourceGroupId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].ResourceGroupId"));

			List<RouteEntry> routeEntrys = new ArrayList<RouteEntry>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys.Length"); j++) {
				RouteEntry routeEntry = new RouteEntry();
				routeEntry.setRouteTableId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].RouteTableId"));
				routeEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].DestinationCidrBlock"));
				routeEntry.setType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Type"));
				routeEntry.setStatus(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Status"));
				routeEntry.setInstanceId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].InstanceId"));
				routeEntry.setNextHopType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopType"));

				List<NextHop> nextHops = new ArrayList<NextHop>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops.Length"); k++) {
					NextHop nextHop = new NextHop();
					nextHop.setNextHopType(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopType"));
					nextHop.setNextHopId(_ctx.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopId"));
					nextHop.setEnabled(_ctx.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Enabled"));
					nextHop.setWeight(_ctx.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Weight"));

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