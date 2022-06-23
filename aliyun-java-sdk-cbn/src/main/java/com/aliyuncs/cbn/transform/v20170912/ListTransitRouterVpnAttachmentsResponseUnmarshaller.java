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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpnAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachment.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterVpnAttachmentsResponseUnmarshaller {

	public static ListTransitRouterVpnAttachmentsResponse unmarshall(ListTransitRouterVpnAttachmentsResponse listTransitRouterVpnAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterVpnAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.RequestId"));
		listTransitRouterVpnAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.NextToken"));
		listTransitRouterVpnAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterVpnAttachmentsResponse.TotalCount"));
		listTransitRouterVpnAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterVpnAttachmentsResponse.MaxResults"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));
			transitRouterAttachment.setResourceType(_ctx.integerValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setVpnOwnerId(_ctx.longValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].VpnOwnerId"));
			transitRouterAttachment.setVpnId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].VpnId"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setVpnRegionId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].VpnRegionId"));
			transitRouterAttachment.setAutoPublishRouteEnabled(_ctx.booleanValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].AutoPublishRouteEnabled"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneId(_ctx.stringValue("ListTransitRouterVpnAttachmentsResponse.TransitRouterAttachments["+ i +"].Zones["+ j +"].ZoneId"));

				zones.add(zone);
			}
			transitRouterAttachment.setZones(zones);

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterVpnAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterVpnAttachmentsResponse;
	}
}