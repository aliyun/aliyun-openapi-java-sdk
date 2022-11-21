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

	public static DescribeVpnPbrRouteEntriesResponse unmarshall(DescribeVpnPbrRouteEntriesResponse describeVpnPbrRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeVpnPbrRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.RequestId"));
		describeVpnPbrRouteEntriesResponse.setPageSize(_ctx.integerValue("DescribeVpnPbrRouteEntriesResponse.PageSize"));
		describeVpnPbrRouteEntriesResponse.setPageNumber(_ctx.integerValue("DescribeVpnPbrRouteEntriesResponse.PageNumber"));
		describeVpnPbrRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeVpnPbrRouteEntriesResponse.TotalCount"));

		List<VpnPbrRouteEntry> vpnPbrRouteEntries = new ArrayList<VpnPbrRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries.Length"); i++) {
			VpnPbrRouteEntry vpnPbrRouteEntry = new VpnPbrRouteEntry();
			vpnPbrRouteEntry.setNextHop(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].NextHop"));
			vpnPbrRouteEntry.setWeight(_ctx.integerValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].Weight"));
			vpnPbrRouteEntry.setRouteDest(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].RouteDest"));
			vpnPbrRouteEntry.setState(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].State"));
			vpnPbrRouteEntry.setCreateTime(_ctx.longValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].CreateTime"));
			vpnPbrRouteEntry.setVpnInstanceId(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].VpnInstanceId"));
			vpnPbrRouteEntry.setRouteSource(_ctx.stringValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].RouteSource"));
			vpnPbrRouteEntry.setPriority(_ctx.integerValue("DescribeVpnPbrRouteEntriesResponse.VpnPbrRouteEntries["+ i +"].Priority"));

			vpnPbrRouteEntries.add(vpnPbrRouteEntry);
		}
		describeVpnPbrRouteEntriesResponse.setVpnPbrRouteEntries(vpnPbrRouteEntries);
	 
	 	return describeVpnPbrRouteEntriesResponse;
	}
}