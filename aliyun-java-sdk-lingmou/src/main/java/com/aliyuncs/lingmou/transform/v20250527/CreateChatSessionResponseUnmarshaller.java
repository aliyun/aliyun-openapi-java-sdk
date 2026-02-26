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

package com.aliyuncs.lingmou.transform.v20250527;

import com.aliyuncs.lingmou.model.v20250527.CreateChatSessionResponse;
import com.aliyuncs.lingmou.model.v20250527.CreateChatSessionResponse.Data;
import com.aliyuncs.lingmou.model.v20250527.CreateChatSessionResponse.Data.AvatarAssets;
import com.aliyuncs.lingmou.model.v20250527.CreateChatSessionResponse.Data.RtcParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChatSessionResponseUnmarshaller {

	public static CreateChatSessionResponse unmarshall(CreateChatSessionResponse createChatSessionResponse, UnmarshallerContext _ctx) {
		
		createChatSessionResponse.setRequestId(_ctx.stringValue("CreateChatSessionResponse.requestId"));
		createChatSessionResponse.setMessage(_ctx.stringValue("CreateChatSessionResponse.message"));
		createChatSessionResponse.setHttpStatusCode(_ctx.longValue("CreateChatSessionResponse.httpStatusCode"));
		createChatSessionResponse.setCode(_ctx.stringValue("CreateChatSessionResponse.code"));
		createChatSessionResponse.setSuccess(_ctx.booleanValue("CreateChatSessionResponse.success"));

		Data data = new Data();
		data.setSessionId(_ctx.stringValue("CreateChatSessionResponse.data.sessionId"));

		RtcParams rtcParams = new RtcParams();
		rtcParams.setAppId(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.appId"));
		rtcParams.setAvatarUserId(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.avatarUserId"));
		rtcParams.setChannel(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.channel"));
		rtcParams.setClientUserId(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.clientUserId"));
		rtcParams.setGslb(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.gslb"));
		rtcParams.setNonce(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.nonce"));
		rtcParams.setServerUserId(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.serverUserId"));
		rtcParams.setTimestamp(_ctx.longValue("CreateChatSessionResponse.data.rtcParams.timestamp"));
		rtcParams.setToken(_ctx.stringValue("CreateChatSessionResponse.data.rtcParams.token"));
		data.setRtcParams(rtcParams);

		AvatarAssets avatarAssets = new AvatarAssets();
		avatarAssets.setUrl(_ctx.stringValue("CreateChatSessionResponse.data.avatarAssets.url"));
		avatarAssets.setMd5(_ctx.stringValue("CreateChatSessionResponse.data.avatarAssets.md5"));
		avatarAssets.setSecret(_ctx.stringValue("CreateChatSessionResponse.data.avatarAssets.secret"));
		avatarAssets.setType(_ctx.stringValue("CreateChatSessionResponse.data.avatarAssets.type"));
		avatarAssets.setMinRequiredVersion(_ctx.stringValue("CreateChatSessionResponse.data.avatarAssets.minRequiredVersion"));
		data.setAvatarAssets(avatarAssets);
		createChatSessionResponse.setData(data);
	 
	 	return createChatSessionResponse;
	}
}