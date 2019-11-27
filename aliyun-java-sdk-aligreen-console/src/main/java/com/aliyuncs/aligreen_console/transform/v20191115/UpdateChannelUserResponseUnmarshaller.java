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

import com.aliyuncs.aligreen_console.model.v20191115.UpdateChannelUserResponse;
import com.aliyuncs.aligreen_console.model.v20191115.UpdateChannelUserResponse.ChannelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateChannelUserResponseUnmarshaller {

	public static UpdateChannelUserResponse unmarshall(UpdateChannelUserResponse updateChannelUserResponse, UnmarshallerContext _ctx) {
		
		updateChannelUserResponse.setRequestId(_ctx.stringValue("UpdateChannelUserResponse.RequestId"));
		updateChannelUserResponse.setUid(_ctx.stringValue("UpdateChannelUserResponse.Uid"));
		updateChannelUserResponse.setNotes(_ctx.stringValue("UpdateChannelUserResponse.Notes"));
		updateChannelUserResponse.setAligreenUid(_ctx.stringValue("UpdateChannelUserResponse.AligreenUid"));

		ChannelInfo channelInfo = new ChannelInfo();
		channelInfo.setName(_ctx.stringValue("UpdateChannelUserResponse.ChannelInfo.Name"));
		channelInfo.setOwners(_ctx.stringValue("UpdateChannelUserResponse.ChannelInfo.Owners"));
		channelInfo.setNotes(_ctx.stringValue("UpdateChannelUserResponse.ChannelInfo.Notes"));
		channelInfo.setChannel(_ctx.stringValue("UpdateChannelUserResponse.ChannelInfo.Channel"));
		updateChannelUserResponse.setChannelInfo(channelInfo);
	 
	 	return updateChannelUserResponse;
	}
}