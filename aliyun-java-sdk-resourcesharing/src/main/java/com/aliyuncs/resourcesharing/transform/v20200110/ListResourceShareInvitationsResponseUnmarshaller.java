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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareInvitationsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareInvitationsResponse.ResourceShareInvitation;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceShareInvitationsResponse.ResourceShareInvitation.InvitationFailedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceShareInvitationsResponseUnmarshaller {

	public static ListResourceShareInvitationsResponse unmarshall(ListResourceShareInvitationsResponse listResourceShareInvitationsResponse, UnmarshallerContext _ctx) {
		
		listResourceShareInvitationsResponse.setRequestId(_ctx.stringValue("ListResourceShareInvitationsResponse.RequestId"));
		listResourceShareInvitationsResponse.setNextToken(_ctx.stringValue("ListResourceShareInvitationsResponse.NextToken"));

		List<ResourceShareInvitation> resourceShareInvitations = new ArrayList<ResourceShareInvitation>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceShareInvitationsResponse.ResourceShareInvitations.Length"); i++) {
			ResourceShareInvitation resourceShareInvitation = new ResourceShareInvitation();
			resourceShareInvitation.setStatus(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].Status"));
			resourceShareInvitation.setCreateTime(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].CreateTime"));
			resourceShareInvitation.setResourceShareId(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].ResourceShareId"));
			resourceShareInvitation.setResourceShareName(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].ResourceShareName"));
			resourceShareInvitation.setSenderAccountId(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].SenderAccountId"));
			resourceShareInvitation.setReceiverAccountId(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].ReceiverAccountId"));
			resourceShareInvitation.setResourceShareInvitationId(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].ResourceShareInvitationId"));

			List<InvitationFailedDetail> invitationFailedDetails = new ArrayList<InvitationFailedDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails.Length"); j++) {
				InvitationFailedDetail invitationFailedDetail = new InvitationFailedDetail();
				invitationFailedDetail.setStatus(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails["+ j +"].Status"));
				invitationFailedDetail.setStatusMessage(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails["+ j +"].StatusMessage"));
				invitationFailedDetail.setAssociateType(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails["+ j +"].AssociateType"));
				invitationFailedDetail.setResourceId(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails["+ j +"].ResourceId"));
				invitationFailedDetail.setResourceType(_ctx.stringValue("ListResourceShareInvitationsResponse.ResourceShareInvitations["+ i +"].InvitationFailedDetails["+ j +"].ResourceType"));

				invitationFailedDetails.add(invitationFailedDetail);
			}
			resourceShareInvitation.setInvitationFailedDetails(invitationFailedDetails);

			resourceShareInvitations.add(resourceShareInvitation);
		}
		listResourceShareInvitationsResponse.setResourceShareInvitations(resourceShareInvitations);
	 
	 	return listResourceShareInvitationsResponse;
	}
}