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
		describeBgpPeersResponse.setTotalCount(_ctx.integerValue("DescribeBgpPeersResponse.TotalCount"));
		describeBgpPeersResponse.setPageNumber(_ctx.integerValue("DescribeBgpPeersResponse.PageNumber"));
		describeBgpPeersResponse.setPageSize(_ctx.integerValue("DescribeBgpPeersResponse.PageSize"));

		List<BgpPeer> bgpPeers = new ArrayList<BgpPeer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBgpPeersResponse.BgpPeers.Length"); i++) {
			BgpPeer bgpPeer = new BgpPeer();
			bgpPeer.setName(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Name"));
			bgpPeer.setDescription(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Description"));
			bgpPeer.setBgpPeerId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpPeerId"));
			bgpPeer.setBgpGroupId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpGroupId"));
			bgpPeer.setPeerIpAddress(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerIpAddress"));
			bgpPeer.setPeerAsn(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].PeerAsn"));
			bgpPeer.setAuthKey(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].AuthKey"));
			bgpPeer.setRouterId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouterId"));
			bgpPeer.setBgpStatus(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].BgpStatus"));
			bgpPeer.setStatus(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Status"));
			bgpPeer.setKeepalive(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Keepalive"));
			bgpPeer.setLocalAsn(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].LocalAsn"));
			bgpPeer.setHold(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].Hold"));
			bgpPeer.setIsFake(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].IsFake"));
			bgpPeer.setRouteLimit(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RouteLimit"));
			bgpPeer.setRegionId(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].RegionId"));
			bgpPeer.setEnableBfd(_ctx.booleanValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].EnableBfd"));
			bgpPeer.setIpVersion(_ctx.stringValue("DescribeBgpPeersResponse.BgpPeers["+ i +"].IpVersion"));

			bgpPeers.add(bgpPeer);
		}
		describeBgpPeersResponse.setBgpPeers(bgpPeers);
	 
	 	return describeBgpPeersResponse;
	}
}