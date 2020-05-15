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

import com.aliyuncs.aliyuncvc.model.v20191030.JoinLiveResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinLiveResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinLiveResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinLiveResponseUnmarshaller {

	public static JoinLiveResponse unmarshall(JoinLiveResponse joinLiveResponse, UnmarshallerContext _ctx) {
		
		joinLiveResponse.setRequestId(_ctx.stringValue("JoinLiveResponse.RequestId"));
		joinLiveResponse.setErrorCode(_ctx.integerValue("JoinLiveResponse.ErrorCode"));
		joinLiveResponse.setSuccess(_ctx.booleanValue("JoinLiveResponse.Success"));
		joinLiveResponse.setMessage(_ctx.stringValue("JoinLiveResponse.Message"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingDomain(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setMeetingToken(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MeetingToken"));
		meetingInfo.setMeetingCode(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemberUUID(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MemberUUID"));
		meetingInfo.setClientAppId(_ctx.stringValue("JoinLiveResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setMeetingAppId(_ctx.stringValue("JoinLiveResponse.MeetingInfo.MeetingAppId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("JoinLiveResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("JoinLiveResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("JoinLiveResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);
		joinLiveResponse.setMeetingInfo(meetingInfo);
	 
	 	return joinLiveResponse;
	}
}