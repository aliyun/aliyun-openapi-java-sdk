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

import com.aliyuncs.vpc.model.v20160428.DescribeVcoRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVcoRouteEntriesResponse.VcoRouteEntrie;
import com.aliyuncs.vpc.model.v20160428.DescribeVcoRouteEntriesResponse.VpnRouteCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVcoRouteEntriesResponseUnmarshaller {

	public static DescribeVcoRouteEntriesResponse unmarshall(DescribeVcoRouteEntriesResponse describeVcoRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeVcoRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeVcoRouteEntriesResponse.RequestId"));
		describeVcoRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeVcoRouteEntriesResponse.TotalCount"));
		describeVcoRouteEntriesResponse.setPageNumber(_ctx.integerValue("DescribeVcoRouteEntriesResponse.PageNumber"));
		describeVcoRouteEntriesResponse.setPageSize(_ctx.integerValue("DescribeVcoRouteEntriesResponse.PageSize"));

		List<VcoRouteEntrie> vcoRouteEntries = new ArrayList<VcoRouteEntrie>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries.Length"); i++) {
			VcoRouteEntrie vcoRouteEntrie = new VcoRouteEntrie();
			vcoRouteEntrie.setVpnConnectionId(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].VpnConnectionId"));
			vcoRouteEntrie.setRouteDest(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].RouteDest"));
			vcoRouteEntrie.setNextHop(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].NextHop"));
			vcoRouteEntrie.setWeight(_ctx.integerValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].Weight"));
			vcoRouteEntrie.setState(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].State"));
			vcoRouteEntrie.setRouteEntryType(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].RouteEntryType"));
			vcoRouteEntrie.setCreateTime(_ctx.longValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].CreateTime"));
			vcoRouteEntrie.setAsPath(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].AsPath"));
			vcoRouteEntrie.setCommunity(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].Community"));
			vcoRouteEntrie.setSource(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].Source"));

			List<String> nextHopTunnelIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].NextHopTunnelIdList.Length"); j++) {
				nextHopTunnelIdList.add(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VcoRouteEntries["+ i +"].NextHopTunnelIdList["+ j +"]"));
			}
			vcoRouteEntrie.setNextHopTunnelIdList(nextHopTunnelIdList);

			vcoRouteEntries.add(vcoRouteEntrie);
		}
		describeVcoRouteEntriesResponse.setVcoRouteEntries(vcoRouteEntries);

		List<VpnRouteCount> vpnRouteCounts = new ArrayList<VpnRouteCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVcoRouteEntriesResponse.VpnRouteCounts.Length"); i++) {
			VpnRouteCount vpnRouteCount = new VpnRouteCount();
			vpnRouteCount.setRouteEntryType(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VpnRouteCounts["+ i +"].RouteEntryType"));
			vpnRouteCount.setRouteCount(_ctx.integerValue("DescribeVcoRouteEntriesResponse.VpnRouteCounts["+ i +"].RouteCount"));
			vpnRouteCount.setSource(_ctx.stringValue("DescribeVcoRouteEntriesResponse.VpnRouteCounts["+ i +"].Source"));

			vpnRouteCounts.add(vpnRouteCount);
		}
		describeVcoRouteEntriesResponse.setVpnRouteCounts(vpnRouteCounts);
	 
	 	return describeVcoRouteEntriesResponse;
	}
}