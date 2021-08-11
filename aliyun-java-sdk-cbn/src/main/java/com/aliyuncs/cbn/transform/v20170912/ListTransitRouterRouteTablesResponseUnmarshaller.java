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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTablesResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTablesResponse.TransitRouterRouteTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterRouteTablesResponseUnmarshaller {

	public static ListTransitRouterRouteTablesResponse unmarshall(ListTransitRouterRouteTablesResponse listTransitRouterRouteTablesResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterRouteTablesResponse.setRequestId(_ctx.stringValue("ListTransitRouterRouteTablesResponse.RequestId"));
		listTransitRouterRouteTablesResponse.setTotalCount(_ctx.integerValue("ListTransitRouterRouteTablesResponse.TotalCount"));
		listTransitRouterRouteTablesResponse.setMaxResults(_ctx.integerValue("ListTransitRouterRouteTablesResponse.MaxResults"));
		listTransitRouterRouteTablesResponse.setNextToken(_ctx.stringValue("ListTransitRouterRouteTablesResponse.NextToken"));

		List<TransitRouterRouteTable> transitRouterRouteTables = new ArrayList<TransitRouterRouteTable>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables.Length"); i++) {
			TransitRouterRouteTable transitRouterRouteTable = new TransitRouterRouteTable();
			transitRouterRouteTable.setTransitRouterRouteTableStatus(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].TransitRouterRouteTableStatus"));
			transitRouterRouteTable.setTransitRouterRouteTableName(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].TransitRouterRouteTableName"));
			transitRouterRouteTable.setTransitRouterRouteTableId(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].TransitRouterRouteTableId"));
			transitRouterRouteTable.setTransitRouterRouteTableDescription(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].TransitRouterRouteTableDescription"));
			transitRouterRouteTable.setTransitRouterRouteTableType(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].TransitRouterRouteTableType"));
			transitRouterRouteTable.setCreateTime(_ctx.stringValue("ListTransitRouterRouteTablesResponse.TransitRouterRouteTables["+ i +"].CreateTime"));

			transitRouterRouteTables.add(transitRouterRouteTable);
		}
		listTransitRouterRouteTablesResponse.setTransitRouterRouteTables(transitRouterRouteTables);
	 
	 	return listTransitRouterRouteTablesResponse;
	}
}