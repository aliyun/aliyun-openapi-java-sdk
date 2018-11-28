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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteTablesResponseUnmarshaller {

	public static DescribeRouteTablesResponse unmarshall(DescribeRouteTablesResponse describeRouteTablesResponse, UnmarshallerContext context) {
		
		describeRouteTablesResponse.setRequestId(context.stringValue("DescribeRouteTablesResponse.RequestId"));
		describeRouteTablesResponse.setTotalCount(context.integerValue("DescribeRouteTablesResponse.TotalCount"));
		describeRouteTablesResponse.setPageNumber(context.integerValue("DescribeRouteTablesResponse.PageNumber"));
		describeRouteTablesResponse.setPageSize(context.integerValue("DescribeRouteTablesResponse.PageSize"));

		List<RouteTable> routeTables = new ArrayList<RouteTable>();
		for (int i = 0; i < context.lengthValue("DescribeRouteTablesResponse.RouteTables.Length"); i++) {
			RouteTable routeTable = new RouteTable();
			routeTable.setVRouterId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].VRouterId"));
			routeTable.setRouteTableId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableId"));
			routeTable.setRouteTableType(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteTableType"));
			routeTable.setCreationTime(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].CreationTime"));
			routeTable.setResourceGroupId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].ResourceGroupId"));

			List<RouteEntry> routeEntrys = new ArrayList<RouteEntry>();
			for (int j = 0; j < context.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys.Length"); j++) {
				RouteEntry routeEntry = new RouteEntry();
				routeEntry.setRouteTableId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].RouteTableId"));
				routeEntry.setDestinationCidrBlock(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].DestinationCidrBlock"));
				routeEntry.setType(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Type"));
				routeEntry.setStatus(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].Status"));
				routeEntry.setInstanceId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].InstanceId"));
				routeEntry.setNextHopType(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHopType"));

				List<NextHop> nextHops = new ArrayList<NextHop>();
				for (int k = 0; k < context.lengthValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops.Length"); k++) {
					NextHop nextHop = new NextHop();
					nextHop.setNextHopType(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopType"));
					nextHop.setNextHopId(context.stringValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].NextHopId"));
					nextHop.setEnabled(context.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Enabled"));
					nextHop.setWeight(context.integerValue("DescribeRouteTablesResponse.RouteTables["+ i +"].RouteEntrys["+ j +"].NextHops["+ k +"].Weight"));

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