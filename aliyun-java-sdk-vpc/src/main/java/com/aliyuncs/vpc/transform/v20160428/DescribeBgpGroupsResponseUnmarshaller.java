/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeBgpGroupsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBgpGroupsResponse.BgpGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBgpGroupsResponseUnmarshaller {

	public static DescribeBgpGroupsResponse unmarshall(DescribeBgpGroupsResponse describeBgpGroupsResponse, UnmarshallerContext context) {
		
		describeBgpGroupsResponse.setRequestId(context.stringValue("DescribeBgpGroupsResponse.RequestId"));
		describeBgpGroupsResponse.setTotalCount(context.integerValue("DescribeBgpGroupsResponse.TotalCount"));
		describeBgpGroupsResponse.setPageNumber(context.integerValue("DescribeBgpGroupsResponse.PageNumber"));
		describeBgpGroupsResponse.setPageSize(context.integerValue("DescribeBgpGroupsResponse.PageSize"));

		List<BgpGroup> bgpGroups = new ArrayList<BgpGroup>();
		for (int i = 0; i < context.lengthValue("DescribeBgpGroupsResponse.BgpGroups.Length"); i++) {
			BgpGroup bgpGroup = new BgpGroup();
			bgpGroup.setName(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Name"));
			bgpGroup.setDescription(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Description"));
			bgpGroup.setBgpGroupId(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].BgpGroupId"));
			bgpGroup.setPeerAsn(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].PeerAsn"));
			bgpGroup.setAuthKey(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].AuthKey"));
			bgpGroup.setRouterId(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouterId"));
			bgpGroup.setStatus(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Status"));
			bgpGroup.setKeepalive(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Keepalive"));
			bgpGroup.setLocalAsn(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].LocalAsn"));
			bgpGroup.setHold(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].Hold"));
			bgpGroup.setIsFake(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].IsFake"));
			bgpGroup.setRouteLimit(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RouteLimit"));
			bgpGroup.setRegionId(context.stringValue("DescribeBgpGroupsResponse.BgpGroups["+ i +"].RegionId"));

			bgpGroups.add(bgpGroup);
		}
		describeBgpGroupsResponse.setBgpGroups(bgpGroups);
	 
	 	return describeBgpGroupsResponse;
	}
}