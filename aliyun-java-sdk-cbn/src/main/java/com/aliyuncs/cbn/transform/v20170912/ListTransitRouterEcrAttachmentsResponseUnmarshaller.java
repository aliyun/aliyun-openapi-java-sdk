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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterEcrAttachmentsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachment;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachment.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterEcrAttachmentsResponseUnmarshaller {

	public static ListTransitRouterEcrAttachmentsResponse unmarshall(ListTransitRouterEcrAttachmentsResponse listTransitRouterEcrAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterEcrAttachmentsResponse.setRequestId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.RequestId"));
		listTransitRouterEcrAttachmentsResponse.setNextToken(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.NextToken"));
		listTransitRouterEcrAttachmentsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterEcrAttachmentsResponse.TotalCount"));
		listTransitRouterEcrAttachmentsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterEcrAttachmentsResponse.MaxResults"));

		List<TransitRouterAttachment> transitRouterAttachments = new ArrayList<TransitRouterAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments.Length"); i++) {
			TransitRouterAttachment transitRouterAttachment = new TransitRouterAttachment();
			transitRouterAttachment.setCreationTime(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].CreationTime"));
			transitRouterAttachment.setStatus(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].Status"));
			transitRouterAttachment.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentId"));
			transitRouterAttachment.setTransitRouterId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterId"));
			transitRouterAttachment.setResourceType(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].ResourceType"));
			transitRouterAttachment.setTransitRouterRegionId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterRegionId"));
			transitRouterAttachment.setTransitRouterAttachmentDescription(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentDescription"));
			transitRouterAttachment.setEcrOwnerId(_ctx.longValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].EcrOwnerId"));
			transitRouterAttachment.setAutoPublishRouteEnabled(_ctx.booleanValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].AutoPublishRouteEnabled"));
			transitRouterAttachment.setEcrId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].EcrId"));
			transitRouterAttachment.setTransitRouterAttachmentName(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].TransitRouterAttachmentName"));
			transitRouterAttachment.setCenId(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].CenId"));
			transitRouterAttachment.setOrderType(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].OrderType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTransitRouterEcrAttachmentsResponse.TransitRouterAttachments["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			transitRouterAttachment.setTags(tags);

			transitRouterAttachments.add(transitRouterAttachment);
		}
		listTransitRouterEcrAttachmentsResponse.setTransitRouterAttachments(transitRouterAttachments);
	 
	 	return listTransitRouterEcrAttachmentsResponse;
	}
}