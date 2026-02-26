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

import com.aliyuncs.vpc.model.v20160428.GetRouteTargetGroupResponse;
import com.aliyuncs.vpc.model.v20160428.GetRouteTargetGroupResponse.RouteTargetMemberListItem;
import com.aliyuncs.vpc.model.v20160428.GetRouteTargetGroupResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRouteTargetGroupResponseUnmarshaller {

	public static GetRouteTargetGroupResponse unmarshall(GetRouteTargetGroupResponse getRouteTargetGroupResponse, UnmarshallerContext _ctx) {
		
		getRouteTargetGroupResponse.setRequestId(_ctx.stringValue("GetRouteTargetGroupResponse.RequestId"));
		getRouteTargetGroupResponse.setRouteTargetGroupId(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetGroupId"));
		getRouteTargetGroupResponse.setRouteTargetGroupName(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetGroupName"));
		getRouteTargetGroupResponse.setRouteTargetGroupDescription(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetGroupDescription"));
		getRouteTargetGroupResponse.setVpcId(_ctx.stringValue("GetRouteTargetGroupResponse.VpcId"));
		getRouteTargetGroupResponse.setConfigMode(_ctx.stringValue("GetRouteTargetGroupResponse.ConfigMode"));
		getRouteTargetGroupResponse.setStatus(_ctx.stringValue("GetRouteTargetGroupResponse.Status"));
		getRouteTargetGroupResponse.setRegionId(_ctx.stringValue("GetRouteTargetGroupResponse.RegionId"));
		getRouteTargetGroupResponse.setResourceGroupId(_ctx.stringValue("GetRouteTargetGroupResponse.ResourceGroupId"));
		getRouteTargetGroupResponse.setCreateTime(_ctx.stringValue("GetRouteTargetGroupResponse.CreateTime"));

		List<RouteTargetMemberListItem> routeTargetMemberList = new ArrayList<RouteTargetMemberListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRouteTargetGroupResponse.RouteTargetMemberList.Length"); i++) {
			RouteTargetMemberListItem routeTargetMemberListItem = new RouteTargetMemberListItem();
			routeTargetMemberListItem.setMemberId(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetMemberList["+ i +"].MemberId"));
			routeTargetMemberListItem.setMemberType(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetMemberList["+ i +"].MemberType"));
			routeTargetMemberListItem.setWeight(_ctx.integerValue("GetRouteTargetGroupResponse.RouteTargetMemberList["+ i +"].Weight"));
			routeTargetMemberListItem.setHealthCheckStatus(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetMemberList["+ i +"].HealthCheckStatus"));
			routeTargetMemberListItem.setEnableStatus(_ctx.stringValue("GetRouteTargetGroupResponse.RouteTargetMemberList["+ i +"].EnableStatus"));

			routeTargetMemberList.add(routeTargetMemberListItem);
		}
		getRouteTargetGroupResponse.setRouteTargetMemberList(routeTargetMemberList);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetRouteTargetGroupResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetRouteTargetGroupResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetRouteTargetGroupResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getRouteTargetGroupResponse.setTags(tags);
	 
	 	return getRouteTargetGroupResponse;
	}
}