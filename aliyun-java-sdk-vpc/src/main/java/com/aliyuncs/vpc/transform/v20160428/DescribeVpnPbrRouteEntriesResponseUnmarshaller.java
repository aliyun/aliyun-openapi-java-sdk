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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnPbrRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnPbrRouteEntriesResponseUnmarshaller {

	public static DescribeVpnPbrRouteEntriesResponse unmarshall(DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntriesResponse, UnmarshallerContext context) {
		
		describeVpnPbrRouteEntriesResponse.setRequestId(context.stringValue("DescribeVpnPbrRouteEntriesResponse.RequestId"));
		describeVpnPbrRouteEntriesResponse.setTotalCount(context.integerValue("DescribeVpnPbrRouteEntriesResponse.TotalCount"));
		describeVpnPbrRouteEntriesResponse.setPageNumber(context.integerValue("DescribeVpnPbrRouteEntriesResponse.PageNumber"));
		describeVpnPbrRouteEntriesResponse.setPageSize(context.integerValue("DescribeVpnPbrRouteEntriesResponse.PageSize"));

		List<VpnPbrRouteEntry> vpnPbrRouteEntries = new ArrayList<VpnPbrRouteEntry>();
		for (int i = 0; i < context.lengthValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries.Length"); i++) {
			VpnPbrRouteEntry vpnPbrRouteEntry = new VpnPbrRouteEntry();
			vpnPbrRouteEntry.setVpnInstanceId(context.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].VpnInstanceId"));
			vpnPbrRouteEntry.setRouteSource(context.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].RouteSource"));
			vpnPbrRouteEntry.setRouteDest(context.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].RouteDest"));
			vpnPbrRouteEntry.setNextHop(context.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].NextHop"));
			vpnPbrRouteEntry.setWeight(context.integerValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].Weight"));
			vpnPbrRouteEntry.setCreateTime(context.longValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].CreateTime"));
			vpnPbrRouteEntry.setState(context.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].State"));

			vpnPbrRouteEntries.add(vpnPbrRouteEntry);
		}
		describeVpnPbrRouteEntriesResponse.setVpnPbrRouteEntries(vpnPbrRouteEntries);
	 
	 	return describeVpnPbrRouteEntriesResponse;
	}
}