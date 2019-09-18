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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelUserListResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelUserListResponse.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelUserListResponseUnmarshaller {

	public static DescribeRtcChannelUserListResponse unmarshall(DescribeRtcChannelUserListResponse describeRtcChannelUserListResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelUserListResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelUserListResponse.RequestId"));
		describeRtcChannelUserListResponse.setPageSize(_ctx.longValue("DescribeRtcChannelUserListResponse.PageSize"));
		describeRtcChannelUserListResponse.setPageNo(_ctx.longValue("DescribeRtcChannelUserListResponse.PageNo"));
		describeRtcChannelUserListResponse.setTotalCnt(_ctx.longValue("DescribeRtcChannelUserListResponse.TotalCnt"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelUserListResponse.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setChannelId(_ctx.stringValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].ChannelId"));
			userListItem.setUserId(_ctx.stringValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].UserId"));
			userListItem.setStartTime(_ctx.stringValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].StartTime"));
			userListItem.setEndTime(_ctx.stringValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].EndTime"));
			userListItem.setServiceArea(_ctx.stringValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].ServiceArea"));
			userListItem.setSubAudio(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].SubAudio"));
			userListItem.setPubAudio(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].PubAudio"));
			userListItem.setSubVideo360(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].SubVideo360"));
			userListItem.setPubVideo360(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].PubVideo360"));
			userListItem.setSubVideo720(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].SubVideo720"));
			userListItem.setPubVideo720(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].PubVideo720"));
			userListItem.setSubVideo1080(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].SubVideo1080"));
			userListItem.setPubVideo1080(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].PubVideo1080"));
			userListItem.setSubContent(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].SubContent"));
			userListItem.setPubContent(_ctx.integerValue("DescribeRtcChannelUserListResponse.UserList["+ i +"].PubContent"));

			userList.add(userListItem);
		}
		describeRtcChannelUserListResponse.setUserList(userList);
	 
	 	return describeRtcChannelUserListResponse;
	}
}