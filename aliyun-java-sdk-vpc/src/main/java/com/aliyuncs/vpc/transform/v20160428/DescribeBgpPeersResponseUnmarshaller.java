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

import com.aliyuncs.vpc.model.v20160428.DescribeBgpPeersResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBgpPeersResponse.BgpPeer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBgpPeersResponseUnmarshaller {

	public static DescribeBgpPeersResponse unmarshall(DescribeBgpPeersResponse describeBgpPeersResponse, UnmarshallerContext context) {
		
		describeBgpPeersResponse.setRequestId(context.stringValue("DescribeBgpPeersResponse.RequestId"));
		describeBgpPeersResponse.setTotalCount(context.integerValue("DescribeBgpPeersResponse.TotalCount"));
		describeBgpPeersResponse.setPageNumber(context.integerValue("DescribeBgpPeersResponse.PageNumber"));
		describeBgpPeersResponse.setPageSize(context.integerValue("DescribeBgpPeersResponse.PageSize"));

		List<BgpPeer> bgpPeers = new ArrayList<BgpPeer>();
		for (int i = 0; i < context.lengthValue("DescribeBgpPeersResponse.BgpPeers.Length"); i++) {
			BgpPeer bgpPeer = new BgpPeer();
			bgpPeer.setName(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Name"));
			bgpPeer.setDescription(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Description"));
			bgpPeer.setBgpPeerId(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpPeerId"));
			bgpPeer.setBgpGroupId(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpGroupId"));
			bgpPeer.setPeerIpAddress(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerIpAddress"));
			bgpPeer.setPeerAsn(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerAsn"));
			bgpPeer.setAuthKey(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].AuthKey"));
			bgpPeer.setRouterId(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouterId"));
			bgpPeer.setBgpStatus(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpStatus"));
			bgpPeer.setStatus(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Status"));
			bgpPeer.setKeepalive(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Keepalive"));
			bgpPeer.setLocalAsn(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].LocalAsn"));
			bgpPeer.setHold(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Hold"));
			bgpPeer.setIsFake(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].IsFake"));
			bgpPeer.setRouteLimit(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouteLimit"));
			bgpPeer.setRegionId(context.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RegionId"));

			bgpPeers.add(bgpPeer);
		}
		describeBgpPeersResponse.setBgpPeers(bgpPeers);
	 
	 	return describeBgpPeersResponse;
	}
}