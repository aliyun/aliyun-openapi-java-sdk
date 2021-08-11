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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpcAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachment.ZoneMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterVpcAttachmentsResponseUnmarshaller {

	public static ListTransitRouterVpcAttachmentsResponse unmarshall(ListTransitRouterVpcAttachmentsResponse listTransitRouterVpcAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterVpcAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.RequestId"));
		listTransitRouterVpcAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterVpcAttachmentsResponse.TotalCount"));
		listTransitRouterVpcAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterVpcAttachmentsResponse.MaxResults"));
		listTransitRouterVpcAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.NextToken"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setVpcRegionId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].VpcRegionId"));
			transitRouterAttachment.setVpcOwnerId(_ctx.longValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].VpcOwnerId"));
			transitRouterAttachment.setVpcId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].VpcId"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));
			transitRouterAttachment.setResourceType(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));

			List<ZoneMapping> zoneMappings = new ArrayList<ZoneMapping>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].ZoneMappings.Length"); j++) {
				ZoneMapping zoneMapping = new ZoneMapping();
				zoneMapping.setZoneId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].ZoneMappings["+ j +"].ZoneId"));
				zoneMapping.setVSwitchId(_ctx.stringValue("ListTransitRouterVpcAttachmentsResponse.TransitRouterAttachments["+ i +"].ZoneMappings["+ j +"].VSwitchId"));

				zoneMappings.add(zoneMapping);
			}
			transitRouterAttachment.setZoneMappings(zoneMappings);

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterVpcAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterVpcAttachmentsResponse;
	}
}