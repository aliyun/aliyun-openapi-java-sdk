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

import com.aliyuncs.resourcemanager.model.v20200331.AcceptHandshakeResponse;
import com.aliyuncs.resourcemanager.model.v20200331.AcceptHandshakeResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptHandshakeResponseUnmarshaller {

	public static AcceptHandshakeResponse unmarshall(AcceptHandshakeResponse acceptHandshakeResponse, UnmarshallerContext _ctx) {
		
		acceptHandshakeResponse.setRequestId(_ctx.stringValue("AcceptHandshakeResponse.RequestId"));

		Handshake handshake = new Handshake();
		handshake.setHandshakeId(_ctx.stringValue("AcceptHandshakeResponse.Handshake.HandshakeId"));
		handshake.setResourceDirectoryId(_ctx.stringValue("AcceptHandshakeResponse.Handshake.ResourceDirectoryId"));
		handshake.setMasterAccountId(_ctx.stringValue("AcceptHandshakeResponse.Handshake.MasterAccountId"));
		handshake.setMasterAccountName(_ctx.stringValue("AcceptHandshakeResponse.Handshake.MasterAccountName"));
		handshake.setTargetEntity(_ctx.stringValue("AcceptHandshakeResponse.Handshake.TargetEntity"));
		handshake.setTargetType(_ctx.stringValue("AcceptHandshakeResponse.Handshake.TargetType"));
		handshake.setNote(_ctx.stringValue("AcceptHandshakeResponse.Handshake.Note"));
		handshake.setStatus(_ctx.stringValue("AcceptHandshakeResponse.Handshake.Status"));
		handshake.setCreateTime(_ctx.stringValue("AcceptHandshakeResponse.Handshake.CreateTime"));
		handshake.setModifyTime(_ctx.stringValue("AcceptHandshakeResponse.Handshake.ModifyTime"));
		handshake.setExpireTime(_ctx.stringValue("AcceptHandshakeResponse.Handshake.ExpireTime"));
		acceptHandshakeResponse.setHandshake(handshake);
	 
	 	return acceptHandshakeResponse;
	}
}