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

import com.aliyuncs.vpc.model.v20160428.ListRouteTargetGroupsResponse;
import com.aliyuncs.vpc.model.v20160428.ListRouteTargetGroupsResponse.RouteTargetGroup;
import com.aliyuncs.vpc.model.v20160428.ListRouteTargetGroupsResponse.RouteTargetGroup.RouteTargetMember;
import com.aliyuncs.vpc.model.v20160428.ListRouteTargetGroupsResponse.RouteTargetGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRouteTargetGroupsResponseUnmarshaller {

	public static ListRouteTargetGroupsResponse unmarshall(ListRouteTargetGroupsResponse listRouteTargetGroupsResponse, UnmarshallerContext _ctx) {
		
		listRouteTargetGroupsResponse.setRequestId(_ctx.stringValue("ListRouteTargetGroupsResponse.RequestId"));
		listRouteTargetGroupsResponse.setNextToken(_ctx.stringValue("ListRouteTargetGroupsResponse.NextToken"));
		listRouteTargetGroupsResponse.setTotalCount(_ctx.integerValue("ListRouteTargetGroupsResponse.TotalCount"));
		listRouteTargetGroupsResponse.setMaxResults(_ctx.integerValue("ListRouteTargetGroupsResponse.MaxResults"));

		List<RouteTargetGroup> routeTargetGroups = new ArrayList<RouteTargetGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListRouteTargetGroupsResponse.RouteTargetGroups.Length"); i++) {
			RouteTargetGroup routeTargetGroup = new RouteTargetGroup();
			routeTargetGroup.setStatus(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].Status"));
			routeTargetGroup.setRouteTargetGroupDescription(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetGroupDescription"));
			routeTargetGroup.setVpcId(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].VpcId"));
			routeTargetGroup.setRouteTargetGroupId(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetGroupId"));
			routeTargetGroup.setConfigMode(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].ConfigMode"));
			routeTargetGroup.setRegionId(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RegionId"));
			routeTargetGroup.setRouteTargetGroupName(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetGroupName"));
			routeTargetGroup.setResourceGroupId(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].ResourceGroupId"));
			routeTargetGroup.setCreateTime(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].CreateTime"));

			List<RouteTargetMember> routeTargetMemberList = new ArrayList<RouteTargetMember>();
			for (int j = 0; j < _ctx.lengthValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList.Length"); j++) {
				RouteTargetMember routeTargetMember = new RouteTargetMember();
				routeTargetMember.setMemberId(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList["+ j +"].MemberId"));
				routeTargetMember.setEnableStatus(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList["+ j +"].EnableStatus"));
				routeTargetMember.setMemberType(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList["+ j +"].MemberType"));
				routeTargetMember.setHealthCheckStatus(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList["+ j +"].HealthCheckStatus"));
				routeTargetMember.setWeight(_ctx.integerValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].RouteTargetMemberList["+ j +"].Weight"));

				routeTargetMemberList.add(routeTargetMember);
			}
			routeTargetGroup.setRouteTargetMemberList(routeTargetMemberList);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("ListRouteTargetGroupsResponse.RouteTargetGroups["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			routeTargetGroup.setTags(tags);

			routeTargetGroups.add(routeTargetGroup);
		}
		listRouteTargetGroupsResponse.setRouteTargetGroups(routeTargetGroups);
	 
	 	return listRouteTargetGroupsResponse;
	}
}