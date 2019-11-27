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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aligreen_console.model.v20191115.ListChannelUsersResponse;
import com.aliyuncs.aligreen_console.model.v20191115.ListChannelUsersResponse.ChannelUser;
import com.aliyuncs.aligreen_console.model.v20191115.ListChannelUsersResponse.ChannelUser.ChannelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChannelUsersResponseUnmarshaller {

	public static ListChannelUsersResponse unmarshall(ListChannelUsersResponse listChannelUsersResponse, UnmarshallerContext _ctx) {
		
		listChannelUsersResponse.setRequestId(_ctx.stringValue("ListChannelUsersResponse.RequestId"));
		listChannelUsersResponse.setTotalCount(_ctx.integerValue("ListChannelUsersResponse.TotalCount"));
		listChannelUsersResponse.setPageSize(_ctx.integerValue("ListChannelUsersResponse.PageSize"));
		listChannelUsersResponse.setCurrentPage(_ctx.integerValue("ListChannelUsersResponse.CurrentPage"));

		List<ChannelUser> channelUsers = new ArrayList<ChannelUser>();
		for (int i = 0; i < _ctx.lengthValue("ListChannelUsersResponse.ChannelUsers.Length"); i++) {
			ChannelUser channelUser = new ChannelUser();
			channelUser.setUid(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].Uid"));
			channelUser.setNotes(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].Notes"));
			channelUser.setAligreenUid(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].AligreenUid"));

			ChannelInfo channelInfo = new ChannelInfo();
			channelInfo.setName(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].ChannelInfo.Name"));
			channelInfo.setOwners(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].ChannelInfo.Owners"));
			channelInfo.setNotes(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].ChannelInfo.Notes"));
			channelInfo.setChannel(_ctx.stringValue("ListChannelUsersResponse.ChannelUsers["+ i +"].ChannelInfo.Channel"));
			channelUser.setChannelInfo(channelInfo);

			channelUsers.add(channelUser);
		}
		listChannelUsersResponse.setChannelUsers(channelUsers);
	 
	 	return listChannelUsersResponse;
	}
}