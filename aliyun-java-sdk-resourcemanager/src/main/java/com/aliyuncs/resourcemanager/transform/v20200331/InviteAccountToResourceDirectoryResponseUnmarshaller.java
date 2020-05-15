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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.InviteAccountToResourceDirectoryResponse;
import com.aliyuncs.resourcemanager.model.v20200331.InviteAccountToResourceDirectoryResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class InviteAccountToResourceDirectoryResponseUnmarshaller {

	public static InviteAccountToResourceDirectoryResponse unmarshall(InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectoryResponse, UnmarshallerContext _ctx) {
		
		inviteAccountToResourceDirectoryResponse.setRequestId(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.RequestId"));

		Handshake handshake = new Handshake();
		handshake.setHandshakeId(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.HandshakeId"));
		handshake.setResourceDirectoryId(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.ResourceDirectoryId"));
		handshake.setMasterAccountId(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.MasterAccountId"));
		handshake.setMasterAccountName(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.MasterAccountName"));
		handshake.setTargetEntity(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.TargetEntity"));
		handshake.setTargetType(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.TargetType"));
		handshake.setNote(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.Note"));
		handshake.setStatus(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.Status"));
		handshake.setCreateTime(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.CreateTime"));
		handshake.setModifyTime(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.ModifyTime"));
		handshake.setExpireTime(_ctx.stringValue("InviteAccountToResourceDirectoryResponse.Handshake.ExpireTime"));
		inviteAccountToResourceDirectoryResponse.setHandshake(handshake);
	 
	 	return inviteAccountToResourceDirectoryResponse;
	}
}