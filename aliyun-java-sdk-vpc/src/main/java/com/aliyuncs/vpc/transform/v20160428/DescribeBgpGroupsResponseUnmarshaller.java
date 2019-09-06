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
		describeBgpGroupsResponse.setTotalCount(_ctx.integerValue("DescribeBgpGroupsResponse.TotalCount"));
		describeBgpGroupsResponse.setPageNumber(_ctx.integerValue("DescribeBgpGroupsResponse.PageNumber"));
		describeBgpGroupsResponse.setPageSize(_ctx.integerValue("DescribeBgpGroupsResponse.PageSize"));

		List<BgpGroup> bgpGroups = new ArrayList<BgpGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBgpGroupsResponse.BgpGroups.Length"); i++) {
			BgpGroup bgpGroup = new BgpGroup();
			bgpGroup.setName(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Name"));
			bgpGroup.setDescription(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Description"));
			bgpGroup.setBgpGroupId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].BgpGroupId"));
			bgpGroup.setPeerAsn(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].PeerAsn"));
			bgpGroup.setAuthKey(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].AuthKey"));
			bgpGroup.setRouterId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouterId"));
			bgpGroup.setStatus(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Status"));
			bgpGroup.setKeepalive(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Keepalive"));
			bgpGroup.setLocalAsn(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].LocalAsn"));
			bgpGroup.setHold(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Hold"));
			bgpGroup.setIsFake(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].IsFake"));
			bgpGroup.setRouteLimit(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouteLimit"));
			bgpGroup.setRegionId(_ctx.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RegionId"));

			bgpGroups.add(bgpGroup);
		}
		describeBgpGroupsResponse.setBgpGroups(bgpGroups);
	 
	 	return describeBgpGroupsResponse;
	}
}