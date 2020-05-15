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

import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingInternationalResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingInternationalResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.GetMeetingInternationalResponse.MeetingInfo.MemberListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMeetingInternationalResponseUnmarshaller {

	public static GetMeetingInternationalResponse unmarshall(GetMeetingInternationalResponse getMeetingInternationalResponse, UnmarshallerContext _ctx) {
		
		getMeetingInternationalResponse.setRequestId(_ctx.stringValue("GetMeetingInternationalResponse.RequestId"));
		getMeetingInternationalResponse.setErrorCode(_ctx.integerValue("GetMeetingInternationalResponse.ErrorCode"));
		getMeetingInternationalResponse.setMessage(_ctx.stringValue("GetMeetingInternationalResponse.Message"));
		getMeetingInternationalResponse.setSuccess(_ctx.booleanValue("GetMeetingInternationalResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MeetingName"));
		meetingInfo.setValidTime(_ctx.longValue("GetMeetingInternationalResponse.MeetingInfo.ValidTime"));
		meetingInfo.setMeetingCode(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setCreateTime(_ctx.longValue("GetMeetingInternationalResponse.MeetingInfo.CreateTime"));
		meetingInfo.setUserId(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setPassword(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.Password"));

		List<MemberListItem> memberList = new ArrayList<MemberListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMeetingInternationalResponse.MeetingInfo.MemberList.Length"); i++) {
			MemberListItem memberListItem = new MemberListItem();
			memberListItem.setUserAvatarUrl(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].UserAvatarUrl"));
			memberListItem.setMemberUUID(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));
			memberListItem.setUserName(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].UserName"));
			memberListItem.setUserId(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].UserId"));
			memberListItem.setStatus(_ctx.stringValue("GetMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].Status"));

			memberList.add(memberListItem);
		}
		meetingInfo.setMemberList(memberList);
		getMeetingInternationalResponse.setMeetingInfo(meetingInfo);
	 
	 	return getMeetingInternationalResponse;
	}
}