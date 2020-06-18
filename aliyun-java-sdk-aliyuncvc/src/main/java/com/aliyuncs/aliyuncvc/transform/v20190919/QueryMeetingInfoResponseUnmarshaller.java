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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryMeetingInfoResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryMeetingInfoResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryMeetingInfoResponse.MeetingInfo.MemberListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMeetingInfoResponseUnmarshaller {

	public static QueryMeetingInfoResponse unmarshall(QueryMeetingInfoResponse queryMeetingInfoResponse, UnmarshallerContext _ctx) {
		
		queryMeetingInfoResponse.setRequestId(_ctx.stringValue("QueryMeetingInfoResponse.RequestId"));
		queryMeetingInfoResponse.setErrorCode(_ctx.integerValue("QueryMeetingInfoResponse.ErrorCode"));
		queryMeetingInfoResponse.setMessage(_ctx.stringValue("QueryMeetingInfoResponse.Message"));
		queryMeetingInfoResponse.setSuccess(_ctx.booleanValue("QueryMeetingInfoResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MeetingName"));
		meetingInfo.setValidDate(_ctx.longValue("QueryMeetingInfoResponse.MeetingInfo.ValidDate"));
		meetingInfo.setMeetingCode(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setCreateDate(_ctx.longValue("QueryMeetingInfoResponse.MeetingInfo.CreateDate"));
		meetingInfo.setUserId(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MeetingUUID"));

		List<MemberListItem> memberList = new ArrayList<MemberListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMeetingInfoResponse.MeetingInfo.MemberList.Length"); i++) {
			MemberListItem memberListItem = new MemberListItem();
			memberListItem.setUserAvatarUrl(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MemberList["+ i +"].UserAvatarUrl"));
			memberListItem.setMemberUUID(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));
			memberListItem.setUserName(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MemberList["+ i +"].UserName"));
			memberListItem.setUserId(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MemberList["+ i +"].UserId"));
			memberListItem.setStatus(_ctx.stringValue("QueryMeetingInfoResponse.MeetingInfo.MemberList["+ i +"].Status"));

			memberList.add(memberListItem);
		}
		meetingInfo.setMemberList(memberList);
		queryMeetingInfoResponse.setMeetingInfo(meetingInfo);
	 
	 	return queryMeetingInfoResponse;
	}
}