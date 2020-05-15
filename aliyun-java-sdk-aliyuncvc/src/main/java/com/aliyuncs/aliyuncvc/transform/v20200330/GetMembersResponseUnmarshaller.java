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

package com.aliyuncs.aliyuncvc.transform.v20200330;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20200330.GetMembersResponse;
import com.aliyuncs.aliyuncvc.model.v20200330.GetMembersResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20200330.GetMembersResponse.MeetingInfo.MemberListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMembersResponseUnmarshaller {

	public static GetMembersResponse unmarshall(GetMembersResponse getMembersResponse, UnmarshallerContext _ctx) {
		
		getMembersResponse.setRequestId(_ctx.stringValue("GetMembersResponse.RequestId"));
		getMembersResponse.setErrorCode(_ctx.integerValue("GetMembersResponse.ErrorCode"));
		getMembersResponse.setMessage(_ctx.stringValue("GetMembersResponse.Message"));
		getMembersResponse.setSuccess(_ctx.booleanValue("GetMembersResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("GetMembersResponse.MeetingInfo.MeetingName"));
		meetingInfo.setValidTime(_ctx.longValue("GetMembersResponse.MeetingInfo.ValidTime"));
		meetingInfo.setMeetingCode(_ctx.stringValue("GetMembersResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setCreateTime(_ctx.longValue("GetMembersResponse.MeetingInfo.CreateTime"));
		meetingInfo.setUserId(_ctx.stringValue("GetMembersResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("GetMembersResponse.MeetingInfo.MeetingUUID"));

		List<MemberListItem> memberList = new ArrayList<MemberListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMembersResponse.MeetingInfo.MemberList.Length"); i++) {
			MemberListItem memberListItem = new MemberListItem();
			memberListItem.setUserAvatarUrl(_ctx.stringValue("GetMembersResponse.MeetingInfo.MemberList["+ i +"].UserAvatarUrl"));
			memberListItem.setMemberUUID(_ctx.stringValue("GetMembersResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));
			memberListItem.setUserName(_ctx.stringValue("GetMembersResponse.MeetingInfo.MemberList["+ i +"].UserName"));
			memberListItem.setUserId(_ctx.stringValue("GetMembersResponse.MeetingInfo.MemberList["+ i +"].UserId"));
			memberListItem.setStatus(_ctx.stringValue("GetMembersResponse.MeetingInfo.MemberList["+ i +"].Status"));

			memberList.add(memberListItem);
		}
		meetingInfo.setMemberList(memberList);
		getMembersResponse.setMeetingInfo(meetingInfo);
	 
	 	return getMembersResponse;
	}
}