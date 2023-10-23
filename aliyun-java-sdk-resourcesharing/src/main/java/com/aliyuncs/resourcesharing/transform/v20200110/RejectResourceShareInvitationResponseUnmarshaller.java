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

import com.aliyuncs.resourcesharing.model.v20200110.RejectResourceShareInvitationResponse;
import com.aliyuncs.resourcesharing.model.v20200110.RejectResourceShareInvitationResponse.ResourceShareInvitation;
import com.aliyuncs.transform.UnmarshallerContext;


public class RejectResourceShareInvitationResponseUnmarshaller {

	public static RejectResourceShareInvitationResponse unmarshall(RejectResourceShareInvitationResponse rejectResourceShareInvitationResponse, UnmarshallerContext _ctx) {
		
		rejectResourceShareInvitationResponse.setRequestId(_ctx.stringValue("RejectResourceShareInvitationResponse.RequestId"));

		ResourceShareInvitation resourceShareInvitation = new ResourceShareInvitation();
		resourceShareInvitation.setResourceShareInvitationId(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareInvitationId"));
		resourceShareInvitation.setResourceShareId(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareId"));
		resourceShareInvitation.setResourceShareName(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.ResourceShareName"));
		resourceShareInvitation.setSenderAccountId(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.SenderAccountId"));
		resourceShareInvitation.setReceiverAccountId(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.ReceiverAccountId"));
		resourceShareInvitation.setCreateTime(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.CreateTime"));
		resourceShareInvitation.setStatus(_ctx.stringValue("RejectResourceShareInvitationResponse.ResourceShareInvitation.Status"));
		rejectResourceShareInvitationResponse.setResourceShareInvitation(resourceShareInvitation);
	 
	 	return rejectResourceShareInvitationResponse;
	}
}