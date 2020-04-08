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

import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingInternationalResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingInternationalResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinMeetingInternationalResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinMeetingInternationalResponseUnmarshaller {

	public static JoinMeetingInternationalResponse unmarshall(JoinMeetingInternationalResponse joinMeetingInternationalResponse, UnmarshallerContext _ctx) {
		
		joinMeetingInternationalResponse.setRequestId(_ctx.stringValue("JoinMeetingInternationalResponse.RequestId"));
		joinMeetingInternationalResponse.setErrorCode(_ctx.integerValue("JoinMeetingInternationalResponse.ErrorCode"));
		joinMeetingInternationalResponse.setSuccess(_ctx.booleanValue("JoinMeetingInternationalResponse.Success"));
		joinMeetingInternationalResponse.setMessage(_ctx.stringValue("JoinMeetingInternationalResponse.Message"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingDomain(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setMeetingToken(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MeetingToken"));
		meetingInfo.setMeetingCode(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemberUUID(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MemberUUID"));
		meetingInfo.setClientAppId(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setMeetingAppId(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.MeetingAppId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("JoinMeetingInternationalResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);
		joinMeetingInternationalResponse.setMeetingInfo(meetingInfo);
	 
	 	return joinMeetingInternationalResponse;
	}
}