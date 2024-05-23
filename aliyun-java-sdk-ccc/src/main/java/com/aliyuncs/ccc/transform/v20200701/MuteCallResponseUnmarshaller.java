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

import com.aliyuncs.ccc.model.v20200701.MuteCallResponse;
import com.aliyuncs.ccc.model.v20200701.MuteCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.MuteCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.MuteCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.MuteCallResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class MuteCallResponseUnmarshaller {

	public static MuteCallResponse unmarshall(MuteCallResponse muteCallResponse, UnmarshallerContext _ctx) {
		
		muteCallResponse.setRequestId(_ctx.stringValue("MuteCallResponse.RequestId"));
		muteCallResponse.setCode(_ctx.stringValue("MuteCallResponse.Code"));
		muteCallResponse.setHttpStatusCode(_ctx.integerValue("MuteCallResponse.HttpStatusCode"));
		muteCallResponse.setMessage(_ctx.stringValue("MuteCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MuteCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("MuteCallResponse.Params["+ i +"]"));
		}
		muteCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("MuteCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("MuteCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("MuteCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("MuteCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setIndex(_ctx.integerValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setReleaseInitiator(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setReleaseReason(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setUserExtension(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setOriginator(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setSkillGroupId(_ctx.stringValue("MuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("MuteCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("MuteCallResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("MuteCallResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("MuteCallResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("MuteCallResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("MuteCallResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("MuteCallResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("MuteCallResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("MuteCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setMobile(_ctx.stringValue("MuteCallResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("MuteCallResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("MuteCallResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MuteCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("MuteCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		muteCallResponse.setData(data);
	 
	 	return muteCallResponse;
	}
}