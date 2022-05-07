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

import com.aliyuncs.vpc.model.v20160428.DescribeBgpGroupsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBgpGroupsResponse.BgpGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBgpGroupsResponseUnmarshaller {

	public static DescribeBgpGroupsResponse unmarshall(DescribeBgpGroupsResponse describeBgpGroupsResponse, UnmarshallerContext _ctx) {
		
		describeBgpGroupsResponse.setRequestId(_ctx.stringValue("DescribeBgpGroupsResponse.RequestId"));
		describeBgpGroupsResponse.setPageSize(_ctx.integerValue("DescribeBgpGroupsResponse.PageSize"));
		describeBgpGroupsResponse.setPageNumber(_ctx.integerValue("DescribeBgpGroupsResponse.PageNumber"));
		describeBgpGroupsResponse.setTotalCount(_ctx.integerValue("DescribeBgpGroupsResponse.TotalCount"));

		List<BgpGroup> bgpGroups = new ArrayList<BgpGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBgpGroupsResponse.BgpGroups.Length"); i++) {
			BgpGroup bgpGroup = new BgpGroup();
			bgpGroup.setStatus(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Status"));
			bgpGroup.setBgpGroupId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].BgpGroupId"));
			bgpGroup.setRouterId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouterId"));
			bgpGroup.setPeerAsn(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].PeerAsn"));
			bgpGroup.setLocalAsn(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].LocalAsn"));
			bgpGroup.setRegionId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RegionId"));
			bgpGroup.setHold(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Hold"));
			bgpGroup.setIpVersion(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].IpVersion"));
			bgpGroup.setDescription(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Description"));
			bgpGroup.setKeepalive(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Keepalive"));
			bgpGroup.setIsFake(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].IsFake"));
			bgpGroup.setRouteLimit(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouteLimit"));
			bgpGroup.setRouteQuota(_ctx.integerValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouteQuota"));
			bgpGroup.setName(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Name"));
			bgpGroup.setAuthKey(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].AuthKey"));

			bgpGroups.add(bgpGroup);
		}
		describeBgpGroupsResponse.setBgpGroups(bgpGroups);
	 
	 	return describeBgpGroupsResponse;
	}
}