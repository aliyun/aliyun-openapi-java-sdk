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

import com.aliyuncs.ccc.model.v20200701.CoachCallResponse;
import com.aliyuncs.ccc.model.v20200701.CoachCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.CoachCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.CoachCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.CoachCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CoachCallResponseUnmarshaller {

	public static CoachCallResponse unmarshall(CoachCallResponse coachCallResponse, UnmarshallerContext _ctx) {
		
		coachCallResponse.setRequestId(_ctx.stringValue("CoachCallResponse.RequestId"));
		coachCallResponse.setCode(_ctx.stringValue("CoachCallResponse.Code"));
		coachCallResponse.setHttpStatusCode(_ctx.integerValue("CoachCallResponse.HttpStatusCode"));
		coachCallResponse.setMessage(_ctx.stringValue("CoachCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CoachCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("CoachCallResponse.Params["+ i +"]"));
		}
		coachCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("CoachCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("CoachCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("CoachCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("CoachCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setIndex(_ctx.integerValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setJobId(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setSkillGroupId(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("CoachCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("CoachCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("CoachCallResponse.Data.UserContext.DeviceId"));
		userContext.setDeviceState(_ctx.stringValue("CoachCallResponse.Data.UserContext.DeviceState"));
		userContext.setExtension(_ctx.stringValue("CoachCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("CoachCallResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("CoachCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("CoachCallResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("CoachCallResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("CoachCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setReserved(_ctx.longValue("CoachCallResponse.Data.UserContext.Reserved"));
		userContext.setUri(_ctx.stringValue("CoachCallResponse.Data.UserContext.Uri"));
		userContext.setUserId(_ctx.stringValue("CoachCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("CoachCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("CoachCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CoachCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("CoachCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		coachCallResponse.setData(data);
	 
	 	return coachCallResponse;
	}
}