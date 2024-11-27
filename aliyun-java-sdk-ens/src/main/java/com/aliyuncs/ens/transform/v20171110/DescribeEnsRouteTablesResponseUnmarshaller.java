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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsRouteTablesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRouteTablesResponse.RouteTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsRouteTablesResponseUnmarshaller {

	public static DescribeEnsRouteTablesResponse unmarshall(DescribeEnsRouteTablesResponse describeEnsRouteTablesResponse, UnmarshallerContext _ctx) {
		
		describeEnsRouteTablesResponse.setRequestId(_ctx.stringValue("DescribeEnsRouteTablesResponse.RequestId"));
		describeEnsRouteTablesResponse.setPageNumber(_ctx.integerValue("DescribeEnsRouteTablesResponse.PageNumber"));
		describeEnsRouteTablesResponse.setTotalCount(_ctx.integerValue("DescribeEnsRouteTablesResponse.TotalCount"));
		describeEnsRouteTablesResponse.setPageSize(_ctx.integerValue("DescribeEnsRouteTablesResponse.PageSize"));

		List<RouteTable> routeTables = new ArrayList<RouteTable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsRouteTablesResponse.RouteTables.Length"); i++) {
			RouteTable routeTable = new RouteTable();
			routeTable.setCreationTime(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].CreationTime"));
			routeTable.setStatus(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].Status"));
			routeTable.setRouteTableId(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].RouteTableId"));
			routeTable.setNetworkId(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].NetworkId"));
			routeTable.setEnsRegionId(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].EnsRegionId"));
			routeTable.setType(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].Type"));
			routeTable.setRouteTableName(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].RouteTableName"));
			routeTable.setNetworkName(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].NetworkName"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeEnsRouteTablesResponse.RouteTables["+ i +"].VSwitchIds["+ j +"]"));
			}
			routeTable.setVSwitchIds(vSwitchIds);

			routeTables.add(routeTable);
		}
		describeEnsRouteTablesResponse.setRouteTables(routeTables);
	 
	 	return describeEnsRouteTablesResponse;
	}
}