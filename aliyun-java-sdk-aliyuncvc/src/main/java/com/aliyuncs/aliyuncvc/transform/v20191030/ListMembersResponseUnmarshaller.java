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

import com.aliyuncs.aliyuncvc.model.v20191030.ListMembersResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ListMembersResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.ListMembersResponse.MeetingInfo.MemberRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMembersResponseUnmarshaller {

	public static ListMembersResponse unmarshall(ListMembersResponse listMembersResponse, UnmarshallerContext _ctx) {
		
		listMembersResponse.setRequestId(_ctx.stringValue("ListMembersResponse.RequestId"));
		listMembersResponse.setErrorCode(_ctx.integerValue("ListMembersResponse.ErrorCode"));
		listMembersResponse.setMessage(_ctx.stringValue("ListMembersResponse.Message"));
		listMembersResponse.setSuccess(_ctx.booleanValue("ListMembersResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("ListMembersResponse.MeetingInfo.MeetingName"));
		meetingInfo.setMeetingCode(_ctx.stringValue("ListMembersResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemo(_ctx.stringValue("ListMembersResponse.MeetingInfo.Memo"));
		meetingInfo.setUserName(_ctx.stringValue("ListMembersResponse.MeetingInfo.UserName"));
		meetingInfo.setCreateTime(_ctx.longValue("ListMembersResponse.MeetingInfo.CreateTime"));
		meetingInfo.setUserId(_ctx.stringValue("ListMembersResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("ListMembersResponse.MeetingInfo.MeetingUUID"));

		List<MemberRecord> memberInfos = new ArrayList<MemberRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListMembersResponse.MeetingInfo.MemberInfos.Length"); i++) {
			MemberRecord memberRecord = new MemberRecord();
			memberRecord.setMemberUUID(_ctx.stringValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].MemberUUID"));
			memberRecord.setUserId(_ctx.stringValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].UserId"));
			memberRecord.setStatus(_ctx.stringValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].Status"));
			memberRecord.setBeginTime(_ctx.longValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].BeginTime"));
			memberRecord.setEndTime(_ctx.longValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].EndTime"));
			memberRecord.setUserName(_ctx.stringValue("ListMembersResponse.MeetingInfo.MemberInfos["+ i +"].UserName"));

			memberInfos.add(memberRecord);
		}
		meetingInfo.setMemberInfos(memberInfos);
		listMembersResponse.setMeetingInfo(meetingInfo);
	 
	 	return listMembersResponse;
	}
}