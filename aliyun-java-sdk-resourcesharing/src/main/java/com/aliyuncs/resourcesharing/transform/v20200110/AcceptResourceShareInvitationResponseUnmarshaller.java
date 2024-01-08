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

import com.aliyuncs.resourcesharing.model.v20200110.AcceptResourceShareInvitationResponse;
import com.aliyuncs.resourcesharing.model.v20200110.AcceptResourceShareInvitationResponse.ResourceShareInvitation;
import com.aliyuncs.resourcesharing.model.v20200110.AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptResourceShareInvitationResponseUnmarshaller {

	public static AcceptResourceShareInvitationResponse unmarshall(AcceptResourceShareInvitationResponse acceptResourceShareInvitationResponse, UnmarshallerContext _ctx) {
		
		acceptResourceShareInvitationResponse.setRequestId(_ctx.stringValue("AcceptResourceShareInvitationResponse.RequestId"));

		ResourceShareInvitation resourceShareInvitation = new ResourceShareInvitation();
		resourceShareInvitation.setResourceShareInvitationId(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareInvitationId"));
		resourceShareInvitation.setResourceShareId(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareId"));
		resourceShareInvitation.setResourceShareName(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareName"));
		resourceShareInvitation.setSenderAccountId(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.SenderAccountId"));
		resourceShareInvitation.setReceiverAccountId(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.ReceiverAccountId"));
		resourceShareInvitation.setCreateTime(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.CreateTime"));
		resourceShareInvitation.setStatus(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.Status"));

		List<AcceptInvitationFailedDetail> acceptInvitationFailedDetails = new ArrayList<AcceptInvitationFailedDetail>();
		for (int i = 0; i < _ctx.lengthValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails.Length"); i++) {
			AcceptInvitationFailedDetail acceptInvitationFailedDetail = new AcceptInvitationFailedDetail();
			acceptInvitationFailedDetail.setStatus(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails["+ i +"].Status"));
			acceptInvitationFailedDetail.setStatusMessage(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails["+ i +"].StatusMessage"));
			acceptInvitationFailedDetail.setAssociateType(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails["+ i +"].AssociateType"));
			acceptInvitationFailedDetail.setResourceId(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails["+ i +"].ResourceId"));
			acceptInvitationFailedDetail.setResourceType(_ctx.stringValue("AcceptResourceShareInvitationResponse.ResourceShareInvitation.AcceptInvitationFailedDetails["+ i +"].ResourceType"));

			acceptInvitationFailedDetails.add(acceptInvitationFailedDetail);
		}
		resourceShareInvitation.setAcceptInvitationFailedDetails(acceptInvitationFailedDetails);
		acceptResourceShareInvitationResponse.setResourceShareInvitation(resourceShareInvitation);
	 
	 	return acceptResourceShareInvitationResponse;
	}
}