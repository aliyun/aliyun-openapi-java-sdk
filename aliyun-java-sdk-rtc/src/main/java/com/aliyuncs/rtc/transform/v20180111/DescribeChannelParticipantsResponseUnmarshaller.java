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

import com.aliyuncs.rtc.model.v20180111.DescribeChannelParticipantsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChannelParticipantsResponseUnmarshaller {

	public static DescribeChannelParticipantsResponse unmarshall(DescribeChannelParticipantsResponse describeChannelParticipantsResponse, UnmarshallerContext _ctx) {
		
		describeChannelParticipantsResponse.setRequestId(_ctx.stringValue("DescribeChannelParticipantsResponse.RequestId"));
		describeChannelParticipantsResponse.setTimestamp(_ctx.integerValue("DescribeChannelParticipantsResponse.Timestamp"));
		describeChannelParticipantsResponse.setTotalNum(_ctx.integerValue("DescribeChannelParticipantsResponse.TotalNum"));
		describeChannelParticipantsResponse.setTotalPage(_ctx.integerValue("DescribeChannelParticipantsResponse.TotalPage"));

		List<String> userList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChannelParticipantsResponse.UserList.Length"); i++) {
			userList.add(_ctx.stringValue("DescribeChannelParticipantsResponse.UserList["+ i +"]"));
		}
		describeChannelParticipantsResponse.setUserList(userList);
	 
	 	return describeChannelParticipantsResponse;
	}
}