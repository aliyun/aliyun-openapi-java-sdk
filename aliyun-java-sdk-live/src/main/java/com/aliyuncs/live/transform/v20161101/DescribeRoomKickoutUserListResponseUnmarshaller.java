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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeRoomKickoutUserListResponse;
import com.aliyuncs.live.model.v20161101.DescribeRoomKickoutUserListResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoomKickoutUserListResponseUnmarshaller {

	public static DescribeRoomKickoutUserListResponse unmarshall(DescribeRoomKickoutUserListResponse describeRoomKickoutUserListResponse, UnmarshallerContext _ctx) {
		
		describeRoomKickoutUserListResponse.setRequestId(_ctx.stringValue("DescribeRoomKickoutUserListResponse.RequestId"));
		describeRoomKickoutUserListResponse.setTotalNum(_ctx.integerValue("DescribeRoomKickoutUserListResponse.TotalNum"));
		describeRoomKickoutUserListResponse.setTotalPage(_ctx.integerValue("DescribeRoomKickoutUserListResponse.TotalPage"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRoomKickoutUserListResponse.UserList.Length"); i++) {
			User user = new User();
			user.setAppUid(_ctx.stringValue("DescribeRoomKickoutUserListResponse.UserList["+ i +"].AppUid"));
			user.setOpStartTime(_ctx.stringValue("DescribeRoomKickoutUserListResponse.UserList["+ i +"].OpStartTime"));
			user.setOpEndTime(_ctx.stringValue("DescribeRoomKickoutUserListResponse.UserList["+ i +"].OpEndTime"));

			userList.add(user);
		}
		describeRoomKickoutUserListResponse.setUserList(userList);
	 
	 	return describeRoomKickoutUserListResponse;
	}
}