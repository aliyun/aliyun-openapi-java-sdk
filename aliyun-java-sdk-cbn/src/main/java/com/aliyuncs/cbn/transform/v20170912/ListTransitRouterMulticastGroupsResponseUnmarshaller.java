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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastGroupsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterMulticastGroupsResponseUnmarshaller {

	public static ListTransitRouterMulticastGroupsResponse unmarshall(ListTransitRouterMulticastGroupsResponse listTransitRouterMulticastGroupsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterMulticastGroupsResponse.setRequestId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.RequestId"));
		listTransitRouterMulticastGroupsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterMulticastGroupsResponse.TotalCount"));
		listTransitRouterMulticastGroupsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterMulticastGroupsResponse.MaxResults"));
		listTransitRouterMulticastGroupsResponse.setNextToken(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.NextToken"));

		List<TransitRouterMulticastGroup> transitRouterMulticastGroups = new ArrayList<TransitRouterMulticastGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups.Length"); i++) {
			TransitRouterMulticastGroup transitRouterMulticastGroup = new TransitRouterMulticastGroup();
			transitRouterMulticastGroup.setGroupIpAddress(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].GroupIpAddress"));
			transitRouterMulticastGroup.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].TransitRouterAttachmentId"));
			transitRouterMulticastGroup.setVSwitchId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].VSwitchId"));
			transitRouterMulticastGroup.setNetworkInterfaceId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].NetworkInterfaceId"));
			transitRouterMulticastGroup.setPeerTransitRouterMulticastDomainId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].PeerTransitRouterMulticastDomainId"));
			transitRouterMulticastGroup.setStatus(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].Status"));
			transitRouterMulticastGroup.setGroupSource(_ctx.booleanValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].GroupSource"));
			transitRouterMulticastGroup.setGroupMember(_ctx.booleanValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].GroupMember"));
			transitRouterMulticastGroup.setMemberType(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].MemberType"));
			transitRouterMulticastGroup.setSourceType(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].SourceType"));
			transitRouterMulticastGroup.setResourceType(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].ResourceType"));
			transitRouterMulticastGroup.setResourceOwnerId(_ctx.longValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].ResourceOwnerId"));
			transitRouterMulticastGroup.setResourceId(_ctx.stringValue("ListTransitRouterMulticastGroupsResponse.TransitRouterMulticastGroups["+ i +"].ResourceId"));

			transitRouterMulticastGroups.add(transitRouterMulticastGroup);
		}
		listTransitRouterMulticastGroupsResponse.setTransitRouterMulticastGroups(transitRouterMulticastGroups);
	 
	 	return listTransitRouterMulticastGroupsResponse;
	}
}