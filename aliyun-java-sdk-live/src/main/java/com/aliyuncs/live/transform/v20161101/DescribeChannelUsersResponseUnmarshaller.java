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

import com.aliyuncs.live.model.v20161101.DescribeChannelUsersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChannelUsersResponseUnmarshaller {

	public static DescribeChannelUsersResponse unmarshall(DescribeChannelUsersResponse describeChannelUsersResponse, UnmarshallerContext _ctx) {
		
		describeChannelUsersResponse.setRequestId(_ctx.stringValue("DescribeChannelUsersResponse.RequestId"));
		describeChannelUsersResponse.setTimestamp(_ctx.longValue("DescribeChannelUsersResponse.Timestamp"));
		describeChannelUsersResponse.setIsChannelExists(_ctx.booleanValue("DescribeChannelUsersResponse.IsChannelExists"));
		describeChannelUsersResponse.setInteractiveUserNumber(_ctx.integerValue("DescribeChannelUsersResponse.InteractiveUserNumber"));
		describeChannelUsersResponse.setLiveUserNumber(_ctx.integerValue("DescribeChannelUsersResponse.LiveUserNumber"));

		List<String> interactiveUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChannelUsersResponse.InteractiveUserList.Length"); i++) {
			interactiveUserList.add(_ctx.stringValue("DescribeChannelUsersResponse.InteractiveUserList["+ i +"]"));
		}
		describeChannelUsersResponse.setInteractiveUserList(interactiveUserList);

		List<String> liveUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChannelUsersResponse.LiveUserList.Length"); i++) {
			liveUserList.add(_ctx.stringValue("DescribeChannelUsersResponse.LiveUserList["+ i +"]"));
		}
		describeChannelUsersResponse.setLiveUserList(liveUserList);
	 
	 	return describeChannelUsersResponse;
	}
}