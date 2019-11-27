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

package com.aliyuncs.aligreen_console.transform.v20191115;

import com.aliyuncs.aligreen_console.model.v20191115.GetChannelUserResponse;
import com.aliyuncs.aligreen_console.model.v20191115.GetChannelUserResponse.ChannelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChannelUserResponseUnmarshaller {

	public static GetChannelUserResponse unmarshall(GetChannelUserResponse getChannelUserResponse, UnmarshallerContext _ctx) {
		
		getChannelUserResponse.setRequestId(_ctx.stringValue("GetChannelUserResponse.RequestId"));
		getChannelUserResponse.setUid(_ctx.stringValue("GetChannelUserResponse.Uid"));
		getChannelUserResponse.setNotes(_ctx.stringValue("GetChannelUserResponse.Notes"));
		getChannelUserResponse.setAligreenUid(_ctx.stringValue("GetChannelUserResponse.AligreenUid"));

		ChannelInfo channelInfo = new ChannelInfo();
		channelInfo.setName(_ctx.stringValue("GetChannelUserResponse.ChannelInfo.Name"));
		channelInfo.setOwners(_ctx.stringValue("GetChannelUserResponse.ChannelInfo.Owners"));
		channelInfo.setNotes(_ctx.stringValue("GetChannelUserResponse.ChannelInfo.Notes"));
		channelInfo.setChannel(_ctx.stringValue("GetChannelUserResponse.ChannelInfo.Channel"));
		getChannelUserResponse.setChannelInfo(channelInfo);
	 
	 	return getChannelUserResponse;
	}
}