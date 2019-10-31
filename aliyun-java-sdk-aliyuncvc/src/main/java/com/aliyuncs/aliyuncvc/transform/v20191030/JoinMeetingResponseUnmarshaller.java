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

import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinMeetingResponseUnmarshaller {

	public static JoinMeetingResponse unmarshall(JoinMeetingResponse joinMeetingResponse, UnmarshallerContext _ctx) {
		
		joinMeetingResponse.setRequestId(_ctx.stringValue("JoinMeetingResponse.RequestId"));
		joinMeetingResponse.setErrorCode(_ctx.integerValue("JoinMeetingResponse.ErrorCode"));
		joinMeetingResponse.setSuccess(_ctx.booleanValue("JoinMeetingResponse.Success"));
		joinMeetingResponse.setMessage(_ctx.stringValue("JoinMeetingResponse.Message"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingDomain(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setMeetingToken(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MeetingToken"));
		meetingInfo.setMeetingCode(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemberUUID(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MemberUUID"));
		meetingInfo.setClientAppId(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setMeetingAppId(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.MeetingAppId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("JoinMeetingResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);
		joinMeetingResponse.setMeetingInfo(meetingInfo);
	 
	 	return joinMeetingResponse;
	}
}