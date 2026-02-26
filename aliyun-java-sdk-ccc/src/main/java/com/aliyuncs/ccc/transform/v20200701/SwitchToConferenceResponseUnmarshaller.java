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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.SwitchToConferenceResponse;
import com.aliyuncs.ccc.model.v20200701.SwitchToConferenceResponse.Data;
import com.aliyuncs.ccc.model.v20200701.SwitchToConferenceResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.SwitchToConferenceResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.SwitchToConferenceResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchToConferenceResponseUnmarshaller {

	public static SwitchToConferenceResponse unmarshall(SwitchToConferenceResponse switchToConferenceResponse, UnmarshallerContext _ctx) {
		
		switchToConferenceResponse.setRequestId(_ctx.stringValue("SwitchToConferenceResponse.RequestId"));
		switchToConferenceResponse.setCode(_ctx.stringValue("SwitchToConferenceResponse.Code"));
		switchToConferenceResponse.setHttpStatusCode(_ctx.integerValue("SwitchToConferenceResponse.HttpStatusCode"));
		switchToConferenceResponse.setMessage(_ctx.stringValue("SwitchToConferenceResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SwitchToConferenceResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("SwitchToConferenceResponse.Params["+ i +"]"));
		}
		switchToConferenceResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setIndex(_ctx.integerValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setReleaseInitiator(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setSkillGroupId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setUserId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setReleaseReason(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("SwitchToConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setHeartbeat(_ctx.longValue("SwitchToConferenceResponse.Data.UserContext.Heartbeat"));
		userContext.setExtension(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.Extension"));
		userContext.setWorkMode(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.UserId"));
		userContext.setBreakCode(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("SwitchToConferenceResponse.Data.UserContext.OutboundScenario"));
		userContext.setDeviceState(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.DeviceState"));
		userContext.setMobile(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SwitchToConferenceResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("SwitchToConferenceResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		switchToConferenceResponse.setData(data);
	 
	 	return switchToConferenceResponse;
	}
}