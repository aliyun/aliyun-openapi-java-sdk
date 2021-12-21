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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVbrAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterVbrAttachmentsResponseUnmarshaller {

	public static ListTransitRouterVbrAttachmentsResponse unmarshall(ListTransitRouterVbrAttachmentsResponse listTransitRouterVbrAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterVbrAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.RequestId"));
		listTransitRouterVbrAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.NextToken"));
		listTransitRouterVbrAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterVbrAttachmentsResponse.TotalCount"));
		listTransitRouterVbrAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterVbrAttachmentsResponse.MaxResults"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));
			transitRouterAttachment.setResourceType(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setVbrRegionId(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].VbrRegionId"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setVbrOwnerId(_ctx.longValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].VbrOwnerId"));
			transitRouterAttachment.setAutoPublishRouteEnabled(_ctx.booleanValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].AutoPublishRouteEnabled"));
			transitRouterAttachment.setVbrId(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].VbrId"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterVbrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterVbrAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterVbrAttachmentsResponse;
	}
}