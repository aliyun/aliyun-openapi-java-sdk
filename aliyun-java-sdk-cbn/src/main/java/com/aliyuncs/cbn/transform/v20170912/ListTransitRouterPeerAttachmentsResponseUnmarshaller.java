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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPeerAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterPeerAttachmentsResponseUnmarshaller {

	public static ListTransitRouterPeerAttachmentsResponse unmarshall(ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterPeerAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.RequestId"));
		listTransitRouterPeerAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.TotalCount"));
		listTransitRouterPeerAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.MaxResults"));
		listTransitRouterPeerAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.NextToken"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setPeerTransitRouterRegionId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterRegionId"));
			transitRouterAttachment.setPeerTransitRouterOwnerId(_ctx.longValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterOwnerId"));
			transitRouterAttachment.setPeerTransitRouterId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].PeerTransitRouterId"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));
			transitRouterAttachment.setResourceType(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setAutoPublishRouteEnabled(_ctx.booleanValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].AutoPublishRouteEnabled"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));
			transitRouterAttachment.setBandwidth(_ctx.integerValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].Bandwidth"));
			transitRouterAttachment.setBandwidthPackageId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].BandwidthPackageId"));
			transitRouterAttachment.setRegionId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].RegionId"));
			transitRouterAttachment.setGeographicSpanId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].GeographicSpanId"));
			transitRouterAttachment.setCenBandwidthPackageId(_ctx.stringValue("ListTransitRouterPeerAttachmentsResponse.TransitRouterAttachments["+ i +"].CenBandwidthPackageId"));

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterPeerAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterPeerAttachmentsResponse;
	}
}