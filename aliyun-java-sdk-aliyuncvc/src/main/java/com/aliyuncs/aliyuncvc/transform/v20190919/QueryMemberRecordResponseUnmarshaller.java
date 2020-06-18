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

import com.aliyuncs.aliyuncvc.model.v20190919.QueryMemberRecordResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryMemberRecordResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryMemberRecordResponse.MeetingInfo.MemberRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMemberRecordResponseUnmarshaller {

	public static QueryMemberRecordResponse unmarshall(QueryMemberRecordResponse queryMemberRecordResponse, UnmarshallerContext _ctx) {
		
		queryMemberRecordResponse.setRequestId(_ctx.stringValue("QueryMemberRecordResponse.RequestId"));
		queryMemberRecordResponse.setErrorCode(_ctx.integerValue("QueryMemberRecordResponse.ErrorCode"));
		queryMemberRecordResponse.setMessage(_ctx.stringValue("QueryMemberRecordResponse.Message"));
		queryMemberRecordResponse.setSuccess(_ctx.booleanValue("QueryMemberRecordResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MeetingName"));
		meetingInfo.setMeetingCode(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemo(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.Memo"));
		meetingInfo.setUserName(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.UserName"));
		meetingInfo.setCreateDate(_ctx.longValue("QueryMemberRecordResponse.MeetingInfo.CreateDate"));
		meetingInfo.setUserId(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.UserId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MeetingUUID"));

		List<MemberRecord> memberRecordsList = new ArrayList<MemberRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryMemberRecordResponse.MeetingInfo.MemberRecordsList.Length"); i++) {
			MemberRecord memberRecord = new MemberRecord();
			memberRecord.setMemberUUID(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MemberRecordsList["+ i +"].MemberUUID"));
			memberRecord.setUserId(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MemberRecordsList["+ i +"].UserId"));
			memberRecord.setStatus(_ctx.stringValue("QueryMemberRecordResponse.MeetingInfo.MemberRecordsList["+ i +"].Status"));

			memberRecordsList.add(memberRecord);
		}
		meetingInfo.setMemberRecordsList(memberRecordsList);
		queryMemberRecordResponse.setMeetingInfo(meetingInfo);
	 
	 	return queryMemberRecordResponse;
	}
}