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

import com.aliyuncs.ccc.model.v20200701.StartConferenceResponse;
import com.aliyuncs.ccc.model.v20200701.StartConferenceResponse.Data;
import com.aliyuncs.ccc.model.v20200701.StartConferenceResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.StartConferenceResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.StartConferenceResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartConferenceResponseUnmarshaller {

	public static StartConferenceResponse unmarshall(StartConferenceResponse startConferenceResponse, UnmarshallerContext _ctx) {
		
		startConferenceResponse.setRequestId(_ctx.stringValue("StartConferenceResponse.RequestId"));
		startConferenceResponse.setCode(_ctx.stringValue("StartConferenceResponse.Code"));
		startConferenceResponse.setHttpStatusCode(_ctx.integerValue("StartConferenceResponse.HttpStatusCode"));
		startConferenceResponse.setMessage(_ctx.stringValue("StartConferenceResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartConferenceResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("StartConferenceResponse.Params["+ i +"]"));
		}
		startConferenceResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("StartConferenceResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("StartConferenceResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("StartConferenceResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("StartConferenceResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setAssociatedData(_ctx.mapValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setReleaseReason(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("StartConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("StartConferenceResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("StartConferenceResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("StartConferenceResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("StartConferenceResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("StartConferenceResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("StartConferenceResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("StartConferenceResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("StartConferenceResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("StartConferenceResponse.Data.UserContext.OutboundScenario"));
		userContext.setUri(_ctx.stringValue("StartConferenceResponse.Data.UserContext.Uri"));
		userContext.setDeviceState(_ctx.stringValue("StartConferenceResponse.Data.UserContext.DeviceState"));
		userContext.setMobile(_ctx.stringValue("StartConferenceResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("StartConferenceResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("StartConferenceResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartConferenceResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("StartConferenceResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		startConferenceResponse.setData(data);
	 
	 	return startConferenceResponse;
	}
}