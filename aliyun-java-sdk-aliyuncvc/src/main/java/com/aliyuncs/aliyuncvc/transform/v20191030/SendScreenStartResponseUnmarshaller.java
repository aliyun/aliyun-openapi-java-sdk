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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse.Data.AuthWsChannelConfig;
import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse.Data.IceServersItem;
import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse.Data.ShareConfig;
import com.aliyuncs.aliyuncvc.model.v20191030.SendScreenStartResponse.Data.SignallingServerConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendScreenStartResponseUnmarshaller {

	public static SendScreenStartResponse unmarshall(SendScreenStartResponse sendScreenStartResponse, UnmarshallerContext _ctx) {
		
		sendScreenStartResponse.setRequestId(_ctx.stringValue("SendScreenStartResponse.RequestId"));
		sendScreenStartResponse.setMessage(_ctx.stringValue("SendScreenStartResponse.Message"));
		sendScreenStartResponse.setErrorCode(_ctx.integerValue("SendScreenStartResponse.ErrorCode"));
		sendScreenStartResponse.setSuccess(_ctx.booleanValue("SendScreenStartResponse.Success"));

		Data data = new Data();
		data.setReceiverInfo(_ctx.mapValue("SendScreenStartResponse.Data.ReceiverInfo"));
		data.setSessionId(_ctx.stringValue("SendScreenStartResponse.Data.SessionId"));

		AuthWsChannelConfig authWsChannelConfig = new AuthWsChannelConfig();
		authWsChannelConfig.setAuthWsUrl(_ctx.stringValue("SendScreenStartResponse.Data.AuthWsChannelConfig.AuthWsUrl"));
		authWsChannelConfig.setToken(_ctx.stringValue("SendScreenStartResponse.Data.AuthWsChannelConfig.Token"));
		authWsChannelConfig.setWsOuterReConnTime(_ctx.integerValue("SendScreenStartResponse.Data.AuthWsChannelConfig.WsOuterReConnTime"));
		data.setAuthWsChannelConfig(authWsChannelConfig);

		ShareConfig shareConfig = new ShareConfig();
		shareConfig.setMaxMultiScreenShareBitrate(_ctx.integerValue("SendScreenStartResponse.Data.ShareConfig.MaxMultiScreenShareBitrate"));
		shareConfig.setMaxScreenShareBitrate(_ctx.integerValue("SendScreenStartResponse.Data.ShareConfig.MaxScreenShareBitrate"));
		shareConfig.setShareConfigMaxFrameRate(_ctx.integerValue("SendScreenStartResponse.Data.ShareConfig.ShareConfigMaxFrameRate"));
		shareConfig.setShareConfigMinFrameRate(_ctx.integerValue("SendScreenStartResponse.Data.ShareConfig.ShareConfigMinFrameRate"));
		data.setShareConfig(shareConfig);

		SignallingServerConfig signallingServerConfig = new SignallingServerConfig();
		signallingServerConfig.setClientHeartBeatUrl(_ctx.stringValue("SendScreenStartResponse.Data.SignallingServerConfig.ClientHeartBeatUrl"));
		signallingServerConfig.setGetMessageUrl(_ctx.stringValue("SendScreenStartResponse.Data.SignallingServerConfig.GetMessageUrl"));
		signallingServerConfig.setGetReceiverInfoUrl(_ctx.stringValue("SendScreenStartResponse.Data.SignallingServerConfig.GetReceiverInfoUrl"));
		signallingServerConfig.setSendMessageUrl(_ctx.stringValue("SendScreenStartResponse.Data.SignallingServerConfig.SendMessageUrl"));
		signallingServerConfig.setShareScreenMeetingRobUrl(_ctx.stringValue("SendScreenStartResponse.Data.SignallingServerConfig.ShareScreenMeetingRobUrl"));
		data.setSignallingServerConfig(signallingServerConfig);

		List<IceServersItem> iceServers = new ArrayList<IceServersItem>();
		for (int i = 0; i < _ctx.lengthValue("SendScreenStartResponse.Data.IceServers.Length"); i++) {
			IceServersItem iceServersItem = new IceServersItem();
			iceServersItem.setCredential(_ctx.stringValue("SendScreenStartResponse.Data.IceServers["+ i +"].Credential"));
			iceServersItem.setUrl(_ctx.stringValue("SendScreenStartResponse.Data.IceServers["+ i +"].Url"));
			iceServersItem.setUserName(_ctx.stringValue("SendScreenStartResponse.Data.IceServers["+ i +"].UserName"));

			iceServers.add(iceServersItem);
		}
		data.setIceServers(iceServers);
		sendScreenStartResponse.setData(data);
	 
	 	return sendScreenStartResponse;
	}
}