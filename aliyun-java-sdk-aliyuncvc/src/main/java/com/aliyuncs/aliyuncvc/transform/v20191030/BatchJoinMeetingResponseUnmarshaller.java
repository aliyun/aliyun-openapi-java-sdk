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

import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingResponse.MeetingInfo.Member;
import com.aliyuncs.aliyuncvc.model.v20191030.BatchJoinMeetingResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchJoinMeetingResponseUnmarshaller {

	public static BatchJoinMeetingResponse unmarshall(BatchJoinMeetingResponse batchJoinMeetingResponse, UnmarshallerContext _ctx) {
		
		batchJoinMeetingResponse.setRequestId(_ctx.stringValue("BatchJoinMeetingResponse.RequestId"));
		batchJoinMeetingResponse.setMessage(_ctx.stringValue("BatchJoinMeetingResponse.Message"));
		batchJoinMeetingResponse.setErrorCode(_ctx.integerValue("BatchJoinMeetingResponse.ErrorCode"));
		batchJoinMeetingResponse.setSuccess(_ctx.booleanValue("BatchJoinMeetingResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingAppId(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MeetingAppId"));
		meetingInfo.setMeetingDomain(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setClientAppId(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingCode(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MeetingUUID"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);

		List<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("BatchJoinMeetingResponse.MeetingInfo.MemberList.Length"); i++) {
			Member member = new Member();
			member.setUserId(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MemberList["+ i +"].UserId"));
			member.setMeetingToken(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MemberList["+ i +"].MeetingToken"));
			member.setMemberUUID(_ctx.stringValue("BatchJoinMeetingResponse.MeetingInfo.MemberList["+ i +"].MemberUUID"));

			memberList.add(member);
		}
		meetingInfo.setMemberList(memberList);
		batchJoinMeetingResponse.setMeetingInfo(meetingInfo);
	 
	 	return batchJoinMeetingResponse;
	}
}