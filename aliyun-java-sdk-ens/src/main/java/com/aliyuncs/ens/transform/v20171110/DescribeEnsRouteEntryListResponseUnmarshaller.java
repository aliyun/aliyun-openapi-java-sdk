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

import com.aliyuncs.ens.model.v20171110.DescribeEnsRouteEntryListResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRouteEntryListResponse.RouteEntry;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRouteEntryListResponse.RouteEntry.NextHop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsRouteEntryListResponseUnmarshaller {

	public static DescribeEnsRouteEntryListResponse unmarshall(DescribeEnsRouteEntryListResponse describeEnsRouteEntryListResponse, UnmarshallerContext _ctx) {
		
		describeEnsRouteEntryListResponse.setRequestId(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RequestId"));
		describeEnsRouteEntryListResponse.setPageNumber(_ctx.integerValue("DescribeEnsRouteEntryListResponse.PageNumber"));
		describeEnsRouteEntryListResponse.setPageSize(_ctx.integerValue("DescribeEnsRouteEntryListResponse.PageSize"));
		describeEnsRouteEntryListResponse.setTotalCount(_ctx.integerValue("DescribeEnsRouteEntryListResponse.TotalCount"));

		List<RouteEntry> routeEntrys = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsRouteEntryListResponse.RouteEntrys.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setStatus(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].Status"));
			routeEntry.setType(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].Type"));
			routeEntry.setDescription(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].Description"));
			routeEntry.setRouteEntryName(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].RouteEntryName"));
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].DestinationCidrBlock"));
			routeEntry.setRouteEntryId(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].RouteEntryId"));
			routeEntry.setRouteTableId(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].RouteTableId"));

			List<NextHop> nextHops = new ArrayList<NextHop>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].NextHops.Length"); j++) {
				NextHop nextHop = new NextHop();
				nextHop.setNextHopId(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopId"));
				nextHop.setNextHopType(_ctx.stringValue("DescribeEnsRouteEntryListResponse.RouteEntrys["+ i +"].NextHops["+ j +"].NextHopType"));

				nextHops.add(nextHop);
			}
			routeEntry.setNextHops(nextHops);

			routeEntrys.add(routeEntry);
		}
		describeEnsRouteEntryListResponse.setRouteEntrys(routeEntrys);
	 
	 	return describeEnsRouteEntryListResponse;
	}
}