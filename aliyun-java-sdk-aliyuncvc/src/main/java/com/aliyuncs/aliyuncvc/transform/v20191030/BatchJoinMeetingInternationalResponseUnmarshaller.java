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

import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingInternationalResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingInternationalResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingInternationalResponse.MeetingInfo.Member;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingInternationalResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchJoinMeetingInternationalResponseUnmarshaller {

	public static BatchJoinMeetingInternationalResponse unmarshall(BatchJoinMeetingInternationalResponse batchJoinMeetingInternationalResponse, UnmarshallerContext _ctx) {
		
		batchJoinMeetingInternationalResponse.setRequestId(_ctx.stringValue("BatchJoinMeetingInternationalResponse.RequestId"));
		batchJoinMeetingInternationalResponse.setMessage(_ctx.stringValue("BatchJoinMeetingInternationalResponse.Message"));
		batchJoinMeetingInternationalResponse.setErrorCode(_ctx.integerValue("BatchJoinMeetingInternationalResponse.ErrorCode"));
		batchJoinMeetingInternationalResponse.setSuccess(_ctx.booleanValue("BatchJoinMeetingInternationalResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingAppId(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MeetingAppId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setMeetingToken(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MeetingToken"));
		meetingInfo.setMeetingDomain(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setClientAppId(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingCode(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MeetingCode"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);

		List<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MemberList.Length"); i++) {
			Member member = new Member();
			member.setMemberUUID(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));
			member.setMeetingToken(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].MeetingToken"));
			member.setUserId(_ctx.stringValue("BatchJoinMeetingInternationalResponse.MeetingInfo.MemberList["+ i +"].UserId"));

			memberList.add(member);
		}
		meetingInfo.setMemberList(memberList);
		batchJoinMeetingInternationalResponse.setMeetingInfo(meetingInfo);
	 
	 	return batchJoinMeetingInternationalResponse;
	}
}