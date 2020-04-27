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

import com.aliyuncs.resourcemanager.model.v20200331.CancelHandshakeResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CancelHandshakeResponse.Handshake;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelHandshakeResponseUnmarshaller {

	public static CancelHandshakeResponse unmarshall(CancelHandshakeResponse cancelHandshakeResponse, UnmarshallerContext _ctx) {
		
		cancelHandshakeResponse.setRequestId(_ctx.stringValue("CancelHandshakeResponse.RequestId"));

		Handshake handshake = new Handshake();
		handshake.setHandshakeId(_ctx.stringValue("CancelHandshakeResponse.Handshake.HandshakeId"));
		handshake.setResourceDirectoryId(_ctx.stringValue("CancelHandshakeResponse.Handshake.ResourceDirectoryId"));
		handshake.setMasterAccountId(_ctx.stringValue("CancelHandshakeResponse.Handshake.MasterAccountId"));
		handshake.setMasterAccountName(_ctx.stringValue("CancelHandshakeResponse.Handshake.MasterAccountName"));
		handshake.setTargetEntity(_ctx.stringValue("CancelHandshakeResponse.Handshake.TargetEntity"));
		handshake.setTargetType(_ctx.stringValue("CancelHandshakeResponse.Handshake.TargetType"));
		handshake.setNote(_ctx.stringValue("CancelHandshakeResponse.Handshake.Note"));
		handshake.setStatus(_ctx.stringValue("CancelHandshakeResponse.Handshake.Status"));
		handshake.setCreateTime(_ctx.stringValue("CancelHandshakeResponse.Handshake.CreateTime"));
		handshake.setModifyTime(_ctx.stringValue("CancelHandshakeResponse.Handshake.ModifyTime"));
		handshake.setExpireTime(_ctx.stringValue("CancelHandshakeResponse.Handshake.ExpireTime"));
		cancelHandshakeResponse.setHandshake(handshake);
	 
	 	return cancelHandshakeResponse;
	}
}