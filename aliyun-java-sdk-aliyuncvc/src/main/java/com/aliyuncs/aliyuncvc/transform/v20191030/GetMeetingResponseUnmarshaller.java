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

import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingResponse.MeetingInfo.MemberListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMeetingResponseUnmarshaller {

	public static GetMeetingResponse unmarshall(GetMeetingResponse getMeetingResponse, UnmarshallerContext _ctx) {
		
		getMeetingResponse.setRequestId(_ctx.stringValue("GetMeetingResponse.RequestId"));
		getMeetingResponse.setErrorCode(_ctx.integerValue("GetMeetingResponse.ErrorCode"));
		getMeetingResponse.setMessage(_ctx.stringValue("GetMeetingResponse.Message"));
		getMeetingResponse.setSuccess(_ctx.booleanValue("GetMeetingResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MeetingName"));
		meetingInfo.setValidTime(_ctx.longValue("GetMeetingResponse.MeetingInfo.ValidTime"));
		meetingInfo.setMeetingCode(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setCreateTime(_ctx.longValue("GetMeetingResponse.MeetingInfo.CreateTime"));
		meetingInfo.setUserId(_ctx.stringValue("GetMeetingResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setPassword(_ctx.stringValue("GetMeetingResponse.MeetingInfo.Password"));

		List<MemberListItem> memberList = new ArrayList<MemberListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMeetingResponse.MeetingInfo.MemberList.Length"); i++) {
			MemberListItem memberListItem = new MemberListItem();
			memberListItem.setUserAvatarUrl(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MemberList["+ i +"].UserAvatarUrl"));
			memberListItem.setMemberUUID(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));
			memberListItem.setUserName(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MemberList["+ i +"].UserName"));
			memberListItem.setUserId(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MemberList["+ i +"].UserId"));
			memberListItem.setStatus(_ctx.stringValue("GetMeetingResponse.MeetingInfo.MemberList["+ i +"].Status"));

			memberList.add(memberListItem);
		}
		meetingInfo.setMemberList(memberList);
		getMeetingResponse.setMeetingInfo(meetingInfo);
	 
	 	return getMeetingResponse;
	}
}