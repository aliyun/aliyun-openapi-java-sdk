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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnRouteEntriesResponse.VpnRouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnRouteEntriesResponseUnmarshaller {

	public static DescribeVpnRouteEntriesResponse unmarshall(DescribeVpnRouteEntriesResponse describeVpnRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeVpnRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeVpnRouteEntriesResponse.RequestId"));
		describeVpnRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeVpnRouteEntriesResponse.TotalCount"));
		describeVpnRouteEntriesResponse.setPageNumber(_ctx.integerValue("DescribeVpnRouteEntriesResponse.PageNumber"));
		describeVpnRouteEntriesResponse.setPageSize(_ctx.integerValue("DescribeVpnRouteEntriesResponse.PageSize"));

		List<VpnRouteEntry> vpnRouteEntries = new ArrayList<VpnRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries.Length"); i++) {
			VpnRouteEntry vpnRouteEntry = new VpnRouteEntry();
			vpnRouteEntry.setVpnInstanceId(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].VpnInstanceId"));
			vpnRouteEntry.setRouteDest(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].RouteDest"));
			vpnRouteEntry.setNextHop(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].NextHop"));
			vpnRouteEntry.setWeight(_ctx.integerValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].Weight"));
			vpnRouteEntry.setCreateTime(_ctx.longValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].CreateTime"));
			vpnRouteEntry.setState(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].State"));
			vpnRouteEntry.setAsPath(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].AsPath"));
			vpnRouteEntry.setCommunity(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].Community"));
			vpnRouteEntry.setSource(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].Source"));
			vpnRouteEntry.setRouteEntryType(_ctx.stringValue("DescribeVpnRouteEntriesResponse.VpnRouteEntries["+ i +"].RouteEntryType"));

			vpnRouteEntries.add(vpnRouteEntry);
		}
		describeVpnRouteEntriesResponse.setVpnRouteEntries(vpnRouteEntries);
	 
	 	return describeVpnRouteEntriesResponse;
	}
}