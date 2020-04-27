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

import com.aliyuncs.resourcemanager.model.v20200331.DeclineHandshakeResponse;
import com.aliyuncs.resourcemanager.model.v20200331.DeclineHandshakeResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeclineHandshakeResponseUnmarshaller {

	public static DeclineHandshakeResponse unmarshall(DeclineHandshakeResponse declineHandshakeResponse, UnmarshallerContext _ctx) {
		
		declineHandshakeResponse.setRequestId(_ctx.stringValue("DeclineHandshakeResponse.RequestId"));

		Handshake handshake = new Handshake();
		handshake.setHandshakeId(_ctx.stringValue("DeclineHandshakeResponse.Handshake.HandshakeId"));
		handshake.setResourceDirectoryId(_ctx.stringValue("DeclineHandshakeResponse.Handshake.ResourceDirectoryId"));
		handshake.setMasterAccountId(_ctx.stringValue("DeclineHandshakeResponse.Handshake.MasterAccountId"));
		handshake.setMasterAccountName(_ctx.stringValue("DeclineHandshakeResponse.Handshake.MasterAccountName"));
		handshake.setTargetEntity(_ctx.stringValue("DeclineHandshakeResponse.Handshake.TargetEntity"));
		handshake.setTargetType(_ctx.stringValue("DeclineHandshakeResponse.Handshake.TargetType"));
		handshake.setNote(_ctx.stringValue("DeclineHandshakeResponse.Handshake.Note"));
		handshake.setStatus(_ctx.stringValue("DeclineHandshakeResponse.Handshake.Status"));
		handshake.setCreateTime(_ctx.stringValue("DeclineHandshakeResponse.Handshake.CreateTime"));
		handshake.setModifyTime(_ctx.stringValue("DeclineHandshakeResponse.Handshake.ModifyTime"));
		handshake.setExpireTime(_ctx.stringValue("DeclineHandshakeResponse.Handshake.ExpireTime"));
		declineHandshakeResponse.setHandshake(handshake);
	 
	 	return declineHandshakeResponse;
	}
}