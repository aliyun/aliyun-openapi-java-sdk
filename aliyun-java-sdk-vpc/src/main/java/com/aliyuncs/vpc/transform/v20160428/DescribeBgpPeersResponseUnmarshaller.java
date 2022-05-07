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

	public static DescribeBgpPeersResponse unmarshall(DescribeBgpPeersResponse describeBgpPeersResponse, UnmarshallerContext _ctx) {
		
		describeBgpPeersResponse.setRequestId(_ctx.stringValue("DescribeBgpPeersResponse.RequestId"));
		describeBgpPeersResponse.setPageSize(_ctx.integerValue("DescribeBgpPeersResponse.PageSize"));
		describeBgpPeersResponse.setPageNumber(_ctx.integerValue("DescribeBgpPeersResponse.PageNumber"));
		describeBgpPeersResponse.setTotalCount(_ctx.integerValue("DescribeBgpPeersResponse.TotalCount"));

		List<BgpPeer> bgpPeers = new ArrayList<BgpPeer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBgpPeersResponse.BgpPeers.Length"); i++) {
			BgpPeer bgpPeer = new BgpPeer();
			bgpPeer.setStatus(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Status"));
			bgpPeer.setPeerIpAddress(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerIpAddress"));
			bgpPeer.setRouterId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouterId"));
			bgpPeer.setBgpGroupId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpGroupId"));
			bgpPeer.setBgpStatus(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpStatus"));
			bgpPeer.setBfdMultiHop(_ctx.integerValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BfdMultiHop"));
			bgpPeer.setPeerAsn(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerAsn"));
			bgpPeer.setLocalAsn(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].LocalAsn"));
			bgpPeer.setRegionId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RegionId"));
			bgpPeer.setBgpPeerId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpPeerId"));
			bgpPeer.setEnableBfd(_ctx.booleanValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].EnableBfd"));
			bgpPeer.setHold(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Hold"));
			bgpPeer.setIpVersion(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].IpVersion"));
			bgpPeer.setKeepalive(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Keepalive"));
			bgpPeer.setDescription(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Description"));
			bgpPeer.setRouteLimit(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouteLimit"));
			bgpPeer.setIsFake(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].IsFake"));
			bgpPeer.setAuthKey(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].AuthKey"));
			bgpPeer.setName(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Name"));
			bgpPeer.setAdvertisedRouteCount(_ctx.integerValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].AdvertisedRouteCount"));
			bgpPeer.setReceivedRouteCount(_ctx.integerValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].ReceivedRouteCount"));
			bgpPeer.setGmtModified(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].GmtModified"));

			bgpPeers.add(bgpPeer);
		}
		describeBgpPeersResponse.setBgpPeers(bgpPeers);
	 
	 	return describeBgpPeersResponse;
	}
}