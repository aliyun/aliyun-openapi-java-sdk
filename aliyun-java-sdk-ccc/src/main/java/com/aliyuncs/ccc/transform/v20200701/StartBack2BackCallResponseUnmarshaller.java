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

import com.aliyuncs.ccc.model.v20200701.StartBack2BackCallResponse;
import com.aliyuncs.ccc.model.v20200701.StartBack2BackCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.StartBack2BackCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.StartBack2BackCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.StartBack2BackCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartBack2BackCallResponseUnmarshaller {

	public static StartBack2BackCallResponse unmarshall(StartBack2BackCallResponse startBack2BackCallResponse, UnmarshallerContext _ctx) {
		
		startBack2BackCallResponse.setRequestId(_ctx.stringValue("StartBack2BackCallResponse.RequestId"));
		startBack2BackCallResponse.setCode(_ctx.stringValue("StartBack2BackCallResponse.Code"));
		startBack2BackCallResponse.setHttpStatusCode(_ctx.integerValue("StartBack2BackCallResponse.HttpStatusCode"));
		startBack2BackCallResponse.setMessage(_ctx.stringValue("StartBack2BackCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartBack2BackCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("StartBack2BackCallResponse.Params["+ i +"]"));
		}
		startBack2BackCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setJobId(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setTimestamp(_ctx.longValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("StartBack2BackCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.DeviceId"));
		userContext.setDeviceState(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.DeviceState"));
		userContext.setExtension(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("StartBack2BackCallResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("StartBack2BackCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setReserved(_ctx.longValue("StartBack2BackCallResponse.Data.UserContext.Reserved"));
		userContext.setUri(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.Uri"));
		userContext.setUserId(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartBack2BackCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("StartBack2BackCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		startBack2BackCallResponse.setData(data);
	 
	 	return startBack2BackCallResponse;
	}
}