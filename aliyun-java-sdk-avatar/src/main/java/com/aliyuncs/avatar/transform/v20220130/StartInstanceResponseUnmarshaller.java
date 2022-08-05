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

package com.aliyuncs.avatar.transform.v20220130;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.avatar.model.v20220130.StartInstanceResponse;
import com.aliyuncs.avatar.model.v20220130.StartInstanceResponse.Data;
import com.aliyuncs.avatar.model.v20220130.StartInstanceResponse.Data.Channel;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartInstanceResponseUnmarshaller {

	public static StartInstanceResponse unmarshall(StartInstanceResponse startInstanceResponse, UnmarshallerContext _ctx) {
		
		startInstanceResponse.setCode(_ctx.stringValue("StartInstanceResponse.Code"));
		startInstanceResponse.setMessage(_ctx.stringValue("StartInstanceResponse.Message"));
		startInstanceResponse.setSuccess(_ctx.booleanValue("StartInstanceResponse.Success"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("StartInstanceResponse.Data.RequestId"));
		data.setSessionId(_ctx.stringValue("StartInstanceResponse.Data.SessionId"));
		data.setToken(_ctx.stringValue("StartInstanceResponse.Data.Token"));

		Channel channel = new Channel();
		channel.setChannelId(_ctx.stringValue("StartInstanceResponse.Data.Channel.ChannelId"));
		channel.setToken(_ctx.stringValue("StartInstanceResponse.Data.Channel.Token"));
		channel.setType(_ctx.stringValue("StartInstanceResponse.Data.Channel.Type"));
		channel.setExpiredTime(_ctx.stringValue("StartInstanceResponse.Data.Channel.ExpiredTime"));
		channel.setNonce(_ctx.stringValue("StartInstanceResponse.Data.Channel.Nonce"));
		channel.setUserId(_ctx.stringValue("StartInstanceResponse.Data.Channel.UserId"));
		channel.setAppId(_ctx.stringValue("StartInstanceResponse.Data.Channel.AppId"));
		channel.setUserInfoInChannel(_ctx.stringValue("StartInstanceResponse.Data.Channel.UserInfoInChannel"));

		List<String> gslb = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartInstanceResponse.Data.Channel.Gslb.Length"); i++) {
			gslb.add(_ctx.stringValue("StartInstanceResponse.Data.Channel.Gslb["+ i +"]"));
		}
		channel.setGslb(gslb);
		data.setChannel(channel);
		startInstanceResponse.setData(data);
	 
	 	return startInstanceResponse;
	}
}