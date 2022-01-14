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

import com.aliyuncs.resourcemanager.model.v20200331.GetHandshakeResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetHandshakeResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHandshakeResponseUnmarshaller {

	public static GetHandshakeResponse unmarshall(GetHandshakeResponse getHandshakeResponse, UnmarshallerContext _ctx) {
		
		getHandshakeResponse.setRequestId(_ctx.stringValue("GetHandshakeResponse.RequestId"));

		Handshake handshake = new Handshake();
		handshake.setStatus(_ctx.stringValue("GetHandshakeResponse.Handshake.Status"));
		handshake.setExpireTime(_ctx.stringValue("GetHandshakeResponse.Handshake.ExpireTime"));
		handshake.setCreateTime(_ctx.stringValue("GetHandshakeResponse.Handshake.CreateTime"));
		handshake.setTargetEntity(_ctx.stringValue("GetHandshakeResponse.Handshake.TargetEntity"));
		handshake.setMasterAccountId(_ctx.stringValue("GetHandshakeResponse.Handshake.MasterAccountId"));
		handshake.setHandshakeId(_ctx.stringValue("GetHandshakeResponse.Handshake.HandshakeId"));
		handshake.setMasterAccountRealName(_ctx.stringValue("GetHandshakeResponse.Handshake.MasterAccountRealName"));
		handshake.setResourceDirectoryId(_ctx.stringValue("GetHandshakeResponse.Handshake.ResourceDirectoryId"));
		handshake.setInvitedAccountRealName(_ctx.stringValue("GetHandshakeResponse.Handshake.InvitedAccountRealName"));
		handshake.setNote(_ctx.stringValue("GetHandshakeResponse.Handshake.Note"));
		handshake.setMasterAccountName(_ctx.stringValue("GetHandshakeResponse.Handshake.MasterAccountName"));
		handshake.setTargetType(_ctx.stringValue("GetHandshakeResponse.Handshake.TargetType"));
		handshake.setModifyTime(_ctx.stringValue("GetHandshakeResponse.Handshake.ModifyTime"));
		getHandshakeResponse.setHandshake(handshake);
	 
	 	return getHandshakeResponse;
	}
}